package io.horizon.spi;

import io.zerows.extension.runtime.skeleton.osgi.spi.web.Credential;
import io.macrocosm.specification.app.HApp;
import io.macrocosm.specification.program.HArk;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.skeleton.refine.Ke;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.core.feature.web.mbse.atom.specification.KCredential;

import java.util.Objects;

public class ExAmbientCredit implements Credential {
    @Override
    public Future<KCredential> fetchAsync(final String sigma) {
        final HArk ark = Ke.ark(sigma);
        final KCredential idc = new KCredential();
        if (Objects.nonNull(ark)) {
            final HApp app = ark.app();
            final JsonObject credential = new JsonObject();
            credential.put(KName.SIGMA, sigma);
            credential.put(KName.APP_ID, app.option(KName.KEY));
            credential.put(KName.REALM, app.name());
            credential.put(KName.LANGUAGE, app.option(KName.LANGUAGE));
            credential.put(KName.GRANT_TYPE, "authorization_code");
            idc.fromJson(credential);
        }
        return Ux.future(idc);
    }
}
