package io.zerows.extension.mbse.action.uca.aim;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;
import io.zerows.extension.mbse.action.atom.JtUri;

/*
 * JtUri generate useful handler here
 */
public interface JtAim {
    /*
     * Main workflow here.
     */
    Handler<RoutingContext> attack(JtUri uri);
}
