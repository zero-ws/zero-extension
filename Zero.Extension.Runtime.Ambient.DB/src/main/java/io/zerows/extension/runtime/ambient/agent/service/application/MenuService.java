package io.zerows.extension.runtime.ambient.agent.service.application;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.ambient.domain.tables.daos.XMenuDao;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class MenuService implements MenuStub {

    @Override
    public Future<JsonArray> fetchByApp(final String appId) {
        return Ux.Jooq.on(XMenuDao.class)
            .fetchJAsync(KName.APP_ID, appId)
            // metadata field extraction
            .compose(Fn.ofJArray(KName.METADATA));
    }
}
