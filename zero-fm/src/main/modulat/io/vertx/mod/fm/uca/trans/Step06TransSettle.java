package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.daos.FTransDao;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.em.EmTran;
import io.vertx.mod.fm.uca.enter.Maker;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lang : 2024-01-24
 */
class Step06TransSettle implements Trade<List<FSettlement>, FTrans> {

    @Override
    public Future<FTrans> flatter(final JsonObject data, final List<FSettlement> settlements) {
        // 构造 FTrans
        return Maker.ofT().buildFastAsync(data)
            .compose(trans -> {
                /*
                 * 金额计算
                 */
                BigDecimal sum = new BigDecimal(0);
                final List<String> nameList = new ArrayList<>();
                for (final FSettlement settlement : settlements) {
                    if (Objects.nonNull(settlement.getAmount())) {
                        sum = sum.add(settlement.getAmount());
                        nameList.add(settlement.getCode());
                    }
                }
                trans.setAmount(sum);
                trans.setType(EmTran.Type.SETTLEMENT.name());
                trans.setName("ST:" + Ut.fromJoin(nameList));
                // 此处构造完成
                return Ux.future(trans);
            })
            .compose(Ux.Jooq.on(FTransDao.class)::insertAsync);
    }
}
