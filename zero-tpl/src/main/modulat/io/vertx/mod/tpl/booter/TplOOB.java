package io.vertx.mod.tpl.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.macro.plugin.booting.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TplOOB extends AbstractBoot {
    public TplOOB() {
        super(KeIpc.Module.TPL);
    }
}
