package io.vertx.mod.fm.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class FmOOB extends AbstractBoot {
    public FmOOB() {
        super(KeIpc.Module.FM);
    }
}
