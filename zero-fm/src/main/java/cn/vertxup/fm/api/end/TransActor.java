package cn.vertxup.fm.api.end;

import cn.vertxup.fm.service.end.AdjustStub;
import cn.vertxup.fm.service.end.DebtStub;
import cn.vertxup.fm.service.end.SettleWStub;
import cn.vertxup.fm.service.end.TransStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.time.Instant;

/**
 * @author lang : 2024-02-20
 */
@Queue
public class TransActor {

    @Inject
    private transient SettleWStub settleStub;

    @Inject
    private transient TransStub transStub;

    @Inject
    private transient DebtStub debtStub;

    @Inject
    private transient AdjustStub adjustStub;

    /**
     * 结算单已经存在的情况下的直接处理专用接口
     * <pre><code>
     *     {
     *         "settlements": [ 结算单 ],
     *         "items": [ 结算明细，finishedId 有值 ],
     *         "payment": [ 直接结算专用 ]
     *     }
     * </code></pre>
     * 此处接口执行时，结算单已经存在，所以在基础结算单环境少一个创建结算单的基本步骤，且
     * 这里的结算单处理信息是批量的。
     *
     * @param body 请求数据格式
     *
     * @return 结算单处理结果
     */
    @Address(Addr.Trans.END_TRANS)
    @Me
    public Future<JsonObject> finishAsync(final JsonObject body, final User user) {
        {
            // PUT 方法，所以要设置创建人信息（交易创建），特殊请求属性
            final String key = Ux.keyUser(user);
            body.put(KName.CREATED_BY, key);
            body.put(KName.CREATED_AT, Instant.now());
        }
        // 1. 更新结算单
        return this.settleStub.updateAsync(body, user).compose(settlements -> {
            final JsonArray payment = Ut.valueJArray(body, FmCv.ID.PAYMENT);
            if (Ut.isNil(payment)) {
                // 转应收
                // 2. 创建新的应收单
                return this.debtStub.createAsync(body, settlements)
                    .compose(Ux::futureJ);
            } else {
                // 直接结算
                // 2. 创建交易信息
                return this.transStub.createAsync(body, settlements)

                    // 3. 修正 finishedId
                    .compose(trans -> this.adjustStub.adjustAsync(trans, Ut.valueJArray(body, KName.ITEMS)))
                    .compose(Ux::futureJ);
            }
        });
    }

    @Address(Addr.Trans.END_DEBT)
    @Me
    public Future<JsonObject> debtAsync(final JsonObject body) {
        return null;
    }
}
