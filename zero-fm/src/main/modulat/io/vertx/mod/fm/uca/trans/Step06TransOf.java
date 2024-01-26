package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.daos.FTransOfDao;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import cn.vertxup.fm.domain.tables.pojos.FTransOf;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.uca.enter.Maker;
import io.vertx.up.unity.Ux;

import java.util.List;

/**
 * @author lang : 2024-01-25
 */
class Step06TransOf implements Trade<FTrans, FTransOf> {
    @Override
    public Future<List<FTransOf>> scatter(final JsonObject data, final FTrans trans) {
        /*
         * {
         *     "type": "xxx",
         *     "comment": "xxx",
         *     "keys": []
         * }
         */
        return Maker.ofTO().buildAsync(data, trans)
            .compose(Ux.Jooq.on(FTransOfDao.class)::insertAsync);
    }
}
