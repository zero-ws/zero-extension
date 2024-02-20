package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.daos.FDebtDao;
import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.em.EmTran;
import io.vertx.mod.fm.refine.Fm;
import io.vertx.mod.fm.uca.trans.Trade;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Set;

/**
 * @author lang : 2024-01-24
 */
public class DebtService implements DebtStub {

    @Inject
    private transient TransStub transStub;

    @Override
    public Future<FDebt> createAsync(final JsonObject data, final FSettlement settlement) {
        final List<FSettlement> settlements = List.of(settlement);
        return Trade.step05D().flatter(data, settlements);
    }

    @Override
    public Future<FDebt> createAsync(final JsonObject data, final List<FSettlement> settlements) {
        /*
         * 此处的逻辑有一个关键点，就是在 data 中提取底层所需的 keySelected，有了
         * 此操作之后，转应收才能够成功，否则转应收会变成一个伪命题。
         */
        final JsonArray items = Ut.valueJArray(data, KName.ITEMS);
        final JsonArray keys = Ut.toJArray(Ut.valueSetString(items, KName.KEY));
        final JsonObject params = data.copy().put("selected", keys);
        return Trade.step05D().flatter(data, settlements);
    }

    @Override
    public Future<JsonObject> fetchDebt(final JsonArray keys) {
        final JsonObject response = new JsonObject();
        return Ux.Jooq.on(FDebtDao.class).fetchInAsync(KName.KEY, keys)
            .compose(debts -> {
                /* debts */
                response.put(KName.Finance.DEBTS, Ux.toJson(debts));
                return this.transStub.fetchAsync(Ut.toSet(keys), Set.of(EmTran.Type.DEBT, EmTran.Type.REFUND));
            })
            .compose(tranData -> Ux.future(Fm.toTransaction(response, tranData)));
    }
}
