package io.zerows.extension.runtime.ambient.agent.api.application;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.ambient.agent.service.application.AppStub;
import io.zerows.extension.runtime.ambient.eon.Addr;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-07-26
 */
@Queue
public class AdminActor {

    @Inject
    private AppStub appStub;

    @Address(Addr.App.ADMIN_USABLE)
    public Future<JsonArray> fetchUsable(final String tenantId) {
        if (Ut.isNil(tenantId)) {
            return Ux.futureA();
        }
        return this.appStub.fetchByTenant(tenantId);
    }
}
