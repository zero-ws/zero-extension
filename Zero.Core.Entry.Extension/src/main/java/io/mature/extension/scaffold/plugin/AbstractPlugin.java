package io.mature.extension.scaffold.plugin;

import io.horizon.atom.datamation.KFabric;
import io.horizon.atom.datamation.KMapping;
import io.horizon.eon.em.typed.ChangeFlag;
import io.horizon.uca.log.Annal;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.util.Ut;
import io.zerows.core.cloud.eon.VDBC;
import io.zerows.extension.mbse.basement.atom.builtin.DataAtom;
import io.zerows.extension.mbse.basement.exception._501FabricIssueException;

import java.util.Objects;


@SuppressWarnings("unchecked")
public abstract class AbstractPlugin<T> {
    protected transient DataAtom atom;
    protected transient KFabric fabric;

    public T bind(final DataAtom atom) {
        this.atom = atom;
        return (T) this;
    }

    public T bind(final KFabric fabric) {
        this.fabric = fabric;
        return (T) this;
    }

    protected Annal logger() {
        return Annal.get(this.getClass());
    }

    protected ChangeFlag operation(final JsonObject options) {
        return Ut.toEnum(() -> options.getString(VDBC.I_SERVICE.SERVICE_CONFIG.CONFIGURATION_OPERATION), ChangeFlag.class, ChangeFlag.NONE);
    }

    protected KFabric fabric(final JsonObject options) {
        Fn.out(Objects.isNull(this.fabric), _501FabricIssueException.class, this.getClass());
        final Object mapping = options.getValue(KName.MAPPING);
        final KMapping item = this.mapping(mapping);
        /* 双条件检查，为 NULL 和 Empty 都没有任何 Mapping 配置*/
        if (Objects.isNull(item) || item.isEmpty()) {
            this.logger().info("[ Combiner ] No mapping! {0}", options.encode());
            return this.fabric;
        } else {
            this.logger().info("[ Combiner ] Mapping found! {0}", item.toString());
            return this.fabric.copy(item);
        }
    }

    private KMapping mapping(final Object value) {
        if (value instanceof String) {
            final JsonObject config = Ut.ioJObject(value.toString());
            return this.mapping(config);
        } else if (value instanceof JsonObject) {
            return new KMapping((JsonObject) value);
        } else {
            return null;
        }
    }
}
