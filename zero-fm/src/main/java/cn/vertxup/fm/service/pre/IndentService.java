package cn.vertxup.fm.service.pre;

import cn.vertxup.fm.domain.tables.daos.FBillItemDao;
import cn.vertxup.fm.domain.tables.pojos.*;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class IndentService implements IndentStub {

    @Inject
    private transient FillStub fillStub;

    @Override
    public Future<FTrans> payAsync(final JsonObject data) {
        final String indent = data.getString(KName.INDENT);
        Objects.requireNonNull(indent);
        final FTrans prePayment = Ux.fromJson(data, FTrans.class);
        return Ke.umIndent(prePayment, prePayment.getSigma(), indent, FTrans::setSerial).compose(payment -> {
            if (Objects.isNull(payment.getCode())) {
                payment.setCode(payment.getSerial());
            }
            return Ux.future(payment);
        });
    }

    @Override
    public Future<FBill> initAsync(final String indent, final JsonObject data) {
        Objects.requireNonNull(indent);
        // Bill building
        final FBill preBill = Ux.fromJson(data, FBill.class);
        // Serial Generation for Bill
        return Ke.umIndent(preBill, preBill.getSigma(), indent, FBill::setSerial).compose(bill -> {
            if (Objects.isNull(bill.getCode())) {
                bill.setCode(bill.getSerial());
            }
            return Ux.future(bill);
        });
    }

    @Override
    public Future<FBillItem> itemAsync(final String key, final JsonObject data) {
        return Ux.Jooq.on(FBillItemDao.class).fetchJByIdAsync(key).compose(queried -> {
            final JsonObject normalized = queried.copy().mergeIn(data);
            final FBillItem item = Ux.fromJson(normalized, FBillItem.class);
            return Ux.future(item);
        });
    }

    @Override
    public Future<ConcurrentMap<Boolean, List<FBillItem>>> itemAsync(final JsonArray items, final JsonObject data) {
        final List<FBillItem> itemFrom = Ux.fromJson(items, FBillItem.class);
        // Build New Items
        final List<FBillItem> itemTo = new ArrayList<>();
        itemFrom.forEach(item -> {
            item.setUpdatedBy(data.getString(KName.UPDATED_BY));
            item.setUpdatedAt(LocalDateTime.now());

            final JsonObject itemJson = Ux.toJson(item);
            final FBillItem itemN = Ux.fromJson(itemJson, FBillItem.class);
            itemN.setRelatedId(item.getKey());
            itemN.setCreatedAt(LocalDateTime.now());
            itemN.setCreatedBy(item.getUpdatedBy());
            itemTo.add(itemN);
        });
        this.fillStub.transfer(itemFrom, itemTo);
        final ConcurrentMap<Boolean, List<FBillItem>> map = new ConcurrentHashMap<>();
        map.put(Boolean.FALSE, itemFrom);
        map.put(Boolean.TRUE, itemTo);
        return Ux.future(map);
    }

    @Override
    public Future<FSettlement> settleAsync(final String indent, final boolean runUp, final JsonObject data) {
        Objects.requireNonNull(indent);


        /*
         * 新的结算流程不再考虑 data 中是否包含了 finished 属性，直接根据传入的 runUp 计算
         * runUp = true 表示延迟结账，此时 finished = false
         * runUp = false 表示现结，当前结算单可以终结了，此时 finished = true
         * 若 finished 时才会出现 finishedAt 的设置，否则不执行相关设置
         */
        final FSettlement preSettlement = Ux.fromJson(data, FSettlement.class);
        if (runUp) {
            preSettlement.setFinished(Boolean.FALSE);
        } else {
            preSettlement.setFinished(Boolean.TRUE);
            preSettlement.setFinishedAt(LocalDateTime.now());
        }


        // 生成结算单的单号
        return Ke.umIndent(preSettlement, preSettlement.getSigma(), indent, FSettlement::setSerial).compose(settlement -> {
            if (Objects.isNull(settlement.getCode())) {
                settlement.setCode(settlement.getSerial());
            }
            return Ux.future(settlement);
        });
    }

    @Override
    public Future<List<FBillItem>> settleAsync(final JsonArray items, final JsonObject data) {
        final List<FBillItem> itemList = Ux.fromJson(items, FBillItem.class);
        itemList.forEach(item -> {
            item.setStatus(FmCv.Status.FINISHED);
            item.setUpdatedAt(LocalDateTime.now());
            item.setUpdatedBy(data.getString(KName.UPDATED_BY));
        });
        return Ux.future(itemList);
    }

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
