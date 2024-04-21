package io.vertx.mod.psi.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.core.web.metadata.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class PsiOOB extends AbstractBoot {
    public PsiOOB() {
        super(KeIpc.Module.PSI);
    }
}
