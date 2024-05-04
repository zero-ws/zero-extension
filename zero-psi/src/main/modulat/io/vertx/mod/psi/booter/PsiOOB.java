package io.vertx.mod.psi.booter;

import io.zerows.extension.runtime.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class PsiOOB extends AbstractBoot {
    public PsiOOB() {
        super(KeIpc.Module.PSI);
    }
}
