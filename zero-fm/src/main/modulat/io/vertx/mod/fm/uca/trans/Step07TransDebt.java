package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.daos.FTransDao;
import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.uca.enter.Maker;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lang : 2024-03-12
 */
class Step07TransDebt implements Trade<List<FDebt>, FTrans> {

    @Override
    public Future<FTrans> flatter(final JsonObject data, final List<FDebt> debts) {
        // 构造 FTrans
        return Maker.ofT().buildFastAsync(data)
            .compose(trans -> {
                // 名称
                final List<String> nameList = new ArrayList<>();
                for (final FDebt debt : debts) {
                    if (null != debt.getAmount()) {
                        nameList.add(debt.getCode());
                    }
                }
                trans.setName("DR: " + Ut.fromJoin(nameList));
                // 此处构造完成
                return Ux.future(trans);
            })
            .compose(Ux.Jooq.on(FTransDao.class)::insertAsync);
    }
}
