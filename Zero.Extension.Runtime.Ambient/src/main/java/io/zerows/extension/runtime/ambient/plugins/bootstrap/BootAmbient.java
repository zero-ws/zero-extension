package io.zerows.extension.runtime.ambient.plugins.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootAmbient extends AbstractBoot {
    public BootAmbient() {
        super(KeIpc.Module.AMBIENT);
    }
}
