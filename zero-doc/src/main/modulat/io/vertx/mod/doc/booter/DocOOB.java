package io.vertx.mod.doc.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.vertx.up.plugin.booting.AbstractBoot;

/**
 * @author lang : 2023-08-17
 */
public class DocOOB extends AbstractBoot {

    public DocOOB() {
        super(KeIpc.Module.DOC);
    }
}
