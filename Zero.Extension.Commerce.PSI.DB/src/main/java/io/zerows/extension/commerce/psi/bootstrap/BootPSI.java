package io.zerows.extension.commerce.psi.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootPSI extends AbstractBoot {
    public BootPSI() {
        super(KeIpc.Module.PSI);
    }
}
