package io.zerows.extension.mbse.modulat.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootModulat extends AbstractBoot {
    public BootModulat() {
        super(KeIpc.Module.BATTERY);
    }

    @Override
    protected Set<String> configureBuiltIn() {
        return BkPin.getBuiltIn();
    }
}
