package io.vertx.mod.fm.uca.notification;

import cn.vertxup.fm.domain.tables.daos.FBillDao;
import cn.vertxup.fm.domain.tables.pojos.FBill;
import io.horizon.spi.feature.Transit;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Subscribe;
import io.vertx.up.commune.config.XHeader;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;

/**
 * 冲账提醒处理
 *
 * @author lang : 2024-04-03
 */
public class NotifyReversalOrder {
    /*
     * 冲账提交专用提醒模型，此处为基础站内信模式
     * 1. 如果 WebSocket 存在订阅，那么此处才会执行，若没有开浏览器，则不会执行
     * 2. 发送完成之后，消息会直接发送到浏览器中，使用回调模式来创建消息历史，只存在 SENT 和 HISTORY 两种状态
     */
    @Subscribe("reversal-order")
    @Address(Addr.Notify.REVERSAL_ORDER)
    public Future<JsonObject> submitNotify(final JsonObject input, final XHeader header) {
       return Ux.Jooq.on(FBillDao.class).<FBill>fetchOneAsync("key",input.getString("billId")).compose(bill->{
            JsonObject entries = new JsonObject();
            entries.put(KName.Finance.AMOUNT,input.getString("amount"));
            entries.put(KName.Finance.SERIAL,input.getString("serial"));
            entries.put(KName.Finance.REALNAME,input.getString("realname"));
            entries.put(KName.Finance.ROOMNUMBER,bill.getModelKey());
            entries.put(KName.Finance.CREATEDAT,input.getString("createdAt"));
            entries.put(KName.SIGMA, header.getSigma());
            entries.put(KName.APP_ID, header.getAppId());
            entries.put(KName.Finance.NAME,"冲账");
            return Ux.future(entries);
        }).compose(massger->{
            JsonObject entries = new JsonObject();
            entries.put(KName.DATA,massger);
            entries.put(KName.SIGMA, header.getSigma());
            entries.put(KName.APP_ID, header.getAppId());
            entries.put(KName.MESSAGE, "NOTIFY.REVERSAL.ORDER");
            return Ux.channel(Transit.class, JsonObject::new, stub -> stub.message(entries))
                    .compose(message -> Ux.future(NotifyReversalParam.response(message, input)));
        });
    }
}
