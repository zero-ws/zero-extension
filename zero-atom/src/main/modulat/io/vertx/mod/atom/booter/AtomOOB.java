package io.vertx.mod.atom.booter;

import io.zerows.extension.runtime.skeleton.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class AtomOOB extends AbstractBoot {
    public AtomOOB() {
        super(KeIpc.Module.ATOM);
    }
}
