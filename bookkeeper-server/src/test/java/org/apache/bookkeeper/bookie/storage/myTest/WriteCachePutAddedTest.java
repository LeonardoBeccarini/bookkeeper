package org.apache.bookkeeper.bookie.storage.myTest;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.bookie.storage.ldb.WriteCache;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test mirati per uccidere le mutazioni "changed conditional boundary"
 * sopravvissute nel metodo put() di WriteCache.
 * <p>
 * MUTAZIONI TARGET:
 * - Linea 150: (offset + size) > maxCacheSize  →  >=
 * - Linea 153: maxSegmentSize - localOffset < size  →  <=
 * - Linea 170: currentLastEntryId > entryId  →  >= e →  false
 */
public class WriteCachePutAddedTest {

    private ByteBufAllocator allocator;
    private WriteCache cache;

    @Before
    public void setUp() {
        allocator = UnpooledByteBufAllocator.DEFAULT;
    }

    @After
    public void tearDown() {
        if (cache != null) {
            cache.close();
        }
    }

    /**
     * UCCIDE MUTAZIONE LINEA 150: (offset + size) > maxCacheSize → >=
     * <p>
     * Scenario: offset=0, size=64, maxCacheSize=64
     * - Originale (>):  64 > 64 = FALSE  → put RIESCE
     * - Mutazione (>=): 64 >= 64 = TRUE  → put FALLISCE (return false)
     * <p> <p>
     * Il test PASSA con codice originale, FALLISCE con mutazione.
     */
    @Test
    public void testExactCacheSizeLimit_KillsBoundaryMutation() {
        // Cache di esattamente 64 byte
        cache = new WriteCache(allocator, 64, 64);

        ByteBuf entry = Unpooled.buffer(64);
        entry.writeZero(64);

        // Questo put DEVE riuscire con il codice originale
        boolean result = cache.put(1, 1, entry);

        // Asserzione forte: verifica che il put sia riuscito
        assertTrue("PUT al limite esatto (offset+size == maxCacheSize) DEVE riuscire", result);

        // Verifiche aggiuntive che l'entry sia effettivamente nella cache
        assertTrue("Entry DEVE essere presente nella cache", cache.hasEntry(1, 1));
        assertEquals("Count DEVE essere 1", 1, cache.count());

        ByteBuf retrieved = cache.get(1, 1);
        assertNotNull("GET DEVE ritornare l'entry", retrieved);
        assertEquals("Dimensione entry DEVE corrispondere", 64, retrieved.readableBytes());

        entry.release();
        retrieved.release();
    }

    /**
     * UCCIDE MUTAZIONE LINEA 153: maxSegmentSize - localOffset < size → <=
     * <p>
     * Scenario: dopo prima entry, localOffset=64, maxSegmentSize=128, size=64
     * remaining = 128 - 64 = 64, size = 64
     * - Originale (<):  64 < 64 = FALSE  → NON fa continue → entry entra QUI
     * - Mutazione (<=): 64 <= 64 = TRUE  → FA continue → cerca altro spazio
     *   Ma dopo continue, cacheOffset+=64 → nuovo offset supera maxCacheSize → FALLISCE
     * <p>
     * Il test PASSA con codice originale, FALLISCE con mutazione.
     */
    @Test
    public void testExactSegmentBoundary_KillsBoundaryMutation() {
        // Cache: 128 byte totali, segmento singolo da 128 byte
        // IMPORTANTE: maxCacheSize == maxSegmentSize per evitare che trovi spazio altrove
        cache = new WriteCache(allocator, 128, 128);

        // Prima entry: 64 byte (alignedSize = 64)
        ByteBuf entry1 = Unpooled.buffer(64);
        entry1.writeZero(64);
        assertTrue("Prima entry deve entrare", cache.put(1, 1, entry1));
        // Stato: cacheOffset=64, localOffset=64

        // Seconda entry: 64 byte
        // remaining = maxSegmentSize - localOffset = 128 - 64 = 64
        // size = 64
        // Con <:  64 < 64 = false → entra nel segmento corrente → PUT RIESCE
        // Con <=: 64 <= 64 = true → continue → cacheOffset diventa 128
        //         → (128 + 64) > 128 → return false alla linea 150
        ByteBuf entry2 = Unpooled.buffer(64);
        entry2.writeZero(64);

        boolean result = cache.put(1, 2, entry2);

        assertTrue("PUT che riempie esattamente lo spazio rimanente DEVE riuscire", result);

        // Verifiche che entrambe le entry siano nella cache
        assertTrue("Entry 1 DEVE essere presente", cache.hasEntry(1, 1));
        assertTrue("Entry 2 DEVE essere presente", cache.hasEntry(1, 2));
        assertEquals("Count DEVE essere 2", 2, cache.count());

        entry1.release();
        entry2.release();
    }

    /**
     * UCCIDE MUTAZIONE LINEA 170: currentLastEntryId > entryId → false
     * (removed conditional - replaced comparison check with false)
     * <p>
     * Scenario: scrivo entry con ID 100, poi entry con ID 50 (out-of-order)
     * - Originale (>):  100 > 50 = TRUE  → break → lastEntryId RIMANE 100
     * - Mutazione (false): false → continua → lastEntryId DIVENTA 50
     * <p>
     * getLastEntry() ritorna get(ledgerId, lastEntryId):
     * - Con originale: get(1, 100) → dati entry alta (999L)
     * - Con mutazione: get(1, 50) → dati entry bassa (111L)
     */
    @Test
    public void testOutOfOrderWrite_KillsConditionFalseMutation() {
        cache = new WriteCache(allocator, 1024, 1024);

        // Prima scrivo l'entry con ID ALTO (100)
        ByteBuf entryHigh = Unpooled.buffer(8);
        entryHigh.writeLong(999L);  // Valore distintivo
        assertTrue(cache.put(1, 100, entryHigh));
        // lastEntryId per ledger 1 = 100

        // Poi scrivo l'entry con ID BASSO (50) - OUT OF ORDER
        ByteBuf entryLow = Unpooled.buffer(8);
        entryLow.writeLong(111L);  // Valore distintivo diverso
        assertTrue(cache.put(1, 50, entryLow));

        // Con codice originale: 100 > 50 = true → break → lastEntryId = 100
        // Con mutazione (false): → continua → lastEntryId = 50

        // getLastEntry ritorna get(ledgerId, lastEntryId)
        ByteBuf last = cache.getLastEntry(1);
        assertNotNull("getLastEntry NON deve essere null", last);

        // ASSERZIONE CHIAVE che uccide la mutazione:
        // Se lastEntryId=100 (corretto): leggiamo 999L
        // Se lastEntryId=50 (mutazione): leggiamo 111L → TEST FALLISCE
        long value = last.readLong();
        assertEquals("getLastEntry DEVE ritornare l'entry con ID MAGGIORE (100), non quella più recente (50)",
                999L, value);

        entryHigh.release();
        entryLow.release();
        last.release();
    }

    /**
     * UCCIDE MUTAZIONE LINEA 170: currentLastEntryId > entryId → >=
     * (changed conditional boundary)
     * <p>
     * Scenario: scrivo entry con ID 50, poi RISCRIVO con stesso ID 50
     * - Originale (>):  50 > 50 = FALSE → NON fa break → aggiorna lastEntryMap
     * - Mutazione (>=): 50 >= 50 = TRUE → FA break → NON aggiorna lastEntryMap
     * <p>
     * NOTA: In questo caso specifico, poiché l'entryId è uguale, il valore
     * finale di lastEntryId è comunque 50 in entrambi i casi.
     * Tuttavia, l'index viene aggiornato e get() ritorna i nuovi dati.
     * <p>
     * Per testare questo boundary, verifichiamo il comportamento con
     * scrittura in ordine crescente dove currentLastEntryId == entryId - 1
     * non è applicabile. Usiamo invece un test che verifichi la sequenza.
     */
    @Test
    public void testSequentialWrites_LastEntryAlwaysUpdated() {
        cache = new WriteCache(allocator, 1024, 1024);

        // Scrivo entry in ordine crescente: 1, 2, 3
        for (int i = 1; i <= 3; i++) {
            ByteBuf entry = Unpooled.buffer(8);
            entry.writeLong(i * 100L);
            assertTrue("Entry " + i + " deve essere accettata", cache.put(1, i, entry));
            entry.release();
        }

        // lastEntryId deve essere 3
        ByteBuf last = cache.getLastEntry(1);
        assertNotNull(last);
        assertEquals("Dopo scritture sequenziali, lastEntry deve essere l'ultima (ID=3)",
                300L, last.readLong());
        last.release();

        // Ora scrivo una entry con ID intermedio (2) - questa NON deve cambiare lastEntryId
        ByteBuf entryMid = Unpooled.buffer(8);
        entryMid.writeLong(222L);
        assertTrue(cache.put(1, 2, entryMid));
        entryMid.release();

        // lastEntryId deve rimanere 3, NON diventare 2
        ByteBuf lastAfter = cache.getLastEntry(1);
        assertNotNull(lastAfter);
        assertEquals("Dopo riscrittura ID intermedio, lastEntry deve rimanere ID=3",
                300L, lastAfter.readLong());
        lastAfter.release();
    }

    /**
     * Test aggiuntivo per verificare il corretto funzionamento del boundary
     * alla linea 150 con offset > 0.
     */
    @Test
    public void testCacheBoundary_WithNonZeroOffset() {
        // Cache di 128 byte
        cache = new WriteCache(allocator, 128, 128);

        // Prima entry: 64 byte → offset diventa 64
        ByteBuf entry1 = Unpooled.buffer(64);
        entry1.writeZero(64);
        assertTrue(cache.put(1, 1, entry1));

        // Seconda entry: 64 byte → offset+size = 64+64 = 128 == maxCacheSize
        // Con >:  128 > 128 = false → PUT RIESCE
        // Con >=: 128 >= 128 = true → PUT FALLISCE
        ByteBuf entry2 = Unpooled.buffer(64);
        entry2.writeZero(64);

        boolean result = cache.put(1, 2, entry2);
        assertTrue("Entry che porta offset+size esattamente a maxCacheSize DEVE entrare", result);

        assertEquals("Entrambe le entry devono essere nella cache", 2, cache.count());

        entry1.release();
        entry2.release();
    }

    /**
     * Test che verifica il comportamento quando la cache è piena.
     * Questo serve come controllo che il test boundary sia significativo.
     */
    @Test
    public void testCacheFull_RejectsNextEntry() {
        cache = new WriteCache(allocator, 64, 64);

        // Riempio la cache completamente
        ByteBuf entry1 = Unpooled.buffer(64);
        entry1.writeZero(64);
        assertTrue(cache.put(1, 1, entry1));

        // La prossima entry DEVE essere rifiutata
        // offset=64, size=1, offset+size=65 > 64 → return false
        ByteBuf entry2 = Unpooled.buffer(1);
        entry2.writeZero(1);

        boolean result = cache.put(1, 2, entry2);
        assertFalse("Entry che sfora maxCacheSize DEVE essere rifiutata", result);

        entry1.release();
        entry2.release();
    }
}