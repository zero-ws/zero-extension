package io.vertx.mod.battery.booter;

import io.vertx.mod.battery.init.BkPin;
import io.zerows.extension.runtime.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BatteryOOB extends AbstractBoot {
    public BatteryOOB() {
        super(KeIpc.Module.BATTERY);
    }

    @Override
    protected Set<String> configureBuiltIn() {
        return BkPin.getBuiltIn();
    }
}
