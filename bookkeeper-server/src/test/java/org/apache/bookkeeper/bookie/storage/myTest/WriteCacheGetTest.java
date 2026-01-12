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

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class WriteCacheGetTest {

    public enum CacheState {
        AVAILABLE,
        EMPTY,
        CLOSED
    }

    public enum Outcome {
        EXCEPTION,
        MISS,
        HIT
    }

    private static final int WRONG_ID = 47;
    private static final int ID = 0;
    private static final byte[] ENTRY = "Test entry 1".getBytes(StandardCharsets.UTF_8);

    private final int testNumber;
    private final long ledgerID;
    private final long entryID;
    private final CacheState cacheState;
    private final Outcome outcome;

    private WriteCache writeCache;

    public WriteCacheGetTest(int testNumber, int ledgerID, int entryId, CacheState cacheState, Outcome outcome) {
        this.testNumber = testNumber;
        this.entryID = entryId;
        this.ledgerID = ledgerID;
        this.cacheState = cacheState;
        this.outcome = outcome;
    }

    @Parameters(name = "Test #{0}:LedgerID{1}, EntryID{2}, CacheState={3} -> Outcome={4}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, ID, ID, CacheState.AVAILABLE, Outcome.HIT},
                {2, ID, WRONG_ID, CacheState.AVAILABLE, Outcome.MISS},
                {3, WRONG_ID, ID, CacheState.AVAILABLE, Outcome.MISS},
                {4, WRONG_ID, WRONG_ID, CacheState.AVAILABLE, Outcome.MISS},
            //    {5, ID, -1, CacheState.AVAILABLE, Outcome.EXCEPTION},
                {6, -1, ID, CacheState.AVAILABLE, Outcome.EXCEPTION},
                {7, -1, WRONG_ID, CacheState.AVAILABLE, Outcome.EXCEPTION},
             //   {8, WRONG_ID, -1, CacheState.AVAILABLE, Outcome.EXCEPTION},
                {9, -1, -1, CacheState.AVAILABLE, Outcome.EXCEPTION},
                {10, ID, ID, CacheState.EMPTY, Outcome.MISS},
                {11, ID, ID, CacheState.CLOSED, Outcome.MISS},
        });

    }

    @Before
    public void setUp() {
        ByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;
        long maxCacheSize = 1024;
        writeCache = new WriteCache(allocator, maxCacheSize);

        switch (cacheState) {
            case EMPTY:
                break;

            case AVAILABLE:
                ByteBuf buffer = Unpooled.wrappedBuffer(ENTRY);
                boolean inserted = writeCache.put(ID, ID, buffer);
                assertTrue("Setup fallito: impossibile inserire entry nella cache", inserted);
                break;

            case CLOSED:
                writeCache.close();
                break;
        }
    }

    @After
    public void tearDown() {
        if (writeCache != null) {
            if (cacheState != CacheState.CLOSED) {
                writeCache.close();
            }
            writeCache = null;
        }
    }

    @Test
    public void testGet() {
        switch (outcome) {
            case EXCEPTION:
                testException();
                break;

            case HIT:
                testHit();
                break;

            case MISS:
                testMiss();
                break;
        }
    }

    private void testException() {
        try {
            writeCache.get(ledgerID, entryID);
            fail("Test #" + testNumber + ": Attesa eccezione ma nessuna lanciata");
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
            // Eccezione attesa - il test passa
            System.out.println("Test #" + testNumber + ": Eccezione catturata come atteso: " +
                    e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    private void testHit() {
        ByteBuf result = writeCache.get(ledgerID, entryID);
        assertNotNull("Test #" + testNumber + ": Atteso HIT ma ottenuto null", result);

        // Verifico che i dati siano corretti
        byte[] resultData = new byte[result.readableBytes()];
        result.readBytes(resultData);
        assertArrayEquals("Test #" + testNumber + ": Dati non corrispondenti",
                ENTRY, resultData);

        result.release();
    }

    private void testMiss() {
        ByteBuf result = writeCache.get(ledgerID, entryID);
        assertNull("Test #" + testNumber + ": Atteso MISS ma ottenuto un valore", result);
    }
}
