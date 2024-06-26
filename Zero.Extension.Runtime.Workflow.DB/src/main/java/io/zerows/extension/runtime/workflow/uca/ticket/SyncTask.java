package io.zerows.extension.runtime.workflow.uca.ticket;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.core.feature.database.jooq.operation.UxJooq;
import io.zerows.extension.runtime.workflow.atom.configuration.MetaInstance;
import io.zerows.extension.runtime.workflow.atom.runtime.WRecord;
import io.zerows.extension.runtime.workflow.domain.tables.daos.WTodoDao;
import io.zerows.extension.runtime.workflow.domain.tables.pojos.WTicket;
import io.zerows.extension.runtime.workflow.domain.tables.pojos.WTodo;
import io.zerows.extension.runtime.workflow.uca.toolkit.URequest;
import io.zerows.extension.runtime.workflow.uca.toolkit.UTL;

public class SyncTask extends AbstractSync {
    SyncTask(final MetaInstance metadata) {
        super(metadata);
    }

    @Override
    public Future<WRecord> treatAsync(final JsonObject requestJ, final WRecord recordRef, final WTicket ticketIn) {
        final UxJooq tJq = Ux.Jooq.on(WTodoDao.class);
        final String key = requestJ.getString(KName.KEY);
        return tJq.<WTodo>fetchByIdAsync(key).compose(todoIn -> Ux.future(todoIn)

            // Before
            .compose(todo -> UTL.beforeUpdate(todo, recordRef))

            // Sync
            .compose(recordQ -> {
                final JsonObject todoJ = requestJ.copy();
                // Compress Json
                URequest.reduceJ(todoJ);
                final WTodo updated = Ux.updateT(todoIn, todoJ);
                return tJq.updateAsync(updated);
            })

            // After
            .compose(todo -> UTL.afterUpdate(todo, recordRef))
        );
    }
}
