package org.apache.bookkeeper.bookie.storage.myTest;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.bookie.storage.ldb.WriteCache;
import org.junit.Test;

/**
 * Test mirati per uccidere le mutazioni "changed conditional boundary"
 * sopravvissute nel metodo put() di WriteCache.
 */
public class WriteCachePutAddedTest {

    /**
     * Uccide mutazione linea 150: (offset + size) > maxCacheSize → >=
     */
    @Test
    public void testExactCacheSizeLimit() {
        // Cache 64 bytes, segment grande. Entry 64 bytes allineata = 64.
        try (WriteCache cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 64, 1024)) {
            ByteBuf entry = Unpooled.buffer(64);
            entry.writeBytes(new byte[64]);

            // offset=0, size=64, offset+size=64==maxCacheSize
            assertTrue(cache.put(1, 1, entry));

            entry.release();
        }
    }

    /**
     * Uccide mutazione linea 153: maxSegmentSize - localOffset < size → <=
     */
    @Test
    public void testExactSegmentBoundary() {
        // Cache 128 bytes, segment 128 bytes. Due entry da 64 bytes.
        try (WriteCache cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 128, 128)) {
            ByteBuf entry1 = Unpooled.buffer(64);
            entry1.writeBytes(new byte[64]);
            ByteBuf entry2 = Unpooled.buffer(64);
            entry2.writeBytes(new byte[64]);

            assertTrue(cache.put(1, 1, entry1)); // offset=0, localOffset=0
            // offset=64, localOffset=64, spazio=128-64=64=size
            assertTrue(cache.put(1, 2, entry2));

            entry1.release();
            entry2.release();
        }
    }

    /**
     * Uccide mutazione linea 170: currentLastEntryId > entryId → >=
     */
    @Test
    public void testLastEntryUpdateWithSameId() {
        try (WriteCache cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024, 1024)) {
            ByteBuf entry1 = Unpooled.wrappedBuffer(new byte[]{1, 2, 3, 4});
            ByteBuf entry2 = Unpooled.wrappedBuffer(new byte[]{5, 6, 7, 8});

            assertTrue(cache.put(1, 5, entry1));
            assertTrue(cache.put(1, 5, entry2)); // stesso entryId, dati diversi

            ByteBuf result = cache.getLastEntry(1);
            assertNotNull(result);

            byte[] data = new byte[4];
            result.readBytes(data);
            assertArrayEquals(new byte[]{5, 6, 7, 8}, data);

            result.release();
        }
    }
}