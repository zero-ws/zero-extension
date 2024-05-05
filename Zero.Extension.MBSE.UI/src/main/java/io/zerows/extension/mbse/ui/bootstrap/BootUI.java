package io.zerows.extension.mbse.ui.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootUI extends AbstractBoot {
    public BootUI() {
        super(KeIpc.Module.UI);
    }
}
