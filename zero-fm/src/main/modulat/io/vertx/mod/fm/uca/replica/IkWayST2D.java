package io.vertx.mod.fm.uca.replica;

import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.mod.fm.cv.em.EmDebt;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 结算核心步骤
 * <pre><code>
 *     1. {@link FSettlement} -> {@link FDebt}
 * </code></pre>
 *
 * @author lang : 2024-01-18
 */
class IkWayST2D implements IkWay<FSettlement, FDebt> {
    /**
     * 「结算」延迟结算模式的处理
     * <pre><code>
     *     退款/应收 单的设置
     *     1. settlementId：单据设置和结算单关联。
     *     2. 若原始结算单编号为 CODE，转换成
     *        - RCODE：退款
     *        - DCODE：应收
     * </code></pre>
     *
     * @param settlement from = 结算单
     * @param debt       to = 退款/应收
     */
    @Override
    public void transfer(final FSettlement settlement, final FDebt debt) {
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
}
