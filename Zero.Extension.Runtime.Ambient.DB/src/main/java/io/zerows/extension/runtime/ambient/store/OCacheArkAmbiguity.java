package io.zerows.extension.runtime.ambient.store;

import io.macrocosm.specification.app.HApp;
import io.macrocosm.specification.program.HArk;
import io.zerows.core.metadata.atom.MultiKeyMap;
import io.zerows.core.metadata.zdk.AbstractAmbiguity;
import org.osgi.framework.Bundle;

import java.util.Objects;
import java.util.Set;

/**
 * @author lang : 2024-07-08
 */
class OCacheArkAmbiguity extends AbstractAmbiguity implements OCacheArk {

    private static final MultiKeyMap<HArk> STORED = new MultiKeyMap<>();

    OCacheArkAmbiguity(final Bundle bundle) {
        super(bundle);
    }

    @Override
    public Set<String> keys() {
        return STORED.keySet();
    }

    @Override
    public HArk valueGet(final String key) {
        return STORED.getOr(key);
    }

    @Override
    public OCacheArk add(final HArk ark) {
        if (Objects.isNull(ark)) {
            return this;
        }
        final HApp app = ark.app();
        if (Objects.nonNull(app)) {
            // appId, name
            STORED.put(app.appId(), ark, app.name());
        }
        return this;
    }

    @Override
    public OCacheArk remove(final HArk ark) {
        if (Objects.isNull(ark)) {
            return this;
        }
        final HApp app = ark.app();
        if (Objects.nonNull(app)) {
            // appId, name
            STORED.remove(app.appId());
        }
        return this;
    }
}
