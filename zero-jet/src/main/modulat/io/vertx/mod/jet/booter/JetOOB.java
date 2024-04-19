package io.vertx.mod.jet.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class JetOOB extends AbstractBoot {
    public JetOOB() {
        super(KeIpc.Module.JET);
    }
}
