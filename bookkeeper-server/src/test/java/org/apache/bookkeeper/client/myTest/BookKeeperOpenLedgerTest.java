package org.apache.bookkeeper.client.myTest;

import org.apache.bookkeeper.client.BKException;
import org.apache.bookkeeper.client.BookKeeper;
import org.apache.bookkeeper.client.BookKeeper.DigestType;
import org.apache.bookkeeper.client.LedgerEntry;
import org.apache.bookkeeper.client.LedgerHandle;
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
import java.util.Enumeration;

@RunWith(Parameterized.class)
public class BookKeeperOpenLedgerTest extends BookKeeperClusterTestCase {

    public enum LedgerState {
        CLOSED,
        OPEN,
        IN_RECOVERY
    }

    public enum Outcome {
        SUCCESS,
        EXCEPTION
    }

    private static final byte[] PASSWD = "pippo".getBytes(StandardCharsets.UTF_8);
    private static final byte[] WRONG_PASSWD = "pluto".getBytes(StandardCharsets.UTF_8);
    private static final byte[] EMPTY_PASSWD = new byte[0];
    private static final DigestType rightDigestType = DigestType.CRC32;
   // private static final DigestType wrongDigestType = DigestType.MAC;
    private static final long WRONG_ID = 100L;

    private static final byte[] ENTRY_1 = "Test entry 1".getBytes(StandardCharsets.UTF_8);
    private static final byte[] ENTRY_2 = "Test entry 2".getBytes(StandardCharsets.UTF_8);

    // Parametri
    private final long ledgerID;
    private final DigestType digestType;
    private final byte[] passwd;
    private final LedgerState ledgerState;
    private final Outcome outcome;

    private BookKeeper bkClient;
    private BookKeeper bkClient2;
    private LedgerHandle ledgerHandle;
    private LedgerHandle recoveryHandle;

    @Parameterized.Parameters(name = "{index}: ledgerID={0}, digestType={1}, passwd={2}, ledgerState={3}, outcome={4}")
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                /* 1 */ {-1L, rightDigestType, PASSWD, LedgerState.CLOSED, Outcome.EXCEPTION},
                /* 2 */ {WRONG_ID, rightDigestType, PASSWD, LedgerState.CLOSED, Outcome.EXCEPTION},
          //      /* 3 */ {0L, wrongDigestType, PASSWD, LedgerState.CLOSED, Outcome.EXCEPTION},
                /* 4 */ {0L, rightDigestType, PASSWD, LedgerState.CLOSED, Outcome.SUCCESS},
                /* 5 */ {0L, rightDigestType, null, LedgerState.CLOSED, Outcome.EXCEPTION},
                /* 6 */ {0L, rightDigestType, EMPTY_PASSWD, LedgerState.CLOSED, Outcome.EXCEPTION},
                /* 7 */ {0L, rightDigestType, WRONG_PASSWD, LedgerState.CLOSED, Outcome.EXCEPTION},
                /* 8 */ {0L, rightDigestType, PASSWD, LedgerState.OPEN, Outcome.SUCCESS},
                /* 9 */ {0L, rightDigestType, PASSWD, LedgerState.IN_RECOVERY, Outcome.SUCCESS},
        });
    }

    public BookKeeperOpenLedgerTest(long ledgerID, DigestType digestType, byte[] passwd,
                                    LedgerState ledgerState, Outcome outcome) {
        super(3, 60);
        this.ledgerID = ledgerID;
        this.digestType = digestType;
        this.passwd = passwd;
        this.ledgerState = ledgerState;
        this.outcome = outcome;
    }

    @Before
    @Override
    public void setUp() throws Exception {
        baseConf.setJournalWriteData(true);
        baseClientConf.setUseV2WireProtocol(true);
        super.setUp();

        this.bkClient = new BookKeeper(baseClientConf);

        // Creazione del ledger iniziale
        this.ledgerHandle = bkClient.createLedger(2, 2, 1,
                rightDigestType, PASSWD);

        ledgerHandle.addEntry(ENTRY_1);
        ledgerHandle.addEntry(ENTRY_2);

        switch (ledgerState) {
            case OPEN:
                // Non chiudiamo il ledgerHandle, rimane OPEN.
                break;
            case CLOSED:
                ledgerHandle.close();
                break;
            case IN_RECOVERY:
                this.bkClient2 = new BookKeeper(baseClientConf);
                this.recoveryHandle = bkClient2.openLedger(
                        ledgerHandle.getId(), DigestType.CRC32, PASSWD);
                assertWriterIsFenced("IN_RECOVERY setup: il writer originale non risulta fenced");
                break;
        }
    }

    @Test
    public void testOpenLedger() {
        // Se ledgerID è 0 o positivo placeholder, usiamo l'ID del ledger creato
        // Se ledgerID è negativo o WRONG_ID, usiamo il valore del parametro
        long idToUse = (this.ledgerID == 0L) ? ledgerHandle.getId() : this.ledgerID;

        LedgerHandle opened = null;
        Exception caught = null;

        try {
            opened = this.bkClient.openLedger(idToUse, this.digestType, this.passwd);

            // Se arriviamo qui senza eccezioni, verifichiamo che possiamo leggere
            assertCanReadFirstTwoEntries(opened);

            // Verifica fencing per stati OPEN/IN_RECOVERY
            if (idToUse == ledgerHandle.getId() && !ledgerHandle.isClosed()
                    && (ledgerState == LedgerState.OPEN || ledgerState == LedgerState.IN_RECOVERY)) {
                assertWriterIsFenced("Dopo openLedger il writer originale doveva risultare fenced");
            }

        } catch (Exception e) {
            caught = e;
        } finally {
            if (opened != null) {
                try {
                    opened.close();
                } catch (Exception ignore) {
                }
            }
        }

        // Verifica dell'outcome atteso
        switch (outcome) {
            case SUCCESS:
                Assert.assertNull(
                        "Non era attesa un'eccezione ma ne è stata lanciata una: "
                                + (caught != null ? caught.getClass().getSimpleName() + ": " + caught.getMessage() : ""),
                        caught);
                break;
            case EXCEPTION:
                Assert.assertNotNull(
                        "Era attesa un'eccezione ma openLedger è riuscito.",
                        caught);
                break;
        }
    }

    //AGGIUNTA test case client chiuso
    @Test
    public void testOpenLedgerWithClosedClient() throws Exception {
        // Crea e chiudi il ledger normalmente
        LedgerHandle lh = bkClient.createLedger(2, 2, 1, rightDigestType, PASSWD);
        lh.addEntry(ENTRY_1);
        long ledgerId = lh.getId();
        lh.close();

        // Chiudi il client PRIMA di chiamare openLedger
        bkClient.close();

        try {
            bkClient.openLedger(ledgerId, rightDigestType, PASSWD);
            Assert.fail("Doveva lanciare BKException.ClientClosedException");
        } catch (BKException.BKClientClosedException e) {
            // eccezione attesa.
        }
    }

    private void assertCanReadFirstTwoEntries(LedgerHandle lh) throws Exception {
        Enumeration<LedgerEntry> entries = lh.readEntries(0, 1);
        Assert.assertTrue("Attesa entry 0", entries.hasMoreElements());
        LedgerEntry e0 = entries.nextElement();
        Assert.assertArrayEquals("Contenuto entry 0 inatteso", ENTRY_1, e0.getEntry());

        Assert.assertTrue("Attesa entry 1", entries.hasMoreElements());
        LedgerEntry e1 = entries.nextElement();
        Assert.assertArrayEquals("Contenuto entry 1 inatteso", ENTRY_2, e1.getEntry());
    }

    private void assertWriterIsFenced(String messageIfNotFenced) throws Exception {
        try {
            ledgerHandle.addEntry("should-fail-after-fencing".getBytes(StandardCharsets.UTF_8));
            Assert.fail(messageIfNotFenced);
        } catch (BKException expected) {
            // OK: il writer è stato fenced
        }
    }


    @After
    @Override
    public void tearDown() throws Exception {
        if (recoveryHandle != null) {
            try {
                recoveryHandle.close();
            } catch (Exception e) {
                //don't care
            }
        }
        if (ledgerHandle != null && !ledgerHandle.isClosed()) {
            try {
                ledgerHandle.close();
            } catch (Exception e) {
                //don't care
            }
        }
        if (bkClient2 != null) {
            try {
                bkClient2.close();
            } catch (Exception e) {
                //don't care
            }
        }
        if (bkClient != null) {
            try {
                bkClient.close();
            } catch (Exception e) {
                //don't care
            }
        }
        super.tearDown();
    }
}