package org.apache.bookkeeper.bookie.storage.myTest;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.bookie.storage.ldb.WriteCache;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Test suite per la classe WriteCache.
 * <p>
 * Questa classe implementa un approccio Black-Box Testing basato sulle classi di equivalenza
 * e Boundary Value Analysis. Utilizza JUnit 4 Parameterized runner per coprire la
 * matrice multidimensionale di scenari (Stato Cache + Input).
 * </p>
 */
@RunWith(Parameterized.class)
public class WriteCachePutTest {

    public enum CacheState {
        AVAILABLE,
        FULL,
        CLOSED
    }

    public enum BufType {
        VALID,
        EMPTY,
        NULL,
        INVALID
    }

    public enum Outcome {
        TRUE,
        FALSE,
        EXCEPTION,
        NPE
    }

    private final int testCaseId;
    private final long ledgerId;
    private final long entryId;
    private final BufType bufType;
    private final CacheState initialState;
    private final Outcome expectedOutcome;

    private WriteCache writeCache;
    private ByteBuf entryBuffer;

    public WriteCachePutTest(int testCaseId, long ledgerId, long entryId,
                          BufType bufType, CacheState initialState, Outcome expectedOutcome) {
        this.testCaseId = testCaseId;
        this.ledgerId = ledgerId;
        this.entryId = entryId;
        this.bufType = bufType;
        this.initialState = initialState;
        this.expectedOutcome = expectedOutcome;
    }

    @Parameters(name = "Test #{0}: L={1}, E={2}, Buf={3}, State={4} -> Expect={5}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Happy Path & Boundary
                {1,  100L, 0L, BufType.VALID, CacheState.AVAILABLE, Outcome.TRUE},
                {2,  100L, 0L, BufType.EMPTY, CacheState.AVAILABLE, Outcome.TRUE},

                // Invalid Inputs
                {3,  -1L,  0L, BufType.VALID, CacheState.AVAILABLE, Outcome.EXCEPTION},
                {4,  100L, -1L, BufType.VALID, CacheState.AVAILABLE, Outcome.EXCEPTION},
                {5,  100L, 0L, BufType.NULL,  CacheState.AVAILABLE, Outcome.NPE},
                {6,  100L, 0L, BufType.INVALID, CacheState.AVAILABLE, Outcome.EXCEPTION},

                // State Constraints
                {7,  100L, 0L, BufType.VALID, CacheState.FULL,      Outcome.FALSE},
                {8,  100L, 0L, BufType.VALID, CacheState.CLOSED,    Outcome.EXCEPTION},

                // Interaction & Priority Checks
                {9,  100L, 0L, BufType.NULL,    CacheState.FULL,    Outcome.NPE},
                //Test #10 ora si aspetta FALSE (Check Full vince su Check ID)
                {10, -1L,  0L, BufType.VALID,   CacheState.FULL,    Outcome.FALSE},
                {11, 100L, 0L, BufType.INVALID, CacheState.CLOSED,  Outcome.EXCEPTION},
                {12, -1L, -1L, BufType.VALID,   CacheState.AVAILABLE, Outcome.EXCEPTION}
        });
    }

    @Before
    public void setUp() {
        ByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;
        long maxCacheSize = 1024;
        writeCache = new WriteCache(allocator, maxCacheSize);

        switch (initialState) {
            case AVAILABLE:
                break;
            case FULL:
                ByteBuf filler = Unpooled.buffer((int) maxCacheSize);
                filler.writeZero((int) maxCacheSize);
                boolean filled = writeCache.put(9999, 9999, filler);
                assertTrue("Setup error: Impossibile riempire la cache", filled);
                break;
            case CLOSED:
                writeCache.close();
                break;
        }
        createEntryBuffer();
    }

    @After
    public void tearDown() {
        // 1. Chiudiamo la cache (se non è già chiusa)
        if (writeCache != null) {
            try {
                writeCache.close();
            } catch (Exception e) {
                // Ignora errori di chiusura nel teardown
            }
        }

        // 2. Rilascio robusto del buffer
        // Non tocchiamo i Mock (INVALID) o i NULL
        if (entryBuffer != null && bufType != BufType.INVALID && bufType != BufType.NULL) {
            try {
                // Usiamo ReferenceCountUtil.safeRelease che gestisce null e controlli base
                // Ma aggiungiamo un controllo manuale sul refCnt per evitare eccezioni di Netty
                if (entryBuffer.refCnt() > 0) {
                    entryBuffer.release();
                }
            } catch (Throwable t) {
                // CATTURA TUTTO: IllegalReferenceCountException è un Error/RuntimeException
                // Se siamo qui, il buffer è già stato rilasciato o è corrotto.
                // Ignoriamo perché il test è finito.
            }
        }
    }

    @Test
    public void testPutScenario() {
        try {
            boolean result = writeCache.put(ledgerId, entryId, entryBuffer);

            if (expectedOutcome == Outcome.EXCEPTION || expectedOutcome == Outcome.NPE) {
                fail("Attesa eccezione " + expectedOutcome + " ma il metodo ha ritornato: " + result);
            }

            if (expectedOutcome == Outcome.TRUE) {
                assertTrue("Test #" + testCaseId + " fallito: atteso TRUE", result);

                // Verifica che l'entry sia stata effettivamente scritta nella cache
                if (initialState == CacheState.AVAILABLE) {
                    assertTrue("Test #" + testCaseId + ": entry non trovata nella cache dopo put()",
                            writeCache.hasEntry(ledgerId, entryId));

                    ByteBuf retrieved = writeCache.get(ledgerId, entryId);
                    assertNotNull("Test #" + testCaseId + ": get() ha ritornato null dopo put() riuscito",
                            retrieved);
                    assertEquals("Test #" + testCaseId + ": dimensione entry non corrisponde",
                            entryBuffer.readableBytes(), retrieved.readableBytes());
                    retrieved.release();
                }

            } else if (expectedOutcome == Outcome.FALSE) {
                assertFalse("Test #" + testCaseId + " fallito: atteso FALSE", result);
            }

        } catch (NullPointerException e) {
            if (expectedOutcome != Outcome.NPE) {
                fail("Ricevuta NPE inaspettata per Test #" + testCaseId + ": " + e.getMessage());
            }
        } catch (IllegalArgumentException e) {
            // Gestione specifica per ID negativi
            if (expectedOutcome != Outcome.EXCEPTION) {
                fail("Ricevuta IllegalArgumentException inaspettata per Test #" + testCaseId + ": " + e.getMessage());
            }
        } catch (Exception e) {
            // Gestione altre eccezioni (es. IllegalStateException per cache chiusa)
            if (expectedOutcome != Outcome.EXCEPTION) {
                fail("Ricevuta eccezione inaspettata (" + e.getClass().getSimpleName() + ") per Test #" + testCaseId + ": " + e.getMessage());
            }
        }
    }
    // =========================================================================
// BRANCH: maxSegmentSize - localOffset < size → TRUE (continue)
// =========================================================================

    /**
     * TC-WB-01: Entry al boundary del segmento - forza continue nel loop
     * Branch target: maxSegmentSize - localOffset < size → TRUE
     */
    @Test
    public void testBranch_SegmentBoundary_EntryCrossesSegment() {
        int segmentSize = 256;
        int cacheSize = segmentSize * 2;

        try (WriteCache cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, cacheSize, segmentSize)) {
            // Prima entry: 192 bytes → rimangono 64 bytes nel primo segmento
            ByteBuf entry1 = Unpooled.buffer(192);
            entry1.writeZero(192);
            assertTrue(cache.put(1L, 1L, entry1));

            // Seconda entry: 100 bytes → non entra nei 64 bytes rimanenti
            // Triggera: maxSegmentSize - localOffset (64) < size (100) → TRUE
            ByteBuf entry2 = Unpooled.buffer(100);
            entry2.writeZero(100);
            assertTrue(cache.put(1L, 2L, entry2));

            entry1.release();
            entry2.release();
        }
    }

// =========================================================================
// BRANCH: currentLastEntryId > entryId → TRUE
// =========================================================================

    /**
     * TC-WB-02: Scrittura out-of-order - entryId più vecchio arriva dopo
     * Branch target: currentLastEntryId > entryId → TRUE
     */
    @Test
    public void testBranch_OutOfOrderWrite_OlderEntryAfterNewer() {
        try (WriteCache cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024, 1024)) {
            long ledgerId = 1L;

            // Prima inserzione: entryId = 100
            ByteBuf entry1 = Unpooled.buffer(10);
            entry1.writeZero(10);
            assertTrue(cache.put(ledgerId, 100L, entry1));

            // Seconda inserzione: entryId = 50 (più vecchio)
            // Triggera: currentLastEntryId (100) > entryId (50) → TRUE
            ByteBuf entry2 = Unpooled.buffer(10);
            entry2.writeZero(10);
            assertTrue(cache.put(ledgerId, 50L, entry2));

            entry1.release();
            entry2.release();
        }
    }

    private void createEntryBuffer() {
        switch (bufType) {
            case VALID:
                entryBuffer = Unpooled.buffer(10);
                entryBuffer.writeBytes("Test".getBytes());
                break;
            case EMPTY:
                entryBuffer = Unpooled.buffer(0);
                break;
            case NULL:
                entryBuffer = null;
                break;
            case INVALID:
                entryBuffer = Mockito.mock(ByteBuf.class);
                Mockito.when(entryBuffer.readableBytes()).thenReturn(-1);
                Mockito.when(entryBuffer.capacity()).thenReturn(-1);
                Mockito.when(entryBuffer.retainedDuplicate()).thenReturn(entryBuffer);
                break;
        }
    }
    
    
}