package io.vertx.mod.atom.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.macro.plugin.booting.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class AtomOOB extends AbstractBoot {
    public AtomOOB() {
        super(KeIpc.Module.ATOM);
    }
}
