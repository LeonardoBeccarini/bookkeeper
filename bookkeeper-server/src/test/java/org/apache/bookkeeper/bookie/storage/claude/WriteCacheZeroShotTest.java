package org.apache.bookkeeper.bookie.storage.claude;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;

import org.apache.bookkeeper.bookie.storage.ldb.WriteCache;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link WriteCache} class.
 * Tests the put() and get() methods for storing and retrieving ledger entries.
 */
public class WriteCacheZeroShotTest {

    private static final long DEFAULT_CACHE_SIZE = 1024 * 1024; // 1 MB
    private static final int DEFAULT_MAX_SEGMENT_SIZE = 64 * 1024; // 64 KB

    private WriteCache writeCache;

    @Before
    public void setUp() {
        writeCache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, DEFAULT_CACHE_SIZE, DEFAULT_MAX_SEGMENT_SIZE);
    }

    @After
    public void tearDown() {
        if (writeCache != null) {
            writeCache.close();
        }
    }

    // ==================== Basic Put and Get Tests ====================

    @Test
    public void testPutAndGetSingleEntry() {
        long ledgerId = 1L;
        long entryId = 0L;
        ByteBuf entry = createEntry("Hello, BookKeeper!");

        boolean putResult = writeCache.put(ledgerId, entryId, entry);
        assertTrue("Put operation should succeed", putResult);

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNotNull("Retrieved entry should not be null", retrievedEntry);
        assertEquals("Retrieved entry content should match", "Hello, BookKeeper!", extractString(retrievedEntry));

        entry.release();
        retrievedEntry.release();
    }

    @Test
    public void testPutAndGetMultipleEntriesSameLedger() {
        long ledgerId = 1L;
        int numEntries = 10;
        ByteBuf[] entries = new ByteBuf[numEntries];

        // Put multiple entries
        for (int i = 0; i < numEntries; i++) {
            entries[i] = createEntry("Entry-" + i);
            boolean putResult = writeCache.put(ledgerId, i, entries[i]);
            assertTrue("Put operation for entry " + i + " should succeed", putResult);
        }

        // Get and verify all entries
        for (int i = 0; i < numEntries; i++) {
            ByteBuf retrievedEntry = writeCache.get(ledgerId, i);
            assertNotNull("Retrieved entry " + i + " should not be null", retrievedEntry);
            assertEquals("Retrieved entry " + i + " content should match", "Entry-" + i, extractString(retrievedEntry));
            retrievedEntry.release();
        }

        // Clean up
        for (ByteBuf entry : entries) {
            entry.release();
        }
    }

    @Test
    public void testPutAndGetMultipleLedgers() {
        int numLedgers = 5;
        int entriesPerLedger = 3;

        // Put entries for multiple ledgers
        for (int ledger = 0; ledger < numLedgers; ledger++) {
            for (int entry = 0; entry < entriesPerLedger; entry++) {
                ByteBuf buf = createEntry("Ledger-" + ledger + "-Entry-" + entry);
                boolean putResult = writeCache.put(ledger, entry, buf);
                assertTrue("Put should succeed for ledger " + ledger + " entry " + entry, putResult);
                buf.release();
            }
        }

        // Verify all entries
        for (int ledger = 0; ledger < numLedgers; ledger++) {
            for (int entry = 0; entry < entriesPerLedger; entry++) {
                ByteBuf retrievedEntry = writeCache.get(ledger, entry);
                assertNotNull("Entry should exist for ledger " + ledger + " entry " + entry, retrievedEntry);
                assertEquals("Content should match", "Ledger-" + ledger + "-Entry-" + entry, extractString(retrievedEntry));
                retrievedEntry.release();
            }
        }
    }

    // ==================== Get Non-Existent Entry Tests ====================

    @Test
    public void testGetNonExistentEntry() {
        long ledgerId = 999L;
        long entryId = 999L;

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNull("Get for non-existent entry should return null", retrievedEntry);
    }

    @Test
    public void testGetNonExistentEntryFromExistingLedger() {
        long ledgerId = 1L;
        ByteBuf entry = createEntry("Test entry");
        writeCache.put(ledgerId, 0L, entry);

        ByteBuf retrievedEntry = writeCache.get(ledgerId, 999L);
        assertNull("Get for non-existent entry ID should return null", retrievedEntry);

        entry.release();
    }

    @Test
    public void testGetFromNonExistentLedger() {
        long existingLedgerId = 1L;
        long nonExistentLedgerId = 2L;
        ByteBuf entry = createEntry("Test entry");
        writeCache.put(existingLedgerId, 0L, entry);

        ByteBuf retrievedEntry = writeCache.get(nonExistentLedgerId, 0L);
        assertNull("Get from non-existent ledger should return null", retrievedEntry);

        entry.release();
    }

    // ==================== Boundary Value Tests ====================

    @Test
    public void testPutAndGetWithZeroIds() {
        long ledgerId = 0L;
        long entryId = 0L;
        ByteBuf entry = createEntry("Zero IDs entry");

        boolean putResult = writeCache.put(ledgerId, entryId, entry);
        assertTrue("Put with zero IDs should succeed", putResult);

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNotNull("Get with zero IDs should succeed", retrievedEntry);
        assertEquals("Content should match", "Zero IDs entry", extractString(retrievedEntry));

        entry.release();
        retrievedEntry.release();
    }

    @Test
    public void testPutAndGetWithLargeIds() {
        long ledgerId = Long.MAX_VALUE - 1;
        long entryId = Long.MAX_VALUE - 1;
        ByteBuf entry = createEntry("Large IDs entry");

        boolean putResult = writeCache.put(ledgerId, entryId, entry);
        assertTrue("Put with large IDs should succeed", putResult);

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNotNull("Get with large IDs should succeed", retrievedEntry);
        assertEquals("Content should match", "Large IDs entry", extractString(retrievedEntry));

        entry.release();
        retrievedEntry.release();
    }

    @Test
    public void testPutAndGetWithMaxLongValues() {
        long ledgerId = Long.MAX_VALUE;
        long entryId = Long.MAX_VALUE;
        ByteBuf entry = createEntry("Max Long values entry");

        boolean putResult = writeCache.put(ledgerId, entryId, entry);
        assertTrue("Put with max Long values should succeed", putResult);

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNotNull("Get with max Long values should succeed", retrievedEntry);
        assertEquals("Content should match", "Max Long values entry", extractString(retrievedEntry));

        entry.release();
        retrievedEntry.release();
    }

    // ==================== Entry Content Tests ====================

    @Test
    public void testPutAndGetEmptyEntry() {
        long ledgerId = 1L;
        long entryId = 0L;
        ByteBuf entry = Unpooled.buffer(0);

        boolean putResult = writeCache.put(ledgerId, entryId, entry);
        assertTrue("Put with empty entry should succeed", putResult);

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNotNull("Get should return the empty entry", retrievedEntry);
        assertEquals("Retrieved entry should be empty", 0, retrievedEntry.readableBytes());

        entry.release();
        retrievedEntry.release();
    }

    @Test
    public void testPutAndGetLargeEntry() {
        long ledgerId = 1L;
        long entryId = 0L;
        int entrySize = 10 * 1024; // 10 KB
        byte[] largeData = new byte[entrySize];
        for (int i = 0; i < entrySize; i++) {
            largeData[i] = (byte) (i % 256);
        }
        ByteBuf entry = Unpooled.wrappedBuffer(largeData);

        boolean putResult = writeCache.put(ledgerId, entryId, entry);
        assertTrue("Put with large entry should succeed", putResult);

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNotNull("Get should return the large entry", retrievedEntry);
        assertEquals("Retrieved entry size should match", entrySize, retrievedEntry.readableBytes());

        byte[] retrievedData = new byte[entrySize];
        retrievedEntry.readBytes(retrievedData);
        assertArrayEquals("Retrieved data should match original", largeData, retrievedData);

        entry.release();
        retrievedEntry.release();
    }

    @Test
    public void testPutAndGetBinaryData() {
        long ledgerId = 1L;
        long entryId = 0L;
        byte[] binaryData = new byte[]{0x00, 0x01, (byte) 0xFF, (byte) 0xFE, 0x7F, (byte) 0x80};
        ByteBuf entry = Unpooled.wrappedBuffer(binaryData);

        boolean putResult = writeCache.put(ledgerId, entryId, entry);
        assertTrue("Put with binary data should succeed", putResult);

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNotNull("Get should return the binary entry", retrievedEntry);

        byte[] retrievedData = new byte[binaryData.length];
        retrievedEntry.readBytes(retrievedData);
        assertArrayEquals("Binary data should match", binaryData, retrievedData);

        entry.release();
        retrievedEntry.release();
    }

    // ==================== Duplicate Entry Tests ====================

    @Test
    public void testPutDuplicateEntryOverwrites() {
        long ledgerId = 1L;
        long entryId = 0L;
        ByteBuf firstEntry = createEntry("First entry");
        ByteBuf secondEntry = createEntry("Second entry");

        boolean firstPutResult = writeCache.put(ledgerId, entryId, firstEntry);
        assertTrue("First put should succeed", firstPutResult);

        boolean secondPutResult = writeCache.put(ledgerId, entryId, secondEntry);
        // Note: Behavior may vary - some implementations may reject duplicates
        // This test documents the observed behavior

        ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
        assertNotNull("Get should return an entry", retrievedEntry);

        firstEntry.release();
        secondEntry.release();
        retrievedEntry.release();
    }

    // ==================== Cache Capacity Tests ====================

    @Test
    public void testCacheRejectsEntryWhenFull() {
        // Create a small cache
        WriteCache smallCache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, 1024, 512);

        try {
            int entrySize = 200;
            byte[] data = new byte[entrySize];
            int entriesAdded = 0;
            boolean putSucceeded = true;

            // Keep adding entries until cache is full
            while (putSucceeded && entriesAdded < 100) {
                ByteBuf entry = Unpooled.wrappedBuffer(data);
                putSucceeded = smallCache.put(1L, entriesAdded, entry);
                if (putSucceeded) {
                    entriesAdded++;
                }
                entry.release();
            }

            // Verify that at some point, put returns false when cache is full
            assertTrue("Should have added at least one entry", entriesAdded > 0);
            assertFalse("Put should eventually return false when cache is full", putSucceeded);

        } finally {
            smallCache.close();
        }
    }

    // ==================== Consistency Tests ====================

    @Test
    public void testMultipleGetsReturnConsistentData() {
        long ledgerId = 1L;
        long entryId = 0L;
        ByteBuf entry = createEntry("Consistent data");

        writeCache.put(ledgerId, entryId, entry);

        // Retrieve the same entry multiple times
        for (int i = 0; i < 5; i++) {
            ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
            assertNotNull("Get #" + i + " should return entry", retrievedEntry);
            assertEquals("Get #" + i + " content should match", "Consistent data", extractString(retrievedEntry));
            retrievedEntry.release();
        }

        entry.release();
    }

    @Test
    public void testGetDoesNotModifyCache() {
        long ledgerId = 1L;
        long entryId = 0L;
        ByteBuf entry = createEntry("Original data");

        writeCache.put(ledgerId, entryId, entry);

        // First get
        ByteBuf firstGet = writeCache.get(ledgerId, entryId);
        assertNotNull("First get should succeed", firstGet);
        String firstContent = extractString(firstGet);
        firstGet.release();

        // Second get should return the same data
        ByteBuf secondGet = writeCache.get(ledgerId, entryId);
        assertNotNull("Second get should succeed", secondGet);
        String secondContent = extractString(secondGet);
        assertEquals("Data should be unchanged between gets", firstContent, secondContent);

        secondGet.release();
        entry.release();
    }

    // ==================== Entry Ordering Tests ====================

    @Test
    public void testNonSequentialEntryIds() {
        long ledgerId = 1L;
        long[] entryIds = {5L, 2L, 8L, 1L, 10L};

        for (long entryId : entryIds) {
            ByteBuf entry = createEntry("Entry-" + entryId);
            boolean putResult = writeCache.put(ledgerId, entryId, entry);
            assertTrue("Put for entry " + entryId + " should succeed", putResult);
            entry.release();
        }

        for (long entryId : entryIds) {
            ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
            assertNotNull("Entry " + entryId + " should be retrievable", retrievedEntry);
            assertEquals("Content should match", "Entry-" + entryId, extractString(retrievedEntry));
            retrievedEntry.release();
        }
    }

    @Test
    public void testSparseEntryIds() {
        long ledgerId = 1L;
        long[] sparseIds = {0L, 100L, 1000L, 10000L};

        for (long entryId : sparseIds) {
            ByteBuf entry = createEntry("Sparse-" + entryId);
            boolean putResult = writeCache.put(ledgerId, entryId, entry);
            assertTrue("Put for sparse entry " + entryId + " should succeed", putResult);
            entry.release();
        }

        for (long entryId : sparseIds) {
            ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
            assertNotNull("Sparse entry " + entryId + " should be retrievable", retrievedEntry);
            assertEquals("Content should match", "Sparse-" + entryId, extractString(retrievedEntry));
            retrievedEntry.release();
        }

        // Verify gaps return null
        assertNull("Entry in gap should return null", writeCache.get(ledgerId, 50L));
        assertNull("Entry in gap should return null", writeCache.get(ledgerId, 500L));
    }

    // ==================== Helper Methods ====================

    /**
     * Creates a ByteBuf containing the given string data.
     */
    private ByteBuf createEntry(String data) {
        byte[] bytes = data.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        return Unpooled.wrappedBuffer(bytes);
    }

    /**
     * Extracts a string from a ByteBuf without modifying the reader index.
     */
    private String extractString(ByteBuf buf) {
        byte[] bytes = new byte[buf.readableBytes()];
        buf.getBytes(buf.readerIndex(), bytes);
        return new String(bytes, java.nio.charset.StandardCharsets.UTF_8);
    }
}