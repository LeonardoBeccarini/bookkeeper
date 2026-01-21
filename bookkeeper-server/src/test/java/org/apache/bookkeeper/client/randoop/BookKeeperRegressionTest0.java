package org.apache.bookkeeper.client.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookKeeperRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test001");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper1 = new org.apache.bookkeeper.client.BookKeeper(clientConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test002");
        org.apache.bookkeeper.client.api.DigestType digestType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper.DigestType digestType1 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test003");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper1 = new org.apache.bookkeeper.client.BookKeeper("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Failed to initialize metadata client driver");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test005");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        Class<?> wildcardClass1 = digestType0.getClass();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test006");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        Class<?> wildcardClass1 = digestType0.getClass();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test007");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.zookeeper.ZooKeeper zooKeeper1 = null;
        io.netty.channel.EventLoopGroup eventLoopGroup2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper3 = new org.apache.bookkeeper.client.BookKeeper(clientConfiguration0, zooKeeper1, eventLoopGroup2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No zookeeper instance provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test008");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.zookeeper.ZooKeeper zooKeeper1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper2 = new org.apache.bookkeeper.client.BookKeeper(clientConfiguration0, zooKeeper1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No zookeeper instance provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test009");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper6 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test010");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test011");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        Class<?> wildcardClass6 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper1 = new org.apache.bookkeeper.client.BookKeeper("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Failed to initialize metadata client driver");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test013");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper6 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test014");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        Class<?> wildcardClass3 = digestType1.getClass();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test015");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper6 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test016");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test017");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.setStatsLogger(statsLogger10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test018");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType1 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test019");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.allocator(byteBufAllocator4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test020");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        io.netty.buffer.ByteBufAllocator byteBufAllocator2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.allocator(byteBufAllocator2);
        org.apache.zookeeper.ZooKeeper zooKeeper4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.zk(zooKeeper4);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test021");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test022");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper2 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test023");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        io.netty.buffer.ByteBufAllocator byteBufAllocator2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.allocator(byteBufAllocator2);
        Class<?> wildcardClass4 = builder3.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test024");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test025");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setStatsLogger(statsLogger8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test026");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper16 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test027");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.eventLoopGroup(eventLoopGroup10);
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.allocator(byteBufAllocator12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test028");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.dnsResolver(dNSToSwitchMapping10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test029");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        Class<?> wildcardClass4 = digestType1.getClass();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test030");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.stats.StatsLogger statsLogger2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.setStatsLogger(statsLogger2);
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.statsLogger(statsLogger4);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test031");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test032");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.dnsResolver(dNSToSwitchMapping16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test033");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.statsLogger(statsLogger10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test034");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        io.netty.channel.EventLoopGroup eventLoopGroup6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.eventLoopGroup(eventLoopGroup6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test035");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.util.HashedWheelTimer hashedWheelTimer4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.requestTimer(hashedWheelTimer4);
        Class<?> wildcardClass6 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test036");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        org.apache.zookeeper.ZooKeeper zooKeeper16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.zk(zooKeeper16);
        org.apache.zookeeper.ZooKeeper zooKeeper18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.zk(zooKeeper18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test037");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.dnsResolver(dNSToSwitchMapping12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper14 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test038");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        io.netty.util.HashedWheelTimer hashedWheelTimer10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.requestTimer(hashedWheelTimer10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test039");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.stats.StatsLogger statsLogger2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.setStatsLogger(statsLogger2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper4 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test040");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test041");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.dnsResolver(dNSToSwitchMapping12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder1.setEventLoopGroup(eventLoopGroup14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.requestTimer(hashedWheelTimer16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test042");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType3);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test043");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.setStatsLogger(statsLogger10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test044");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.allocator(byteBufAllocator14);
        io.netty.buffer.ByteBufAllocator byteBufAllocator16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.allocator(byteBufAllocator16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test045");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        io.netty.util.HashedWheelTimer hashedWheelTimer10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.requestTimer(hashedWheelTimer10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test046");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setEventLoopGroup(eventLoopGroup16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.eventLoopGroup(eventLoopGroup18);
        io.netty.channel.EventLoopGroup eventLoopGroup20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setEventLoopGroup(eventLoopGroup20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test047");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.util.HashedWheelTimer hashedWheelTimer4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.requestTimer(hashedWheelTimer4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setStatsLogger(statsLogger6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test048");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        Class<?> wildcardClass4 = digestType0.getClass();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test049");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.allocator(byteBufAllocator10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test050");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder3.allocator(byteBufAllocator12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper14 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test051");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setEventLoopGroup(eventLoopGroup8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.eventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test052");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        io.netty.channel.EventLoopGroup eventLoopGroup6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.eventLoopGroup(eventLoopGroup6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test053");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.dnsResolver(dNSToSwitchMapping6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test054");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType4);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType4);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType5.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType6.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test055");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.statsLogger(statsLogger10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test056");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.eventLoopGroup(eventLoopGroup10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.statsLogger(statsLogger12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder11.setStatsLogger(statsLogger14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test057");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setStatsLogger(statsLogger10);
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.allocator(byteBufAllocator12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test058");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.setStatsLogger(statsLogger10);
        Class<?> wildcardClass12 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test059");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.dnsResolver(dNSToSwitchMapping6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test060");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test061");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test062");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setEventLoopGroup(eventLoopGroup8);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.dnsResolver(dNSToSwitchMapping10);
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.allocator(byteBufAllocator12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test063");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.zk(zooKeeper10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setEventLoopGroup(eventLoopGroup12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test064");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test065");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.allocator(byteBufAllocator14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.statsLogger(statsLogger18);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder5.dnsResolver(dNSToSwitchMapping20);
        Class<?> wildcardClass22 = builder21.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test066");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.statsLogger(statsLogger10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.eventLoopGroup(eventLoopGroup12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test067");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.featureProvider(featureProvider6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test068");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.statsLogger(statsLogger8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test069");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper16 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test070");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.featureProvider(featureProvider16);
        io.netty.util.HashedWheelTimer hashedWheelTimer18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.requestTimer(hashedWheelTimer18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test071");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.dnsResolver(dNSToSwitchMapping18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test072");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType0.toApiDigestType();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test073");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.zk(zooKeeper10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test074");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.eventLoopGroup(eventLoopGroup14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper16 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test075");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.allocator(byteBufAllocator14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.statsLogger(statsLogger18);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder5.dnsResolver(dNSToSwitchMapping20);
        org.apache.zookeeper.ZooKeeper zooKeeper22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder5.setZookeeper(zooKeeper22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test076");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        Class<?> wildcardClass4 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test077");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.zk(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.statsLogger(statsLogger12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.eventLoopGroup(eventLoopGroup14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper16 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test078");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.dnsResolver(dNSToSwitchMapping6);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.dnsResolver(dNSToSwitchMapping8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test079");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        org.apache.zookeeper.ZooKeeper zooKeeper16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.zk(zooKeeper16);
        io.netty.util.HashedWheelTimer hashedWheelTimer18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.requestTimer(hashedWheelTimer18);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.dnsResolver(dNSToSwitchMapping20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test080");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType1 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test081");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.eventLoopGroup(eventLoopGroup14);
        org.apache.zookeeper.ZooKeeper zooKeeper16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder7.zk(zooKeeper16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test082");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setEventLoopGroup(eventLoopGroup16);
        org.apache.zookeeper.ZooKeeper zooKeeper18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.zk(zooKeeper18);
        Class<?> wildcardClass20 = builder17.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test083");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setStatsLogger(statsLogger10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.zk(zooKeeper12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test084");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test085");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.zookeeper.ZooKeeper zooKeeper4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setZookeeper(zooKeeper4);
        io.netty.buffer.ByteBufAllocator byteBufAllocator6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.allocator(byteBufAllocator6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test086");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setEventLoopGroup(eventLoopGroup8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test087");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.dnsResolver(dNSToSwitchMapping8);
        io.netty.util.HashedWheelTimer hashedWheelTimer10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.requestTimer(hashedWheelTimer10);
        Class<?> wildcardClass12 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test088");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test089");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setEventLoopGroup(eventLoopGroup16);
        org.apache.zookeeper.ZooKeeper zooKeeper18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.zk(zooKeeper18);
        org.apache.bookkeeper.stats.StatsLogger statsLogger20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder17.statsLogger(statsLogger20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test090");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.zk(zooKeeper8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.statsLogger(statsLogger10);
        Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test091");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType2);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test092");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.allocator(byteBufAllocator8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test093");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.dnsResolver(dNSToSwitchMapping12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder1.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.dnsResolver(dNSToSwitchMapping16);
        org.apache.zookeeper.ZooKeeper zooKeeper18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.setZookeeper(zooKeeper18);
        org.apache.bookkeeper.stats.StatsLogger statsLogger20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setStatsLogger(statsLogger20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test094");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.zk(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.statsLogger(statsLogger12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.eventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder7.featureProvider(featureProvider16);
        Class<?> wildcardClass18 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test095");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.featureProvider(featureProvider12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test096");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType3.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType7 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType5.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType6.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType7 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType7.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test097");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.eventLoopGroup(eventLoopGroup10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.statsLogger(statsLogger12);
        io.netty.util.HashedWheelTimer hashedWheelTimer14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder11.requestTimer(hashedWheelTimer14);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.dnsResolver(dNSToSwitchMapping16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test098");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test099");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.eventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.dnsResolver(dNSToSwitchMapping16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test100");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        io.netty.channel.EventLoopGroup eventLoopGroup6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.setEventLoopGroup(eventLoopGroup6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.allocator(byteBufAllocator8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test101");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.eventLoopGroup(eventLoopGroup8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.statsLogger(statsLogger10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test102");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.api.DigestType digestType5 = digestType4.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType5);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType5.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType6.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test103");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.setZookeeper(zooKeeper6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setEventLoopGroup(eventLoopGroup8);
        io.netty.util.HashedWheelTimer hashedWheelTimer10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.requestTimer(hashedWheelTimer10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test104");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.statsLogger(statsLogger10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test105");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.setEventLoopGroup(eventLoopGroup10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.zk(zooKeeper12);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.featureProvider(featureProvider14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test106");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.zk(zooKeeper10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setEventLoopGroup(eventLoopGroup12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder11.allocator(byteBufAllocator14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test107");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.dnsResolver(dNSToSwitchMapping12);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.featureProvider(featureProvider14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test108");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        io.netty.channel.EventLoopGroup eventLoopGroup2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.eventLoopGroup(eventLoopGroup2);
        io.netty.util.HashedWheelTimer hashedWheelTimer4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.requestTimer(hashedWheelTimer4);
        Class<?> wildcardClass6 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test109");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.featureProvider(featureProvider16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.statsLogger(statsLogger18);
        io.netty.buffer.ByteBufAllocator byteBufAllocator20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder17.allocator(byteBufAllocator20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test110");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY;
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType1 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY + "'", digestType1.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY + "'", digestType3.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.DUMMY + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY + "'", digestType5.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY + "'", digestType6.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test111");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        Class<?> wildcardClass10 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test112");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.stats.StatsLogger statsLogger2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.setStatsLogger(statsLogger2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.eventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.statsLogger(statsLogger6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test113");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setEventLoopGroup(eventLoopGroup16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.eventLoopGroup(eventLoopGroup18);
        io.netty.buffer.ByteBufAllocator byteBufAllocator20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.allocator(byteBufAllocator20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper22 = builder21.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test114");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.zk(zooKeeper12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test115");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.dnsResolver(dNSToSwitchMapping12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder1.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.dnsResolver(dNSToSwitchMapping16);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.featureProvider(featureProvider18);
        org.apache.zookeeper.ZooKeeper zooKeeper20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder17.setZookeeper(zooKeeper20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test116");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.api.DigestType digestType6 = digestType5.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType7 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType6);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType5.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType6.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType7 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType7.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test117");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.eventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test118");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.featureProvider(featureProvider16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test119");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.MAC;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType2);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.MAC + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.HMAC + "'", digestType3.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.HMAC));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test120");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        Class<?> wildcardClass8 = builder3.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test121");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setEventLoopGroup(eventLoopGroup16);
        io.netty.buffer.ByteBufAllocator byteBufAllocator18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.allocator(byteBufAllocator18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test122");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.dnsResolver(dNSToSwitchMapping12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder1.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.dnsResolver(dNSToSwitchMapping16);
        org.apache.zookeeper.ZooKeeper zooKeeper18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.setZookeeper(zooKeeper18);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder15.featureProvider(featureProvider20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test123");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType3);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType3);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType4.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType5.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test124");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.featureProvider(featureProvider16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.setStatsLogger(statsLogger18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test125");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        io.netty.channel.EventLoopGroup eventLoopGroup2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.eventLoopGroup(eventLoopGroup2);
        org.apache.zookeeper.ZooKeeper zooKeeper4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.zk(zooKeeper4);
        io.netty.buffer.ByteBufAllocator byteBufAllocator6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.allocator(byteBufAllocator6);
        Class<?> wildcardClass8 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test126");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.setEventLoopGroup(eventLoopGroup12);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder9.dnsResolver(dNSToSwitchMapping14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test127");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.statsLogger(statsLogger10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.statsLogger(statsLogger12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.statsLogger(statsLogger14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test128");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.requestTimer(hashedWheelTimer16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper18 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test129");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.statsLogger(statsLogger12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setStatsLogger(statsLogger14);
        org.apache.bookkeeper.stats.StatsLogger statsLogger16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder13.setStatsLogger(statsLogger16);
        io.netty.buffer.ByteBufAllocator byteBufAllocator18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder13.allocator(byteBufAllocator18);
        org.apache.bookkeeper.stats.StatsLogger statsLogger20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setStatsLogger(statsLogger20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test130");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.allocator(byteBufAllocator4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper6 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test131");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.allocator(byteBufAllocator14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.statsLogger(statsLogger18);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.featureProvider(featureProvider20);
        org.apache.zookeeper.ZooKeeper zooKeeper22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder19.setZookeeper(zooKeeper22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test132");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.statsLogger(statsLogger12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test133");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.setZookeeper(zooKeeper6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setEventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.setZookeeper(zooKeeper10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test134");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.stats.StatsLogger statsLogger2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.setStatsLogger(statsLogger2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.eventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.statsLogger(statsLogger6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.eventLoopGroup(eventLoopGroup8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.eventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test135");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.zk(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.statsLogger(statsLogger12);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.dnsResolver(dNSToSwitchMapping14);
        io.netty.buffer.ByteBufAllocator byteBufAllocator16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.allocator(byteBufAllocator16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test136");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType3);
        org.apache.bookkeeper.client.api.DigestType digestType5 = digestType4.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType5);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType5.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType6.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test137");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        io.netty.channel.EventLoopGroup eventLoopGroup2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.eventLoopGroup(eventLoopGroup2);
        io.netty.util.HashedWheelTimer hashedWheelTimer4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.requestTimer(hashedWheelTimer4);
        io.netty.channel.EventLoopGroup eventLoopGroup6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.eventLoopGroup(eventLoopGroup6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test138");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.zk(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setStatsLogger(statsLogger12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test139");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.setEventLoopGroup(eventLoopGroup10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.zk(zooKeeper12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.eventLoopGroup(eventLoopGroup14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test140");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType2.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType2.toApiDigestType();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test141");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setEventLoopGroup(eventLoopGroup16);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.featureProvider(featureProvider18);
        org.apache.bookkeeper.stats.StatsLogger statsLogger20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setStatsLogger(statsLogger20);
        Class<?> wildcardClass22 = builder19.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test142");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.statsLogger(statsLogger12);
        io.netty.util.HashedWheelTimer hashedWheelTimer14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder1.requestTimer(hashedWheelTimer14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test143");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder3.zk(zooKeeper12);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder3.dnsResolver(dNSToSwitchMapping14);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.dnsResolver(dNSToSwitchMapping16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test144");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.stats.StatsLogger statsLogger2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.setStatsLogger(statsLogger2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.eventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.statsLogger(statsLogger6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test145");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.setZookeeper(zooKeeper6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.allocator(byteBufAllocator8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper10 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test146");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.setZookeeper(zooKeeper8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setStatsLogger(statsLogger10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test147");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.featureProvider(featureProvider16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.setEventLoopGroup(eventLoopGroup18);
        io.netty.buffer.ByteBufAllocator byteBufAllocator20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.allocator(byteBufAllocator20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper22 = builder21.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test148");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.dnsResolver(dNSToSwitchMapping6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.setEventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test149");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.statsLogger(statsLogger10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        Class<?> wildcardClass14 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test150");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.setZookeeper(zooKeeper6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setEventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.featureProvider(featureProvider12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test151");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.setEventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test152");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType3.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType7 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType6);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType5.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType6.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType7 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType7.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test153");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.allocator(byteBufAllocator14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.statsLogger(statsLogger18);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.featureProvider(featureProvider20);
        org.apache.bookkeeper.stats.StatsLogger statsLogger22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder21.statsLogger(statsLogger22);
        io.netty.channel.EventLoopGroup eventLoopGroup24 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder25 = builder23.eventLoopGroup(eventLoopGroup24);
        org.apache.bookkeeper.stats.StatsLogger statsLogger26 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder27 = builder25.setStatsLogger(statsLogger26);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test154");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.eventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test155");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.MAC;
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType1 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.HMAC + "'", digestType1.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.HMAC));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.HMAC + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.HMAC));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test156");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.allocator(byteBufAllocator14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.statsLogger(statsLogger18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper20 = builder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test157");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.featureProvider(featureProvider12);
        io.netty.util.HashedWheelTimer hashedWheelTimer14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.requestTimer(hashedWheelTimer14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test158");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType3);
        org.apache.bookkeeper.client.api.DigestType digestType5 = digestType4.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType6 = digestType4.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType7 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType6);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType5.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType6.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType7 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType7.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test159");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.eventLoopGroup(eventLoopGroup8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setStatsLogger(statsLogger10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test160");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.statsLogger(statsLogger18);
        io.netty.buffer.ByteBufAllocator byteBufAllocator20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder17.allocator(byteBufAllocator20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test161");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.stats.StatsLogger statsLogger2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.setStatsLogger(statsLogger2);
        org.apache.zookeeper.ZooKeeper zooKeeper4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.zk(zooKeeper4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.dnsResolver(dNSToSwitchMapping6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.zk(zooKeeper8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test162");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setEventLoopGroup(eventLoopGroup16);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.featureProvider(featureProvider18);
        org.apache.bookkeeper.stats.StatsLogger statsLogger20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setStatsLogger(statsLogger20);
        org.apache.bookkeeper.stats.StatsLogger statsLogger22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder19.setStatsLogger(statsLogger22);
        io.netty.buffer.ByteBufAllocator byteBufAllocator24 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder25 = builder19.allocator(byteBufAllocator24);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test163");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.buffer.ByteBufAllocator byteBufAllocator6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.allocator(byteBufAllocator6);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.dnsResolver(dNSToSwitchMapping8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test164");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.featureProvider(featureProvider16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.setEventLoopGroup(eventLoopGroup18);
        org.apache.zookeeper.ZooKeeper zooKeeper20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.zk(zooKeeper20);
        org.apache.bookkeeper.stats.StatsLogger statsLogger22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder21.setStatsLogger(statsLogger22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test165");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.allocator(byteBufAllocator8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.allocator(byteBufAllocator10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test166");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.dnsResolver(dNSToSwitchMapping6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.zk(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.zk(zooKeeper12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test167");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.zk(zooKeeper10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder11.featureProvider(featureProvider14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test168");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setEventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test169");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder3.featureProvider(featureProvider12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test170");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.zookeeper.ZooKeeper zooKeeper4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.zk(zooKeeper4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test171");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setEventLoopGroup(eventLoopGroup16);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.dnsResolver(dNSToSwitchMapping18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test172");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.zk(zooKeeper10);
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.allocator(byteBufAllocator12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test173");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.dnsResolver(dNSToSwitchMapping12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder1.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.dnsResolver(dNSToSwitchMapping16);
        org.apache.zookeeper.ZooKeeper zooKeeper18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.setZookeeper(zooKeeper18);
        io.netty.channel.EventLoopGroup eventLoopGroup20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.eventLoopGroup(eventLoopGroup20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test174");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.setStatsLogger(statsLogger6);
        Class<?> wildcardClass8 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test175");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.featureProvider(featureProvider16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.setEventLoopGroup(eventLoopGroup18);
        org.apache.zookeeper.ZooKeeper zooKeeper20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.zk(zooKeeper20);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder19.dnsResolver(dNSToSwitchMapping22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test176");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType3.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType5 = digestType3.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType5);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType5.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType6.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test177");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY;
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType1 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType4);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY + "'", digestType1.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.DUMMY + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.DUMMY + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY + "'", digestType5.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY + "'", digestType6.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.DUMMY));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test178");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.eventLoopGroup(eventLoopGroup10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.statsLogger(statsLogger12);
        io.netty.util.HashedWheelTimer hashedWheelTimer14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder11.requestTimer(hashedWheelTimer14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setEventLoopGroup(eventLoopGroup16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test179");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.dnsResolver(dNSToSwitchMapping6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setZookeeper(zooKeeper8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test180");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.zk(zooKeeper10);
        Class<?> wildcardClass12 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test181");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType2.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType2.toApiDigestType();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test182");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test183");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.zk(zooKeeper10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setEventLoopGroup(eventLoopGroup12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setStatsLogger(statsLogger14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test184");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.dnsResolver(dNSToSwitchMapping8);
        io.netty.util.HashedWheelTimer hashedWheelTimer10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.requestTimer(hashedWheelTimer10);
        io.netty.util.HashedWheelTimer hashedWheelTimer12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.requestTimer(hashedWheelTimer12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test185");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder3.allocator(byteBufAllocator12);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.dnsResolver(dNSToSwitchMapping14);
        org.apache.zookeeper.ZooKeeper zooKeeper16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setZookeeper(zooKeeper16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test186");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.allocator(byteBufAllocator8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test187");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        org.apache.bookkeeper.stats.StatsLogger statsLogger16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setStatsLogger(statsLogger16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.eventLoopGroup(eventLoopGroup18);
        io.netty.channel.EventLoopGroup eventLoopGroup20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder17.setEventLoopGroup(eventLoopGroup20);
        io.netty.channel.EventLoopGroup eventLoopGroup22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder17.eventLoopGroup(eventLoopGroup22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test188");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.dnsResolver(dNSToSwitchMapping10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder3.setEventLoopGroup(eventLoopGroup12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setStatsLogger(statsLogger14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test189");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder3.zk(zooKeeper12);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.dnsResolver(dNSToSwitchMapping14);
        org.apache.bookkeeper.stats.StatsLogger statsLogger16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setStatsLogger(statsLogger16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test190");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.zk(zooKeeper10);
        Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test191");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.statsLogger(statsLogger10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.featureProvider(featureProvider14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test192");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.dnsResolver(dNSToSwitchMapping6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setZookeeper(zooKeeper8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.allocator(byteBufAllocator10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test193");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.eventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.featureProvider(featureProvider16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test194");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.stats.StatsLogger statsLogger2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.setStatsLogger(statsLogger2);
        org.apache.zookeeper.ZooKeeper zooKeeper4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.zk(zooKeeper4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.dnsResolver(dNSToSwitchMapping6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.requestTimer(hashedWheelTimer8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test195");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.dnsResolver(dNSToSwitchMapping10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test196");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.allocator(byteBufAllocator8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.statsLogger(statsLogger10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.featureProvider(featureProvider12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test197");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.dnsResolver(dNSToSwitchMapping10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setStatsLogger(statsLogger12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder11.eventLoopGroup(eventLoopGroup14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test198");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.buffer.ByteBufAllocator byteBufAllocator6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.allocator(byteBufAllocator6);
        Class<?> wildcardClass8 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test199");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.featureProvider(featureProvider12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setStatsLogger(statsLogger14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test200");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.allocator(byteBufAllocator14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.statsLogger(statsLogger18);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.featureProvider(featureProvider20);
        org.apache.bookkeeper.stats.StatsLogger statsLogger22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder21.statsLogger(statsLogger22);
        io.netty.channel.EventLoopGroup eventLoopGroup24 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder25 = builder23.eventLoopGroup(eventLoopGroup24);
        io.netty.channel.EventLoopGroup eventLoopGroup26 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder27 = builder23.setEventLoopGroup(eventLoopGroup26);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test201");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.eventLoopGroup(eventLoopGroup12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder9.zk(zooKeeper14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test202");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.requestTimer(hashedWheelTimer16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.statsLogger(statsLogger18);
        org.apache.zookeeper.ZooKeeper zooKeeper20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder17.setZookeeper(zooKeeper20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test203");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType3);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType3);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType6 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType3);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType7 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType3);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType8 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType7);
        Class<?> wildcardClass9 = digestType7.getClass();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType5.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType6.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType7 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType7.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType8 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType8.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test204");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test205");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test206");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType2 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType2);
        org.apache.bookkeeper.client.api.DigestType digestType4 = digestType3.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType5 = digestType3.toApiDigestType();
        org.apache.bookkeeper.client.api.DigestType digestType6 = digestType3.toApiDigestType();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType5.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType6 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType6.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test207");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setEventLoopGroup(eventLoopGroup16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.eventLoopGroup(eventLoopGroup18);
        org.apache.bookkeeper.stats.StatsLogger statsLogger20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setStatsLogger(statsLogger20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test208");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.zk(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.statsLogger(statsLogger12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setStatsLogger(statsLogger14);
        org.apache.bookkeeper.stats.StatsLogger statsLogger16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder13.setStatsLogger(statsLogger16);
        io.netty.buffer.ByteBufAllocator byteBufAllocator18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder13.allocator(byteBufAllocator18);
        io.netty.channel.EventLoopGroup eventLoopGroup20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.eventLoopGroup(eventLoopGroup20);
        org.apache.bookkeeper.stats.StatsLogger statsLogger22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder19.setStatsLogger(statsLogger22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test209");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setEventLoopGroup(eventLoopGroup16);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.featureProvider(featureProvider18);
        org.apache.bookkeeper.stats.StatsLogger statsLogger20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setStatsLogger(statsLogger20);
        io.netty.util.HashedWheelTimer hashedWheelTimer22 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder23 = builder19.requestTimer(hashedWheelTimer22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test210");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType2.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType2);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType2);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32 + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32 + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType4.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32 + "'", digestType5.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test211");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.dnsResolver(dNSToSwitchMapping6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.allocator(byteBufAllocator8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.statsLogger(statsLogger10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test212");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        io.netty.channel.EventLoopGroup eventLoopGroup2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.eventLoopGroup(eventLoopGroup2);
        io.netty.util.HashedWheelTimer hashedWheelTimer4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.requestTimer(hashedWheelTimer4);
        io.netty.channel.EventLoopGroup eventLoopGroup6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.eventLoopGroup(eventLoopGroup6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.eventLoopGroup(eventLoopGroup8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.featureProvider(featureProvider10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test213");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.featureProvider(featureProvider16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder5.setEventLoopGroup(eventLoopGroup18);
        org.apache.zookeeper.ZooKeeper zooKeeper20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setZookeeper(zooKeeper20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test214");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.featureProvider(featureProvider12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test215");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.MAC;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType3);
        Class<?> wildcardClass5 = digestType3.getClass();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.MAC + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.HMAC + "'", digestType4.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.HMAC));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test216");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.dnsResolver(dNSToSwitchMapping6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.featureProvider(featureProvider10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test217");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.setZookeeper(zooKeeper6);
        io.netty.channel.EventLoopGroup eventLoopGroup8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setEventLoopGroup(eventLoopGroup8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.eventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test218");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        io.netty.buffer.ByteBufAllocator byteBufAllocator16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.allocator(byteBufAllocator16);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.featureProvider(featureProvider18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test219");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder7.eventLoopGroup(eventLoopGroup14);
        org.apache.bookkeeper.stats.StatsLogger statsLogger16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder7.setStatsLogger(statsLogger16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test220");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.statsLogger(statsLogger10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.zk(zooKeeper12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test221");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setStatsLogger(statsLogger8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setEventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test222");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.setEventLoopGroup(eventLoopGroup14);
        io.netty.buffer.ByteBufAllocator byteBufAllocator16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.allocator(byteBufAllocator16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.setStatsLogger(statsLogger18);
        org.apache.zookeeper.ZooKeeper zooKeeper20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setZookeeper(zooKeeper20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test223");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.stats.StatsLogger statsLogger2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.setStatsLogger(statsLogger2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.eventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.statsLogger(statsLogger6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.statsLogger(statsLogger8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test224");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.dnsResolver(dNSToSwitchMapping6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.featureProvider(featureProvider10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.statsLogger(statsLogger12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test225");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.setStatsLogger(statsLogger8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        io.netty.util.HashedWheelTimer hashedWheelTimer14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.requestTimer(hashedWheelTimer14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test226");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType4.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test227");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.dnsResolver(dNSToSwitchMapping6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.zk(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.statsLogger(statsLogger12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper14 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test228");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.featureProvider(featureProvider8);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.dnsResolver(dNSToSwitchMapping10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test229");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        io.netty.buffer.ByteBufAllocator byteBufAllocator12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.allocator(byteBufAllocator12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test230");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.featureProvider(featureProvider6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setZookeeper(zooKeeper10);
        io.netty.util.HashedWheelTimer hashedWheelTimer12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.requestTimer(hashedWheelTimer12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test231");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.setStatsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setZookeeper(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.zk(zooKeeper10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test232");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.MAC;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.api.DigestType digestType5 = digestType4.toApiDigestType();
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.MAC + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.api.DigestType.MAC + "'", digestType5.equals(org.apache.bookkeeper.client.api.DigestType.MAC));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test233");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        org.apache.bookkeeper.stats.StatsLogger statsLogger16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setStatsLogger(statsLogger16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.setEventLoopGroup(eventLoopGroup18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test234");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.dnsResolver(dNSToSwitchMapping8);
        io.netty.util.HashedWheelTimer hashedWheelTimer10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.requestTimer(hashedWheelTimer10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder9.setEventLoopGroup(eventLoopGroup14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test235");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.statsLogger(statsLogger14);
        org.apache.bookkeeper.stats.StatsLogger statsLogger16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder13.setStatsLogger(statsLogger16);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder13.dnsResolver(dNSToSwitchMapping18);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test236");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.allocator(byteBufAllocator8);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.dnsResolver(dNSToSwitchMapping10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder9.statsLogger(statsLogger12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.eventLoopGroup(eventLoopGroup14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test237");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        org.apache.zookeeper.ZooKeeper zooKeeper16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setZookeeper(zooKeeper16);
        org.apache.bookkeeper.stats.StatsLogger statsLogger18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder15.setStatsLogger(statsLogger18);
        org.apache.bookkeeper.stats.StatsLogger statsLogger20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.setStatsLogger(statsLogger20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test238");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.statsLogger(statsLogger10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setZookeeper(zooKeeper14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder13.setEventLoopGroup(eventLoopGroup16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test239");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.zk(zooKeeper10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test240");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.setStatsLogger(statsLogger8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.setEventLoopGroup(eventLoopGroup10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test241");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        io.netty.channel.EventLoopGroup eventLoopGroup14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.setEventLoopGroup(eventLoopGroup14);
        io.netty.util.HashedWheelTimer hashedWheelTimer16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.requestTimer(hashedWheelTimer16);
        org.apache.zookeeper.ZooKeeper zooKeeper18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.zk(zooKeeper18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper20 = builder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test242");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        org.apache.bookkeeper.stats.StatsLogger statsLogger10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.setStatsLogger(statsLogger10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test243");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        org.apache.zookeeper.ZooKeeper zooKeeper8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.zk(zooKeeper8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.featureProvider(featureProvider10);
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.statsLogger(statsLogger12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test244");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        io.netty.buffer.ByteBufAllocator byteBufAllocator2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.allocator(byteBufAllocator2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test245");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.buffer.ByteBufAllocator byteBufAllocator4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.allocator(byteBufAllocator4);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.featureProvider(featureProvider6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper10 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test246");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder5.zk(zooKeeper14);
        org.apache.bookkeeper.stats.StatsLogger statsLogger16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder5.setStatsLogger(statsLogger16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.eventLoopGroup(eventLoopGroup18);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder19.featureProvider(featureProvider20);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test247");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.MAC;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType5 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.MAC + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType3.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType5 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType5.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test248");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.MAC;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType1);
        org.apache.bookkeeper.client.api.DigestType digestType3 = digestType2.toApiDigestType();
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType4 = org.apache.bookkeeper.client.BookKeeper.DigestType.fromApiDigestType(digestType3);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.MAC + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType2.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.client.api.DigestType.MAC + "'", digestType3.equals(org.apache.bookkeeper.client.api.DigestType.MAC));
        org.junit.Assert.assertTrue("'" + digestType4 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.MAC + "'", digestType4.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.MAC));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test249");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.setZookeeper(zooKeeper6);
        org.apache.bookkeeper.stats.StatsLogger statsLogger8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.setStatsLogger(statsLogger8);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder1.featureProvider(featureProvider10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder1.setZookeeper(zooKeeper12);
        io.netty.buffer.ByteBufAllocator byteBufAllocator14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.allocator(byteBufAllocator14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test250");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.featureProvider(featureProvider4);
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.requestTimer(hashedWheelTimer6);
        io.netty.buffer.ByteBufAllocator byteBufAllocator8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder7.allocator(byteBufAllocator8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder7.allocator(byteBufAllocator10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder7.setEventLoopGroup(eventLoopGroup12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test251");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.featureProvider(featureProvider4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder5.zk(zooKeeper6);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder5.featureProvider(featureProvider8);
        io.netty.buffer.ByteBufAllocator byteBufAllocator10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder5.allocator(byteBufAllocator10);
        org.apache.bookkeeper.feature.FeatureProvider featureProvider12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder5.featureProvider(featureProvider12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.statsLogger(statsLogger14);
        io.netty.buffer.ByteBufAllocator byteBufAllocator16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder13.allocator(byteBufAllocator16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.BookKeeper bookKeeper18 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: No stats logger provided");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test252");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setZookeeper(zooKeeper12);
        org.apache.bookkeeper.stats.StatsLogger statsLogger14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.statsLogger(statsLogger14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder15.setEventLoopGroup(eventLoopGroup16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test253");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder3.dnsResolver(dNSToSwitchMapping4);
        org.apache.bookkeeper.stats.StatsLogger statsLogger6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder3.statsLogger(statsLogger6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder3.requestTimer(hashedWheelTimer8);
        io.netty.channel.EventLoopGroup eventLoopGroup10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder3.setEventLoopGroup(eventLoopGroup10);
        org.apache.zookeeper.ZooKeeper zooKeeper12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder3.zk(zooKeeper12);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder13.dnsResolver(dNSToSwitchMapping14);
        io.netty.channel.EventLoopGroup eventLoopGroup16 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder17 = builder13.eventLoopGroup(eventLoopGroup16);
        io.netty.channel.EventLoopGroup eventLoopGroup18 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder19 = builder17.setEventLoopGroup(eventLoopGroup18);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping20 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder21 = builder17.dnsResolver(dNSToSwitchMapping20);
        Class<?> wildcardClass22 = builder17.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test254");
        org.apache.bookkeeper.client.BookKeeper.DigestType digestType0 = org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C;
        org.apache.bookkeeper.client.api.DigestType digestType1 = digestType0.toApiDigestType();
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType2 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType digestType3 = org.apache.bookkeeper.client.BookKeeper.DigestType.toProtoDigestType(digestType0);
        org.junit.Assert.assertTrue("'" + digestType0 + "' != '" + org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C + "'", digestType0.equals(org.apache.bookkeeper.client.BookKeeper.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType1 + "' != '" + org.apache.bookkeeper.client.api.DigestType.CRC32C + "'", digestType1.equals(org.apache.bookkeeper.client.api.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType2 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType2.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
        org.junit.Assert.assertTrue("'" + digestType3 + "' != '" + org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C + "'", digestType3.equals(org.apache.bookkeeper.proto.DataFormats.LedgerMetadataFormat.DigestType.CRC32C));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookKeeperRegressionTest0.test255");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration0 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder1 = org.apache.bookkeeper.client.BookKeeper.forConfig(clientConfiguration0);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder3 = builder1.dnsResolver(dNSToSwitchMapping2);
        io.netty.channel.EventLoopGroup eventLoopGroup4 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder5 = builder1.setEventLoopGroup(eventLoopGroup4);
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder7 = builder1.zk(zooKeeper6);
        io.netty.util.HashedWheelTimer hashedWheelTimer8 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder9 = builder1.requestTimer(hashedWheelTimer8);
        org.apache.zookeeper.ZooKeeper zooKeeper10 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder11 = builder9.zk(zooKeeper10);
        io.netty.channel.EventLoopGroup eventLoopGroup12 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder13 = builder11.setEventLoopGroup(eventLoopGroup12);
        org.apache.zookeeper.ZooKeeper zooKeeper14 = null;
        org.apache.bookkeeper.client.BookKeeper.Builder builder15 = builder11.zk(zooKeeper14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }
}

