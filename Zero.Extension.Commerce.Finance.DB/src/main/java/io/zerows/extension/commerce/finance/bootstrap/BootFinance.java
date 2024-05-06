package io.zerows.extension.commerce.finance.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootFinance extends AbstractBoot {
    public BootFinance() {
        super(KeIpc.Module.FM);
    }
}
