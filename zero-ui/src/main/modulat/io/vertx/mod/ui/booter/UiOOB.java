package io.vertx.mod.ui.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class UiOOB extends AbstractBoot {
    public UiOOB() {
        super(KeIpc.Module.UI);
    }
}
