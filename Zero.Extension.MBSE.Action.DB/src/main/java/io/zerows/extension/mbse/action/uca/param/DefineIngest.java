package io.zerows.extension.mbse.action.uca.param;

import io.vertx.ext.web.RoutingContext;
import io.vertx.up.util.Ut;
import io.zerows.core.metadata.store.OZeroStore;
import io.zerows.core.web.model.commune.Envelop;
import io.zerows.extension.mbse.action.atom.JtUri;
import io.zerows.extension.mbse.action.eon.JtConstant;
import io.zerows.extension.mbse.action.exception._501IngestMissingException;
import io.zerows.extension.mbse.action.exception._501IngestSpecException;
import io.zerows.extension.mbse.action.osgi.spi.jet.JtIngest;

import java.util.Objects;

class DefineIngest implements JtIngest {
    @Override
    public Envelop in(final RoutingContext context, final JtUri uri) {
        final Class<?> clazz = OZeroStore.classInject(JtConstant.COMPONENT_INGEST_KEY);
        if (Objects.isNull(clazz)) {
            return Envelop.failure(new _501IngestMissingException(this.getClass()));
        } else if (!Ut.isImplement(clazz, JtIngest.class)) {
            return Envelop.failure(new _501IngestSpecException(this.getClass(), clazz.getName()));
        } else {
            final JtIngest ingest = Ut.instance(clazz);
            return ingest.in(context, uri);
        }
    }
}
