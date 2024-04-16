package io.vertx.mod.jet.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.macro.plugin.booting.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class JetOOB extends AbstractBoot {
    public JetOOB() {
        super(KeIpc.Module.JET);
    }
}
