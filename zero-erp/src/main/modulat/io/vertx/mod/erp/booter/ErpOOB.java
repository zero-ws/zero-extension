package io.vertx.mod.erp.booter;

import io.zerows.extension.runtime.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class ErpOOB extends AbstractBoot {
    public ErpOOB() {
        super(KeIpc.Module.ERP);
    }
}
