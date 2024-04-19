package io.vertx.mod.tpl.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TplOOB extends AbstractBoot {
    public TplOOB() {
        super(KeIpc.Module.TPL);
    }
}
