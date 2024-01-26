package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.daos.FTransItemDao;
import cn.vertxup.fm.domain.tables.daos.FTransOfDao;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import cn.vertxup.fm.domain.tables.pojos.FTransItem;
import cn.vertxup.fm.domain.tables.pojos.FTransOf;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.mod.fm.cv.em.EmTran;
import io.vertx.mod.fm.uca.replica.IkWay;
import io.vertx.mod.fm.uca.trans.Trade;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.List;
import java.util.Set;

/**
 * @author lang : 2024-01-24
 */
public class TransService implements TransStub {
    @Override
    public Future<FTrans> createAsync(final JsonObject data, final FSettlement settlement) {
        final JsonObject params = new JsonObject();
        {
            params.put(KName.COMMENT, settlement.getComment());
            params.put(KName.TYPE, EmTran.Type.SETTLEMENT.name());
            params.put(KName.KEYS, new JsonArray().add(settlement.getKey()));
        }
        // 1. 构造 FTrans
        return Trade.step06T().flatter(data, List.of(settlement))
            // 2. 构造 FTransOf
            .compose(trans -> this.createAsync(trans, data, params));
    }

    private Future<FTrans> createAsync(
        final FTrans trans, final JsonObject data, final JsonObject params) {
        return Trade.step06TO().scatter(params, trans)
            .compose(nil -> {
                final JsonArray paymentJ = Ut.valueJArray(data, FmCv.ID.PAYMENT);
                final List<FTransItem> payments = Ux.fromJson(paymentJ, FTransItem.class);

                IkWay.ofT2TI().transfer(trans, payments);

                return Ux.Jooq.on(FTransItemDao.class).insertAsync(payments);
            })
            .compose(nil -> Ux.future(trans));
    }

    @Override
    public Future<List<FTransItem>> fetchBySettle(final List<FSettlement> settlements) {
        // List<FSettlement> -> Trans -> List<FTransItem>
        final Set<String> settleIds = Ut.valueSetString(settlements, FSettlement::getKey);
        final JsonObject condition = Ux.whereAnd();
        condition.put("objectType", EmTran.Type.SETTLEMENT.name());
        condition.put("objectId,i", Ut.toJArray(settleIds));
        return Ux.Jooq.on(FTransOfDao.class).<FTransOf>fetchAsync(condition)
            .compose(transOf -> {
                final Set<String> transIds = Ut.valueSetString(transOf, FTransOf::getTransId);


                // 跳过选择，直接查询 FTransItem
                final JsonObject condTrans = Ux.whereAnd();
                condTrans.put("transactionId,i", Ut.toJArray(transIds));
                return Ux.Jooq.on(FTransItemDao.class).fetchAsync(condTrans);
            });
    }
}
