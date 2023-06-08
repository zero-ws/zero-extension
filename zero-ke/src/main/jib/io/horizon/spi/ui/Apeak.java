package io.horizon.spi.ui;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.uca.jooq.UxJooq;

/*
 * Apeak implementation by some specific definition
 * Only full column contains render part for different usage
 * The implementation class should be in zero-ui to read column information.
 */
public interface Apeak {

    String ARG0 = KName.DYNAMIC;
    String ARG1 = KName.IDENTIFIER;
    String ARG2 = KName.SIGMA;
    String ARG3 = KName.VIEW;

    Apeak on(UxJooq jooq);

    /*
     * Read full columns with filters here.
     * config is generated by IxModule Object.
     */
    Future<JsonArray> fetchFull(JsonObject params);
}
