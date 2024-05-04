package io.vertx.mod.is.booter;

import io.zerows.extension.runtime.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class IsOOB extends AbstractBoot {
    public IsOOB() {
        super(KeIpc.Module.IS);
    }
}
