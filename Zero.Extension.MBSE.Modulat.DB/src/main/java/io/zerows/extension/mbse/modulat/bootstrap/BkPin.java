package io.zerows.extension.mbse.modulat.bootstrap;

import io.macrocosm.specification.app.HApp;
import io.macrocosm.specification.app.HRegistry;
import io.macrocosm.specification.program.HArk;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.up.unity.Ux;
import io.zerows.extension.mbse.modulat.osgi.spi.ExModulat;
import io.zerows.extension.mbse.modulat.util.Bk;
import io.zerows.extension.runtime.skeleton.osgi.spi.modeler.Modulat;

import java.util.Objects;
import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BkPin implements HRegistry.Mod<Vertx> {

    public static Set<String> getBuiltIn() {
        return BkConfiguration.builtIn();
    }

    @Override
    public Future<Boolean> initializeAsync(final Vertx container, final HArk ark) {

        final HApp app = ark.app();
        final String appKey = app.appId(); // Ut.valueString(appJ, KName.KEY);
        if (Objects.isNull(appKey)) {
            Bk.LOG.Init.warn(this.getClass(), "App Id = null, ignored initialized!!");
            return Ux.futureF();
        }
        final Modulat modulat = new ExModulat();
        return modulat.extension(app.option()).compose(nil -> Ux.futureT());
    }
}
