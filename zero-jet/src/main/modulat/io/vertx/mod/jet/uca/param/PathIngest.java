package io.vertx.mod.jet.uca.param;

import io.horizon.spi.jet.JtIngest;
import io.vertx.boot.supply.Electy;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.mod.jet.atom.JtUri;
import io.zerows.core.web.metadata.commune.Envelop;

import java.util.Map;

/*
 * package scope,
 * /api/xxx/:name
 *
 * Only parsed uri and get uri pattern
 * -->
 *    name = xxxx
 */
class PathIngest implements JtIngest {

    @Override
    public Envelop in(final RoutingContext context, final JtUri uri) {
        /*
         * Pattern extract only
         */
        final HttpServerRequest request = context.request();
        final String requestUri = request.path();
        final HttpMethod method = request.method();
        final JsonObject data = new JsonObject();
        /*
         * Zero Jet to double check whether current uri is match pattern
         * definition uris in our uri pool to fix issue here.
         *
         * Additional `key` parameter will be passed `pathParams()` but it's invalid.
         */
        if (Electy.uriMatch(requestUri, method)) {
            final Map<String, String> params = context.pathParams();
            params.forEach(data::put);
        }
        return Envelop.success(data);
    }
}
