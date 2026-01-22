package org.apache.bookkeeper.client.myTest;

import org.apache.bookkeeper.client.BKException;
import org.apache.bookkeeper.client.BookKeeper;
import org.apache.bookkeeper.client.LedgerHandle;
import org.apache.bookkeeper.client.BookKeeper.DigestType;
import org.apache.bookkeeper.test.BookKeeperClusterTestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BookKeeperDeleteLedgerTest extends BookKeeperClusterTestCase {

    private static final byte[] PASSWD = "pippo".getBytes(StandardCharsets.UTF_8);
    private static final DigestType DIGEST_TYPE = DigestType.MAC;

    private final long ledgerID;
    private final boolean shouldLedgerExistAfterDelete;
    private LedgerHandle ledgerHandle;
    private BookKeeper bkClient;
    private boolean ledgerDeleted = false;

    @Parameterized.Parameters(name = "{index}: ledgerID={0}, shouldLedgerExistAfterDelete={1}")
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                /* 1 - ledger esistente: dopo delete NON deve esistere */   {0L, false},
                /* 2 - ledgerID non valido: ledger originale DEVE esistere */ {-1L, true},
                /* 3 - ledger inesistente: ledger originale DEVE esistere */  {100L, true}
        });
    }

    public BookKeeperDeleteLedgerTest(long lId, boolean shouldLedgerExistAfterDelete) {
        super(2, 60);
        this.ledgerID = lId;
        this.shouldLedgerExistAfterDelete = shouldLedgerExistAfterDelete;
    }

    @Before
    public void setUp() throws Exception {
        baseConf.setJournalWriteData(true);
        baseClientConf.setUseV2WireProtocol(true);
        super.setUp();
        this.bkClient = new BookKeeper(baseClientConf);
        this.ledgerHandle = bkClient.createLedger(1, 1, 1, DIGEST_TYPE, PASSWD);
    }

    @After
    public void tearDown() throws Exception {
        if (ledgerHandle != null && !ledgerDeleted) {
            try {
                ledgerHandle.close();
            } catch (Exception e) {
                // Ignora eccezioni se il ledger è già stato eliminato
            }
        }
        if (bkClient != null) {
            bkClient.close();
        }
        super.tearDown();
    }

    @Test
    public void testDeleteLedger() throws Exception {
        // Determina l'ID da eliminare:
        // - Se ledgerID == 0, usa l'ID reale del ledger creato nel setUp
        // - Altrimenti usa il valore parametrizzato (non valido o inesistente)
        long idToDelete;
        if (ledgerID == 0L) {
            idToDelete = ledgerHandle.getId();
        } else {
            idToDelete = ledgerID;
        }

        // Chiudi il ledgerHandle prima della delete
        ledgerHandle.close();

        // Esegui la delete (l'API non lancia eccezioni per ID non validi/inesistenti)
        bkClient.deleteLedger(idToDelete);

        // Verifica: prova ad aprire il ledger originale per verificare se esiste ancora
        long originalLedgerId = ledgerHandle.getId();
        boolean ledgerExists;

        try {
            LedgerHandle lh = bkClient.openLedger(originalLedgerId, DIGEST_TYPE, PASSWD);
            lh.close();
            ledgerExists = true;
        } catch (Exception e) {
            // Il ledger non esiste (è stato eliminato)
            ledgerExists = false;
            ledgerDeleted = true;
        }

        // Asserzione finale
        if (shouldLedgerExistAfterDelete) {
            Assert.assertTrue(
                    "Il ledger originale doveva ancora esistere dopo deleteLedger(" + idToDelete + ")",
                    ledgerExists
            );
        } else {
            Assert.assertFalse(
                    "Il ledger originale doveva essere eliminato dopo deleteLedger(" + idToDelete + ")",
                    ledgerExists
            );
        }
    }

    @Test
    public void testDeleteLedgerWithClosedClient() throws Exception {
        // Chiudi il ledgerHandle prima
        ledgerHandle.close();

        long ledgerId = ledgerHandle.getId();

        // Chiudo il client prima di chiamare deleteLedger
        bkClient.close();

        try {
            bkClient.deleteLedger(ledgerId);
            Assert.fail("Doveva lanciare BKException.BKClientClosedException");
        } catch (BKException.BKClientClosedException e) {
            // eccezione attesa
            ledgerDeleted = false; // Il ledger NON è stato effettivamente eliminato
        }
    }
}