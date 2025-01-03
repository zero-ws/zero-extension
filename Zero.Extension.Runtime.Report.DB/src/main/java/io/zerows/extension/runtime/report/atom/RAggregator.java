package io.zerows.extension.runtime.report.atom;

import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.eon.em.EmDim;

import java.io.Serializable;

/**
 * @author lang : 2024-10-30
 */
public class RAggregator implements Serializable {

    private final String field;
    private final EmDim.Aggregator aggregator;

    public RAggregator(final JsonObject configJ) {
        this.field = Ut.valueString(configJ, KName.SOURCE);
        this.aggregator = Ut.toEnum(() -> Ut.valueString(configJ, "function"),
            EmDim.Aggregator.class, EmDim.Aggregator.COUNT);
    }

    public String field() {
        return this.field;
    }

    public EmDim.Aggregator aggregator() {
        return this.aggregator;
    }
}
