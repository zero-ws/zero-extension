package io.zerows.extension.runtime.ambient.agent.api.application;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.zerows.core.domain.atom.commune.XHeader;
import io.zerows.extension.runtime.ambient.agent.service.application.AppStub;
import io.zerows.extension.runtime.ambient.agent.service.application.MenuStub;
import io.zerows.extension.runtime.ambient.eon.Addr;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-07-26
 */
@Queue
public class EntryActor {

    @Inject
    private transient AppStub appStub;

    @Inject
    private transient MenuStub menuStub;

    @Address(Addr.App.BY_NAME)
    public Future<JsonObject> byName(final String name) {
        return this.appStub.fetchByName(name);
    }

    @Address(Addr.App.BY_ID)
    public Future<JsonObject> byId(final String appId, final XHeader header) {
        return this.appStub.fetchById(appId);
    }

    @Address(Addr.Menu.BY_APP_ID)
    public Future<JsonArray> fetchMenus(final String appId) {
        return this.menuStub.fetchByApp(appId);
    }

}
