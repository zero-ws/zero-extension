package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.daos.FSettlementItemDao;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.mod.fm.uca.enter.Maker;
import io.vertx.up.unity.Ux;

import java.util.List;

/**
 * 步骤四：根据数据生成最终的 {@link FSettlementItem} 的列表
 *
 * @author lang : 2024-01-22
 */
class TradeSI implements Trade<FSettlement, FSettlementItem> {
    @Override
    public Future<List<FSettlementItem>> execute(final JsonArray data, final FSettlement inserted) {
        /*
         * STI 构造来处理账单明细信息
         * 直接用账单明细 FBillItem 中的数据来构造 FSettlementItem，并且将 FSettlementItem 插入到数据库中
         * 保存起来。
         */
        return Maker.upSTI().buildAsync(data, inserted)
            .compose(Ux.Jooq.on(FSettlementItemDao.class)::insertAsync);
    }
}
