package io.zerows.extension.commerce.rbac.osgi.spi;

import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;
import io.zerows.core.domain.atom.typed.UObject;
import io.zerows.extension.commerce.rbac.agent.service.accredit.ActionService;
import io.zerows.extension.commerce.rbac.agent.service.accredit.ActionStub;
import io.zerows.extension.commerce.rbac.eon.AuthMsg;
import io.zerows.extension.commerce.rbac.exception._404ActionMissingException;
import io.zerows.extension.runtime.skeleton.osgi.spi.ui.Anchoret;
import io.zerows.extension.runtime.skeleton.osgi.spi.web.Seeker;

import java.util.Objects;

import static io.zerows.extension.commerce.rbac.util.Sc.LOG;

/*
 * Seek impact resource for params here, it will be passed by crud
 */
public class ExIntimitySeeker extends Anchoret<Seeker> implements Seeker {

    private transient final ActionStub stub = Ut.singleton(ActionService.class);

    @Override
    public Future<JsonObject> fetchImpact(final JsonObject params) {
        /*
         * Uri, Method
         */
        final String uri = params.getString(ARG0);
        final HttpMethod method = HttpMethod.valueOf(params.getString(ARG1));
        final String sigma = params.getString(ARG2);
        LOG.Resource.info(this.getLogger(), AuthMsg.SEEKER_RESOURCE, uri, method, sigma);
        return this.stub.fetchAction(uri, method, sigma).compose(action -> Objects.isNull(action) ?
            Future.failedFuture(new _404ActionMissingException(this.getClass(), method + " " + uri)) :
            UObject.create(params).append(KName.RESOURCE_ID, action.getResourceId())
                .toFuture());
    }
}
