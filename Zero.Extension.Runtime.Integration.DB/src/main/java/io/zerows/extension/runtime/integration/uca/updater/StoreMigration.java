package io.zerows.extension.runtime.integration.uca.updater;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.integration.domain.tables.pojos.IDirectory;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class StoreMigration implements StoreUp {
    @Override
    public Future<IDirectory> migrate(final IDirectory directory, final JsonObject directoryJ) {
        // Migration for `integrationId` changing
        return Ux.future(directory);
    }
}
