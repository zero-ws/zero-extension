package io.zerows.extension.runtime.ambient.uca.boot;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.up.util.Ut;
import io.zerows.core.metadata.uca.logging.OLog;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * 全应用加载器，用于加载当前应用的全局配置，不同组装器操作流程会有所区别
 *
 * @author lang : 2024-07-08
 */
public interface Cabinet<T> {
    Cc<Integer, Cabinet<?>> CC_SKELETON = Cc.open();

    @SuppressWarnings("unchecked")
    static <T> Cabinet<T> of(final Supplier<Cabinet<?>> supplier) {
        return (Cabinet<T>) CC_SKELETON.pick(supplier, supplier.hashCode());
    }

    Future<ConcurrentMap<String, T>> loadAsync(final Vertx container);

    default OLog logger() {
        return Ut.Log.boot(this.getClass());
    }
}
