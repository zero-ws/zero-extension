package io.horizon.spi.plugin;

import io.vertx.mod.atom.modeling.builtin.DataAtom;
import io.horizon.atom.datamation.KDictAtom;

@SuppressWarnings("unchecked")
public interface DataPlugin<T> {

    default T bind(final DataAtom atom) {
        return (T) this;
    }

    default T bind(final KDictAtom fabric) {
        return (T) this;
    }
}
