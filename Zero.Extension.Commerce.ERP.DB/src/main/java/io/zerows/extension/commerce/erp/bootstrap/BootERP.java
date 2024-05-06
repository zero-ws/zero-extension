package io.zerows.extension.commerce.erp.bootstrap;

import io.zerows.core.web.model.extension.AbstractBoot;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BootERP extends AbstractBoot {
    public BootERP() {
        super(KeIpc.Module.ERP);
    }
}
