package io.vertx.mod.doc.booter;

import io.zerows.extension.runtime.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author lang : 2023-08-17
 */
public class DocOOB extends AbstractBoot {

    public DocOOB() {
        super(KeIpc.Module.DOC);
    }
}
