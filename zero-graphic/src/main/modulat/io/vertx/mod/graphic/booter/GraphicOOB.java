package io.vertx.mod.graphic.booter;

import io.vertx.mod.ke.cv.KeIpc;
import io.zerows.macro.plugin.booting.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class GraphicOOB extends AbstractBoot {
    public GraphicOOB() {
        super(KeIpc.Module.G);
    }
}
