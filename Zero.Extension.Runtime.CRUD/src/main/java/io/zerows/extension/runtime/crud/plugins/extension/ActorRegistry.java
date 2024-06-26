package io.zerows.extension.runtime.crud.plugins.extension;

import io.zerows.core.web.io.plugins.extension.PlugRegistry;
import io.zerows.extension.runtime.crud.bootstrap.IxPin;

import java.util.Set;
import java.util.stream.Collectors;

/*
 * Extension of PlugRegistry for micro mode.
 */
public class ActorRegistry implements PlugRegistry {
    /*
     * Get module uris from the configuration of crud
     */
    private static final Set<String> URIS = IxPin.getUris();

    @Override
    public Set<String> analyze(final Set<String> routes) {
        /*
         * Remove :actor uri, put replaced here.
         */
        final Set<String> processed = routes.stream()
            .filter(item -> !item.contains(":actor"))
            .collect(Collectors.toSet());
        /*
         * Add replaced uri with :actor parameters
         */
        processed.addAll(URIS);
        return processed;
    }
}
