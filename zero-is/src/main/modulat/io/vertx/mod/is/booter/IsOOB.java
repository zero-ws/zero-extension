package io.vertx.mod.is.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.core.web.metadata.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class IsOOB extends AbstractBoot {
    public IsOOB() {
        super(KeIpc.Module.IS);
    }
}
