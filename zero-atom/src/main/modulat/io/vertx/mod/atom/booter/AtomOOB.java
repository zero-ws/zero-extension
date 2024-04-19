package io.vertx.mod.atom.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class AtomOOB extends AbstractBoot {
    public AtomOOB() {
        super(KeIpc.Module.ATOM);
    }
}
