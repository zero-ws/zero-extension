package io.vertx.mod.doc.uca.refer;

import io.horizon.annotations.Memory;
import io.horizon.uca.cache.Cc;
import io.vertx.mod.doc.cv.em.EmRefer;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * @author lang : 2023-09-25
 */
interface CACHE {

    @Memory(Quote.class)
    Cc<String, Quote> CCT_QUOTE = Cc.openThread();
}

interface POOL {

    ConcurrentMap<EmRefer.Entity, Supplier<Quote>> SUPPLIER = new ConcurrentHashMap<>() {
        {
            this.put(EmRefer.Entity.DOC, QuoteDoc::new);
        }
    };
}
