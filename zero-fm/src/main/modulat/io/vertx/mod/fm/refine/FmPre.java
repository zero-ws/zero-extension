package io.vertx.mod.fm.refine;

import cn.vertxup.fm.domain.tables.pojos.FPreAuthorize;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/**
 * @author lang : 2024-01-11
 */
final class FmPre {
    private FmPre() {
    }

    static FPreAuthorize toAuthorize(final JsonObject data) {
        final JsonObject preJ = Ut.valueJObject(data);
        final FPreAuthorize authorize;
        if (preJ.containsKey("preAuthorize")) {
            final JsonObject preAuthorize = data.getJsonObject("preAuthorize");
            final JsonObject authorizeJson = data.copy().mergeIn(preAuthorize);
            authorize = Ux.fromJson(authorizeJson, FPreAuthorize.class);
        } else {
            authorize = null;
        }
        return authorize;
    }
}
