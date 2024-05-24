package io.zerows.extension.runtime.ambient.configuration;

import io.zerows.core.web.model.atom.io.MDConfiguration;
import io.zerows.core.web.model.uca.normalize.EquipAt;
import io.zerows.extension.runtime.ambient.eon.AtConstant;
import org.junit.Test;

/**
 * @author lang : 2024-05-08
 */
public class EquipAtTestCase {

    @Test
    public void testExtensionAt() {
        final MDConfiguration configuration = new MDConfiguration(AtConstant.BUNDLE_SYMBOLIC_NAME);
        final EquipAt component = EquipAt.of(configuration.id());
        component.initialize(configuration);

        System.out.println(configuration.id());
    }
}
