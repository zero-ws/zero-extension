package io.zerows.extension.runtime.skeleton.osgi;

import io.zerows.core.metadata.atom.configuration.MDConfiguration;
import io.zerows.core.metadata.zdk.dependency.AbstractConnectorService;
import io.zerows.core.metadata.zdk.service.ServiceContext;
import io.zerows.core.web.model.extension.HExtension;
import org.apache.felix.dm.Component;
import org.apache.felix.dm.DependencyManager;
import org.apache.felix.dm.ServiceDependency;
import org.osgi.framework.Bundle;

import java.util.function.Supplier;

/**
 * @author lang : 2024-05-08
 */
public abstract class ExtensionServiceConnector extends AbstractConnectorService {

    protected ExtensionServiceConnector(final Bundle bundle) {
        super(bundle);
    }

    @Override
    public ServiceContext withContext(final Bundle owner) {
        final MDConfiguration configuration = HExtension.getOrCreate(owner);
        return ServiceContext.ofModule(configuration);
    }

    @Override
    public void serviceDependency(final DependencyManager dm, final Supplier<Component> supplier, final Supplier<ServiceDependency> serviceSupplier) {
        super.serviceDependency(dm, supplier, serviceSupplier);
    }
}
