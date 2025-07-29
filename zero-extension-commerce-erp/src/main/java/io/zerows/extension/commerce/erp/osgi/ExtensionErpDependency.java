package io.zerows.extension.commerce.erp.osgi;

import io.zerows.core.metadata.zdk.service.ServiceConnector;
import io.zerows.extension.runtime.skeleton.osgi.ExtensionServiceConnector;
import org.osgi.framework.Bundle;

/**
 * @author lang : 2024-04-22
 */
class ExtensionErpDependency extends ExtensionServiceConnector {

    private ExtensionErpDependency(final Bundle bundle) {
        super(bundle);
    }

    static ServiceConnector of(final Bundle bundle) {
        return of(bundle, ExtensionErpDependency::new);
    }
}
