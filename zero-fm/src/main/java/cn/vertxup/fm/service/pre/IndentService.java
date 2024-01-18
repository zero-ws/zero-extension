package cn.vertxup.fm.service.pre;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class IndentService implements IndentStub {

    @Override
    public Future<List<FSettlementItem>> settleAsync(final FSettlement settlement, final List<FBillItem> items) {
        final List<FSettlementItem> settlements = new ArrayList<>();
        for (int idx = 0; idx < items.size(); idx++) {
            final FBillItem item = items.get(idx);
            final JsonObject record = Ux.toJson(item);

            record.remove(KName.KEY);
            final FSettlementItem settlementItem = Ux.fromJson(record, FSettlementItem.class);
            settlementItem.setSettlementId(settlement.getKey());
            settlementItem.setRelatedId(item.getKey());
            settlementItem.setIncome(item.getIncome());

            Ke.umCreated(settlementItem, item);
            settlementItem.setSerial(settlement.getSerial() + "-" + Ut.fromAdjust(idx + 1, 3));
            settlementItem.setCode(settlement.getCode() + "-" + Ut.fromAdjust(idx + 1, 3));
            settlements.add(settlementItem);
        }
        return Ux.future(settlements);
    }
}
