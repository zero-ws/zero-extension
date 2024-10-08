package io.zerows.extension.runtime.ambient.osgi.spi.extension;

import io.horizon.uca.log.Annal;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.KWeb;
import io.vertx.up.unity.Ux;
import io.zerows.core.feature.database.atom.Database;
import io.zerows.core.feature.web.cache.Rapid;
import io.zerows.extension.runtime.ambient.eon.AtMsg;
import io.zerows.extension.runtime.skeleton.osgi.spi.extension.Init;

import java.util.function.Function;

import static io.zerows.extension.runtime.ambient.util.At.LOG;

public class DatabaseInit implements Init {

    private static final Annal LOGGER = Annal.get(DatabaseInit.class);

    @Override
    public Function<JsonObject, Future<JsonObject>> apply() {
        return appJson -> {
            LOG.App.info(LOGGER, AtMsg.INIT_DATABASE, appJson.encode());
            /* Database Json */
            final JsonObject databaseJson = appJson.getJsonObject(KName.SOURCE);
            final Database database = new Database();
            database.fromJson(databaseJson);
            /*
             * Init third step: X_SOURCE stored into pool
             */
            return Rapid.<String, Database>object(KWeb.CACHE.DATABASE)
                .write(appJson.getString(KName.KEY), database)
                .compose(item -> Ux.future(item.toJson()))
                .compose(item -> Ux.future(this.result(appJson, item)));
        };
    }

    @Override
    public JsonObject result(final JsonObject input,
                             final JsonObject database) {
        LOG.App.info(LOGGER, AtMsg.INIT_DB_RT, database.encodePrettily());
        return input;
    }
}
