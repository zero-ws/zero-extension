package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.daos.FDebtDao;
import cn.vertxup.fm.domain.tables.daos.FSettlementDao;
import cn.vertxup.fm.domain.tables.daos.FSettlementItemDao;
import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.atom.TranData;
import io.vertx.mod.fm.cv.em.EmTran;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class QrService implements QrStub {

    @Inject
    private transient TransStub transStub;

    /**
     * 此处注意响应的格式，响应格式在原始基础上会有所变化
     * <pre><code>
     *     1. 原来的单结算单的模式改成了多结算单模式，那么此处有可能会出现多张订单同时结算的情况
     *        结算限制：结算本身不限制，只是给出相关提示，同订单的选择提示。
     *     2. 响应数据格式如：
     *        {
     *            "settlements": [],
     *            "items": [],
     *            "debts": [],
     *            "transactions": []
     *        }
     *        前端去针对数据结构做运算，此处的结构是为了方便前端处理，后端不做任何运算，此处是在
     *        选择之后提取 settlements 结算信息时出来的内容，放前端运算更靠谱，和结算相关的信息
     *        有两个维度
     *        - debts：相关应收信息
     *        - transactions：交易数据，交易数据中会包含直接结算部分，如果交易数据直接和结算挂钩
     *        证明这些交易数据本身是关联结算的，而且是直接结算模式。
     * </code></pre>
     *
     * @param keys 传入的结算单主键集合
     *
     * @return JsonObject
     */
    @Override
    public Future<JsonObject> fetchSettlement(final JsonArray keys) {
        final JsonObject response = new JsonObject();
        return Ux.Jooq.on(FSettlementDao.class).<FSettlement>fetchInAsync(KName.KEY, keys)
            .compose(settlements -> {
                /* settlements */
                response.put(KName.Finance.SETTLEMENTS, Ux.toJson(settlements));
                return this.fetchInternalItems(keys);
            })
            .compose(items -> {
                /* items */
                response.put(KName.ITEMS, Ux.toJson(items));
                final JsonArray debtIds = Ut.toJArray(Ut.valueSetString(items, FSettlementItem::getDebtId));
                return this.fetchInternalDebts(debtIds);
            })
            .compose(debts -> {
                /* debts */
                response.put(KName.Finance.DEBTS, Ux.toJson(debts));
                return this.transStub.fetchAsync(Ut.toSet(keys), Set.of(EmTran.Type.SETTLEMENT));
            })
            .compose(tranData -> this.combineTran(response, tranData));
    }

    @Override
    public Future<JsonObject> fetchDebt(final JsonArray keys) {
        final JsonObject response = new JsonObject();
        return this.fetchInternalDebts(keys)
            .compose(debts -> {
                /* debts */
                response.put(KName.Finance.DEBTS, Ux.toJson(debts));
                return this.transStub.fetchAsync(Ut.toSet(keys), Set.of(EmTran.Type.DEBT, EmTran.Type.REFUND));
            })
            .compose(tranData -> this.combineTran(response, tranData));
    }

    @Override
    public Future<ConcurrentMap<String, String>> statusSettlement(final Set<String> keys) {
        // PKG-FM-102
        return this.transStub.fetchAsync(keys, Set.of(EmTran.Type.SETTLEMENT)).compose(tranList -> {
            // 数据结构：结算 key = 最终呈现的状态信息
            final ConcurrentMap<String, String> statusMap = new ConcurrentHashMap<>();
            keys.forEach(settlementKey -> {
                final TranData trans = tranList.stream()
                    .filter(data -> data.isIn(settlementKey))
                    .findAny().orElse(null);
                if (Objects.nonNull(trans) && Objects.nonNull(trans.transaction())) {
                    final FTrans tranRef = trans.transaction();
                    statusMap.put(settlementKey, tranRef.getType());
                }
            });
            return Ux.future(statusMap);
        });
    }

    private Future<JsonObject> combineTran(final JsonObject response, final List<TranData> tranData) {
        final JsonArray transactions = new JsonArray();
        tranData.stream()
            .map(TranData::toJson)
            .forEach(transactions::add);
        response.put(KName.Finance.TRANSACTIONS, transactions);
        return Ux.future(response);
    }


    private Future<List<FDebt>> fetchInternalDebts(final JsonArray debts) {
        return Ux.Jooq.on(FDebtDao.class).fetchInAsync(KName.KEY, debts);
    }

    private Future<List<FSettlementItem>> fetchInternalItems(final JsonArray settlementIds) {
        return Ux.Jooq.on(FSettlementItemDao.class).fetchInAsync(KName.Finance.SETTLEMENT_ID, settlementIds);
    }
}
