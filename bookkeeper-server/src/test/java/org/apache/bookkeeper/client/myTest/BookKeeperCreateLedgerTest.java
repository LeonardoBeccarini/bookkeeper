package org.apache.bookkeeper.client.myTest;

import org.apache.bookkeeper.client.BookKeeper;
import org.apache.bookkeeper.client.BookKeeper.DigestType;
import org.apache.bookkeeper.client.LedgerHandle;
import org.apache.bookkeeper.test.BookKeeperClusterTestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class BookKeeperCreateLedgerTest extends BookKeeperClusterTestCase {

    // Parametri del test
    private final int ensSize;
    private final int wQS;
    private final int aQS;
    private final DigestType digestType;
    private final byte[] password;

    // Semplificato: true se ci aspettiamo un errore, false se deve funzionare
    private final boolean isExceptionExpected;

    private BookKeeper bkClient;
    private LedgerHandle lh;

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
                /* 11 */ {  0,  1,  1, DigestType.CRC32, "pippo", true },
                /* 12 */ {  0,  1,  0, DigestType.CRC32, "pippo", true },
                /* 13 */ {  0,  0,  1, DigestType.CRC32, "pippo", true },
                /* 14 */ {  0,  0,  0, DigestType.CRC32, "pippo", true },
                /* 15 */ {  0,  0, -1, DigestType.CRC32, "pippo", true },
                /* 16 */ {  0, -1,  0, DigestType.CRC32, "pippo", true },
                /* 17 */ {  0, -1, -1, DigestType.CRC32, "pippo", true },
                /* 18 */ {  0, -1, -2, DigestType.CRC32, "pippo", true },
                /* 19 */ {  1,  2,  3, DigestType.CRC32, "pippo", true },
                /* 20 */ {  1,  2,  2, DigestType.CRC32, "pippo", true },
                /* 21 */ {  1,  2,  1, DigestType.CRC32, "pippo", true },
                /* 22 */ {  1,  1,  2, DigestType.CRC32, "pippo", true },
                /* 23 */ {  1,  1,  1, DigestType.CRC32, "pippo", false }, // Successo Atteso
                /* 24 */ {  1,  1,  0, DigestType.CRC32, "pippo", false }, // Successo Atteso
                /* 25 */ {  1,  0,  1, DigestType.CRC32, "pippo", true },
                /* 26 */ {  1,  0,  0, DigestType.CRC32, "pippo", true },
                /* 27 */ {  1,  0, -1, DigestType.CRC32, "pippo", true },

                // --- Test Unidimensionali per digestType ---
                /* 28 */ {  1,  1,  1, DigestType.CRC32C, "pippo", false }, // Successo Atteso
                /* 29 */ {  1,  1,  1, DigestType.DUMMY,  "pippo", false }, // Successo Atteso
                /* 30 */ {  1,  1,  1, DigestType.MAC,    "pippo", false }, // Successo Atteso
                /* 31 */ {  1,  1,  1, null,              "pippo", true },

                // --- Test Unidimensionali per passwd ---
                /* 32 */ {  1,  1,  1, DigestType.CRC32,  " ",     false }, // Successo Atteso
                /* 33 */ {  1,  1,  1, DigestType.CRC32,  null,    true }
        });
    }

    public BookKeeperCreateLedgerTest(int ensSize, int wQS, int aQS, DigestType digestType, String passw, boolean isExceptionExpected) {
        // Avviamo 3 bookies per garantire che i casi di successo (es. quorum=1) funzionino sempre.
        super(3);
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
        LedgerHandle lh = null;
        try {
            // Eseguiamo la creazione in modo asincrono con un timeout breve (2 secondi).
            // Questo gestisce i casi in cui il client si blocca aspettando bookies che non esistono.
            CompletableFuture<LedgerHandle> future = CompletableFuture.supplyAsync(() -> {
                try {
                    return bkClient.createLedger(this.ensSize, this.wQS, this.aQS, this.digestType, this.password);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            });

            lh = future.get(2, TimeUnit.SECONDS);

            // --- SE ARRIVIAMO QUI, IL LEDGER È STATO CREATO ---

            if (isExceptionExpected) {
                // Caso Zombie: Il ledger è stato creato ma i parametri erano invalidi (es. 0,0,0).
                // Proviamo a scrivere una entry per vedere se funziona davvero.
                try {
                    lh.addEntry("Test".getBytes());
                    // Se la scrittura riesce, il test fallisce (doveva rompersi!)
                    Assert.fail("Fallimento atteso (parametri invalidi), ma il ledger è stato creato e scritto con successo.");
                } catch (Exception e) {
                    // La scrittura è fallita -> Ottimo, il ledger era rotto come previsto.
                }
            } else {
                // Caso Successo: Doveva funzionare e ha funzionato.
                Assert.assertNotNull(lh);
                lh.close();
            }

        } catch (Exception e) {
            // --- GESTIONE ERRORI E TIMEOUT ---

            // Qualsiasi eccezione (Timeout, IllegalArgument, BKException) è considerata un "Fallimento della creazione".

            if (!isExceptionExpected) {
                e.printStackTrace();
                Assert.fail("Successo atteso, ma è stata lanciata un'eccezione: " + e.getMessage());
            }
        }
    }
}