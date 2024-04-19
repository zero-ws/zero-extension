package io.vertx.mod.rbac.meansure;

import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.ext.healthchecks.Status;
import io.vertx.mod.rbac.atom.ScConfig;
import io.vertx.mod.rbac.init.ScPin;
import io.zerows.core.web.monitor.meansure.AbstractQuota;

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
