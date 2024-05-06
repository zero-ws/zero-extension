package io.zerows.extension.mbse.modulat.atom;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.vertx.core.json.JsonArray;
import io.vertx.up.util.Ut;
import io.zerows.jackson.databind.JsonArrayDeserializer;
import io.zerows.jackson.databind.JsonArraySerializer;

import java.io.Serializable;
import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class PowerConfig implements Serializable {

    @JsonSerialize(using = JsonArraySerializer.class)
    @JsonDeserialize(using = JsonArrayDeserializer.class)
    private transient JsonArray builtIn = new JsonArray();

    public JsonArray getBuiltIn() {
        return this.builtIn;
    }

    public void setBuiltIn(final JsonArray builtIn) {
        this.builtIn = builtIn;
    }

    public Set<String> buildIn() {
        return Ut.toSet(this.builtIn);
    }
}
