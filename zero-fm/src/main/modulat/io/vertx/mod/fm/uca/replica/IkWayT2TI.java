package io.vertx.mod.fm.uca.replica;

import cn.vertxup.fm.domain.tables.pojos.FTrans;
import cn.vertxup.fm.domain.tables.pojos.FTransItem;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.util.Ut;

import java.util.List;
import java.util.Objects;

/**
 * @author lang : 2024-01-18
 */
class IkWayT2TI implements IkWay<FTrans, FTransItem> {
    /**
     * 「付款」付款单
     * <pre><code>
     *     1. 一张付款单会包含多个付款项
     *     2. 结算单和付款单依靠付款项结合
     *     3. 设置 transactionId 关联信息
     * </code></pre>
     *
     * @param transaction from = 付款单
     * @param items       to = 付款项
     */
    @Override
    public void transfer(final FTrans transaction, final List<FTransItem> items) {
        for (int idx = 0; idx < items.size(); idx++) {
            final FTransItem item = items.get(idx);
            item.setTransactionId(transaction.getKey());
            if (Objects.isNull(item.getCode()) || Objects.isNull(item.getSerial())) {
                item.setSerial(transaction.getSerial() + "-" + Ut.fromAdjust(idx + 1, 2));
                item.setCode(transaction.getCode() + "-" + Ut.fromAdjust(idx + 1, 2));
            }
            Ke.umCreated(item, transaction);
        }
    }
}