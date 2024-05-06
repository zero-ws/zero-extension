package io.zerows.extension.commerce.rbac.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootRBAC extends AbstractBoot {
    public BootRBAC() {
        super(KeIpc.Module.RBAC);
    }
}
