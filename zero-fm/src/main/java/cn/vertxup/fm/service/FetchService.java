package cn.vertxup.fm.service;

import cn.vertxup.fm.domain.tables.daos.FBillDao;
import cn.vertxup.fm.domain.tables.daos.FBillItemDao;
import cn.vertxup.fm.domain.tables.daos.FSettlementDao;
import cn.vertxup.fm.domain.tables.daos.FSettlementItemDao;
import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class FetchService implements FetchStub {

    @Override
    public Future<List<FBill>> fetchByOrder(final String orderId) {
        final JsonObject condBill = Ux.whereAnd();
        condBill.put(KName.Finance.ORDER_ID, orderId);
        return Ux.Jooq.on(FBillDao.class).fetchAsync(condBill);
    }

    @Override
    public Future<List<FBillItem>> fetchByBills(final List<FBill> bills) {
        if (bills.isEmpty()) {
            return Ux.future(new ArrayList<>());
        }

        final JsonObject condition = Ux.whereAnd();
        condition.put(KName.Finance.BILL_ID + ",i",
            Ut.toJArray(bills.stream().map(FBill::getKey)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet()))
        );
        return Ux.Jooq.on(FBillItemDao.class).fetchAsync(condition);
    }

    @Override
    public Future<List<FSettlement>> fetchSettlements(final List<FBillItem> items) {
        if (items.isEmpty()) {
            return Ux.future(new ArrayList<>());
        }


        final JsonObject condition = Ux.whereAnd();
        condition.put(KName.KEY, Ut.toJArray(items.stream()
            .map(FBillItem::getSettlementId)
            .filter(Ut::isNotNil)
            .collect(Collectors.toSet())
        ));
        return Ux.Jooq.on(FSettlementDao.class).fetchAsync(condition);
    }

    @Override
    public Future<List<FSettlementItem>> fetchBySettlements(final List<FSettlement> settlements) {
        final Set<String> settlementIds = Ut.valueSetString(settlements, FSettlement::getKey);
        final JsonObject condition = Ux.whereAnd();
        condition.put(KName.Finance.SETTLEMENT_ID + ",i", Ut.toJArray(settlementIds));
        return Ux.Jooq.on(FSettlementItemDao.class).fetchAsync(condition);
    }
}
