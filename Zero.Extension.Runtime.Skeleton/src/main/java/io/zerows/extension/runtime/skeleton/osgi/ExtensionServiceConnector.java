package io.zerows.extension.runtime.skeleton.osgi;

import io.zerows.core.feature.web.mbse.atom.io.MDConfiguration;
import io.zerows.core.feature.web.mbse.uca.normalize.EngageAt;
import io.zerows.core.metadata.zdk.AbstractServiceConnector;
import org.apache.felix.dm.Component;
import org.apache.felix.dm.DependencyManager;
import org.apache.felix.dm.ServiceDependency;
import org.osgi.framework.Bundle;

import java.util.function.Supplier;

/**
 * @author lang : 2024-05-08
 */
public abstract class ExtensionServiceConnector extends AbstractServiceConnector {
    protected final MDConfiguration configuration;

    protected ExtensionServiceConnector(final Bundle bundle) {
        super(bundle);
        this.configuration = new MDConfiguration(bundle);
        final EngageAt engageAt = EngageAt.of(this.configuration.id());
        // 初始化配置
        engageAt.initialize(this.configuration);
    }

    @Override
    public void serviceDependency(final DependencyManager dm, final Supplier<Component> supplier, final Supplier<ServiceDependency> serviceSupplier) {
        super.serviceDependency(dm, supplier, serviceSupplier);
    }
}
