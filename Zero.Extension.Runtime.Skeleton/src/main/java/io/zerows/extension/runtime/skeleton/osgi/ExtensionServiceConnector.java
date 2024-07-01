package io.zerows.extension.runtime.skeleton.osgi;

import io.zerows.core.metadata.atom.configuration.MDConfiguration;
import io.zerows.core.metadata.zdk.dependency.AbstractConnectorBase;
import io.zerows.core.web.model.uca.normalize.EquipAt;
import org.apache.felix.dm.Component;
import org.apache.felix.dm.DependencyManager;
import org.apache.felix.dm.ServiceDependency;
import org.osgi.framework.Bundle;

import java.util.function.Supplier;

/**
 * @author lang : 2024-05-08
 */
public abstract class ExtensionServiceConnector extends AbstractConnectorBase {

    protected ExtensionServiceConnector(final Bundle bundle) {
        super(bundle);
        // 由于构造函数执行了两次，所以配置初始化留给子类单独调用，调用过程中构造完成的扩展模块配置信息
        final MDConfiguration configuration = new MDConfiguration(bundle);
        final EquipAt equipAt = EquipAt.of(configuration.id());
        // 初始化配置
        equipAt.initialize(configuration);
    }

    @Override
    public void serviceDependency(final DependencyManager dm, final Supplier<Component> supplier, final Supplier<ServiceDependency> serviceSupplier) {
        super.serviceDependency(dm, supplier, serviceSupplier);
    }
}
