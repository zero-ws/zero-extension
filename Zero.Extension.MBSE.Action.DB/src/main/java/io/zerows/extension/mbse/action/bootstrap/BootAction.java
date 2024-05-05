package io.zerows.extension.mbse.action.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootAction extends AbstractBoot {
    public BootAction() {
        super(KeIpc.Module.JET);
    }
}
