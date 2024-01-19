package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

import java.util.List;

/**
 * @author lang : 2024-01-19
 */
class TradeBI implements Trade<FSettlement, FBillItem> {
    @Override
    public Future<List<FBillItem>> refresh(final JsonArray data, final FSettlement assist) {
        return Trade.super.refresh(data, assist);
    }
}
