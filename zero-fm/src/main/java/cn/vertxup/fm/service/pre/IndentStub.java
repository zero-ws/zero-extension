package cn.vertxup.fm.service.pre;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import io.vertx.core.Future;

import java.util.List;

/**
 * 初始化专用服务，初始化不同内容时应该要设定不同的数据，主要任务
 * <pre><code>
 *     1. 初始化账单
 *        初始化账单子项
 *     2. 初始化结算单
 *     3. （批量）初始化结算项
 *     4. （批量）初始化付款单
 * </code></pre>
 * 和接口不同的点在于，这个接口所有的内容是带有返回值的
 * - 是表达式级别的，接口中所有方法返回值都是 void，表示不带返回值（全是副作用方法）
 * - {@link IndentStub} 是带返回值的，多为第一步构造对象专用，且由于流程的位置，所以所有方法都返回 {@link Future}
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface IndentStub {

    /**
     * 「生成结算项」
     * 根据结算单以及各个账单子项生成结算子项，此处是从账单跨越到结算单的过程
     * <pre><code>
     *     1. 移除 `key` 主键值（生成结算单的时候会自动处理）
     *     2. 将结算单关联到当前 settlement 单据，此处有两种情况
     *        - settlementId，此值没有任何争议
     *        - relatedId，此值可以是订单ID，也可以是批次ID
     *     3. 假设结算单号为 CODE-XX，那么结算单子项编号为：
     *        - CODE-XX-001
     *        - CODE-XX-002
     *        ......
     *        - CODE-XX-00N
     * </code></pre>
     *
     * @param settlement 结算单
     * @param items      账单子项
     *
     * @return {@link List}
     */
    @Deprecated
    Future<List<FSettlementItem>> settleAsync(FSettlement settlement, List<FBillItem> items);
}
