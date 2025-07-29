package io.zerows.extension.commerce.erp.util;

import io.horizon.uca.log.Log;
import io.horizon.uca.log.LogModule;

/*
 *
 */
public class Er {

    public interface LOG {
        String MODULE = "Επιχείρηση";

        LogModule Worker = Log.modulat(MODULE).extension("Worker");
    }
}
