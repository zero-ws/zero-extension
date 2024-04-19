package io.vertx.mod.ambient.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class AmbientOOB extends AbstractBoot {
    public AmbientOOB() {
        super(KeIpc.Module.AMBIENT);
    }
}
