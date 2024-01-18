package cn.vertxup.fm.service.business;

import cn.vertxup.fm.domain.tables.daos.FBillDao;
import cn.vertxup.fm.domain.tables.daos.FBillItemDao;
import cn.vertxup.fm.domain.tables.daos.FPreAuthorizeDao;
import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FPreAuthorize;
import cn.vertxup.fm.service.pre.FillStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.uca.replica.IkWayObj;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import jakarta.inject.Inject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BillService implements BillStub {
    @Inject
    private transient FillStub fillStub;
    @Inject
    private transient AccountStub accountStub;

    @Override
    public Future<JsonObject> singleAsync(final FBill bill, final FBillItem billItem, final FPreAuthorize authorize) {
        if (Objects.nonNull(authorize)) {
            bill.setAmount(BigDecimal.ZERO);
            billItem.setAmount(BigDecimal.ZERO);
        }
        return Ux.Jooq.on(FBillDao.class).insertAsync(bill).compose(inserted -> {
            // UCA
            IkWayObj.b2bi().transfer(bill, billItem);

            final List<Future<JsonObject>> futures = new ArrayList<>();
            futures.add(Ux.Jooq.on(FBillItemDao.class).insertJAsync(billItem));
            if (Objects.nonNull(authorize)) {
                // UCA
                IkWayObj.b2a().transfer(bill, authorize);
                futures.add(Ux.Jooq.on(FPreAuthorizeDao.class).insertJAsync(authorize));
            }
            final List<FBillItem> itemList = new ArrayList<>();
            itemList.add(billItem);
            return Fn.combineA(futures)
                .compose(nil -> this.accountStub.inBook(bill, itemList))
                .compose(nil -> this.billAsync(bill, itemList));
        });
    }

    @Override
    public Future<JsonObject> multiAsync(final FBill bill, final List<FBillItem> items) {
        /*
         * Because Multi will be selected from item, it means that the items contains `key` here
         * We must remove `key` of items instead of duplicated key met here
         * Fix:
         */
        items.forEach(item -> item.setKey(null));

        return Ux.Jooq.on(FBillDao.class).insertAsync(bill).compose(inserted -> {
            // UCA
            IkWayObj.b2bi().transfer(bill, items);

            return Ux.Jooq.on(FBillItemDao.class).insertJAsync(items)
                .compose(nil -> this.accountStub.inBook(bill, items))
                .compose(nil -> this.billAsync(bill, items));
        });
    }

    private Future<JsonObject> billAsync(final FBill bill, final List<FBillItem> items) {
        final JsonObject response = Ux.toJson(bill);
        response.put(KName.ITEMS, Ux.toJson(items));
        return Ux.future(response);
    }
}
