package io.horizon.spi.jet;

import io.vertx.core.Future;
import io.zerows.core.feature.web.mbse.atom.runner.ActIn;
import io.zerows.core.feature.web.mbse.atom.runner.ActOut;

/*
 * Business component, connect to dao, basic condition:
 */
public interface JtComponent {
    /*
     * Access for ActIn here
     */
    Future<ActOut> transferAsync(ActIn request);
}
