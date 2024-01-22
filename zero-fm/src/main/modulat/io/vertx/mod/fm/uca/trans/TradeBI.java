package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.daos.FBillItemDao;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.mod.fm.uca.enter.Maker;
import io.vertx.mod.fm.uca.replica.IkWay;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.List;
import java.util.Objects;

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
 *     上述结构中如果是多条记录，但当前组件中由于 {@link JsonArray} 类型的数据中并不会出现 settlementId 的
 *     属性（第一次生成），所以只会执行单条记录的构造，而不会执行批量构造，如果是执行批量构造，会采取另外的类来
 *     实现，第一个参数不可以是单个对象，而应该是多个对象。
 * </code></pre>
 *
 * @author lang : 2024-01-19
 */
class TradeBI implements Trade<FSettlement, FBillItem> {
    @Override
    public Future<List<FBillItem>> execute(final JsonArray data, final FSettlement inserted) {
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
        Objects.requireNonNull(inserted);
        final JsonArray dataArray = Ut.valueJArray(data);
        return Maker.ofBI().buildAsync(dataArray, inserted)
            .compose(items -> {
                /*
                 * 结合已经创建好的结算单，计算结算单和账单子项的关系，此处更新的内容如：
                 * - settlementId：账单子项中结算单主键
                 * - updatedAt / updatedBy：更新人、更新时间（Auditor相关信息）
                 */
                IkWay.ofST2BI().transfer(inserted, items);

                return Ux.Jooq.on(FBillItemDao.class).updateAsync(items);
            });
    }
}
