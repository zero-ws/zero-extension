package cn.vertxup.fm.api.income;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FPreAuthorize;
import cn.vertxup.fm.service.income.BillStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.mod.fm.refine.Fm;
import io.vertx.mod.fm.uca.enter.Maker;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.unity.Ux;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-01-11
 */
@Queue
public class SingleActor {

    @Inject
    private transient BillStub billStub;

    /** 参考：{@link SingleAgent#inPre} 接口注释 */
    @Me
    @Address(Addr.Bill.IN_PRE)
    public Future<JsonObject> inPre(final JsonObject data) {
        final FBillItem item = Ux.fromJson(data, FBillItem.class);
        final FPreAuthorize authorize = Fm.toAuthorize(data);
        return Maker.ofB().buildFastAsync(data) // 账单序号生成
            /* 账单：1，账单明细：1，预授权：1 or ? ( preAuthorize 节点）*/
            .compose(bill -> this.billStub.singleAsync(
                bill,                                   // 账单对象
                item,                                   // 账单明细对象
                authorize                               // 预授权对象
            ));
    }


    /** 参考：{@link SingleAgent#inCommon} 接口注释 **/
    @Me
    @Address(Addr.Bill.IN_COMMON)
    public Future<JsonObject> inCommon(final JsonObject data) {
        final FBillItem item = Ux.fromJson(data, FBillItem.class);
        return Maker.ofB().buildFastAsync(data) // 账单序号生成
            /* 账单：1，账单明细：1 */
            .compose(bill -> this.billStub.singleAsync(
                bill,                                   // 账单对象
                item                                    // 账单明细对象
            ));
    }
}
