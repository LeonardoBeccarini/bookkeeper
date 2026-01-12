package org.apache.bookkeeper.bookie.storage.myTest;


import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.util.IllegalReferenceCountException;
import io.netty.util.ReferenceCountUtil;
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

    public enum CacheState{
        AVAILABLE,
        EMPTY,
        CLOSED
    }

    private static final int  WRONG_ID = 47;
    private static final int  ID= 0;
    private static final byte[] ENTRY = "Test entry 1".getBytes(StandardCharsets.UTF_8);

    private final long ledgerID;
    private final long entryID;
    private final CacheState cacheState;
    private boolean isExceptionExpected;

    private WriteCache writeCache;

    public WriteCacheGetTest(int ledgerID, int entryId, CacheState cacheState, boolean isExceptionExpected) {
        this.entryID=entryId;
        this.ledgerID = ledgerID;
        this.cacheState = cacheState;
        this.isExceptionExpected = isExceptionExpected;
    }

    @Parameters(name = "LedgerID{0}, EntryID{1}, State={2} -> ExpectEx={3}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            /* 1 */{ID, ID, CacheState.AVAILABLE, false},
                /* 2 */{WRONG_ID, WRONG_ID, CacheState.AVAILABLE, true},
                /* 3 */{WRONG_ID, WRONG_ID, CacheState.AVAILABLE, true},
                /* 4 */{WRONG_ID, WRONG_ID, CacheState.AVAILABLE, true},
                /* 5 */  {ID, ID, CacheState.EMPTY, true},
                /* 6 */ {ID, ID, CacheState.CLOSED, true},
        });

    }

    @Before
    public void setUp(){
        ByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;
        long maxCacheSize = 1024;
        writeCache = new WriteCache(allocator, maxCacheSize);

        switch (cacheState){
            case EMPTY:
                break;
            case AVAILABLE: {
                ByteBuf buffer = Unpooled.wrappedBuffer(ENTRY);
                try {
                    writeCache.put(ID, ID, buffer);
                } finally {
                    ReferenceCountUtil.release(buffer); // evita leak del buffer di input
                }
                break;
            }
            case CLOSED:
                writeCache.close();
        }
    }
    @After
    public void tearDown() {
        if (writeCache != null) {
            // Evita double-close: in CLOSED l'hai già chiusa in setUp
            if (cacheState != CacheState.CLOSED) {
                writeCache.close();
            }
            writeCache = null;
        }
    }

    @Test
    public void testGet() {
        final boolean expectThrow = (cacheState == CacheState.CLOSED) && isExceptionExpected;
        final boolean expectHit =
                (cacheState == CacheState.AVAILABLE)
                        && (ledgerID == ID)
                        && (entryID == ID)
                        && !isExceptionExpected;

        ByteBuf result = null;
        try {
            result = writeCache.get(ledgerID, entryID);

            if (expectThrow) {
                fail("Expected an exception when cache is CLOSED");
            }

            if (expectHit) {
                assertNotNull("Expected cache HIT (non-null ByteBuf)", result);
                byte[] actual = new byte[result.readableBytes()];
                result.getBytes(result.readerIndex(), actual);
                assertArrayEquals("Entry content mismatch", ENTRY, actual);
            } else {
                assertNull("Expected cache MISS (null)", result);
            }
        } catch (IllegalStateException e) {
            if (!expectThrow) {
                throw e; // eccezione inattesa
            }
            // eccezione attesa nel caso CLOSED
        } finally {
            ReferenceCountUtil.release(result); // release sicuro anche su null
        }
    }


}
