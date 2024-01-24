package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.daos.FTransDao;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.uca.enter.Maker;
import io.vertx.mod.fm.uca.replica.IkWay;
import io.vertx.up.unity.Ux;

import java.util.List;

/**
 * @author lang : 2024-01-24
 */
class Step06TransSettle implements Trade<List<FSettlement>, FTrans> {

    @Override
    public Future<FTrans> flatter(final JsonObject data, final List<FSettlement> settlements) {
        // 构造 FTrans
        return Maker.ofT().buildFastAsync(data)
            .compose(trans -> {
                // 构造完成后执行下一步操作
                IkWay.ofST2T().transfer(settlements, trans);
                // 此处构造完成
                return Ux.future(trans);
            })
            .compose(Ux.Jooq.on(FTransDao.class)::insertAsync);
    }
}
