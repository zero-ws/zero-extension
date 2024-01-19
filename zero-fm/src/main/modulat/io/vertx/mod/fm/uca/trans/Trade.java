package io.vertx.mod.fm.uca.trans;

import io.horizon.exception.web._501NotImplementException;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.List;

/**
 * 交易专用接口，处理账单之后的结算部分
 * <pre><code>
 *     1. 三种结算方式的处理
 *        - 直接结算
 *        - 延迟结算
 *        - 直接转应收
 *     2. 结算管理
 *     3. 应收、退款处理
 *     4. 开票处理
 * </code></pre>
 *
 * @author lang : 2024-01-19
 */
public interface Trade<IN, OUT> {
    // 第一种形态：JsonObject + IN
    default Future<OUT> begin(final JsonObject data) {
        return this.execute(data, null);
    }

    default Future<OUT> execute(final JsonObject data, final IN assist) {
        throw new _501NotImplementException(this.getClass());
    }

    // 第二种形态：JsonArray + List<IN>
    default Future<List<OUT>> begin(final JsonArray data) {
        return this.execute(data, null);
    }

    default Future<List<OUT>> execute(final JsonArray data, final List<IN> assist) {
        throw new _501NotImplementException(this.getClass());
    }

    // 第三种形态：JsonArray + IN，不带纯数据模式
    default Future<OUT> refresh(final JsonObject data, final IN assist) {
        throw new _501NotImplementException(this.getClass());
    }

    default Future<List<OUT>> refresh(final JsonArray data, final IN assist) {
        throw new _501NotImplementException(this.getClass());
    }
}
