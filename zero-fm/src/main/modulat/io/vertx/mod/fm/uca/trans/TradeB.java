package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.mod.fm.uca.account.Book;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.List;
import java.util.Set;

/**
 * 步骤三：根据提供的账单明细的数据
 *
 * @author lang : 2024-01-22
 */
class TradeB implements Trade<List<FBillItem>, FBillItem> {
    @Override
    public Future<List<FBillItem>> execute(final JsonArray bookArray, final List<FBillItem> upItems) {
        /*
         * 账单项更新之后，账本需重新记账，此处会有所有账本的keys，系统自动计算
         * 最终更新账本之后的状态：
         * - Pending：账本没有结算完成，还有待持续结算（部分结账）
         * - Finished：账本已经全部完成结算
         * 上述状态是系统自动计算，所以不用担心账本的同步问题。
         *
         * 此处的数据格式：
         * {
         *     "book": []
         * }
         */
        final Set<String> bookKes = Ut.toSet(bookArray);
        return Book.of().income(upItems, bookKes).compose(nil -> Ux.future(upItems));
    }
}
