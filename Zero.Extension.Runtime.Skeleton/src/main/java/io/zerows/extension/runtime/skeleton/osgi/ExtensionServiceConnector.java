package io.zerows.extension.runtime.skeleton.osgi;

import io.zerows.core.metadata.zdk.AbstractServiceConnector;
import io.zerows.core.web.model.atom.module.ExtConfiguration;
import io.zerows.core.web.model.uca.boot.EngageAt;
import io.zerows.core.web.model.uca.boot.EngageFactory;
import org.apache.felix.dm.Component;
import org.apache.felix.dm.DependencyManager;
import org.apache.felix.dm.ServiceDependency;
import org.osgi.framework.Bundle;

import java.util.function.Supplier;

/**
 * @author lang : 2024-05-08
 */
public abstract class ExtensionServiceConnector extends AbstractServiceConnector {
    protected final ExtConfiguration configuration;

    protected ExtensionServiceConnector(final Bundle bundle) {
        super(bundle);
        this.configuration = EngageFactory.create(bundle.getSymbolicName());
        final EngageAt engageAt = EngageFactory.ofComponent(this.configuration);
        // 初始化配置
        engageAt.initialize(this.configuration, bundle);
    }

    @Override
    public void serviceDependency(final DependencyManager dm, final Supplier<Component> supplier, final Supplier<ServiceDependency> serviceSupplier) {
        super.serviceDependency(dm, supplier, serviceSupplier);
    }
}
