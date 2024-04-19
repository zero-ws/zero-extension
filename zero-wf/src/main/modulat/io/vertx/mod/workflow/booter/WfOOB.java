package io.vertx.mod.workflow.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;
import io.vertx.mod.workflow.init.WfPin;

import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class WfOOB extends AbstractBoot {
    public WfOOB() {
        super(KeIpc.Module.WF);
    }

    @Override
    protected Set<String> configureBuiltIn() {
        return WfPin.getBuiltIn();
    }
}
