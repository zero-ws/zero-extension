package io.horizon.spi.plugin;

import io.horizon.atom.datamation.KFabric;
import io.vertx.mod.atom.modeling.builtin.DataAtom;

@SuppressWarnings("unchecked")
public interface DataPlugin<T> {

    default T bind(final DataAtom atom) {
        return (T) this;
    }

    default T bind(final KFabric fabric) {
        return (T) this;
    }
}
