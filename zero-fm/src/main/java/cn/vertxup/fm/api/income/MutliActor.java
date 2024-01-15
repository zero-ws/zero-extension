package cn.vertxup.fm.api.income;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.service.business.BillStub;
import cn.vertxup.fm.service.pre.IndentStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.util.List;

/**
 * @author lang : 2024-01-11
 */
@Queue
public class MutliActor {

    @Inject
    private transient BillStub billStub;

    @Inject
    private transient IndentStub indentStub;

    /** 参考：{@link MultiAgent#inMulti} 接口注释 */
    @Me
    @Address(Addr.Bill.IN_MULTI)
    public Future<JsonObject> inMulti(final JsonObject data) {
        final List<FBillItem> items = Ux.fromJson(Ut.valueJArray(data, KName.ITEMS), FBillItem.class);
        return this.indentStub.initAsync(data)
            /* 账单：1，账单明细：N */
            .compose(bill -> this.billStub.multiAsync(
                bill,                                   // 账单对象
                items                                   // 账单明细列表
            ));
    }
}
