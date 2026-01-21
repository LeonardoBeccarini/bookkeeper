package org.apache.bookkeeper.client.claude;

import org.apache.bookkeeper.client.BKException;
import org.apache.bookkeeper.client.BookKeeper;
import org.apache.bookkeeper.client.BookKeeper.DigestType;
import org.apache.bookkeeper.client.LedgerEntry;
import org.apache.bookkeeper.client.LedgerHandle;
import org.apache.bookkeeper.client.api.LedgerMetadata;
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

/**
 * Parameterized test class for BookKeeper client methods:
 * - createLedger(int ensSize, int writeQuorumSize, int ackQuorumSize, DigestType digestType, byte[] passwd)
 * - openLedger(long lId, DigestType digestType, byte[] passwd)
 * - deleteLedger(long lId)
 */
@RunWith(Parameterized.class)
public class BookKeeperFewShotTest extends BookKeeperClusterTestCase {

    /**
     * Enum representing the method under test.
     */
    public enum MethodUnderTest {
        CREATE_LEDGER,
        OPEN_LEDGER,
        DELETE_LEDGER
    }

    /**
     * Enum representing the expected outcome of a test.
     */
    public enum Outcome {
        SUCCESS,
        FAIL,
        EXCEPTION
    }

    /**
     * Enum representing the state of a ledger for openLedger tests.
     */
    public enum LedgerState {
        CLOSED,
        OPEN,
        IN_RECOVERY
    }

    // Constants for tests
    private static final byte[] VALID_PASSWD = "testPassword".getBytes(StandardCharsets.UTF_8);
    private static final byte[] WRONG_PASSWD = "wrongPassword".getBytes(StandardCharsets.UTF_8);
    private static final byte[] EMPTY_PASSWD = new byte[0];
    private static final DigestType DEFAULT_DIGEST = DigestType.CRC32;

    private static final byte[] TEST_ENTRY_1 = "Test entry one".getBytes(StandardCharsets.UTF_8);
    private static final byte[] TEST_ENTRY_2 = "Test entry two".getBytes(StandardCharsets.UTF_8);

    private static final long INVALID_LEDGER_ID = -1L;
    private static final long NON_EXISTENT_LEDGER_ID = 99999L;

    // Test parameters
    private final MethodUnderTest methodUnderTest;
    private final int ensSize;
    private final int writeQuorumSize;
    private final int ackQuorumSize;
    private final DigestType digestType;
    private final byte[] passwd;
    private final long ledgerId;
    private final LedgerState ledgerState;
    private final Outcome expectedOutcome;
    private final String testDescription;

    // Test resources
    private BookKeeper bkClient;
    private BookKeeper bkClient2;
    private LedgerHandle ledgerHandle;
    private LedgerHandle recoveryHandle;
    private LedgerHandle createdLedger;
    private boolean ledgerDeleted = false;

    @Parameterized.Parameters(name = "{index}: {9}")
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
                // =====================================================================
                // createLedger tests
                // =====================================================================

                // --- Valid createLedger scenarios ---
                /* 1 */  { MethodUnderTest.CREATE_LEDGER, 1, 1, 1, DigestType.CRC32, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "createLedger: valid params (1,1,1) CRC32" },

                /* 2 */  { MethodUnderTest.CREATE_LEDGER, 2, 2, 1, DigestType.CRC32, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "createLedger: valid params (2,2,1) CRC32" },

                /* 3 */  { MethodUnderTest.CREATE_LEDGER, 3, 2, 2, DigestType.CRC32, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "createLedger: valid params (3,2,2) CRC32" },

                /* 4 */  { MethodUnderTest.CREATE_LEDGER, 1, 1, 0, DigestType.CRC32, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "createLedger: valid params (1,1,0) ackQuorum=0" },

                // --- Different digest types ---
                /* 5 */  { MethodUnderTest.CREATE_LEDGER, 1, 1, 1, DigestType.MAC, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "createLedger: valid params with MAC digest" },

                /* 6 */  { MethodUnderTest.CREATE_LEDGER, 1, 1, 1, DigestType.CRC32C, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "createLedger: valid params with CRC32C digest" },

                /* 7 */  { MethodUnderTest.CREATE_LEDGER, 1, 1, 1, DigestType.DUMMY, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "createLedger: valid params with DUMMY digest" },

                // --- Invalid createLedger scenarios: quorum constraints ---
                // /* X */  { MethodUnderTest.CREATE_LEDGER, 1, 2, 1, DigestType.CRC32, VALID_PASSWD,
                //            0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                //            "createLedger: invalid wQ > ensSize" },

                /* 8 */  { MethodUnderTest.CREATE_LEDGER, 1, 1, 2, DigestType.CRC32, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                "createLedger: invalid aQ > wQ" },

                /* 9 */  { MethodUnderTest.CREATE_LEDGER, -1, 1, 1, DigestType.CRC32, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                "createLedger: negative ensSize" },

                /* 10 */ { MethodUnderTest.CREATE_LEDGER, 1, -1, 1, DigestType.CRC32, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                "createLedger: negative writeQuorum" },


                // /* X */ { MethodUnderTest.CREATE_LEDGER, 1, 1, -1, DigestType.CRC32, VALID_PASSWD,
                //            0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                //            "createLedger: negative ackQuorum" },


                // /* X */ { MethodUnderTest.CREATE_LEDGER, 0, 0, 0, DigestType.CRC32, VALID_PASSWD,
                //            0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                //            "createLedger: all zeros (0,0,0)" },

                // --- Invalid createLedger scenarios: null/invalid parameters ---
                /* 11 */ { MethodUnderTest.CREATE_LEDGER, 1, 1, 1, null, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                "createLedger: null digestType" },

                /* 12 */ { MethodUnderTest.CREATE_LEDGER, 1, 1, 1, DigestType.CRC32, null,
                0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                "createLedger: null password" },

                // =====================================================================
                // openLedger tests
                // =====================================================================

                // --- Valid openLedger scenarios ---
                /* 13 */ { MethodUnderTest.OPEN_LEDGER, 2, 2, 1, DEFAULT_DIGEST, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "openLedger: valid ID on closed ledger" },

                /* 14 */ { MethodUnderTest.OPEN_LEDGER, 2, 2, 1, DEFAULT_DIGEST, VALID_PASSWD,
                0L, LedgerState.OPEN, Outcome.SUCCESS,
                "openLedger: valid ID on open ledger (triggers recovery)" },

                /* 15 */ { MethodUnderTest.OPEN_LEDGER, 2, 2, 1, DEFAULT_DIGEST, VALID_PASSWD,
                0L, LedgerState.IN_RECOVERY, Outcome.SUCCESS,
                "openLedger: valid ID on ledger in recovery" },

                // --- Invalid openLedger scenarios: wrong credentials ---
                /* 16 */ { MethodUnderTest.OPEN_LEDGER, 2, 2, 1, DEFAULT_DIGEST, WRONG_PASSWD,
                0L, LedgerState.CLOSED, Outcome.FAIL,
                "openLedger: wrong password" },

                /* 17 */ { MethodUnderTest.OPEN_LEDGER, 2, 2, 1, DEFAULT_DIGEST, EMPTY_PASSWD,
                0L, LedgerState.CLOSED, Outcome.EXCEPTION,
                "openLedger: empty password" },

                /* 18 */ { MethodUnderTest.OPEN_LEDGER, 2, 2, 1, DEFAULT_DIGEST, null,
                0L, LedgerState.CLOSED, Outcome.FAIL,
                "openLedger: null password" },

                // --- Invalid openLedger scenarios: invalid ledger ID ---
                /* 19 */ { MethodUnderTest.OPEN_LEDGER, 2, 2, 1, DEFAULT_DIGEST, VALID_PASSWD,
                INVALID_LEDGER_ID, LedgerState.CLOSED, Outcome.EXCEPTION,
                "openLedger: negative ledger ID" },

                /* 20 */ { MethodUnderTest.OPEN_LEDGER, 2, 2, 1, DEFAULT_DIGEST, VALID_PASSWD,
                NON_EXISTENT_LEDGER_ID, LedgerState.CLOSED, Outcome.FAIL,
                "openLedger: non-existent ledger ID" },

                // =====================================================================
                // deleteLedger tests
                // Note: deleteLedger API does NOT throw exceptions for invalid/non-existent IDs.
                // We verify behavior by checking if the original ledger still exists.
                // =====================================================================

                // --- deleteLedger with existing ledger ID: ledger should be deleted ---
                /* 21 */ { MethodUnderTest.DELETE_LEDGER, 1, 1, 1, DEFAULT_DIGEST, VALID_PASSWD,
                0L, LedgerState.CLOSED, Outcome.SUCCESS,
                "deleteLedger: delete existing ledger - ledger should NOT exist after" },

                // --- deleteLedger with invalid ID: original ledger should still exist ---
                /* 22 */ { MethodUnderTest.DELETE_LEDGER, 1, 1, 1, DEFAULT_DIGEST, VALID_PASSWD,
                INVALID_LEDGER_ID, LedgerState.CLOSED, Outcome.FAIL,
                "deleteLedger: negative ledger ID - original ledger should still exist" },

                // --- deleteLedger with non-existent ID: original ledger should still exist ---
                /* 23 */ { MethodUnderTest.DELETE_LEDGER, 1, 1, 1, DEFAULT_DIGEST, VALID_PASSWD,
                NON_EXISTENT_LEDGER_ID, LedgerState.CLOSED, Outcome.FAIL,
                "deleteLedger: non-existent ledger ID - original ledger should still exist" },
        });
    }

    public BookKeeperFewShotTest(MethodUnderTest methodUnderTest, int ensSize, int writeQuorumSize,
                                 int ackQuorumSize, DigestType digestType, byte[] passwd,
                                 long ledgerId, LedgerState ledgerState, Outcome expectedOutcome,
                                 String testDescription) {
        // Start 3 bookies with 60 second timeout
        super(3, 60);

        this.methodUnderTest = methodUnderTest;
        this.ensSize = ensSize;
        this.writeQuorumSize = writeQuorumSize;
        this.ackQuorumSize = ackQuorumSize;
        this.digestType = digestType;
        this.passwd = passwd;
        this.ledgerId = ledgerId;
        this.ledgerState = ledgerState;
        this.expectedOutcome = expectedOutcome;
        this.testDescription = testDescription;
    }

    @Before
    @Override
    public void setUp() throws Exception {
        baseConf.setJournalWriteData(true);
        baseClientConf.setUseV2WireProtocol(true);
        super.setUp();
        this.bkClient = new BookKeeper(baseClientConf);

        // Pre-create ledger for openLedger and deleteLedger tests
        if (methodUnderTest == MethodUnderTest.OPEN_LEDGER ||
                methodUnderTest == MethodUnderTest.DELETE_LEDGER) {
            setupPreExistingLedger();
        }
    }

    /**
     * Sets up a pre-existing ledger for openLedger and deleteLedger tests.
     */
    private void setupPreExistingLedger() throws Exception {
        // Create ledger with default valid parameters
        this.ledgerHandle = bkClient.createLedger(2, 2, 1, DEFAULT_DIGEST, VALID_PASSWD);

        // Add test entries
        ledgerHandle.addEntry(TEST_ENTRY_1);
        ledgerHandle.addEntry(TEST_ENTRY_2);

        // Set up ledger state based on test requirements
        switch (ledgerState) {
            case OPEN:
                // Keep ledger open
                break;
            case CLOSED:
                ledgerHandle.close();
                break;
            case IN_RECOVERY:
                // Open ledger with second client to trigger fencing/recovery
                this.bkClient2 = new BookKeeper(baseClientConf);
                this.recoveryHandle = bkClient2.openLedger(
                        ledgerHandle.getId(), DEFAULT_DIGEST, VALID_PASSWD);
                // Verify the original writer is fenced
                assertWriterIsFenced();
                break;
        }
    }

    @Test
    public void testBookKeeperMethod() {
        switch (methodUnderTest) {
            case CREATE_LEDGER:
                testCreateLedger();
                break;
            case OPEN_LEDGER:
                testOpenLedger();
                break;
            case DELETE_LEDGER:
                testDeleteLedger();
                break;
        }
    }

    // =========================================================================
    // createLedger test implementation
    // =========================================================================

    private void testCreateLedger() {
        if (expectedOutcome == Outcome.EXCEPTION || expectedOutcome == Outcome.FAIL) {
            // Expecting an exception/failure
            try {
                this.createdLedger = this.bkClient.createLedger(
                        this.ensSize, this.writeQuorumSize, this.ackQuorumSize,
                        this.digestType, this.passwd);

                // Try to write to verify ledger is functional
                this.createdLedger.addEntry("Test entry".getBytes(StandardCharsets.UTF_8));

                Assert.fail("Expected an exception but createLedger succeeded: " + testDescription);

            } catch (Exception e) {
                // Expected behavior: exception was thrown
                Assert.assertTrue("Exception correctly thrown for: " + testDescription,
                        expectedOutcome == Outcome.EXCEPTION || expectedOutcome == Outcome.FAIL);
            }
        } else {
            // Expecting success
            try {
                this.createdLedger = this.bkClient.createLedger(
                        this.ensSize, this.writeQuorumSize, this.ackQuorumSize,
                        this.digestType, this.passwd);

                Assert.assertNotNull("LedgerHandle should not be null", this.createdLedger);

                // Verify ledger is functional by adding entries
                this.createdLedger.addEntry(TEST_ENTRY_1);
                this.createdLedger.addEntry(TEST_ENTRY_2);

                // Verify metadata matches parameters
                verifyLedgerMetadata(this.createdLedger);

            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail("No exception expected but got " + e.getClass().getName() +
                        ": " + e.getMessage() + " for: " + testDescription);
            }
        }
    }

    private void verifyLedgerMetadata(LedgerHandle lh) {
        LedgerMetadata metadata = lh.getLedgerMetadata();

        Assert.assertEquals("Ensemble size mismatch", this.ensSize, metadata.getEnsembleSize());
        Assert.assertEquals("Write quorum mismatch", this.writeQuorumSize, metadata.getWriteQuorumSize());
        Assert.assertEquals("Ack quorum mismatch", this.ackQuorumSize, metadata.getAckQuorumSize());

        if (this.digestType != null) {
            Assert.assertEquals("Digest type mismatch",
                    this.digestType.toString(), metadata.getDigestType().toString());
        }

        if (this.passwd != null) {
            Assert.assertArrayEquals("Password mismatch", this.passwd, metadata.getPassword());
        }
    }

    // =========================================================================
    // openLedger test implementation
    // =========================================================================

    private void testOpenLedger() {
        // Determine ledger ID to use
        long idToOpen = (this.ledgerId == 0L) ? ledgerHandle.getId() : this.ledgerId;

        LedgerHandle openedLedger = null;
        Exception caughtException = null;

        try {
            openedLedger = this.bkClient.openLedger(idToOpen, this.digestType, this.passwd);

            // Verify we can read entries
            assertCanReadEntries(openedLedger);

            // Verify fencing behavior for OPEN/IN_RECOVERY states
            if (idToOpen == ledgerHandle.getId() && !ledgerHandle.isClosed() &&
                    (ledgerState == LedgerState.OPEN || ledgerState == LedgerState.IN_RECOVERY)) {
                assertWriterIsFenced();
            }

        } catch (Exception e) {
            caughtException = e;
        } finally {
            if (openedLedger != null) {
                try {
                    openedLedger.close();
                } catch (Exception ignore) { }
            }
        }

        // Verify outcome
        switch (expectedOutcome) {
            case SUCCESS:
                Assert.assertNull("No exception expected but got: " +
                        (caughtException != null ? caughtException.getClass().getSimpleName() +
                                ": " + caughtException.getMessage() : ""), caughtException);
                break;
            case FAIL:
                Assert.assertNotNull("Expected BKException but openLedger succeeded", caughtException);
                Assert.assertTrue("Expected BKException but got: " + caughtException.getClass().getSimpleName(),
                        caughtException instanceof BKException);
                break;
            case EXCEPTION:
                Assert.assertNotNull("Expected an exception but openLedger succeeded", caughtException);
                break;
        }
    }

    private void assertCanReadEntries(LedgerHandle lh) throws Exception {
        Enumeration<LedgerEntry> entries = lh.readEntries(0, 1);

        Assert.assertTrue("Expected entry 0", entries.hasMoreElements());
        LedgerEntry entry0 = entries.nextElement();
        Assert.assertArrayEquals("Entry 0 content mismatch", TEST_ENTRY_1, entry0.getEntry());

        Assert.assertTrue("Expected entry 1", entries.hasMoreElements());
        LedgerEntry entry1 = entries.nextElement();
        Assert.assertArrayEquals("Entry 1 content mismatch", TEST_ENTRY_2, entry1.getEntry());
    }

    private void assertWriterIsFenced() throws Exception {
        try {
            ledgerHandle.addEntry("should-fail-after-fencing".getBytes(StandardCharsets.UTF_8));
            Assert.fail("Writer should be fenced but write succeeded");
        } catch (BKException expected) {
            // Expected: writer is fenced
        }
    }

    // =========================================================================
    // deleteLedger test implementation
    // Note: deleteLedger API does NOT throw exceptions for invalid/non-existent IDs.
    // =========================================================================

    private void testDeleteLedger() {
        // Determine ledger ID to delete
        long idToDelete = (this.ledgerId == 0L) ? ledgerHandle.getId() : this.ledgerId;
        long originalLedgerId = ledgerHandle.getId();

        try {
            // Close ledger before deleting if not already closed
            if (!ledgerHandle.isClosed()) {
                ledgerHandle.close();
            }

            // Perform deletion - API does NOT throw exceptions for invalid/non-existent IDs
            bkClient.deleteLedger(idToDelete);

            if (idToDelete == originalLedgerId) {
                ledgerDeleted = true;
            }

        } catch (Exception e) {
            // Unexpected exception
            Assert.fail("Unexpected exception during deleteLedger: " + e.getMessage());
        }

        // Verify the outcome based on whether original ledger should exist
        switch (expectedOutcome) {
            case SUCCESS:
                // Delete of existing ledger should succeed - ledger should NOT exist
                assertLedgerDoesNotExist(originalLedgerId);
                break;
            case FAIL:
                // Delete of invalid/non-existent ID - original ledger should STILL exist
                assertLedgerExists(originalLedgerId);
                break;
            case EXCEPTION:
                // Not expected for deleteLedger API
                break;
        }
    }

    private void assertLedgerExists(long ledgerId) {
        try {
            LedgerHandle lh = bkClient.openLedger(ledgerId, DEFAULT_DIGEST, VALID_PASSWD);
            lh.close();
            // Ledger exists as expected
        } catch (Exception e) {
            Assert.fail("Ledger " + ledgerId + " should exist but could not be opened: " + e.getMessage());
        }
    }

    private void assertLedgerDoesNotExist(long ledgerId) {
        try {
            LedgerHandle lh = bkClient.openLedger(ledgerId, DEFAULT_DIGEST, VALID_PASSWD);
            lh.close();
            Assert.fail("Ledger " + ledgerId + " should not exist but was opened successfully");
        } catch (BKException e) {
            // Expected: ledger does not exist
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Assert.fail("Interrupted while checking ledger existence");
        }
    }

    // =========================================================================
    // Cleanup
    // =========================================================================

    @Override
    @After
    public void tearDown() throws Exception {
        // Close recovery handle
        if (recoveryHandle != null) {
            try {
                recoveryHandle.close();
            } catch (Exception ignore) { }
        }

        // Close created ledger (from createLedger tests)
        if (createdLedger != null && !createdLedger.isClosed()) {
            try {
                createdLedger.close();
            } catch (Exception ignore) { }
        }

        // Close ledger handle (from openLedger/deleteLedger tests)
        if (ledgerHandle != null && !ledgerHandle.isClosed() && !ledgerDeleted) {
            try {
                ledgerHandle.close();
            } catch (Exception ignore) { }
        }

        // Close second BookKeeper client
        if (bkClient2 != null) {
            try {
                bkClient2.close();
            } catch (Exception ignore) { }
        }

        // Close primary BookKeeper client
        if (bkClient != null) {
            try {
                bkClient.close();
            } catch (Exception ignore) { }
        }

        super.tearDown();
    }
}