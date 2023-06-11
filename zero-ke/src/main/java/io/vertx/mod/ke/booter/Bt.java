package io.vertx.mod.ke.booter;

import io.horizon.atom.program.KTimer;
import io.horizon.eon.VString;
import io.vertx.core.Future;

/*
 * Split booter for some divide application of tool
 * 1) Loader
 * 2) Initialize
 */
@Deprecated
public class Bt {

    public static Future<Boolean> loadAsync(final String folder) {
        return BtLoader.loadAsync(folder);
    }

    public static Future<Boolean> loadAsync(final String folder, final String prefix) {
        return BtLoader.loadAsync(folder, prefix);
    }

    public static void init(final String folder) {
        final KTimer timer = KTimer.of().start();
        initAsync(folder).onComplete(BtKit.complete(folder, null, timer));
    }

    public static void init(final String folder, final boolean isOob) {
        final KTimer timer = KTimer.of().start();
        initAsync(folder, isOob).onComplete(BtKit.complete(folder, null, timer));
    }

    public static void init(final String folder, final String prefix) {
        final KTimer timer = KTimer.of().start();
        initAsync(folder, prefix).onComplete(BtKit.complete(folder, null, timer));
    }

    public static void init(final String folder, final String prefix, final boolean isOob) {
        final KTimer timer = KTimer.of().start();
        initAsync(folder, prefix, isOob).onComplete(BtKit.complete(folder, null, timer));
    }

    /*
     * Data Loading Entry of Main
     */
    public static Future<Boolean> initAsync(final String folder) {
        return BtBoot.initAsync(folder, VString.EMPTY, Boolean.TRUE);
    }

    public static Future<Boolean> initAsync(final String folder, final boolean isOob) {
        return BtBoot.initAsync(folder, VString.EMPTY, isOob);
    }

    public static Future<Boolean> initAsync(final String folder, final String prefix) {
        return BtBoot.initAsync(folder, prefix, Boolean.TRUE);
    }

    public static Future<Boolean> initAsync(final String folder, final String prefix, final boolean isOob) {
        return BtBoot.initAsync(folder, prefix, isOob);
    }
}
