package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

import java.util.List;

/**
 * 步骤二：根据数据构造 BillItem 的专用接口，完整步骤：
 * <pre><code>
 *     1. 直接提取 items 节点中的数据（ data ）
 *     2. 根据 items 中的数据构造 BillItem
 *     3. 批量更新 BillItem {@link FBillItem}，这个步骤放到外层去完成，因为此处可能会出现批量模式
 * </code></pre>
 * 当前对象只负责构造 BillItem 的数据，不负责更新 BillItem 的数据，整体结构如下：
 * <pre><code>
 *     -> JsonObject
 *            items ( JsonArray ),  {@link FSettlement}
 *     -> JsonObject
 *            items ( JsonArray ),  {@link FSettlement}
 *     上述结构中如果是多条记录，那么当前组件只负责一条记录中的构造，最终结果会生成 List 结构，到外层
 *     再执行更新的动作，那么更符合批量更新的逻辑，且不会出错，外层会执行一次 combine 的操作，这部分
 *     内容是最新版本中的内容。
 * </code></pre>
 *
 * @author lang : 2024-01-19
 */
class TradeBI implements Trade<FSettlement, FBillItem> {
    @Override
    public Future<List<FBillItem>> execute(final JsonArray data, final FSettlement assist) {
        /*
         * 结算单创建之后，要将 BillItem 账单子项中的 settlementId 和状态执行更新
         * Bill              Settlement
         *    \                /
         *     \              /
         *      \            /
         *        BillItem ( billId, settlementId )
         *
         * 此处的数据结构：
         * {
         *     "items": []
         * }
         * 此处的 items 的类型就是 JsonArray 类型，包含了所有的 BillItem （当前结算的）
         * 且此处需要说明一点，就是关于 FBillItem 的状态，这里的逻辑是账单子项完成结算，所以
         * 所有的账单子项状态都会是 Finished，简单说流程走到这里账单子项以及账单本身就已经完
         * 成了。
         */
        return null;
    }
}
