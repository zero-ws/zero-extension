package io.vertx.mod.fm.uca.replica;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTransItem;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.util.Ut;

import java.util.List;

/**
 * 结算核心步骤
 * <pre><code>
 *     1. {@link FSettlement} -> {@link List<FTransItem>}
 * </code></pre>
 *
 * @author lang : 2024-01-18
 */
class IkWayST2TI implements IkWay<FSettlement, FTransItem> {
    /**
     * 「付款」结算单的付款处理
     * 针对单个结算单执行付款处理
     * <pre><code>
     *     1. 防止异常信息，必须设置 amountPre，默认 0
     *     2. 编号直接根据结算单处理，若结算单是 CODE-XX
     *        - CODE-XX-01
     *        - CODE-XX-02
     *        ....
     * </code></pre>
     *
     * @param settlement from = 结算单
     * @param payments   to = 付款项
     */
    @Override
    public void transfer(final FSettlement settlement, final List<FTransItem> payments) {
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
}
