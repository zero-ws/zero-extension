package io.zerows.extension.runtime.ambient.osgi.spi.feature;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.skeleton.osgi.spi.phantom.AbstractArbor;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class WholeArbor extends AbstractArbor {
    @Override
    public Future<JsonArray> generate(final JsonObject category, final JsonObject configuration) {
        return this.combineArbor(category, null, configuration);
    }
}
