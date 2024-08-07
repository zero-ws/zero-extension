package io.zerows.extension.commerce.finance.agent.api;

import io.zerows.extension.commerce.finance.domain.tables.daos.FBillDao;
import io.zerows.extension.commerce.finance.domain.tables.daos.FBillItemDao;
import io.zerows.extension.commerce.finance.domain.tables.daos.FTransDao;
import io.zerows.extension.commerce.finance.domain.tables.daos.FTransItemDao;
import io.zerows.extension.commerce.finance.domain.tables.pojos.FBill;
import io.zerows.extension.commerce.finance.agent.service.BookStub;
import io.zerows.extension.commerce.finance.agent.service.FetchStub;
import io.zerows.extension.commerce.finance.agent.service.end.SettleRStub;
import io.zerows.extension.commerce.finance.agent.service.end.TransStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.commerce.finance.domain.tables.pojos.FSettlement;
import io.zerows.extension.commerce.finance.domain.tables.pojos.FTrans;
import io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem;
import io.zerows.extension.commerce.finance.eon.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.commerce.finance.atom.BillData;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@Queue
public class FetchActor {
    @Inject
    private transient FetchStub fetchStub;
    @Inject
    private transient BookStub bookStub;
    @Inject
    private transient SettleRStub qrStub;

    @Inject
    private transient TransStub transStub;

    @Address(Addr.BillItem.FETCH_AGGR)
    public Future<JsonObject> fetchAggr(final String orderId) {
        final BillData data = new BillData();
        /* 按照 orderId 查询账单集合信息 */
        return this.fetchStub.fetchByOrder(orderId)
            .compose(data::bill)


            /* 根据账单查询 账单明细 信息 */
            .compose(bills -> this.fetchStub.fetchByBills(bills))
            .compose(data::items)


            /* 根据账单明细查询 结算单 信息 */
            .compose(this.fetchStub::fetchSettlements)
            .compose(data::settlement)

            /*
             * 旧版本多查询了一步，但实际这个步骤查询下来没有任何用
             * 根据结算单查询 交易明细 信息
             */
            .compose(nil -> data.response(false));
    }


    @Address(Addr.Bill.FETCH_BILLS)
    public Future<JsonObject> fetchBills(final JsonObject query) {
        // Search Bills by Pagination ( Qr Engine )
        return Ux.Jooq.on(FBillDao.class).searchAsync(query).compose(response -> {
            final JsonArray bill = Ut.valueJArray(response, KName.LIST);
            final Set<String> bills = Ut.valueSetString(bill, KName.KEY);
            return Ux.Jooq.on(FBillItemDao.class).fetchJInAsync("billId", Ut.toJArray(bills))
                .compose(items -> {
                    final ConcurrentMap<String, JsonArray> grouped = Ut.elementGroup(items, "billId");
                    Ut.itJArray(bill).forEach(json -> {
                        final String key = json.getString(KName.KEY);
                        if (grouped.containsKey(key)) {
                            json.put(KName.ITEMS, grouped.getOrDefault(key, new JsonArray()));
                        } else {
                            json.put(KName.ITEMS, new JsonArray());
                        }
                    });
                    response.put(KName.LIST, bill);
                    return Ux.future(response);
                });
        });
        // return Ux.Jooq.on(FBillDao.class).searchAsync(query);
    }

    @Address(Addr.Bill.FETCH_BILL)
    public Future<JsonObject> fetchByKey(final String key) {
        // Fetch Bill details
        /*
         * {
         *     "items":
         *     "settlements":
         * }
         */
        final JsonObject response = new JsonObject();
        return Ux.Jooq.on(FBillDao.class).<FBill>fetchByIdAsync(key).compose(bill -> {
            if (Objects.isNull(bill)) {
                return Ux.futureJ();
            }
            response.mergeIn(Ux.toJson(bill));
            final List<FBill> bills = new ArrayList<>();
            bills.add(bill);
            return this.fetchStub.fetchByBills(bills).compose(items -> {
                response.put(KName.ITEMS, Ux.toJson(items));
                return this.fetchStub.fetchSettlements(items);
            }).compose(settlements -> {
                Set<String> serial = null;
                for (FSettlement item : settlements) {
                    serial = Set.of("ST:" + item.getSerial());
                }
                return Ux.Jooq.on(FTransDao.class).<FTrans>fetchAsync("NAME", serial)
                        .compose(fTrans -> {
                            Set<String> seria = null;
                            for (FTrans item : fTrans) {
                                seria = Set.of(item.getKey());
                            }
                            return Ux.Jooq.on(FTransItemDao.class).<FTransItem>fetchAsync("TRANSACTION_ID", seria);
                        }).compose(fTransItems -> {
                            final JsonArray settlementJ = Ux.toJson(settlements);
                            final JsonArray newSettlements = new JsonArray();
                            settlementJ.forEach(item -> {
                                final JsonObject entries = Ux.toJson(item);
                                entries.put("payment", Ux.toJson(fTransItems));
                                newSettlements.add(entries);
                            });
                            response.put("settlements", newSettlements);
                            return Ux.future(response);
                        });
            }).otherwise(Ux.otherwise(new JsonObject()));
        });
    }

    @Address(Addr.BillItem.FETCH_BOOK)
    public Future<JsonArray> fetchBooks(final String orderId) {
        return this.bookStub.fetchByOrder(orderId)
            .compose(books -> this.bookStub.fetchAuthorize(books)
                .compose(authorized -> {
                    // Books Joined into PreAuthorize
                    final JsonArray bookArray = Ux.toJson(books);
                    final JsonArray authArray = Ux.toJson(authorized);
                    final ConcurrentMap<String, JsonArray> grouped = Ut.elementGroup(authArray, "bookId");
                    Ut.itJArray(bookArray).forEach(bookJson -> {
                        final String key = bookJson.getString(KName.KEY);
                        bookJson.put("authorize", grouped.getOrDefault(key, new JsonArray()));
                    });
                    return Ux.future(bookArray);
                })
            );
    }

    @Address(Addr.BillItem.FETCH_BOOK_BY_KEY)
    public Future<JsonObject> fetchBook(final String bookId) {
        // Null Prevent
        return Fn.ofJObject(this.bookStub::fetchByKey).apply(bookId);
    }
}
