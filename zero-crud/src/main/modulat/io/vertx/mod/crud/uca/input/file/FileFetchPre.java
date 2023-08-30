package io.vertx.mod.crud.uca.input.file;

import io.horizon.spi.feature.Attachment;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.up.unity.Ux;

/**
 * 附件读取
 *
 * @author lang : 2023-08-04
 */
class FileFetchPre extends FileAction {
    @Override
    public Future<JsonObject> inJAsync(final JsonObject data, final IxMod in) {
        return this.actionFn(in, (criteria, dataArray) -> Ux.channel(
            Attachment.class,                   // Component
            JsonArray::new,                     // JsonArray Data
            file -> file.fetchAsync(criteria)   // Execution Logical
        )).apply(data);
    }
}
