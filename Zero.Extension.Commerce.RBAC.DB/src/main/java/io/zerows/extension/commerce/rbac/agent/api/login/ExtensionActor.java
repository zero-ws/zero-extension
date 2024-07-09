package io.zerows.extension.commerce.rbac.agent.api.login;

import com.google.gson.JsonObject;
import io.vertx.core.Future;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.zerows.extension.commerce.rbac.eon.Addr;

/**
 * @author lang : 2024-07-07
 */
@Queue
public class ExtensionActor {

    @Address(Addr.Auth.Extension.SMS_CAPTCHA)
    public Future<JsonObject> generageSms(final JsonObject params) {
        return null;
    }

    @Address(Addr.Auth.Extension.SMS_LOGIN)
    public Future<JsonObject> loginSms(final JsonObject params) {
        return null;
    }

    @Address(Addr.Auth.Extension.WECHAT_QR)
    public Future<JsonObject> generateWechat(final JsonObject params) {
        return null;
    }

    @Address(Addr.Auth.Extension.WECHAT_LOGIN)
    public Future<JsonObject> loginWechat(final JsonObject params) {
        return null;
    }
}
