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

    private static final byte[] DEFAULT_PASSWD = "pippo".getBytes(StandardCharsets.UTF_8);
    private static final byte[] ENTRY_1 = "Test entry 1".getBytes(StandardCharsets.UTF_8);
    private static final byte[] ENTRY_2 = "Test entry 2".getBytes(StandardCharsets.UTF_8);

    // Parametri
    private final int ledgerID;
    private final DigestType digestType;
    private final byte[] passwd;
    private final LedgerState ledgerState;
    private final boolean isExceptionExpected;

    private BookKeeper bkClient;
    private BookKeeper bkClient2;
    private LedgerHandle ledgerHandle;
    private LedgerHandle recoveryHandle;

    @Parameterized.Parameters(name = "{index}: ledgerID={0}, digestType={1}, passwd={2}, ledgerState={3}, isExceptionExpected={4}")
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                /* 1 */ {-1, DigestType.CRC32, "pippo", LedgerState.CLOSED, true},
                /* 2 */ {0, DigestType.CRC32, "pippo", LedgerState.CLOSED, false},
                /* 3 */ {0, DigestType.CRC32, "pippo", LedgerState.CLOSED, false},
                /* 4 */ {0, DigestType.CRC32C, "pippo", LedgerState.CLOSED, false},
                /* 5 */ {0, DigestType.DUMMY, "pippo", LedgerState.CLOSED, false},
                /* 6 */ {0, DigestType.MAC, "pippo", LedgerState.CLOSED, false},
                /* 7 */ {0, null, "pippo", LedgerState.CLOSED, false},
                /* 8 */ {0, DigestType.CRC32, "pippo", LedgerState.CLOSED, false},
                /* 9 */ {0, DigestType.CRC32, " ", LedgerState.CLOSED, true},
                /* 10 */ {0, DigestType.CRC32, "pluto", LedgerState.CLOSED, true},
                /* 11 */ {0, DigestType.CRC32, null, LedgerState.CLOSED, true},
                /* 12 */ {0, DigestType.CRC32, "pippo", LedgerState.OPEN, false},
                /* 13 */ {0, DigestType.CRC32, "pippo", LedgerState.IN_RECOVERY, false},
                /* 14 */ {0, DigestType.CRC32, "pippo", LedgerState.CLOSED, false},
        });
    }

    public BookKeeperOpenLedgerTest(int ledgerID, DigestType digestType, String passwd, LedgerState ledgerState, boolean isExceptionExpected) {
        super(3, 60);
        this.ledgerID = ledgerID;
        this.digestType = digestType;
        this.passwd = (passwd != null) ? passwd.getBytes(StandardCharsets.UTF_8) : null;
        this.ledgerState = ledgerState;
        this.isExceptionExpected = isExceptionExpected;
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
                DigestType.CRC32, DEFAULT_PASSWD);

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
                // Apriamo il ledger da un secondo client per innescare fencing e recovery.
                // Tenere aperto questo handle rende lo scenario distinto da OPEN:
                // qui il ledger risulta già "fenced" prima dell'openLedger del SUT.
                this.recoveryHandle = bkClient2.openLedger(
                        ledgerHandle.getId(), DigestType.CRC32, DEFAULT_PASSWD);
                // Verifica immediata che il writer originale sia stato fenced.
                assertWriterIsFenced("IN_RECOVERY setup: il writer originale non risulta fenced");
                break;
        }
    }

    @Test
    public void testOpenLedger() {
        // Se ledgerID è -1 usiamo quello invalido, altrimenti l'ID del ledger creato
        long idToUse = (this.ledgerID < 0) ? this.ledgerID : ledgerHandle.getId();

        LedgerHandle opened = null;
        Exception caught = null;

        try {
            opened = this.bkClient.openLedger(idToUse, this.digestType, this.passwd);

            // Digest/password diventano significativi: l'handle deve essere utilizzabile.
            // Quindi verifichiamo una read reale.
            assertCanReadFirstTwoEntries(opened);

            // Stati OPEN/IN_RECOVERY significativi: openLedger deve impedire al writer originale di scrivere.
            // (Nel caso IN_RECOVERY è già fenced dal secondo client, ma questa assert verifica comunque che il fencing valga.)
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
                    // best effort cleanup
                }
            }
        }

        if (isExceptionExpected) {
            Assert.assertNotNull(
                    "Era attesa un'eccezione (" + ledgerState + ", ID: " + ledgerID + ") ma openLedger+read è riuscito.",
                    caught);
        } else {
            Assert.assertNull(
                    "Non era attesa un'eccezione ma ne è stata lanciata una: "
                            + (caught != null ? caught.getClass().getSimpleName() + ": " + caught.getMessage() : ""),
                    caught);
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
            // OK: il writer è stato fenced (o comunque non può più scrivere).
        }
    }

    @After
    @Override
    public void tearDown() throws Exception {
        if (recoveryHandle != null) {
            try {
                recoveryHandle.close();
            } catch (Exception e) {
                // Best effort
            }
        }
        if (ledgerHandle != null && !ledgerHandle.isClosed()) {
            try {
                ledgerHandle.close();
            } catch (Exception e) {
                // Best effort
            }
        }
        if (bkClient2 != null) {
            try {
                bkClient2.close();
            } catch (Exception e) {
                // Best effort
            }
        }
        if (bkClient != null) {
            try {
                bkClient.close();
            } catch (Exception e) {
                // Best effort
            }
        }
        super.tearDown();
    }
}
