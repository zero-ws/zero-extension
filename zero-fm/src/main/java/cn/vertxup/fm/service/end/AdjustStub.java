package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;

/**
 * 修正专用服务
 * <pre><code>
 *     1. 修正 {@link FSettlementItem#getFinishedId()} 对应的值
 *        将 finishedId 关联到新创建的交易中
 *     2. 修正 {@link FSettlement#getFinished()} 对应的值
 *        根据交易的最终数据
 * </code></pre>
 *
 * @author lang : 2024-01-31
 */
public interface AdjustStub {
    /**
     * 根据结算单修正，步骤如：
     * <pre><code>
     *     这种模式只适用于直接结算模式，在直接计算模式中 {@link FSettlement} 已经设置了
     *     finished = true 的情况，此种修正提取所有的 {@link FSettlementItem} 并设置
     *     对应的 finishedId = trans {@link FTrans} 的主键。
     * </code></pre>
     *
     * @param trans      交易记录
     * @param settlement 结算单
     *
     * @return 修正后的交易记录
     */
    Future<FTrans> adjustAsync(FTrans trans, FSettlement settlement);
}
