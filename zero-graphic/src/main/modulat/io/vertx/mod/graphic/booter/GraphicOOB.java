package io.vertx.mod.graphic.booter;

import io.zerows.extension.runtime.eon.KeIpc;
import io.zerows.core.web.model.extension.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class GraphicOOB extends AbstractBoot {
    public GraphicOOB() {
        super(KeIpc.Module.G);
    }
}
