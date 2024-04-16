package io.vertx.mod.fm.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.macro.plugin.booting.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class FmOOB extends AbstractBoot {
    public FmOOB() {
        super(KeIpc.Module.FM);
    }
}
