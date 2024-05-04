package io.vertx.mod.ui.booter;

import io.zerows.extension.runtime.skeleton.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class UiOOB extends AbstractBoot {
    public UiOOB() {
        super(KeIpc.Module.UI);
    }
}
