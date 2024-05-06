package io.zerows.extension.runtime.workflow.bootstrap;

import io.zerows.extension.runtime.skeleton.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootWorkflow extends AbstractBoot {
    public BootWorkflow() {
        super(KeIpc.Module.WF);
    }

    @Override
    protected Set<String> configureBuiltIn() {
        return WfPin.getBuiltIn();
    }
}
