package io.vertx.mod.ambient.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class AmbientOOB extends AbstractBoot {
    public AmbientOOB() {
        super(KeIpc.Module.AMBIENT);
    }
}
