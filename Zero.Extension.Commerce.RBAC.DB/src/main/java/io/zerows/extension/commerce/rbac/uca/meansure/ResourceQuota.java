package io.zerows.extension.commerce.rbac.uca.meansure;

import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.ext.healthchecks.Status;
import io.zerows.extension.commerce.rbac.atom.ScConfig;
import io.zerows.core.feature.web.monitor.meansure.AbstractQuota;
import io.zerows.extension.commerce.rbac.bootstrap.ScPin;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class ResourceQuota extends AbstractQuota {
    public ResourceQuota(final Vertx vertx) {
        super(vertx);
    }

    @Override
    public void handle(final Promise<Status> event) {
        // Permission Pool
        final ScConfig config = ScPin.getConfig();
        this.mapAsync(config.getPoolPermission(), map -> {
            System.out.println(map);
        });
    }
}
