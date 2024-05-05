package io.zerows.extension.mbse.basement.uca.io;

import io.horizon.eon.VValue;
import io.zerows.extension.mbse.basement.uca.plugin.IoHub;
import io.modello.specification.HRecord;
import io.zerows.extension.mbse.basement.exception._417EventTypeConflictException;
import io.vertx.up.fn.Fn;

public class IoSingle extends AbstractIo {

    private void ensure(final Integer length) {
        Fn.outWeb(1 < length, _417EventTypeConflictException.class, this.getClass());
    }

    @Override
    @SafeVarargs
    public final <ID> AoIo keys(final ID... keys) {
        /* keys长度 */
        this.ensure(keys.length);

        return this.saveRow(() -> this.newRow().setKey(keys[VValue.IDX]));
    }

    @Override
    public AoIo records(final HRecord... records) {
        /* records长度 */
        this.ensure(records.length);
        /* Record */
        final HRecord record = records[VValue.IDX];
        final IoHub hub = IoHub.instance();
        final HRecord processed = hub.in(record, this.tpl());
        return this.saveRow(() -> this.newRow().request(processed));
    }
}
