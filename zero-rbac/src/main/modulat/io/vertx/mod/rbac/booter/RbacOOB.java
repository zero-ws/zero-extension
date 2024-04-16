package io.vertx.mod.rbac.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.macro.plugin.booting.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class RbacOOB extends AbstractBoot {
    public RbacOOB() {
        super(KeIpc.Module.RBAC);
    }
}
