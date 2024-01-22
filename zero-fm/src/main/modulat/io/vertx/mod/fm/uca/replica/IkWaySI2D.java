package io.vertx.mod.fm.uca.replica;

import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import io.vertx.mod.fm.cv.em.EmDebt;
import io.vertx.mod.fm.refine.Fm;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * @author lang : 2024-01-22
 */
class IkWaySI2D implements IkWay<List<FSettlementItem>, FDebt> {
    @Override
    public void transfer(final List<FSettlementItem> items, final FDebt debt) {
        if (Objects.isNull(items) || items.isEmpty()) {
            return;
        }
        // PKG-FM-102
        //  debt.setSettlementId(settlement.getKey());
        final FSettlementItem first = items.iterator().next();
        debt.setFinished(Boolean.FALSE);            // 此处必须有，防止查询不了数据
        if (Objects.isNull(debt.getCreatedBy())) {
            debt.setCreatedBy(first.getUpdatedBy());
            debt.setCreatedAt(LocalDateTime.now());
        }

        // Amount, 使用遍历
        BigDecimal decimal = new BigDecimal(0);
        for (final FSettlementItem item : items) {
            final BigDecimal amount = item.getAmount();
            decimal = Fm.calcAmount(decimal, amount, item.getIncome());
        }
        if (decimal.doubleValue() < 0) {
            debt.setAmount(decimal);
            debt.setType(EmDebt.Type.REFUND.name());
        } else {
            debt.setAmount(decimal);
            debt.setType(EmDebt.Type.DEBT.name());
        }
    }
}
