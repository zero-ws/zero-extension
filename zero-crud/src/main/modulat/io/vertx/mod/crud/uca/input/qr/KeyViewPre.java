package io.vertx.mod.crud.uca.input.qr;

import io.horizon.atom.program.Kv;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.cv.IxMsg;
import io.vertx.mod.crud.refine.Ix;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.input.Pre;
import io.vertx.mod.ke.refine.Ke;
import io.zerows.core.domain.atom.commune.secure.Vis;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;

import static io.vertx.mod.crud.refine.Ix.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class KeyViewPre implements Pre {
    @Override
    public Future<JsonObject> inJAsync(final JsonObject data, final IxMod in) {
        final Kv<String, HttpMethod> impactUri = Ix.onImpact(in);
        final String sessionKey = Ke.keyView(
            impactUri.value().name(),
            impactUri.key(),
            Vis.smart(data.getValue(KName.VIEW))
        );
        LOG.Dao.info(this.getClass(), IxMsg.CACHE_KEY_PROJECTION, sessionKey);
        data.put(KName.DATA_KEY, sessionKey);
        return Ux.future(data);
    }
}
