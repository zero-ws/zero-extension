package io.zerows.extension.mbse.basement.bootstrap;

import io.zerows.extension.runtime.skeleton.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootBasement extends AbstractBoot {
    public BootBasement() {
        super(KeIpc.Module.ATOM);
    }
}