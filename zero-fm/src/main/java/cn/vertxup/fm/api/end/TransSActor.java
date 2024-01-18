package cn.vertxup.fm.api.end;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.unity.Ux;

/**
 * 基础数据格式如
 * <pre><code>
 *     {
 *         "data": [                 // 结算单基础数据
 *             {
 *                 "payment": [],    // （直接结算）结算单交易明细
 *                 "book": [],       // 可关闭账本主键
 *                 "items": [],      // 账单明细，生成结算明细专用
 *             }
 *         ],
 *     }
 * </code></pre>
 *
 * @author lang : 2024-01-17
 */
@Queue
public class TransSActor {


    /**
     * 直接结算专用接口 / 数据格式：
     * <pre><code>
     *     {
     *         "book": [],       // 可关闭账本主键
     *         "items": [],      // 账单明细，生成结算明细专用
     *         "payment": [],    // （直接结算）结算单交易明细
     *     }
     * </code></pre>
     *
     * @param body 请求数据格式
     *
     * @return 结算结果
     */
    @Me
    @Address(Addr.Trans.START_DIRECT)
    public Future<JsonObject> directAsync(final JsonObject body) {
        return Ux.futureJ();
    }

    /**
     * 延迟结算专用接口 / 数据格式：
     * <pre><code>
     *     {
     *         "book": [],       // 可关闭账本主键
     *         "items": [],      // 账单明细，生成结算明细专用
     *     }
     * </code></pre>
     *
     * @param body 请求数据格式
     *
     * @return 结算结果
     */
    @Me
    @Address(Addr.Trans.START_DELAY)
    public Future<JsonObject> delayAsync(final JsonObject body) {
        return Ux.futureJ();
    }

    /**
     * 转应收专用接口 / 数据格式：
     * <pre><code>
     *     {
     *         "book": [],       // 可关闭账本主键
     *         "items": [],      // 账单明细，生成结算明细专用
     *     }
     * </code></pre>
     *
     * @param body 请求数据格式
     *
     * @return 结算结果
     */
    @Me
    @Address(Addr.Trans.START_DEBT)
    public Future<JsonObject> debtAsync(final JsonObject body) {
        return Ux.futureJ();
    }
}
