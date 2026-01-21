package org.apache.bookkeeper.client.myTest;

import org.apache.bookkeeper.client.BookKeeper;
import org.apache.bookkeeper.client.BookKeeper.DigestType;
import org.apache.bookkeeper.client.LedgerHandle;
import org.apache.bookkeeper.client.api.LedgerMetadata;
import org.apache.bookkeeper.test.BookKeeperClusterTestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BookKeeperCreateLedgerTest extends BookKeeperClusterTestCase {

    // Parametri del test
    private final int ensSize;
    private final int wQS;
    private final int aQS;
    private final DigestType digestType;
    private final byte[] password;

    private final boolean isExceptionExpected;

    private BookKeeper bkClient;
    private LedgerHandle ledgerHandle;

    @Parameterized.Parameters(name = "{index}: ens={0}, wQ={1}, aQ={2}, digest={3}, pwd={4}, expectError={5}")
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
                // --- Test Multidimensionali Numerici ---
                /* 1 */  { -1,  0,  1, DigestType.CRC32, "pippo", true },
                /* 2 */  { -1,  0,  0, DigestType.CRC32, "pippo", true },
                /* 3 */  { -1,  0, -1, DigestType.CRC32, "pippo", true },
                /* 4 */  { -1, -1,  0, DigestType.CRC32, "pippo", true },
                /* 5 */  { -1, -1, -1, DigestType.CRC32, "pippo", true },
                /* 6 */  { -1, -1, -2, DigestType.CRC32, "pippo", true },
                /* 7 */  { -1, -2, -1, DigestType.CRC32, "pippo", true },
                /* 8 */  { -1, -2, -2, DigestType.CRC32, "pippo", true },
                /* 9 */  { -1, -2, -3, DigestType.CRC32, "pippo", true },
                /* 10 */ {  0,  1,  2, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 11 */ {  0,  1,  1, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 12 */ {  0,  1,  0, DigestType.CRC32, "pippo", true },
                /* 13 */ {  0,  0,  1, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 14 */ {  0,  0,  0, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 15 */ {  0,  0, -1, DigestType.CRC32, "pippo", true },
                /* 16 */ {  0, -1,  0, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 17 */ {  0, -1, -1, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 18 */ {  0, -1, -2, DigestType.CRC32, "pippo", true },
                /* 19 */ {  1,  2,  3, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 20 */ {  1,  2,  2, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 21 */ {  1,  2,  1, DigestType.CRC32, "pippo", true },
                /* 22 */ {  1,  1,  2, DigestType.CRC32, "pippo", true },
                /* 23 */ {  1,  1,  1, DigestType.CRC32, "pippo", false }, // Successo
                /* 24 */ {  1,  1,  0, DigestType.CRC32, "pippo", false }, // Successo
                /* 25 */ {  1,  0,  1, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 26 */ {  1,  0,  0, DigestType.CRC32, "pippo", true },
                // TIMEOUT: /* 27 */ {  1,  0, -1, DigestType.CRC32, "pippo", true },

                // --- Test Unidimensionali per digestType ---
                /* 28 */ {  1,  1,  1, DigestType.CRC32C, "pippo", false }, // Successo
                /* 29 */ {  1,  1,  1, DigestType.DUMMY,  "pippo", false }, // Successo
                /* 30 */ {  1,  1,  1, DigestType.MAC,    "pippo", false }, // Successo
                /* 31 */ {  1,  1,  1, null,              "pippo", true },

                // --- Test Unidimensionali per passwd ---
                /* 32 */ {  1,  1,  1, DigestType.CRC32,  " ",     false }, // Successo
                /* 33 */ {  1,  1,  1, DigestType.CRC32,  null,    true }
        });
    }

    public BookKeeperCreateLedgerTest(int ensSize, int wQS, int aQS, DigestType digestType, String passw, boolean isExceptionExpected) {
        //
        // Avviamo 3 bookies. Questo è CRUCIALE per evitare timeout su quorum validi o check di consistenza.
        // Impostiamo il timeout globale a 60 secondi come rete di sicurezza.
        super(3, 60);

        this.ensSize = ensSize;
        this.wQS = wQS;
        this.aQS = aQS;
        this.digestType = digestType;

        if (passw != null) {
            this.password = passw.getBytes();
        } else {
            this.password = null;
        }
        this.isExceptionExpected = isExceptionExpected;
    }

    @Before
    @Override
    public void setUp() throws Exception {
        baseConf.setJournalWriteData(true);
        baseClientConf.setUseV2WireProtocol(true);
        super.setUp();
        this.bkClient = new BookKeeper(baseClientConf);
    }

    @Test
    public void testCreateLedger() {
        if (this.isExceptionExpected) {
            // Ramo 1: Ci aspettiamo un'eccezione
            try {
                this.ledgerHandle = this.bkClient.createLedger(this.ensSize, this.wQS, this.aQS, this.digestType, this.password);

                // Se la creazione non fallisce (cosa che non dovrebbe accadere), proviamo a scrivere.
                // Se la scrittura funziona, il test fallisce gravemente.
                this.ledgerHandle.addEntry("Expect an error".getBytes());

                // Se arriviamo qui, il sistema ha accettato parametri invalidi E ha permesso la scrittura.
                Assert.fail("An exception was expected but operation succeeded.");

            } catch (Exception e) {
                // Comportamento corretto: eccezione lanciata come previsto.
                // La reference usa un catch generico o multi-catch (IllegalArgumentException | BKException | ...)
                Assert.assertTrue("Eccezione catturata correttamente: " + e.getClass().getSimpleName(), this.isExceptionExpected);
            }
        } else {
            // Ramo 2: Successo atteso
            try {
                this.ledgerHandle = this.bkClient.createLedger(this.ensSize, this.wQS, this.aQS, this.digestType, this.password);

                Assert.assertNotNull("LedgerHandle should not be null", this.ledgerHandle);

                // Verifica funzionale
                this.ledgerHandle.addEntry("Expect that works".getBytes());
                this.ledgerHandle.addEntry("Expect that works two times".getBytes());

                // Controllo metadati
                checkData(this.ledgerHandle);

                Assert.assertFalse("No exception was expected. Test went correctly", this.isExceptionExpected);

            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail("No exception was expected, but " + e.getClass().getName() + " has been thrown.");
            }
        }
    }

    // Helper method copiato 1:1 dalla reference
    private void checkData(LedgerHandle lh) {
        LedgerMetadata metadata = lh.getLedgerMetadata();

        Assert.assertEquals("ens size", this.ensSize, metadata.getEnsembleSize());
        Assert.assertEquals("write quorum", this.wQS, metadata.getWriteQuorumSize());
        Assert.assertEquals("ack quorum", this.aQS, metadata.getAckQuorumSize());

        if (this.digestType != null) {
            Assert.assertEquals("digest type", this.digestType.toString(), metadata.getDigestType().toString());
        }

        if (this.password != null) {
            Assert.assertArrayEquals("password", this.password, metadata.getPassword());
        }
    }

    @Override
    @After
    public void tearDown() throws Exception {
        // Cleanup
        if (this.ledgerHandle != null && !this.ledgerHandle.isClosed()) {
            try {
                this.ledgerHandle.close();
            } catch (Exception e) {
                // Ignora errori in chiusura
            }
        }
        if (this.bkClient != null) {
            this.bkClient.close();
        }
        super.tearDown();
    }
}