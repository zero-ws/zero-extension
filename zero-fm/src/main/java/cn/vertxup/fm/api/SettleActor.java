package cn.vertxup.fm.api;

import cn.vertxup.fm.domain.tables.daos.*;
import cn.vertxup.fm.domain.tables.pojos.*;
import cn.vertxup.fm.service.business.AccountStub;
import cn.vertxup.fm.service.end.PayStub;
import cn.vertxup.fm.service.end.QrStub;
import cn.vertxup.fm.service.pre.FillStub;
import cn.vertxup.fm.service.pre.IndentStub;
import io.horizon.atom.program.KRef;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.time.Instant;
import java.util.List;
import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@Queue
public class SettleActor {

    @Inject
    private transient IndentStub indentStub;

    @Inject
    private transient AccountStub accountStub;

    @Inject
    private transient FillStub fillStub;

    @Inject
    private transient QrStub qrStub;

    @Inject
    private transient PayStub payStub;

    @Me
    @Address(Addr.Settle.UP_PAYMENT)
    public Future<JsonObject> upPayment(final boolean runUp,      // S Bill
                                        final JsonObject data) {
        /*
         * 1. 结算单创建时会生成编号，这个编号是直接存储在
         *    模型的配置 `numbers` 中的，Zero Extension的模块会直接根据其定义
         *    `X_NUMBER` 来生成相关编号。
         * 2. 执行完成之后，结算单会存储在引用中，方便后续执行流程。
         *
         * 此处的是结算的分流点，比较特殊在于 runUp 的值
         * - true: 表示当前结算单为未完成的状态，finished = false
         *         这种表示延迟结账，您还需要在结算管理中执行结账操作
         *         当前单子现结跳过，后续结算管理处理
         *         - 直接结算
         *         - 转应收 / 应退（按钮处理）
         * - false：当前结算单就是已完成的状态，finished = true, finishedAt 有值
         */
        final KRef settleRef = new KRef();
        return this.indentStub.settleAsync(runUp, data)
            .compose(Ux.Jooq.on(FSettlementDao.class)::insertAsync)
            .compose(settleRef::future)


            /*
             * 结算单创建之后，要将 BillItem 账单子项中的 settlementId 和状态执行更新
             * Bill              Settlement
             *    \                /
             *     \              /
             *      \            /
             *        BillItem ( billId, settlementId )
             *
             * 此处的数据结构：
             * {
             *     "items": []
             * }
             * 此处的 items 的类型就是 JsonArray 类型，包含了所有的 BillItem （当前结算的）
             * 且此处需要说明一点，就是关于 FBillItem 的状态，这里的逻辑是账单子项完成结算，所以
             * 所有的账单子项状态都会是 Finished，简单说流程走到这里账单子项以及账单本身就已经完
             * 成了。
             */
            .compose(inserted -> this.indentStub.settleAsync(data.getJsonArray(KName.ITEMS), data))
            .compose(items -> {


                /*
                 * 结合已经创建好的结算单，计算结算单和账单子项的关系，此处更新的内容如：
                 * - settlementId：账单子项中结算单主键
                 * - updatedAt / updatedBy：更新人、更新时间（Auditor相关信息）
                 */
                this.fillStub.settle(settleRef.get(), items);
                return Ux.Jooq.on(FBillItemDao.class).updateAsync(items).compose(itemsUpdated -> {


                    /*
                     * 账单项更新之后，账本需重新记账，此处会有所有账本的keys，系统自动计算
                     * 最终更新账本之后的状态：
                     * - Pending：账本没有结算完成，还有待持续结算（部分结账）
                     * - Finished：账本已经全部完成结算
                     * 上述状态是系统自动计算，所以不用担心账本的同步问题。
                     */
                    final Set<String> bookKeys = Ut.toSet(data.getJsonArray("book"));
                    return this.accountStub.inBook(itemsUpdated, bookKeys)
                        .compose(nil -> Ux.future(items));
                });
            })


            // 使用 账单子项 BillItem 拷贝数据生成 结算子项 SettlementItem 的过程
            .compose(items -> this.indentStub.settleAsync(settleRef.get(), items)
                .compose(Ux.Jooq.on(FSettlementItemDao.class)::insertAsync)
            )


            /*
             * 此处流程上略有区别，由于要追加结算管理模块，所以此处不再生成 应收/退款 记录
             * 而是根据 runUp 的值检查是否触发付款流程，如果是延迟结算，则不触发付款流程
             * 如果不是延迟计算则直接创建 FPayment 的直接结算流程，而后续结算管理会触发
             * 三个核心流程
             * - 直接结算 / 生成应收 / 生成退款，应收和退款在后续流程中二选一。
             */
            .compose(settleItems -> {
                final FSettlement settlement = settleRef.get();
                if (!runUp) {
                    return this.createPayment(data, settlement);
                }
                return Ux.future();
            })
            .compose(nil -> Ux.future(settleRef.get()))
            .compose(Ux::futureJ);
    }

    private Future<Boolean> createPayment(final JsonObject data, final FSettlement settlement) {
        final JsonArray paymentJ = Ut.valueJArray(data, FmCv.ID.PAYMENT);
        final List<FPaymentItem> payments = Ux.fromJson(paymentJ, FPaymentItem.class);
        this.fillStub.payment(settlement, payments);
        return Ux.Jooq.on(FPaymentItemDao.class).insertAsync(payments)
            .compose(nil -> Ux.futureT());
    }

    private Future<Boolean> createDebt(final FDebt debt,
                                       final FSettlement settlement,
                                       final List<FSettlementItem> settleItems) {
        this.fillStub.settle(settlement, debt);
        return Ux.Jooq.on(FDebtDao.class).insertAsync(debt).compose(insertd -> {
            settleItems.forEach(each -> each.setDebtId(insertd.getKey()));
            return Ux.Jooq.on(FSettlementItemDao.class).updateAsync(settleItems)
                .compose(nil -> Ux.futureT());
        });
    }


    @Address(Addr.Settle.UNLOCK_AUTHORIZE)
    public Future<JsonArray> unlockAuthorize(final JsonArray authorized, final User user) {
        // Authorized Modification
        final String userKey = Ux.keyUser(user);
        Ut.itJArray(authorized).forEach(json -> {
            json.put(KName.UPDATED_AT, Instant.now());
            json.put(KName.UPDATED_BY, userKey);
            json.put(KName.STATUS, FmCv.Status.FINISHED);
        });
        final List<FPreAuthorize> authorizeList = Ux.fromJson(authorized, FPreAuthorize.class);
        return Ux.Jooq.on(FPreAuthorizeDao.class).updateAsync(authorizeList).compose(Ux::futureA);
    }

    @Address(Addr.Settle.UP_BOOK)
    public Future<JsonArray> finalizeBook(final JsonArray books, final User user) {
        // Book Finalize ( Not Settlement )
        final String userKey = Ux.keyUser(user);
        Ut.itJArray(books).forEach(json -> {
            json.put(KName.UPDATED_AT, Instant.now());
            json.put(KName.UPDATED_BY, userKey);
        });
        final List<FBook> bookList = Ux.fromJson(books, FBook.class);
        return Ux.Jooq.on(FBookDao.class).updateAsync(bookList).compose(Ux::futureA);
    }

    @Me
    @Address(Addr.Settle.PAY_CREATE)
    public Future<JsonObject> paymentCreate(final JsonObject data) {
        return this.payStub.createAsync(data);
    }

    @Address(Addr.Settle.PAY_DELETE)
    public Future<Boolean> paymentDelete(final String key) {
        return this.payStub.deleteByItem(key);
    }
}
