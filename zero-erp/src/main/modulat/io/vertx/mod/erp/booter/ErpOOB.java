package io.vertx.mod.erp.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class ErpOOB extends AbstractBoot {
    public ErpOOB() {
        super(KeIpc.Module.ERP);
    }
}
