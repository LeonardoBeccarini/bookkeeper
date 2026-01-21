package org.apache.bookkeeper.bookie.storage.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WriteCacheRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test001");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = writeCache2.put((long) (short) 1, (long) 0, byteBuf5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test002");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.deleteLedger((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test003");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test004");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put(0L, (long) '4', byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test005");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) 0, 10L, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test006");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        Class<?> wildcardClass7 = writeCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test007");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test008");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test009");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        writeCache2.clear();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer8);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test010");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache2.put((long) 10, 0L, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test011");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test012");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache2.put((long) (short) -1, 0L, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test013");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer7);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test014");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test015");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        long long7 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = writeCache2.get((long) (short) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test016");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = writeCache2.put((long) '#', (long) (-1), byteBuf5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test017");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        writeCache2.clear();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test018");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        io.netty.buffer.ByteBuf byteBuf5 = writeCache2.get((long) (short) 10, (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass6 = byteBuf5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test019");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test020");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        long long6 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test021");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer9);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test022");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test023");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        long long3 = writeCache2.count();
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache2.put((long) (byte) 100, (long) (byte) 10, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test024");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.close();
        boolean boolean4 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache2.put((long) (short) 10, 0L, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test025");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test026");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.getLastEntry((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass10 = byteBuf9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test027");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache2.get(0L, (long) '4');
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test028");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = writeCache2.put(1L, 10L, byteBuf14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test029");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        writeCache2.clear();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test030");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) ' ', (long) (-1));
        boolean boolean9 = writeCache2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test031");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        boolean boolean8 = writeCache2.hasEntry((long) 1, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test032");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 10L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test033");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        writeCache2.clear();
        Class<?> wildcardClass7 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test034");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 100L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test035");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = writeCache2.get((long) (-1), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test036");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        long long9 = writeCache2.count();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer10);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test037");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test038");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        long long12 = writeCache2.count();
        long long13 = writeCache2.count();
        long long14 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test039");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        writeCache2.deleteLedger((long) '4');
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test040");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        Class<?> wildcardClass7 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test041");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test042");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.deleteLedger((long) ' ');
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) (-1), (long) 0, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test043");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        Class<?> wildcardClass12 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test044");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        boolean boolean7 = writeCache2.isEmpty();
        Class<?> wildcardClass8 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test045");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        long long3 = writeCache2.count();
        writeCache2.clear();
        writeCache2.clear();
        Class<?> wildcardClass6 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test046");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test047");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test048");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        boolean boolean4 = writeCache3.isEmpty();
        Class<?> wildcardClass5 = writeCache3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test049");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test050");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test051");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        long long7 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = writeCache2.put((long) (-1), (long) '#', byteBuf10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test052");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        long long10 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test053");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test054");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        Class<?> wildcardClass6 = writeCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test055");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache2.put(10L, (long) 1, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test056");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.getLastEntry((long) ' ');
        writeCache2.deleteLedger((long) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer17);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test057");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.deleteLedger((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test058");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache3.getLastEntry((long) (byte) 100);
        writeCache3.close();
        boolean boolean9 = writeCache3.hasEntry(100L, (long) (byte) -1);
        org.junit.Assert.assertNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test059");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 0);
        Class<?> wildcardClass3 = writeCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test060");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test061");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer10);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test062");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        Class<?> wildcardClass3 = writeCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test063");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry((long) 10, (long) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test064");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) '#', (long) (short) 100);
        boolean boolean9 = writeCache2.isEmpty();
        Class<?> wildcardClass10 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test065");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) '#', (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = writeCache2.put((long) ' ', 100L, byteBuf11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test066");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean7 = writeCache2.hasEntry((long) (short) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test067");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        long long7 = writeCache2.count();
        boolean boolean8 = writeCache2.isEmpty();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test068");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.deleteLedger((long) ' ');
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 0, (long) (short) 0);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test069");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        long long10 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = writeCache2.get((long) (byte) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test070");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) (short) 0, (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass9 = byteBuf8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test071");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test072");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (byte) 0, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.deleteLedger((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test073");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) ' ', 1L);
        io.netty.buffer.ByteBuf byteBuf13 = writeCache2.get((long) 10, (long) (byte) 100);
        boolean boolean16 = writeCache2.hasEntry((long) 'a', (long) ' ');
        Class<?> wildcardClass17 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test074");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test075");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test076");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (byte) 0, (long) ' ');
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = writeCache2.put((long) (byte) 1, (long) (byte) 1, byteBuf15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test077");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.close();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer4);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test078");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test079");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        long long6 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = writeCache2.put((long) (short) -1, (long) 0, byteBuf11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test080");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.close();
        boolean boolean4 = writeCache2.isEmpty();
        boolean boolean5 = writeCache2.isEmpty();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test081");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        Class<?> wildcardClass11 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test082");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        writeCache2.deleteLedger((long) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache2.put(1L, (long) 100, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test083");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get(0L, (long) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test084");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) ' ', 1L);
        boolean boolean13 = writeCache2.hasEntry((long) (byte) 10, (long) 100);
        io.netty.buffer.ByteBuf byteBuf16 = writeCache2.get(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test085");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        long long6 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) ' ');
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test086");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = writeCache2.put(100L, (long) (-1), byteBuf8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test087");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) ' ', 1L);
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = writeCache2.put((-1L), (long) (short) 1, byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test088");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test089");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.size();
        Class<?> wildcardClass7 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test090");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.deleteLedger((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test091");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (byte) 0, (long) ' ');
        Class<?> wildcardClass13 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test092");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test093");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer7 = null;
        writeCache2.forEach(entryConsumer7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test094");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        long long3 = writeCache2.count();
        writeCache2.clear();
        writeCache2.clear();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test095");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        long long3 = writeCache2.count();
        writeCache2.clear();
        writeCache2.clear();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = writeCache2.getLastEntry((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test096");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test097");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        long long4 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test098");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get((long) '#', (long) (short) 1);
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test099");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = writeCache2.put((long) (short) 1, (long) 'a', byteBuf8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test100");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        boolean boolean3 = writeCache2.isEmpty();
        writeCache2.close();
        long long5 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test101");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test102");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = writeCache2.put((long) '4', 1L, byteBuf12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test103");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) ' ', (long) (-1));
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer9 = null;
        writeCache2.forEach(entryConsumer9);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer11 = null;
        writeCache2.forEach(entryConsumer11);
        writeCache2.close();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer14);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test104");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.getLastEntry((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass15 = byteBuf14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test105");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        long long12 = writeCache2.count();
        long long13 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = writeCache2.put(10L, 0L, byteBuf16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test106");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.count();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer6 = null;
        writeCache2.forEach(entryConsumer6);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test107");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        writeCache2.deleteLedger((long) 1);
        long long9 = writeCache2.size();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test108");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        io.netty.buffer.ByteBuf byteBuf6 = writeCache2.getLastEntry((long) 'a');
        org.junit.Assert.assertNull(byteBuf6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test109");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (short) 100, (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test110");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test111");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache3.getLastEntry((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache3.hasEntry((long) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test112");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test113");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.getLastEntry((long) '#');
        long long15 = writeCache2.count();
        long long16 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test114");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test115");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test116");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) ' ', 1L);
        boolean boolean13 = writeCache2.hasEntry((long) (byte) 10, (long) 100);
        Class<?> wildcardClass14 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test117");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        io.netty.buffer.ByteBuf byteBuf5 = writeCache2.get((long) (short) 10, (long) (-1));
        io.netty.buffer.ByteBuf byteBuf7 = writeCache2.getLastEntry((long) 100);
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = writeCache2.put((long) (byte) 1, (long) (short) -1, byteBuf10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf5);
        org.junit.Assert.assertNull(byteBuf7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test118");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        boolean boolean7 = writeCache2.isEmpty();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer8);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test119");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 10L, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = writeCache3.put((-1L), 10L, byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test120");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        boolean boolean6 = writeCache2.hasEntry(100L, (long) (short) -1);
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.getLastEntry((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test121");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test122");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test123");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) (-1), (long) 0, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test124");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        boolean boolean6 = writeCache2.hasEntry(100L, (long) (short) -1);
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put(10L, 0L, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test125");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4');
        long long3 = writeCache2.count();
        Class<?> wildcardClass4 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test126");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 10L);
        long long3 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test127");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        long long9 = writeCache2.count();
        writeCache2.clear();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test128");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 0);
        writeCache2.close();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test129");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test130");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        boolean boolean3 = writeCache2.isEmpty();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test131");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.getLastEntry((long) 1);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) ' ');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test132");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test133");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        writeCache2.deleteLedger((long) 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test134");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) ' ', (long) (-1));
        long long9 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test135");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.getLastEntry((long) ' ');
        writeCache2.deleteLedger((long) 1);
        writeCache2.clear();
        long long18 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test136");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        writeCache2.deleteLedger((long) 'a');
        long long5 = writeCache2.count();
        boolean boolean8 = writeCache2.hasEntry(10L, (long) (-1));
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = writeCache2.put((long) (short) 0, (long) (short) -1, byteBuf11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test137");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) (byte) 10, (long) (-1), byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test138");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test139");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) ' ', 1L);
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test140");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = writeCache3.put(100L, (long) (short) -1, byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test141");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.getLastEntry((long) '#');
        boolean boolean15 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf18 = writeCache2.get((long) (short) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(byteBuf18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test142");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        long long12 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.getLastEntry((long) '#');
        io.netty.buffer.ByteBuf byteBuf17 = writeCache2.get((long) '4', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertNull(byteBuf17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test143");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.getLastEntry((long) ' ');
        writeCache2.deleteLedger((long) 1);
        long long17 = writeCache2.count();
        boolean boolean18 = writeCache2.isEmpty();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test144");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf7 = writeCache2.getLastEntry(0L);
        writeCache2.clear();
        org.junit.Assert.assertNull(byteBuf7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test145");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        boolean boolean8 = writeCache2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test146");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) (short) 0, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get(1L, (long) (byte) 100);
        boolean boolean14 = writeCache2.hasEntry(1L, (long) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test147");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (short) 100, (long) 'a');
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache2.get(100L, (long) (short) 0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer17);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test148");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) (short) 0, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = writeCache2.put((long) 'a', (-1L), byteBuf11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test149");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry(0L);
        writeCache2.deleteLedger((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuf10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test150");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get(0L, 10L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer9 = null;
        writeCache2.forEach(entryConsumer9);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test151");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 0);
        long long3 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test152");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.close();
        boolean boolean4 = writeCache2.isEmpty();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test153");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 0);
        io.netty.buffer.ByteBuf byteBuf4 = writeCache2.getLastEntry((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass5 = byteBuf4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test154");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        boolean boolean4 = writeCache3.isEmpty();
        writeCache3.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer7 = null;
        writeCache3.forEach(entryConsumer7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test155");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        boolean boolean3 = writeCache2.isEmpty();
        writeCache2.close();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test156");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        boolean boolean5 = writeCache2.hasEntry((long) (short) 100, (long) (short) 1);
        writeCache2.clear();
        Class<?> wildcardClass7 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test157");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 1);
        Class<?> wildcardClass3 = writeCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test158");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        boolean boolean7 = writeCache2.isEmpty();
        writeCache2.deleteLedger((long) 1);
        writeCache2.deleteLedger((long) ' ');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test159");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        writeCache2.deleteLedger((long) '4');
        long long9 = writeCache2.size();
        boolean boolean10 = writeCache2.isEmpty();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test160");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test161");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        writeCache2.deleteLedger((long) 1);
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get((long) 0, (long) ' ');
        boolean boolean12 = writeCache2.isEmpty();
        long long13 = writeCache2.count();
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test162");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        writeCache2.deleteLedger((long) 1);
        long long8 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test163");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        boolean boolean9 = writeCache2.isEmpty();
        long long10 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test164");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        io.netty.buffer.ByteBuf byteBuf5 = writeCache2.get((long) (short) 10, (long) (-1));
        io.netty.buffer.ByteBuf byteBuf7 = writeCache2.getLastEntry((long) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer8 = null;
        writeCache2.forEach(entryConsumer8);
        org.junit.Assert.assertNull(byteBuf5);
        org.junit.Assert.assertNull(byteBuf7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test165");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 10L, (int) ' ');
        long long4 = writeCache3.count();
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache3.put((long) ' ', (long) (short) 100, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test166");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test167");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        long long6 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass9 = byteBuf8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test168");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        long long12 = writeCache2.size();
        long long13 = writeCache2.count();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test169");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        boolean boolean8 = writeCache2.hasEntry((long) 0, (long) 10);
        boolean boolean11 = writeCache2.hasEntry((long) 'a', (long) (-1));
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = writeCache2.put((long) 1, 0L, byteBuf14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test170");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.deleteLedger((long) 10);
        Class<?> wildcardClass7 = writeCache2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test171");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (short) 100, (long) 'a');
        writeCache2.clear();
        writeCache2.clear();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test172");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        long long6 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) (short) -1, (long) (short) -1, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test173");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test174");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        long long6 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) ' ');
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.getLastEntry(0L);
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test175");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        boolean boolean6 = writeCache2.hasEntry(100L, (long) (short) -1);
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) (short) -1, 100L, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test176");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 0);
        boolean boolean5 = writeCache2.hasEntry((long) (short) 10, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test177");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        boolean boolean6 = writeCache2.hasEntry(100L, (long) (short) -1);
        writeCache2.deleteLedger((long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test178");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test179");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        boolean boolean8 = writeCache2.hasEntry((long) '4', (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test180");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (short) 100, (long) 'a');
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache2.get(100L, (long) (short) 0);
        io.netty.buffer.ByteBuf byteBuf19 = writeCache2.get((long) (byte) 1, (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertNull(byteBuf19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test181");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        writeCache2.deleteLedger((long) 1);
        long long8 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test182");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get((long) '#', (long) (short) 1);
        io.netty.buffer.ByteBuf byteBuf13 = writeCache2.getLastEntry((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test183");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.close();
        boolean boolean4 = writeCache2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test184");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        writeCache2.deleteLedger((long) 1);
        long long8 = writeCache2.count();
        long long9 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test185");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test186");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        boolean boolean6 = writeCache2.isEmpty();
        writeCache2.deleteLedger((long) 'a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test187");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        writeCache2.deleteLedger((long) (byte) 0);
        writeCache2.deleteLedger((long) (short) 0);
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = writeCache2.put((long) 0, 0L, byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test188");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 100);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test189");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (short) 100, (long) 'a');
        long long13 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = writeCache2.put((long) 'a', (long) (byte) -1, byteBuf16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test190");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        long long7 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test191");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) 0, (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test192");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.deleteLedger((long) 10);
        writeCache2.clear();
        writeCache2.deleteLedger((long) (byte) 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test193");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 10);
        writeCache2.close();
        long long4 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test194");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        writeCache2.deleteLedger((long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get(10L, (long) 10);
        boolean boolean12 = writeCache2.isEmpty();
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test195");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        writeCache2.clear();
        long long8 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test196");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.count();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test197");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) (short) 0, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get(1L, (long) (byte) 100);
        Class<?> wildcardClass12 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test198");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        writeCache2.deleteLedger((long) ' ');
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.get(0L, 10L);
        boolean boolean11 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache2.getLastEntry((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test199");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        boolean boolean9 = writeCache2.isEmpty();
        long long10 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test200");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf6 = writeCache2.get((long) (short) 10, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass7 = byteBuf6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(byteBuf6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test201");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry(0L);
        boolean boolean11 = writeCache2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test202");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) 0, (long) 1);
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = writeCache2.put((long) (byte) 0, 0L, byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test203");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.count();
        long long7 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test204");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test205");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (short) 100, (long) 'a');
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache2.get((long) 1, 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test206");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        boolean boolean9 = writeCache2.isEmpty();
        Class<?> wildcardClass10 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test207");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4');
        long long3 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = writeCache2.get((long) (short) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test208");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) '#', (long) (short) 100);
        writeCache2.deleteLedger(1L);
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache2.getLastEntry((long) (short) 10);
        boolean boolean16 = writeCache2.hasEntry(0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test209");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        boolean boolean7 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = writeCache2.put((long) 1, (long) (short) 1, byteBuf10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test210");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.getLastEntry((long) '#');
        io.netty.buffer.ByteBuf byteBuf16 = writeCache2.getLastEntry((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test211");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        boolean boolean5 = writeCache2.hasEntry((long) (short) 100, (long) (short) 1);
        writeCache2.clear();
        long long7 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test212");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 10L);
        writeCache2.deleteLedger(0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = writeCache2.hasEntry((long) (short) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test213");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        writeCache2.deleteLedger((long) 1);
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get((long) 0, (long) ' ');
        boolean boolean12 = writeCache2.isEmpty();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer13);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test214");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test215");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test216");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        Class<?> wildcardClass6 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test217");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) ' ', (long) (-1));
        boolean boolean9 = writeCache2.isEmpty();
        Class<?> wildcardClass10 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test218");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        writeCache2.clear();
        boolean boolean7 = writeCache2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test219");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        long long12 = writeCache2.count();
        boolean boolean13 = writeCache2.isEmpty();
        boolean boolean14 = writeCache2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test220");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        boolean boolean6 = writeCache3.hasEntry((long) 10, (long) (byte) -1);
        boolean boolean7 = writeCache3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test221");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) '#', (long) (short) 100);
        boolean boolean9 = writeCache2.isEmpty();
        long long10 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test222");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        long long11 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test223");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) ' ', 1L);
        io.netty.buffer.ByteBuf byteBuf13 = writeCache2.get((long) 10, (long) (byte) 100);
        boolean boolean14 = writeCache2.isEmpty();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test224");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test225");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test226");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test227");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.count();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test228");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) (short) 0, (long) (byte) 1);
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test229");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get((long) '#', (long) (short) 1);
        io.netty.buffer.ByteBuf byteBuf14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = writeCache2.put((long) '4', (long) (-1), byteBuf14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test230");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache3.getLastEntry((long) (byte) 100);
        boolean boolean6 = writeCache3.isEmpty();
        long long7 = writeCache3.count();
        org.junit.Assert.assertNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test231");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        long long7 = writeCache2.size();
        writeCache2.deleteLedger((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test232");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        boolean boolean6 = writeCache3.hasEntry((long) 10, (long) (byte) -1);
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache3.put((long) 0, (long) (byte) -1, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test233");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) (short) 1);
        writeCache2.deleteLedger((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test234");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.size();
        boolean boolean9 = writeCache2.hasEntry((long) (byte) 10, (long) 0);
        writeCache2.close();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test235");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean14 = writeCache2.hasEntry(10L, 0L);
        Class<?> wildcardClass15 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test236");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        writeCache2.deleteLedger((long) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer9 = null;
        writeCache2.forEach(entryConsumer9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test237");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) ' ');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test238");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        writeCache2.deleteLedger((long) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = writeCache2.getLastEntry((long) (short) 0);
        long long7 = writeCache2.size();
        boolean boolean10 = writeCache2.hasEntry((long) 'a', 0L);
        org.junit.Assert.assertNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test239");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) (byte) 10, (long) '4', byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test240");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test241");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.close();
        boolean boolean6 = writeCache2.hasEntry((long) (byte) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test242");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.count();
        Class<?> wildcardClass6 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test243");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        long long9 = writeCache2.count();
        writeCache2.clear();
        Class<?> wildcardClass11 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test244");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        writeCache2.deleteLedger((long) 1);
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.getLastEntry((long) ' ');
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test245");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        long long7 = writeCache2.size();
        Class<?> wildcardClass8 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test246");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.deleteLedger((long) 10);
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) '#', (long) (short) 10);
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test247");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) (byte) 1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (short) 100, (long) 'a');
        writeCache2.clear();
        Class<?> wildcardClass14 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test248");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4');
        boolean boolean5 = writeCache2.hasEntry((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test249");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.get((long) 'a', (long) 10);
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = writeCache2.put((long) (short) 100, (long) 100, byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuf10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test250");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean12 = writeCache2.isEmpty();
        long long13 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache2.getLastEntry((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test251");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.deleteLedger((long) 10);
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) 0);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test252");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache3.getLastEntry((long) (byte) 100);
        writeCache3.close();
        // The following exception was thrown during execution in test generation
        try {
            writeCache3.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test253");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (byte) 0, (long) ' ');
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = writeCache2.put((long) (short) 10, (long) 100, byteBuf15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test254");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 'a');
        boolean boolean3 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf5 = writeCache2.getLastEntry((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test255");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) (short) 0, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get(1L, (long) (byte) 100);
        long long12 = writeCache2.size();
        long long13 = writeCache2.size();
        boolean boolean14 = writeCache2.isEmpty();
        boolean boolean17 = writeCache2.hasEntry(10L, (long) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test256");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        writeCache2.deleteLedger((long) 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test257");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        boolean boolean6 = writeCache2.isEmpty();
        long long7 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.getLastEntry((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test258");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        boolean boolean6 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get(1L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test259");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache3.getLastEntry((long) (byte) 100);
        boolean boolean6 = writeCache3.isEmpty();
        boolean boolean9 = writeCache3.hasEntry((long) (byte) 0, (long) (byte) 10);
        long long10 = writeCache3.size();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache3.get((long) 'a', (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass14 = byteBuf13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test260");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        boolean boolean6 = writeCache2.hasEntry(100L, (long) (short) -1);
        long long7 = writeCache2.count();
        writeCache2.close();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test261");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 0);
        long long3 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = writeCache2.put(0L, (long) (byte) 100, byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test262");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test263");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        long long3 = writeCache2.count();
        writeCache2.clear();
        writeCache2.clear();
        boolean boolean6 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) '4', (long) (byte) -1, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test264");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.deleteLedger((long) ' ');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer7 = null;
        writeCache2.forEach(entryConsumer7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test265");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.getLastEntry((long) 1);
        writeCache2.clear();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test266");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 10L, (int) ' ');
        writeCache3.clear();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test267");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.getLastEntry(1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test268");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        boolean boolean14 = writeCache2.hasEntry(10L, 0L);
        long long15 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test269");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = writeCache2.put((long) '#', 0L, byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test270");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test271");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        writeCache2.deleteLedger((long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.get((long) (short) 100, (long) (short) 10);
        writeCache2.deleteLedger((long) (byte) 1);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test272");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test273");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        writeCache2.deleteLedger((long) (byte) 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test274");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test275");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        long long3 = writeCache2.count();
        Class<?> wildcardClass4 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test276");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        boolean boolean8 = writeCache2.hasEntry((long) 0, (long) 10);
        boolean boolean11 = writeCache2.hasEntry((long) 'a', (long) (-1));
        writeCache2.deleteLedger((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = writeCache2.get((long) (-1), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test277");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        writeCache2.close();
        long long6 = writeCache2.size();
        long long7 = writeCache2.count();
        Class<?> wildcardClass8 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test278");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test279");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 0);
        io.netty.buffer.ByteBuf byteBuf4 = writeCache2.getLastEntry((long) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache2.put((long) 1, (long) 1, byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuf4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test280");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test281");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.get((long) (byte) 0, (long) ' ');
        writeCache2.clear();
        boolean boolean16 = writeCache2.hasEntry((long) (short) 10, 1L);
        Class<?> wildcardClass17 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test282");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) ' ', 1L);
        io.netty.buffer.ByteBuf byteBuf13 = writeCache2.get((long) 10, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.deleteLedger((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test283");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 0);
        long long3 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf5 = writeCache2.getLastEntry((long) (byte) 10);
        writeCache2.deleteLedger((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test284");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        writeCache2.deleteLedger((long) 'a');
        long long5 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get(100L, (long) 10);
        writeCache2.close();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test285");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, 0L);
        io.netty.buffer.ByteBuf byteBuf4 = writeCache2.getLastEntry((long) (short) 10);
        org.junit.Assert.assertNull(byteBuf4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test286");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry(0L);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.getLastEntry((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test287");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        boolean boolean5 = writeCache2.hasEntry((long) (short) 100, (long) (short) 1);
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean8 = writeCache2.isEmpty();
        long long9 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test288");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.close();
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) (short) 1);
        io.netty.buffer.ByteBuf byteBuf14 = writeCache2.get((long) (short) 100, (long) (byte) 100);
        long long15 = writeCache2.size();
        long long16 = writeCache2.count();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test289");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        long long12 = writeCache2.count();
        boolean boolean13 = writeCache2.isEmpty();
        writeCache2.clear();
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test290");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test291");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer5 = null;
        writeCache2.forEach(entryConsumer5);
        writeCache2.deleteLedger((long) 1);
        long long9 = writeCache2.size();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer10 = null;
        writeCache2.forEach(entryConsumer10);
        Class<?> wildcardClass12 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test292");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        boolean boolean4 = writeCache3.isEmpty();
        writeCache3.deleteLedger((long) (short) 10);
        long long7 = writeCache3.count();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test293");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        writeCache2.deleteLedger((long) (byte) 10);
        writeCache2.close();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test294");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        writeCache2.deleteLedger((long) 'a');
        long long5 = writeCache2.count();
        boolean boolean8 = writeCache2.hasEntry(10L, (long) (-1));
        long long9 = writeCache2.size();
        writeCache2.clear();
        Class<?> wildcardClass11 = writeCache2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test295");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache3.getLastEntry((long) (byte) 100);
        boolean boolean6 = writeCache3.isEmpty();
        boolean boolean9 = writeCache3.hasEntry((long) (byte) 0, (long) (byte) 10);
        long long10 = writeCache3.size();
        boolean boolean13 = writeCache3.hasEntry((long) '#', (long) 0);
        org.junit.Assert.assertNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test296");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.count();
        boolean boolean6 = writeCache2.hasEntry(100L, (long) (short) -1);
        writeCache2.close();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            writeCache2.forEach(entryConsumer8);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test297");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) ' ', (long) (-1));
        boolean boolean9 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) (short) 1);
        writeCache2.clear();
        writeCache2.clear();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test298");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        boolean boolean4 = writeCache3.isEmpty();
        writeCache3.deleteLedger((long) (short) 10);
        writeCache3.deleteLedger((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test299");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        long long5 = writeCache2.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) ' ', (long) (-1));
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer9 = null;
        writeCache2.forEach(entryConsumer9);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer11 = null;
        writeCache2.forEach(entryConsumer11);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache2.get((long) '4', (long) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test300");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test301");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        writeCache2.clear();
        boolean boolean10 = writeCache2.hasEntry((long) 0, (long) 1);
        writeCache2.deleteLedger((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test302");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        boolean boolean5 = writeCache2.isEmpty();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.get((long) '#', (long) (short) 100);
        writeCache2.deleteLedger(1L);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache2.getLastEntry((long) '#');
        long long13 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test303");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache2.get((long) 10, (long) (short) 0);
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test304");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache2.getLastEntry((long) 10);
        boolean boolean11 = writeCache2.isEmpty();
        long long12 = writeCache2.count();
        long long13 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache2.getLastEntry((long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = writeCache2.put((long) (byte) 10, (long) 100, byteBuf18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test305");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean5 = writeCache2.isEmpty();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache2.get((long) '#', (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test306");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) '4', (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf5 = writeCache3.getLastEntry((long) (byte) 100);
        writeCache3.close();
        writeCache3.clear();
        writeCache3.clear();
        org.junit.Assert.assertNull(byteBuf5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test307");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) ' ');
        writeCache2.deleteLedger((long) 'a');
        long long5 = writeCache2.count();
        boolean boolean8 = writeCache2.hasEntry(10L, (long) (-1));
        writeCache2.close();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test308");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache.EntryConsumer entryConsumer3 = null;
        writeCache2.forEach(entryConsumer3);
        writeCache2.close();
        long long6 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache2.getLastEntry((long) (byte) 10);
        long long9 = writeCache2.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache2.getLastEntry((long) '4');
        long long12 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test309");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        long long3 = writeCache2.size();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WriteCacheRegressionTest0.test310");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache(byteBufAllocator0, (long) (short) 100);
        writeCache2.deleteLedger((long) (short) 10);
        boolean boolean7 = writeCache2.hasEntry(1L, (-1L));
        writeCache2.deleteLedger((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

