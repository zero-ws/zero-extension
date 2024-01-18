package cn.vertxup.fm.service.pre;

import cn.vertxup.fm.domain.tables.pojos.*;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * 初始化专用服务，初始化不同内容时应该要设定不同的数据，主要任务
 * <pre><code>
 *     1. 初始化账单
 *        初始化账单子项
 *     2. 初始化结算单
 *     3. （批量）初始化结算项
 *     4. （批量）初始化付款单
 * </code></pre>
 * 和 {@link FillStub} 接口不同的点在于，这个接口所有的内容是带有返回值的
 * - {@link FillStub} 是表达式级别的，接口中所有方法返回值都是 void，表示不带返回值（全是副作用方法）
 * - {@link IndentStub} 是带返回值的，多为第一步构造对象专用，且由于流程的位置，所以所有方法都返回 {@link Future}
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface IndentStub {
    /**
     * 「账单」
     * 初始化账单，序号配置直接从 indent 中提取，此处的 data 数据结构如：
     * <pre><code>
     *     {
     *         "indent": "X_NUMBER 中的 code 定义"
     *     }
     * </code></pre>
     * 最终生成的序号存储在 code / serial 中，内置调用
     * {@link IndentStub#initAsync(String, JsonObject)}
     *
     * @param data 输入数据
     *
     * @return {@link FBill}
     */
    default Future<FBill> initAsync(final JsonObject data) {
        return this.initAsync(data.getString(KName.INDENT), data);
    }

    /**
     * 「账单」
     * 初始化账单，带序号的调用模式，直接限定序号信息直接传入
     *
     * @param indent 序号
     * @param data   输入数据
     *
     * @return {@link FBill}
     */
    Future<FBill> initAsync(String indent, JsonObject data);

    /**
     * 「更新账单子项」
     * 此方法为处理账单子项的更新专用方法，将新的数据写入到账单子项中
     * <pre><code>
     *     1. 根据 key 查询账单子项
     *     2. 此处确认可以查询，然后将 data 写入到账单子项数据中
     * </code></pre>
     *
     * @param key  账单子项的主键
     * @param data 更新的数据
     *
     * @return {@link FBillItem}
     */
    Future<FBillItem> itemAsync(String key, JsonObject data);

    /**
     * 「更新账单子项」（批量版）
     * 此方法为处理账单子项的更新专用方法，将新的数据写入到账单子项中
     * <pre><code>
     *     1. 此处不用查询数据库，items 中已经包含了账单项相关数据
     *     2. 主要更新数据
     *        - updatedBy / updatedAt
     *        - relatedId
     *        - createdBy / createdAt
     * </code></pre>
     *
     * @param items 账单子项列表
     * @param data  更新的数据
     *
     * @return {@link FBillItem}
     */
    Future<ConcurrentMap<Boolean, List<FBillItem>>> itemAsync(JsonArray items, JsonObject data);

    /**
     * 「结算」
     * 初始化结算单，序号配置直接从 indent 中提取，此处的 data 数据结构如：
     * <pre><code>
     *     {
     *         "indent": "X_NUMBER 中的 code 定义"
     *     }
     * </code></pre>
     * 结算单生成过程中会检查 finished 相关数据，如果 finished 为 true，则还会设置
     * 结算单的 finishedAt，这种情况一般是现结的情况。
     * 最终生成的序号存储在 code / serial 中，内置调用
     * {@link IndentStub#settleAsync(String, boolean, JsonObject)}
     *
     * @param runUp 是否延迟结算
     * @param data  输入数据
     *
     * @return {@link FSettlement}
     */
    @Deprecated
    default Future<FSettlement> settleAsync(final boolean runUp, final JsonObject data) {
        return this.settleAsync(data.getString(KName.INDENT), runUp, data);
    }

    /**
     * 「结算」
     * 考虑新引入的属性的相关数据
     * - 现结模式处理
     * - 延迟结算模式处理
     *
     * @param indent X_NUMBER 中的 code 定义
     * @param runUp  是否延迟结算
     * @param data   输入数据
     *
     * @return {@link FSettlement}
     */
    @Deprecated
    Future<FSettlement> settleAsync(String indent, final boolean runUp, JsonObject data);

    /**
     * 「账单结算」
     * 结算过程中的账单子项的处理流程，此处只设置更新数据环节
     * <pre><code>
     *     1. updatedAt / updatedBy
     *     2. status = Finished
     * </code></pre>
     *
     * @param items 账单子项列表数据
     * @param data  输入数据
     *
     * @return {@link List}
     */
    @Deprecated
    Future<List<FBillItem>> settleAsync(JsonArray items, JsonObject data);

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

    /**
     * 「付款单」
     * 此处用来构造付款单的信息，一般为创建付款时专用，内置 `indent` 配置处理序号问题。
     *
     * @param data 输入数据
     *
     * @return {@link FTrans}
     */
    Future<FTrans> payAsync(JsonObject data);
}
