package io.vertx.mod.fm.uca.enter;

import io.horizon.exception.web._501NotImplementException;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.List;

/**
 * 对象构造器，直接根据数据构造对象
 * <pre><code>
 *     1. 单对象构造
 *     2. 多对象构造
 * </code></pre>
 *
 * @author lang : 2024-01-18
 */
public interface Maker<H, T> {

    default Future<T> buildFastAsync(final JsonObject data) {
        throw new _501NotImplementException(this.getClass());
    }

    default Future<T> buildAsync(final JsonObject data, final H assist) {
        throw new _501NotImplementException(this.getClass());
    }

    default Future<List<T>> buildAsync(final JsonArray data, final H assist) {
        throw new _501NotImplementException(this.getClass());
    }
}
