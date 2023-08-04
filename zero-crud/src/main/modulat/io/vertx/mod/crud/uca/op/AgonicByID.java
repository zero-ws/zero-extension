package io.vertx.mod.crud.uca.op;

import io.aeon.experiment.specification.KModule;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.init.IxPin;
import io.vertx.mod.crud.refine.Ix;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.desk.IxReply;
import io.vertx.mod.crud.uca.input.Pre;
import io.vertx.mod.crud.uca.next.Co;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class AgonicByID implements Agonic {
    @Override
    @SuppressWarnings("all")
    public Future<JsonObject> runJAsync(final JsonObject input, final IxMod in) {
        final UxJooq jooq = IxPin.jooq(in);
        return jooq.fetchOneAsync(input).compose(entity -> {
            if (Objects.isNull(entity)) {
                // STOP: Return to stop code executing
                return IxReply.success204Pre();
            }
            // For Format Beauty
            final KModule module = in.module();
            final JsonObject active = Ix.serializeJ(entity, module);

            // File: Attachment extraction
            return Pre.fileData().inJAsync(active, in).compose(dataJ -> {
                // Try to connecting
                final IxMod connect = in.connecting(dataJ);
                if (Objects.isNull(connect)) {
                    // STOP: Return to stop code executing
                    return Ux.future(dataJ);
                }
                // Next Json
                final Co<JsonObject, JsonObject, JsonObject, JsonObject> co = Co.nextQ(in, false);
                return co.next(input, dataJ)
                    .compose(params -> this.runJAsync(params, connect))
                    .compose(standBy -> co.ok(dataJ, standBy));
            });
        });
    }
}
