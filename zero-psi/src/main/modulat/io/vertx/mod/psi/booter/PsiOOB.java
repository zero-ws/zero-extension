package io.vertx.mod.psi.booter;

import io.vertx.boot.extension.AbstractBoot;
import io.vertx.mod.ke.cv.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class PsiOOB extends AbstractBoot {
    public PsiOOB() {
        super(KeIpc.Module.PSI);
    }
}
