package io.vertx.mod.lbs.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class LbsOOB extends AbstractBoot {
    public LbsOOB() {
        super(KeIpc.Module.LBS);
    }
}
