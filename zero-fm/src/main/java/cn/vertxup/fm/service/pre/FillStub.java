package cn.vertxup.fm.service.pre;

import cn.vertxup.fm.domain.tables.pojos.*;
import io.vertx.core.json.JsonObject;

import java.util.List;

/**
 * 账单数据处理，账单的核心属性信息需要在本接口详细说明，最基础的属性如下：
 * <pre><code>
 *     status
 *     - Pending：{@link io.vertx.mod.fm.cv.FmCv.Status#PENDING}
 *       等待处理的账单，即等待结算的账单处理。
 *     - Finished：{@link io.vertx.mod.fm.cv.FmCv.Status#FINISHED}
 *       已经处理完成的账单，这种账单已经产生了结算单。
 *     - InValid：{@link io.vertx.mod.fm.cv.FmCv.Status#INVALID}
 *       （无效账单）若出现了转账、拆账、冲账，那么原始的账单的状态就是无效。
 *     - Fixed：{@link io.vertx.mod.fm.cv.FmCv.Status#FIXED}
 *       固定账单，目前表示哑房账的状态（未来可能直接被拿掉）。
 *     - Valid：{@link io.vertx.mod.fm.cv.FmCv.Status#VALID}
 *       （有效账单）结算过程中必须是有效账单被提取。
 * </code></pre>
 * <p>
 * 由于在账务管理系统中已经存在一个基本概念：账单项和会计科目，所以此处账单下边关联的项目
 * 一律使用术语：子项（而不是账单项），方便开发人员理解子项对应的含义，并且区分账单项和
 * 子项的区别：
 * - 账单项，Pay Term，表示当前账单所在的分类树的基础信息。
 * - 子项，Bill Item，表示属于当前账单下的项列表。
 * </p>
 * 共享规则如下：
 * <pre><code>
 *     1. code / serial 同时表示编号，目前版本所有单据一致
 *     2. 所属部分使用 Key 主键关联
 *     3. 若无特殊说明，status = Pending
 *     4. 所有的 auditor 信息直接从 输入的内容中提取
 * </code></pre>
 * 结构如下：
 * <pre><code>
 *     账单        结算单         付款单
 *       \        /    \        /
 *        \      /      \      /
 *         \    /        \    /
 *        账单子项         付款项
 *        billId       settlementId
 *     settlementId      paymentId
 *     账单 - 结算单 - 付款单 都是多对多的关联关系，并且依赖子项做关联
 *     形成异构的结构，结算单和付款单都是基于子项的关联关系。
 * </code></pre>
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface FillStub {
    /**
     * 「入账」多项账单设置，一个账单带有多个子项，基础规则如：
     * <pre><code>
     *     1. 若账单编号是 CODE，那么子项编号如：
     *        - CODE-01
     *        - CODE-02
     *        .....
     *        - CODE-XX
     * </code></pre>
     *
     * @param bill  from = 账单
     * @param items to = 子项列表
     */
    void income(FBill bill, List<FBillItem> items);

    /**
     * 「入账」单项账单设置，一个账单带有一个子项，基础规则如：
     * <pre><code>
     *     1. 子项编号只有一个：CODE-01（为了和多项统一）
     *     2. 多执行一点，由于是单项入账，所以此处会多一个：单价/数量 的设置，并且由于
     *        商品/赔偿等都属于多项入账，所以此处的数量一定是1，而单价一定是子项金额。
     * </code></pre>
     *
     * @param bill from = 账单
     * @param item to = 子项
     */
    void income(FBill bill, FBillItem item);

    /**
     * 「入账」设置账单的预授权信息，每一个账单只能有一个预授权信息与之关联，简单说预授权和账单的
     * 关系是 1:1 的基本关系，基础规则如：
     * <pre><code>
     *     1. 子项编号：CODE-A
     * </code></pre>
     *
     * @param bill      from = 账单
     * @param authorize to = 预授权
     */
    void income(FBill bill, FPreAuthorize authorize);

    /**
     * 「拆账」拆账操作，将一个账单拆分成多个账单，基础规则如：
     * <pre><code>
     *     拆之前：
     *     1. status = InValid
     *     2. active = false
     *
     *     拆之后
     *     1. 拆之前的编号为：CODE-XX，那么拆之后为：
     *        - CODE-XXA
     *        - CODE-XXB
     *        ......
     *     2. status = Pending
     *     3. 拆之后的账单需清空 key 主键值（新建时自动生成）
     *     4. active = true
     *     5. relatedId = 原始项（关联）
     * </code></pre>
     * 目前的版本是一分为二，即拆分成两个账单，本身逻辑是可以支持一个分为多个的，取决于
     * 您目前的序号系统，目前支持：{@link io.vertx.mod.fm.cv.FmCv#SEQ} 中的基础定义
     * A - G 的编号。
     *
     * @param item  from = 拆之前账单项
     * @param items to = 拆之后账单项
     */
    void split(FBillItem item, List<FBillItem> items);

    /**
     * 「冲账」冲账操作，将一个账单冲掉（目前是对冲模式）：
     * <pre><code>
     *     冲账账单：
     *     1. status = InValid
     *     2. active = false
     *
     *     对冲账单：
     *     1. 对冲账单的编号规则：CODE-XX，那么对应对冲编号：
     *        CODE-XXR
     *     2. status = InValid
     *     3. 冲账之后的账单项需要清空 key 主键值（新建时自动生成）
     *     4. active = true
     *     5. relatedId = 原始项（关联）
     * </code></pre>
     * 注意一点：冲账过程中冲账账单和对冲账单同时将状态设置成 InValid，避免计算
     *
     * @param item from = 账单项
     * @param to   to = 对冲账单项
     */
    void revert(FBillItem item, FBillItem to);

    /**
     * 「撤销」撤销操作，直接变更当前账单的基础信息
     * <pre><code>
     *     1. active = false
     *     2. status = InValid
     *     3. type = Cancel （类型变更）
     * </code></pre>
     *
     * @param item   from = 账单项
     * @param params to = 撤销相关参数
     */
    void cancel(FBillItem item, JsonObject params);

    /**
     * 「转账」批量转账处理，拉平对齐的处理模式
     * <pre><code>
     *     转出项：
     *     1. active = false
     *     2. status = InValid
     *     3. type = TransferFrom （类型变更）
     *     4. 原项编号为：CODE-XX，那么子项编号为：
     *        CODE-XXF
     *
     *     转入项：
     *     1. 清空 key 主键（新建时自动生成）
     *     2. 清空 billId 的原始关联（转出的账单要和 income 断开关联）
     *     3. active = true
     *     4. status = Pending
     *     5. 原项编号为：CODE-XX，那么子项编号为：
     *        CODE-XXT
     * </code></pre>
     *
     * @param from from = 源账单
     * @param to   to = 目标账单
     */
    void transfer(List<FBillItem> from, List<FBillItem> to);

    /**
     * 「转账」转账过程中填充账单信息专用，直接将账本信息复制到账单
     * <pre><code>
     *     1. bookId：关联账本主键
     *     2. orderId：关联订单主键
     *     3. modelId / modelKey：广义关联模型
     *     4. 新账单需要清空 key 主键（新建时自动生成）
     * </code></pre>
     *
     * @param book from = 账本
     * @param bill to = 账单
     */
    void transfer(FBook book, FBill bill);

    /**
     * 「结算」现结模式的结算处理
     * <pre><code>
     *     账单子项中包含了两个特殊字段：
     *     - billId：关联账单信息
     *     - settlementId：关联结算单项
     *     当某个子项被结算后，需要将子项中的结算单项关联信息填充，而且此时不更改
     *     子项的状态不发生任何改变。
     * </code></pre>
     *
     * @param settlement from = 结算单
     * @param items      to = 账单子项
     */
    void settle(FSettlement settlement, List<FBillItem> items);

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
    void settle(FSettlement settlement, FDebt debt);

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
    void payment(FSettlement settlement, List<FTransItem> payments);

    /**
     * 「付款」付款单
     * <pre><code>
     *     1. 一张付款单会包含多个付款项
     *     2. 结算单和付款单依靠付款项结合
     *     3. 设置 paymentId 关联信息
     * </code></pre>
     *
     * @param payment  from = 付款单
     * @param payments to = 付款项
     */
    void payment(FTrans payment, List<FTransItem> payments);
}
