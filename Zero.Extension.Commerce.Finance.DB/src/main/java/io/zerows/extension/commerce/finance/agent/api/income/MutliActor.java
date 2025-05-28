package io.zerows.extension.commerce.finance.agent.api.income;

import io.zerows.extension.commerce.finance.domain.tables.pojos.FBillItem;
import io.zerows.extension.commerce.finance.agent.service.income.BillStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.commerce.finance.eon.Addr;
import io.zerows.extension.commerce.finance.uca.enter.Maker;
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

    /** 参考：{@link MultiAgent#inMulti} 接口注释 */
    @Me
    @Address(Addr.Bill.IN_MULTI)
    public Future<JsonObject> inMulti(final JsonObject data) {
        final List<FBillItem> items = Ux.fromJson(Ut.valueJArray(data, KName.ITEMS), FBillItem.class);
        return Maker.ofB().buildFastAsync(data)
            /* 账单：1，账单明细：N */
            .compose(bill -> this.billStub.multiAsync(
                bill,                                   // 账单对象
                items                                   // 账单明细列表
            ));
    }
}
