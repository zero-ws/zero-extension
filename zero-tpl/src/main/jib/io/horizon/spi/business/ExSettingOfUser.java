package io.horizon.spi.business;

import cn.vertxup.tpl.domain.tables.daos.MyNotifyDao;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.eon.em.OwnerType;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.osgi.spi.business.ExSetting;

/**
 * @author lang : 2024-04-09
 */
public class ExSettingOfUser implements ExSetting {
    @Override
    public Future<JsonObject> settingAsync(final String user, final String dimKey) {
        final JsonObject response = new JsonObject();
        return this.settingNotify(user, dimKey).compose(notifySetting -> {
            response.put("notification", notifySetting);
            return Ux.future(response);
        });
    }

    private Future<JsonObject> settingNotify(final String user, final String dimKey) {
        final JsonObject params = Ux.whereAnd();
        params.put(KName.OWNER_ID, user);
        params.put(KName.SIGMA, dimKey);
        params.put(KName.OWNER_TYPE, OwnerType.USER);
        return Ux.Jooq.on(MyNotifyDao.class).fetchJOneAsync(params);
    }
}
