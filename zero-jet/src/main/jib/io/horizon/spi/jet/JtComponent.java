package io.horizon.spi.jet;

import io.vertx.core.Future;
import io.zerows.mbse.commune.ActIn;
import io.zerows.mbse.commune.ActOut;

/*
 * Business component, connect to dao, basic condition:
 */
public interface JtComponent {
    /*
     * Access for ActIn here
     */
    Future<ActOut> transferAsync(ActIn request);
}
