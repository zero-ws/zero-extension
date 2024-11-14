package io.zerows.extension.runtime.report.uca.pull.in;

import io.horizon.atom.program.Kv;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;

/**
 * @author lang : 2024-11-04
 */
public class InValueComponent extends AbstractRInComponent {
    @Override
    public Future<Kv<String, Object>> prepare(final JsonObject params, final JsonObject inConfig) {

        final JsonObject config = Ut.valueJObject(inConfig, "params");
        final String format = Ut.valueString(inConfig, KName.FORMAT);
        final JsonObject parameter = this.buildParameter(config, params);

        final String finalValue = Ut.fromExpression(format, parameter);

        // 外层字段
        return this.buildResult(finalValue, inConfig);
    }
}
