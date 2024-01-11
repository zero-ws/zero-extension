package cn.vertxup.fm.api;

import cn.vertxup.fm.domain.tables.daos.FBillDao;
import cn.vertxup.fm.domain.tables.daos.FBillItemDao;
import cn.vertxup.fm.domain.tables.daos.FSettlementDao;
import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.service.BookStub;
import cn.vertxup.fm.service.FetchStub;
import cn.vertxup.fm.service.end.QrStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.atom.BillData;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.mod.fm.cv.em.EmDebt;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
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
    private transient QrStub qrStub;

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
            .compose(nil -> data.response(true));
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
            }).compose(settlements -> this.fetchStub.fetchTransItems(settlements).compose(payments -> {
                // Append `payment` into settlement list ( JsonArray )
                final JsonArray paymentJ = Ux.toJson(payments);
                final ConcurrentMap<String, JsonArray> paymentMap =
                    Ut.elementGroup(paymentJ, "settlementId");
                final JsonArray settlementJ = Ux.toJson(settlements);
                Ut.itJArray(settlementJ).forEach(settlement -> {
                    final String settleKey = settlement.getString(KName.KEY);
                    if (paymentMap.containsKey(settleKey)) {
                        settlement.put("payment", paymentMap.getOrDefault(settleKey, new JsonArray()));
                    } else {
                        settlement.put("payment", new JsonArray());
                    }
                });
                response.put("settlements", settlementJ);
                return Ux.future(response);
            })).otherwise(Ux.otherwise(new JsonObject()));
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

    @Address(Addr.Settle.FETCH_BY_KEY)
    public Future<JsonObject> fetchSettlement(final String key) {
        return Fn.ofJObject(this.qrStub::fetchSettlement).apply(key);
    }


    @Address(Addr.Settle.FETCH_BY_QR)
    public Future<JsonObject> searchSettle(final JsonObject qr) {
        return Ux.Jooq.on(FSettlementDao.class).searchAsync(qr).compose(pageData -> {
            final JsonArray settlementData = Ut.valueJArray(pageData, "list");
            final Set<String> keys = Ut.valueSetString(settlementData, KName.KEY);
            return this.qrStub.fetchDebtMap(keys).compose(debt -> {
                Ut.itJArray(settlementData).forEach(settleJ -> {
                    /*
                     * 计算 linked 属性，此处 linked 属性要从原来的三属性转换成新的属性
                     * - DONE: 正常结算
                     * - DEBT：应收
                     * - REFUND：应退
                     * - PENDING：待结算
                     */
                    final boolean finished = settleJ.getBoolean(KName.FINISHED, Boolean.FALSE);
                    if (finished) {
                        // 已结算完成
                        final String key = Ut.valueString(settleJ, KName.KEY);
                        if (debt.containsKey(key)) {
                            // linked
                            final FDebt found = debt.get(key);
                            if (0 < found.getAmount().doubleValue()) {
                                // 应收
                                settleJ.put(KName.LINKED, EmDebt.Linked.DEBT.name());
                            } else {
                                // 应退
                                settleJ.put(KName.LINKED, EmDebt.Linked.REFUND.name());
                            }
                        } else {
                            // 正常结算
                            settleJ.put(KName.LINKED, EmDebt.Linked.DONE.name());
                        }
                    } else {
                        // 未结算
                        settleJ.put(KName.LINKED, EmDebt.Linked.PENDING.name());
                    }
                });
                pageData.put("list", settlementData);
                return Ux.future(pageData);
            });
        });
    }

    @Address(Addr.Settle.FETCH_DEBT)
    public Future<JsonObject> fetchDebt(final String key) {
        return Fn.ofJObject(this.qrStub::fetchDebt).apply(key);
    }
}
