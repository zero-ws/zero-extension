package io.zerows.extension.runtime.workflow.uca.ticket;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.core.feature.database.jooq.operation.UxJooq;
import io.zerows.extension.runtime.workflow.atom.configuration.MetaInstance;
import io.zerows.extension.runtime.workflow.atom.runtime.WRecord;
import io.zerows.extension.runtime.workflow.domain.tables.daos.WTicketDao;
import io.zerows.extension.runtime.workflow.domain.tables.pojos.WTicket;
import io.zerows.extension.runtime.workflow.uca.toolkit.URequest;
import io.zerows.extension.runtime.workflow.uca.toolkit.UTL;

class SyncTicket extends AbstractSync {

    SyncTicket(final MetaInstance metadata) {
        super(metadata);
    }

    @Override
    public Future<WRecord> treatAsync(final JsonObject requestJ, final WRecord recordIn, final WTicket ticketIn) {
        return Ux.future(ticketIn)

            // Before
            .compose(ticket -> UTL.beforeUpdate(ticket, recordIn))

            // Sync
            .compose(recordRef -> {
                final UxJooq tJq = Ux.Jooq.on(WTicketDao.class);
                final JsonObject ticketJ = requestJ.copy();
                /*
                 * Key Point for attachment linkage here, the linkage must contain
                 * serial part in params instead of distinguish between ADD / EDIT
                 */
                if (!requestJ.containsKey(KName.SERIAL)) {
                    requestJ.put(KName.SERIAL, ticketIn.getSerial());
                }

                // Compress Json
                URequest.reduceJ(ticketJ);
                final WTicket combine = Ux.updateT(ticketIn, ticketJ);
                return tJq.updateAsync(combine);
            })

            // After
            .compose(updated -> UTL.afterUpdate(updated, recordIn));
    }
}
