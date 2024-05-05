package io.zerows.extension.commerce.lbs.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootLBS extends AbstractBoot {
    public BootLBS() {
        super(KeIpc.Module.LBS);
    }
}
