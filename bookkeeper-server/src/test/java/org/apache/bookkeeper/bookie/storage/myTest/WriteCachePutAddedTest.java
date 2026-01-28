package org.apache.bookkeeper.bookie.storage.myTest;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.bookie.storage.ldb.WriteCache;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test aggiuntivi per uccidere le mutazioni SURVIVED alle linee 150, 153, 170.
 * Complementari ai test parametrizzati in WriteCachePutTest.
 */
public class WriteCachePutAddedTest {

    private WriteCache cache;

    @After
    public void tearDown() {
        if (cache != null) {
            cache.close();
        }
    }

    /**
     * LINEA 150: (offset + size) > maxCacheSize
     * Mutazione: changed conditional boundary (> diventa >=)
     * Test: entry che riempie ESATTAMENTE la cache deve passare.
     * - Originale: (0 + 64) > 64 è FALSE → passa
     * - Mutato:    (0 + 64) >= 64 è TRUE → fallirebbe
     */
    @Test
    public void testCacheBoundaryExactFit() {
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 64, 64);

        ByteBuf entry = Unpooled.buffer(64);
        entry.writeZero(64);

        assertTrue("Entry che riempie esattamente la cache deve passare", cache.put(0L, 0L, entry));
        entry.release();
    }

    /**
     * LINEA 153: maxSegmentSize - localOffset < size
     * Test: entry che non entra nel segmento corrente deve saltare al successivo.
     * IMPORTANTE: alignedSize deve essere MINORE di maxSegmentSize per permettere
     * al retry di trovare un localOffset diverso.
     */
    @Test
    public void testSegmentCrossing() {
        // maxSegmentSize=256, così alignedSize (192) < maxSegmentSize
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024, 256);

        // Entry1: 100 bytes -> alignedSize=128
        // localOffset=0, segmentIdx=0, 256-0=256 >= 100 -> entra
        ByteBuf entry1 = Unpooled.buffer(100);
        entry1.writeZero(100);
        assertTrue(cache.put(0L, 0L, entry1));

        // Entry2: 150 bytes -> alignedSize=192 (< 256!)
        // Iter1: offset=128, localOffset=128, 256-128=128 < 150 -> CONTINUE
        // Iter2: offset=320, localOffset=64, 256-64=192 >= 150 -> entra
        ByteBuf entry2 = Unpooled.buffer(150);
        entry2.writeZero(150);
        assertTrue("Entry che causa segment crossing deve passare", cache.put(0L, 1L, entry2));

        assertNotNull(cache.get(0L, 0L));
        assertNotNull(cache.get(0L, 1L));

        entry1.release();
        entry2.release();
    }
    /**
     * LINEA 170: currentLastEntryId > entryId
     * Mutazione: removed conditional (sostituito con false)
     * Test: inserire entry con ID alto, poi con ID basso.
     * lastEntry deve restare quella con ID maggiore.
     */
    @Test
    public void testOutOfOrderHighThenLow() {
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024);

        ByteBuf high = Unpooled.buffer(8);
        high.writeLong(10L);
        cache.put(0L, 10L, high);

        ByteBuf low = Unpooled.buffer(8);
        low.writeLong(5L);
        cache.put(0L, 5L, low);

        // currentLastEntryId=10 > 5 → break, lastEntry resta 10
        ByteBuf last = cache.getLastEntry(0L);
        assertNotNull(last);
        assertEquals("Last entry deve restare quella con ID maggiore", 10L, last.readLong());

        high.release();
        low.release();
        last.release();
    }

    /**
     * LINEA 170: currentLastEntryId > entryId
     * Mutazione: changed boundary (> diventa >=)
     * Test: inserire due entry con lo STESSO entryId.
     * - Originale: 10 > 10 è FALSE → aggiorna lastEntry
     * - Mutato:    10 >= 10 è TRUE → non aggiornerebbe (break)
     */
    @Test
    public void testSameEntryIdTwice() {
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024);

        ByteBuf first = Unpooled.buffer(8);
        first.writeLong(100L);
        cache.put(0L, 10L, first);

        ByteBuf second = Unpooled.buffer(8);
        second.writeLong(200L);
        cache.put(0L, 10L, second);

        // 10 > 10 è FALSE → NON fa break, lastEntry viene aggiornata
        ByteBuf last = cache.getLastEntry(0L);
        assertNotNull("lastEntry deve esistere dopo put con stesso ID", last);

        first.release();
        second.release();
        last.release();
    }
}