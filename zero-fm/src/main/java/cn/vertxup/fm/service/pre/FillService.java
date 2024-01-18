package cn.vertxup.fm.service.pre;

import cn.vertxup.fm.domain.tables.pojos.*;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.mod.fm.cv.em.EmDebt;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class FillService implements FillStub {

    @Override
    public void cancel(final FBillItem item, final JsonObject params) {
        item.setActive(Boolean.FALSE);
        item.setStatus(FmCv.Status.INVALID);
        item.setType(FmCv.Type.CANCEL);
        item.setUpdatedAt(LocalDateTime.now());
        item.setUpdatedBy(params.getString(KName.UPDATED_BY));
    }

    @Override
    public void transfer(final List<FBillItem> from, final List<FBillItem> to) {
        from.forEach(fromItem -> {
            fromItem.setActive(Boolean.FALSE);
            fromItem.setStatus(FmCv.Status.INVALID);
            fromItem.setType(FmCv.Type.TRANSFER_FROM);
            fromItem.setSerial(fromItem.getSerial() + "F");
            fromItem.setCode(fromItem.getCode() + "F");
        });
        to.forEach(toItem -> {
            toItem.setKey(null);
            toItem.setBillId(null);
            toItem.setSerial(toItem.getSerial() + "T");
            toItem.setCode(toItem.getCode() + "T");
            toItem.setStatus(FmCv.Status.PENDING);
            toItem.setActive(Boolean.TRUE);
        });
    }

    @Override
    public void transfer(final FBook book, final FBill bill) {
        bill.setKey(null);
        bill.setBookId(book.getKey());
        bill.setOrderId(book.getOrderId());
        bill.setModelId(book.getModelId());
        bill.setModelKey(book.getModelKey());
        // Created
        bill.setCreatedAt(bill.getUpdatedAt());
        bill.setCreatedBy(bill.getUpdatedBy());
    }

    @Override
    public void settle(final FSettlement settlement, final List<FBillItem> items) {
        items.forEach(item -> {
            item.setSettlementId(settlement.getKey());
            item.setUpdatedAt(LocalDateTime.now());
            item.setUpdatedBy(settlement.getUpdatedBy());
        });
    }

    @Override
    public void settle(final FSettlement settlement, final FDebt debt) {
        // PKG-FM-102
        //  debt.setSettlementId(settlement.getKey());
        debt.setFinished(Boolean.FALSE);            // 此处必须有，防止查询不了数据
        if (Objects.isNull(debt.getCreatedBy())) {
            debt.setCreatedBy(settlement.getUpdatedBy());
            debt.setCreatedAt(LocalDateTime.now());
        }
        if (0 > settlement.getAmount().doubleValue()) {
            // Refund
            debt.setSerial("R" + settlement.getSerial().substring(1));
            debt.setCode("R" + settlement.getCode().substring(1));
            debt.setType(EmDebt.Type.REFUND.name());
        } else {
            // DEBT Serial
            debt.setSerial("D" + settlement.getSerial().substring(1));
            debt.setCode("D" + settlement.getCode().substring(1));
            debt.setType(EmDebt.Type.DEBT.name());
        }
    }

    @Override
    public void payment(final FSettlement settlement, final List<FTransItem> payments) {
        for (int idx = 0; idx < payments.size(); idx++) {
            final FTransItem item = payments.get(idx);
            // PKG-FM-102
            // 替换旧版单连接
            //            item.setObjectType(EmPay.Type.AT.name());
            //            item.setObjectId(settlement.getKey());
            // item.setSettlementId(settlement.getKey());

            item.setSerial(settlement.getSerial() + "-" + Ut.fromAdjust(idx + 1, 2));
            item.setCode(settlement.getCode() + "-" + Ut.fromAdjust(idx + 1, 2));
            // Fix: Field 'AMOUNT_PRE' doesn't have a default value
            //            if (Objects.isNull(item.getAmountPre())) {
            //                item.setAmountPre(BigDecimal.ZERO);
            //            }

            Ke.umCreated(item, settlement);
        }
    }

    @Override
    public void payment(final FTrans payment, final List<FTransItem> payments) {
        for (int idx = 0; idx < payments.size(); idx++) {
            final FTransItem item = payments.get(idx);
            item.setTransactionId(payment.getKey());
            if (Objects.isNull(item.getCode()) || Objects.isNull(item.getSerial())) {
                item.setSerial(payment.getSerial() + "-" + Ut.fromAdjust(idx + 1, 2));
                item.setCode(payment.getCode() + "-" + Ut.fromAdjust(idx + 1, 2));
            }
            Ke.umCreated(item, payment);
        }
    }
}
