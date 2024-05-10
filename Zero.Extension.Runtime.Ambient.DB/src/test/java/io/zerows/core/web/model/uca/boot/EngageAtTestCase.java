package io.zerows.core.web.model.uca.boot;

import io.zerows.core.feature.web.mbse.atom.io.MDConfiguration;
import io.zerows.core.feature.web.mbse.uca.normalize.EngageAt;
import org.junit.Test;

/**
 * @author lang : 2024-05-08
 */
public class EngageAtTestCase {

    @Test
    public void testExtensionAt() {
        final MDConfiguration configuration = new MDConfiguration("zero-extension-runtime-ambient");
        final EngageAt component = EngageAt.of(configuration.id());
        component.initialize(configuration);

        System.out.println(configuration.id());
    }
}
