package io.vertx.mod.crud.uca.op.view;

import io.horizon.spi.ui.Apeak;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.init.IxPin;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.op.Agonic;
import io.vertx.up.uca.cache.Rapid;
import io.vertx.up.uca.cache.RapidKey;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;

/**
 * 「全列读取」
 * 此类实现主要用于读取模型全列数据，它的核心执行流程如下：
 * <pre><code>
 *     1. 视图使用的缓存 key 格式如：
 *        - {module}
 *        - {module}:{connect}
 *        此处参数为对应的 module 和 connect 记录的模型标识符
 *     2. 由于列本身可支持两种模式：
 *        - 静态模式：直接走 zero-ui 中的静态定义
 *        - 动态模式：调用 zero-ui 中的动态表 UI_COLUMN
 * </code></pre>
 * 此处最核心的接口为底层 SPI（列计算）接口 {@link Apeak}，此处读取的所有列表中的列信息是当前模型可支持的所有
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class ViewFull implements Agonic {

    @Override
    public Future<JsonArray> runJAAsync(final JsonObject input, final IxMod in) {
        final String cacheKey = in.cached();
        return Rapid.<String, JsonArray>t(RapidKey.VIEW_FULL, Agonic.EXPIRED).cached(cacheKey, () -> {


            final UxJooq jooq = IxPin.jooq(in);
            return Ux.channel(Apeak.class, JsonArray::new,
                stub -> stub.on(jooq).fetchFull(input));
        });
    }
}
