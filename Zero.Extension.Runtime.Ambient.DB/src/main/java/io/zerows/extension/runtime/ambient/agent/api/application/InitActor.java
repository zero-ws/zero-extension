package io.zerows.extension.runtime.ambient.agent.api.application;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.fn.Fn;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.database.atom.Database;
import io.zerows.extension.runtime.ambient.agent.service.application.AppStub;
import io.zerows.extension.runtime.ambient.agent.service.application.InitStub;
import io.zerows.extension.runtime.ambient.eon.Addr;
import jakarta.inject.Inject;

@Queue
public class InitActor {

    @Inject
    private transient InitStub stub;
    @Inject
    private transient AppStub appStub;

    @Address(Addr.Init.INIT)
    public Future<JsonObject> initApp(final String appId, final JsonObject data) {
        return this.stub.initCreation(appId, data);
    }

    @Address(Addr.Init.PREPARE)
    public Future<JsonObject> prepare(final String appName) {
        return this.stub.prerequisite(appName);
    }

    @Address(Addr.Init.CONNECT)
    public Future<JsonObject> connect(final JsonObject data) {
        final Database database = Ut.deserialize(data, Database.class);
        return Fn.ifBool(database.test());
    }
}
