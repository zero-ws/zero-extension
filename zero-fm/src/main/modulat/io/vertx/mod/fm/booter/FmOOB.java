package io.vertx.mod.fm.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class FmOOB extends AbstractBoot {
    public FmOOB() {
        super(KeIpc.Module.FM);
    }
}
