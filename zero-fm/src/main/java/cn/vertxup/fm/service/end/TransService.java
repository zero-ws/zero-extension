package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.daos.FTransItemDao;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import cn.vertxup.fm.domain.tables.pojos.FTransItem;
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
}
