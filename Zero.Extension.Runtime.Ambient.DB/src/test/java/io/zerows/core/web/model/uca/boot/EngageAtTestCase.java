package io.zerows.core.web.model.uca.boot;

import io.zerows.core.web.model.atom.module.ExtConfiguration;
import org.junit.Test;

/**
 * @author lang : 2024-05-08
 */
public class EngageAtTestCase {

    @Test
    public void testExtensionAt() {
        final ExtConfiguration configuration = EngageFactory.create("zero-extension-runtime-ambient");
        final EngageAt component = EngageFactory.ofComponent(configuration);
        component.initialize(configuration);
        System.out.println(configuration.id());
    }
}
