package io.zerows.extension.runtime.integration.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootIntegration extends AbstractBoot {
    public BootIntegration() {
        super(KeIpc.Module.IS);
    }
}
