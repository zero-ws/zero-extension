package cn.vertxup.fm.api.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.service.end.DebtStub;
import cn.vertxup.fm.service.end.SettleStub;
import cn.vertxup.fm.service.end.TransStub;
import io.horizon.atom.program.KRef;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.mod.fm.cv.em.EmPay;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.unity.Ux;
import jakarta.inject.Inject;

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
public class SettleActor {

    @Inject
    private transient SettleStub settleStub;

    @Inject
    private transient TransStub transStub;

    @Inject
    private transient DebtStub debtStub;

    /**
     * 直接结算专用接口 / 数据格式：
     * <pre><code>
     *     {
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
        // 直接结算
        final KRef settleRef = new KRef();
        return Ux.future()
            // 1. 创建结算单和结算明细
            .compose(nil -> this.settleStub.createAsync(body, EmPay.Type.AT))
            .compose(settleRef::future)


            // 2. 创建交易单和交易明细
            .compose(settlement -> this.transStub.createAsync(body, settlement))
            .compose(nil -> Ux.futureJ((FSettlement) settleRef.get()));
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
        // 延迟结算
        return Ux.future()
            // 1. 创建结算单和结算明细
            .compose(nil -> this.settleStub.createAsync(body, EmPay.Type.DELAY))
            .compose(Ux::futureJ);
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
        // 直接转应收
        final KRef settleRef = new KRef();
        return Ux.future()
            // 1. 创建结算单和结算明细
            .compose(nil -> this.settleStub.createAsync(body, EmPay.Type.DEBT))
            .compose(settleRef::future)


            // 2. 创建应收单，更新结算明细中的 debtId
            .compose(settlement -> this.debtStub.createAsync(body, settlement))
            .compose(nil -> Ux.futureJ((FSettlement) settleRef.get()));
    }
}
