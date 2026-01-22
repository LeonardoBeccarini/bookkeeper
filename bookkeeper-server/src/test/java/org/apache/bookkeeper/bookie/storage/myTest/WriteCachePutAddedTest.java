package org.apache.bookkeeper.bookie.storage.myTest;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.bookie.storage.ldb.WriteCache;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test per uccidere le mutazioni SURVIVED alle linee 150, 153, 170.

 * ANALISI WriteCache.put():
 * - alignedSize = align64(size) viene aggiunto a cacheOffset
 * - Ma i controlli alle linee 150 e 153 usano 'size' (non allineato)
 * - Linea 150: (offset + size) > maxCacheSize
 * - Linea 153: maxSegmentSize - localOffset < size

 * IMPORTANTE: Per testare il segment crossing (linea 153), alignedSize deve essere
 * MINORE di maxSegmentSize, altrimenti ogni retry atterrerà allo stesso localOffset.
 */
public class WriteCachePutAddedTest {

    private WriteCache cache;

    @Before
    public void setUp() {
        cache = null;
    }

    @After
    public void tearDown() {
        if (cache != null) {
            cache.close();
        }
    }

    // =========================================================================
    // LINEA 150: (offset + size) > maxCacheSize - boundary condition
    // =========================================================================

    @Test
    public void testCacheBoundary_ExactFit() {
        // Cache con 128 bytes totali
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 128, 128);

        // Entry di 64 bytes -> size=64, alignedSize=64
        // offset=0: (0 + 64) <= 128 -> OK
        ByteBuf entry = Unpooled.buffer(64);
        entry.writeZero(64);
        assertTrue("Entry esatta deve entrare", cache.put(1L, 1L, entry));

        // Ora cacheOffset=64
        // Entry di 65 bytes -> size=65, alignedSize=128
        // offset=64: (64 + 65) = 129 > 128 -> FALLISCE (linea 150)
        ByteBuf overflow = Unpooled.buffer(65);
        overflow.writeZero(65);
        assertFalse("Entry che sfora maxCacheSize deve fallire", cache.put(1L, 2L, overflow));

        entry.release();
        overflow.release();
    }

    @Test
    public void testCacheBoundary_ExactLimit() {
        // Test del boundary esatto: offset + size == maxCacheSize dovrebbe passare
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 64, 64);

        // Entry di 64 bytes -> (0 + 64) == 64, non > 64 -> deve passare
        ByteBuf entry = Unpooled.buffer(64);
        entry.writeZero(64);
        assertTrue("Entry al limite esatto deve entrare", cache.put(1L, 1L, entry));

        entry.release();
    }

    // =========================================================================
    // LINEA 153: maxSegmentSize - localOffset < size - segment crossing
    // =========================================================================

    @Test
    public void testSegmentCrossing() {
        // Cache: 1024 bytes, segmenti da 256 bytes
        // CHIAVE: alignedSize dell'entry2 deve essere < maxSegmentSize
        // per permettere al retry di trovare un localOffset diverso
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024, 256);

        // Entry1: 100 bytes -> alignedSize=128
        // offset=0, localOffset=0, segmentIdx=0
        // 256 - 0 = 256 >= 100 -> entra nel segmento 0
        // cacheOffset diventa 128
        ByteBuf entry1 = Unpooled.buffer(100);
        entry1.writeZero(100);
        assertTrue("Prima entry deve entrare", cache.put(1L, 1L, entry1));

        // Entry2: 150 bytes -> alignedSize=192 (< 256, importante!)
        // Iterazione 1: offset=128, localOffset=128, segmentIdx=0
        //   256 - 128 = 128 < 150 -> CONTINUE (linea 153 triggherata!)
        //   cacheOffset diventa 128+192=320
        // Iterazione 2: offset=320, localOffset=320%256=64, segmentIdx=1
        //   256 - 64 = 192 >= 150 -> entra nel segmento 1
        ByteBuf entry2 = Unpooled.buffer(150);
        entry2.writeZero(150);
        assertTrue("Entry che causa segment crossing deve entrare", cache.put(1L, 2L, entry2));

        // Verifica che entrambe siano recuperabili
        ByteBuf retrieved1 = cache.get(1L, 1L);
        ByteBuf retrieved2 = cache.get(1L, 2L);
        assertNotNull("Prima entry deve essere recuperabile", retrieved1);
        assertNotNull("Seconda entry deve essere recuperabile", retrieved2);

        entry1.release();
        entry2.release();
        retrieved1.release();
        retrieved2.release();
    }

    @Test
    public void testSegmentCrossing_BoundaryCondition() {
        // Test del caso limite: remaining space == size (non deve triggherare continue)
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 512, 256);

        // Entry1: 64 bytes -> alignedSize=64
        // localOffset=0 dopo entry1, cacheOffset=64
        ByteBuf entry1 = Unpooled.buffer(64);
        entry1.writeZero(64);
        assertTrue(cache.put(1L, 1L, entry1));

        // Entry2: 192 bytes -> alignedSize=192
        // offset=64, localOffset=64
        // 256 - 64 = 192, size=192 -> 192 < 192 è FALSE, quindi NON fa continue
        // L'entry dovrebbe entrare nello stesso segmento
        ByteBuf entry2 = Unpooled.buffer(192);
        entry2.writeZero(192);
        assertTrue("Entry che entra esattamente deve passare", cache.put(1L, 2L, entry2));

        assertNotNull(cache.get(1L, 1L));
        assertNotNull(cache.get(1L, 2L));

        entry1.release();
        entry2.release();
    }

    // =========================================================================
    // LINEA 170: currentLastEntryId > entryId - out-of-order writes
    // =========================================================================

    @Test
    public void testOutOfOrderWrite_LastEntryUnchanged() {
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024);

        // Scrivi prima l'entry con ID alto
        ByteBuf high = Unpooled.buffer(8);
        high.writeLong(100L);
        cache.put(1L, 100L, high);

        // Poi scrivi l'entry con ID basso (out-of-order)
        ByteBuf low = Unpooled.buffer(8);
        low.writeLong(50L);
        cache.put(1L, 50L, low);

        // lastEntry deve rimanere 100, non 50 (linea 170: 100 > 50 -> break)
        ByteBuf last = cache.getLastEntry(1L);
        assertNotNull("Last entry deve esistere", last);
        assertEquals("Last entry deve essere quella con ID maggiore", 100L, last.readLong());

        high.release();
        low.release();
        last.release();
    }

    @Test
    public void testInOrderWrite_LastEntryUpdated() {
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024);

        // Scrivi prima l'entry con ID basso
        ByteBuf low = Unpooled.buffer(8);
        low.writeLong(50L);
        cache.put(1L, 50L, low);

        // Poi scrivi l'entry con ID alto (in-order)
        ByteBuf high = Unpooled.buffer(8);
        high.writeLong(100L);
        cache.put(1L, 100L, high);

        // lastEntry deve essere aggiornato a 100 (linea 170: 50 > 100 è FALSE)
        ByteBuf last = cache.getLastEntry(1L);
        assertNotNull(last);
        assertEquals(100L, last.readLong());

        low.release();
        high.release();
        last.release();
    }

    @Test
    public void testOutOfOrderWrite_SameEntryId() {
        // Test edge case: stesso entryId scritto due volte
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024);

        ByteBuf first = Unpooled.buffer(8);
        first.writeLong(42L);
        cache.put(1L, 50L, first);

        ByteBuf second = Unpooled.buffer(8);
        second.writeLong(99L);
        cache.put(1L, 50L, second);  // Stesso ledgerId e entryId

        // Il lastEntryId dovrebbe rimanere 50 (linea 170: 50 > 50 è FALSE)
        ByteBuf last = cache.getLastEntry(1L);
        assertNotNull(last);
        // L'ultima entry scritta sovrascrive nell'index, ma lastEntryId non cambia

        first.release();
        second.release();
        last.release();
    }
}