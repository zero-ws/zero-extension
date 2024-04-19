package io.vertx.mod.is.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class IsOOB extends AbstractBoot {
    public IsOOB() {
        super(KeIpc.Module.IS);
    }
}
