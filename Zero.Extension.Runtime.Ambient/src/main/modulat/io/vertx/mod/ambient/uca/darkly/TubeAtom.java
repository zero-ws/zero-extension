package io.vertx.mod.ambient.uca.darkly;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ambient.cv.em.TubeType;
import io.vertx.up.eon.KName;
import io.zerows.extension.runtime.ambient.domain.tables.pojos.XActivityRule;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TubeAtom extends AbstractTube {
    @Override
    public Future<JsonObject> traceAsync(final JsonObject data, final XActivityRule rule) {
        final String field = rule.getRuleField();
        Objects.requireNonNull(field);
        return this.diffAsync(data, rule, field, () -> this.sameAsync(data, rule));
    }

    private Future<JsonObject> sameAsync(final JsonObject data, final XActivityRule rule) {
        return this.sameAsync(data, rule, KName.PHASE, () -> {
            /*
             * java.lang.StackOverflowError fix
             * Change TubeType.Atom -> TubeType.WORKFLOW
             */
            final Tube tube = Tube.instance(TubeType.EXPRESSION);
            return tube.traceAsync(data, rule);
        });
    }
}
