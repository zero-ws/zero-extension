package cn.vertxup.fm.service.business;

import cn.vertxup.fm.domain.tables.daos.FBillDao;
import cn.vertxup.fm.domain.tables.daos.FBillItemDao;
import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FBook;
import io.horizon.eon.VString;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.uca.enter.MakerObj;
import io.vertx.mod.fm.uca.replica.IkWayObj;
import io.vertx.up.eon.KName;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-01-11
 */
public class VarietyService implements VarietyStub {
    @Inject
    private transient AccountStub accountStub;

    @Override
    public Future<JsonObject> splitAsync(final FBillItem item, final List<FBillItem> items) {
        // UCA
        IkWayObj.ofBIS().transfer(item, items);

        final UxJooq jooq = Ux.Jooq.on(FBillItemDao.class);
        return jooq.updateAsync(item)
            .compose(nil -> jooq.insertAsync(items))
            .compose(nil -> Ux.futureJ(item));
    }

    @Override
    public Future<JsonObject> revertAsync(final FBillItem item, final FBillItem to) {
        // UCA
        IkWayObj.ofBIR().transfer(item, to);

        final UxJooq jooq = Ux.Jooq.on(FBillItemDao.class);
        return jooq.updateAsync(item)
            .compose(nil -> jooq.insertAsync(to))
            .compose(nil -> Ux.Jooq.on(FBillDao.class).<FBill>fetchByIdAsync(to.getBillId()))
            .compose(bill -> this.accountStub.inBook(bill, to))
            .compose(nil -> Ux.futureJ(item));
    }

    @Override
    public Future<JsonObject> transferAsync(final ConcurrentMap<Boolean, List<FBillItem>> fromTo, final FBook book,
                                            final JsonObject params) {
        /*
         * `comment` from params
         *  1. Bill set comment
         *  2. Bill Item set comment ( newItem )
         */
        final String comment = params.getString(KName.COMMENT);
        return MakerObj.ofB().buildFastAsync(params).compose(preBill -> {
            // UCA
            IkWayObj.ofBKT().transfer(book, preBill);

            preBill.setComment(comment);
            return Ux.Jooq.on(FBillDao.class).insertAsync(preBill).compose(bill -> {
                    // FBillItem New Adding
                    final List<FBillItem> newItem = fromTo.get(Boolean.TRUE);
                    newItem.forEach(each -> {
                        each.setBillId(bill.getKey());

                        each.setComment(VString.ARROW_RIGHT + comment);
                    });
                    return Ux.Jooq.on(FBillItemDao.class).insertAsync(newItem)
                        .compose(items -> this.accountStub.inBook(bill, items));
                }).compose(added -> {
                    // FBillItem Previous Updating
                    final List<FBillItem> oldItem = fromTo.get(Boolean.FALSE);

                    oldItem.forEach(each -> {
                        final String previous = each.getComment();
                        if (Ut.isNil(previous)) {
                            each.setComment(comment + VString.ARROW_RIGHT);
                        } else {
                            each.setComment(previous + VString.ARROW_RIGHT + comment);
                        }
                    });
                    return Ux.Jooq.on(FBillItemDao.class).updateAsync(oldItem);
                }).compose(this.accountStub::inBook)
                .compose(nil -> Ux.futureJ(preBill));
        });

    }
}
