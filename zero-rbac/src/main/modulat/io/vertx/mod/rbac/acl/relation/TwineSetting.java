package io.vertx.mod.rbac.acl.relation;

import cn.vertxup.rbac.domain.tables.pojos.SUser;
import io.horizon.exception.web._501NotSupportException;
import io.horizon.spi.business.ExSetting;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ke.secure.Twine;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/**
 * 读取用户个人设置专用，对接 MY_ 系列表，走通道结构
 *
 * @author lang : 2024-04-09
 */
public class TwineSetting implements Twine<SUser> {
    @Override
    public Future<JsonObject> identAsync(final JsonObject userJ) {
        final String userId = Ut.valueString(userJ, KName.KEY);
        final String sigma = Ut.valueString(userJ, KName.SIGMA);
        return Ux.channel(ExSetting.class, JsonObject::new, stub -> stub.settingAsync(userId, sigma))
            .compose(settings -> {
                userJ.put(KName.SETTING, settings);
                return Ux.future(userJ);
            });
    }

    @Override
    public Future<JsonObject> identAsync(final SUser key) {
        return Fn.outWeb(_501NotSupportException.class, this.getClass());
    }

    @Override
    public Future<JsonObject> identAsync(final SUser userJ, final JsonObject updatedJ) {
        return Fn.outWeb(_501NotSupportException.class, this.getClass());
    }
}
