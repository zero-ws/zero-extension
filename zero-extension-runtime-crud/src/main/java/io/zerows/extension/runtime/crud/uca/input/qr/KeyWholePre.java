package io.zerows.extension.runtime.crud.uca.input.qr;

import io.horizon.eon.VString;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.crud.uca.desk.IxMod;
import io.zerows.extension.runtime.crud.uca.input.Pre;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.core.domain.atom.specification.KJoin;
import io.zerows.core.feature.web.mbse.atom.specification.KModule;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class KeyWholePre implements Pre {
    @Override
    public Future<JsonObject> inJAsync(final JsonObject data, final IxMod in) {
        /*
         * For `/api/{actor}/by/sigma`
         * Only support extract the data that active = true
         */
        data.put(VString.EMPTY, Boolean.TRUE);      // AND
        data.put(KName.ACTIVE, Boolean.TRUE);
        if (in.canJoin()) {
            /*
             * Can join for `JOIN`
             */
            final KJoin join = in.module().getConnect();
            final String targetIndent = join.getTargetIndent();
            final KModule connect = in.connected();
            data.put(targetIndent, connect.identifier());
        }
        return Ux.future(data);
    }
}
