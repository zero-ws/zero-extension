package cn.vertxup.fm.api;

import cn.vertxup.fm.domain.tables.daos.FSettlementDao;
import cn.vertxup.fm.service.end.DebtStub;
import cn.vertxup.fm.service.end.SettleRStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-01-25
 */
@Queue
public class BatchActor {
    @Inject
    private transient SettleRStub settleRStub;

    @Inject
    private transient DebtStub debtStub;

    @Address(Addr.Settle.FETCH_BY_KEY)
    public Future<JsonObject> fetchSettlement(final JsonArray keys) {
        return Fn.ofJObject(this.settleRStub::fetchSettlement).apply(keys);
    }


    @Address(Addr.Settle.FETCH_BY_QR)
    public Future<JsonObject> searchSettle(final JsonObject qr) {
        return Ux.Jooq.on(FSettlementDao.class).searchAsync(qr).compose(pageData -> {
            final JsonArray settlementData = Ut.valueJArray(pageData, "list");
            final JsonArray keys = Ut.valueJArray(settlementData, KName.KEY);
            return this.settleRStub.fetchStatus(keys).compose(statusMap -> {
                /*
                 * statusMap 中的数据结构如：
                 * - settlementId = JsonArray
                 * 其中 JsonArray 中的状态值会有多个，如果为空，则表示没有处理过
                 * 那么状态中的数据应该是 PENDING（单元素）
                 */
                Ut.itJArray(settlementData).forEach(settleJ -> {
                    final String key = settleJ.getString(KName.KEY);
                    final JsonArray status = statusMap.getOrDefault(key, new JsonArray());
                    settleJ.put(KName.LINKED, status);
                });
                pageData.put("list", settlementData);
                return Ux.future(pageData);
            });
        });
    }

    @Address(Addr.Settle.FETCH_DEBT)
    public Future<JsonObject> fetchDebt(final JsonArray keys) {
        return Fn.ofJObject(this.debtStub::fetchDebt).apply(keys);
    }
}
