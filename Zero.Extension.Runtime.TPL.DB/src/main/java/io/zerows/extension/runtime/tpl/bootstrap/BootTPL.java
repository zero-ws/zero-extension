package io.zerows.extension.runtime.tpl.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootTPL extends AbstractBoot {
    public BootTPL() {
        super(KeIpc.Module.TPL);
    }
}
