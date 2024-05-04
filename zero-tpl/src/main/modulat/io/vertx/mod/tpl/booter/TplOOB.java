package io.vertx.mod.tpl.booter;

import io.zerows.extension.runtime.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TplOOB extends AbstractBoot {
    public TplOOB() {
        super(KeIpc.Module.TPL);
    }
}
