package cn.vertxup.fm.api;

import cn.vertxup.fm.domain.tables.daos.FSettlementDao;
import cn.vertxup.fm.service.end.QrStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.mod.fm.cv.em.EmDebt;
import io.vertx.mod.fm.cv.em.EmTran;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.util.Set;

/**
 * @author lang : 2024-01-25
 */
@Queue
public class BatchActor {
    @Inject
    private transient QrStub qrStub;

    @Address(Addr.Settle.FETCH_BY_KEY)
    public Future<JsonObject> fetchSettlement(final JsonArray keys) {
        return Fn.ofJObject(this.qrStub::fetchSettlement).apply(keys);
    }


    @Address(Addr.Settle.FETCH_BY_QR)
    public Future<JsonObject> searchSettle(final JsonObject qr) {
        return Ux.Jooq.on(FSettlementDao.class).searchAsync(qr).compose(pageData -> {
            final JsonArray settlementData = Ut.valueJArray(pageData, "list");
            final Set<String> keys = Ut.valueSetString(settlementData, KName.KEY);
            return this.qrStub.statusSettlement(keys).compose(transMap -> {
                Ut.itJArray(settlementData).forEach(settleJ -> {
                    /*
                     * 计算 linked 属性，此处 linked 属性要从原来的三属性转换成新的属性
                     * - DONE: 正常结算， finished = true, 交易类型为 SETTLEMENT
                     * - DEBT：应收，finished = true，交易类型为 DEBT（值相同）
                     * - REFUND：应退，finished = true，交易类型为 REFUND（值相同）
                     * - PENDING：待结算，finished = false，交易不存在
                     */
                    final boolean finished = settleJ.getBoolean(KName.FINISHED, Boolean.FALSE);
                    if (finished) {
                        // 已结算完成
                        final String key = Ut.valueString(settleJ, KName.KEY);
                        String type = transMap.getOrDefault(key, EmDebt.Linked.DONE.name());
                        type = type.equals(EmTran.Type.SETTLEMENT.name()) ?
                            EmDebt.Linked.DONE.name() : type;
                        settleJ.put(KName.LINKED, type);
                    } else {
                        // 未结算
                        settleJ.put(KName.LINKED, EmDebt.Linked.PENDING.name());
                    }
                });
                pageData.put("list", settlementData);
                return Ux.future(pageData);
            });
        });
    }

    @Address(Addr.Settle.FETCH_DEBT)
    public Future<JsonObject> fetchDebt(final JsonArray keys) {
        return Fn.ofJObject(this.qrStub::fetchDebt).apply(keys);
    }
}
