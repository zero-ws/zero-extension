package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.horizon.atom.program.KRef;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.em.EmPay;
import io.vertx.mod.fm.uca.trans.Trade;
import io.vertx.up.unity.Ux;

import java.util.List;

/**
 * @author lang : 2024-01-23
 */
public class SettleService implements SettleStub {
    /**
     * 结算步骤
     * <pre><code>
     *      结算单 x 1
     *      结算明细 x N
     * </code></pre>
     *
     * @param body 结算数据
     * @param type 结算类型
     *
     * @return 结算结果
     */
    @Override
    public Future<FSettlement> createAsync(final JsonObject body, final EmPay.Type type) {
        // 01. 创建结算单, type -> FSettlement
        final KRef settleRef = new KRef();
        // (JsonObject, EmPay.Type) -> FSettlement
        return Trade.step01ST().flatter(body, type)
            .compose(settleRef::future)


            // 02. 根据结算单处理账单明细，此处外层调用 updateAsync 更新方法（防并发冲突）
            // (JsonObject, FSettlement) -> List<FBillItem>
            .compose(inserted -> Trade.step02BI().scatter(body, inserted))


            // 03. 执行关闭 Book 的操作（录入关闭）
            // (JsonObject, List<FBillItem>) -> List<FBillItem>
            .compose(items -> Trade.step03B().scatter(body, items))


            // 04. 根据 BillItems 构造 SettlementItems 记录并插入
            // (JsonArray, FSettlement) -> List<FSettlementItem>
            .compose(items -> Trade.step04SI().scatter(Ux.toJson(items), settleRef.get()))


            .compose(nil -> Ux.future(settleRef.get()));
    }

    /**
     * 结算步骤
     * <pre><code>
     *      结算单 x N
     *      结算明细 x N
     * </code></pre>
     *
     * @param body 结算数据
     * @param type 结算类型
     *
     * @return 结算结果
     */
    @Override
    public Future<List<FSettlement>> createAsync(final JsonArray body, final EmPay.Type type) {
        // 01. 创建结算单, type -> FSettlement
        final KRef settleRef = new KRef();
        // (JsonArray, EmPay.Type) -> List<FSettlement>
        return Trade.step01ST().scatter(body, type)
            .compose(settleRef::future)


            // 02. 根据结算单处理账单明细，此处外层调用 updateAsync 更新方法（防并发冲突）
            // (JsonArray, List<FSettlement>) -> List<FBillItem>
            .compose(inserted -> Trade.step02BI().flatter(body, inserted))


            // 03. 执行关闭 Book 的操作（录入关闭）
            // (JsonArray, List<FBillItem>) -> List<FBillItem>
            .compose(items -> Trade.step03B().scatter(body, items))


            // 04. 根据 BillItems 构造 SettlementItems 记录并插入
            // (JsonArray, List<FSettlement>) -> List<FSettlementItem>
            .compose(items -> Trade.step04SI().flatter(Ux.toJson(items), settleRef.get()))


            .compose(nil -> Ux.future(settleRef.get()));
    }
}
