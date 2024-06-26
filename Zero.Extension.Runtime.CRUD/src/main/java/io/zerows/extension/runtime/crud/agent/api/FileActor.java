package io.zerows.extension.runtime.crud.agent.api;

import io.horizon.uca.log.Annal;
import io.horizon.uca.qr.syntax.Ir;
import io.modello.specification.meta.HMetaAtom;
import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.crud.util.Ix;
import io.zerows.extension.runtime.crud.uca.desk.IxMod;
import io.zerows.extension.runtime.crud.uca.desk.IxPanel;
import io.zerows.extension.runtime.crud.uca.desk.IxRequest;
import io.zerows.extension.runtime.crud.uca.input.Pre;
import io.zerows.extension.runtime.crud.uca.next.Co;
import io.zerows.extension.runtime.crud.uca.op.Agonic;
import io.zerows.extension.runtime.crud.uca.trans.Tran;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Infusion;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.web.mbse.atom.specification.KModule;
import io.zerows.core.web.model.commune.Envelop;
import io.zerows.extension.runtime.crud.eon.Addr;
import io.zerows.extension.runtime.crud.eon.em.ApiSpec;
import io.zerows.plugins.office.excel.ExcelClient;

import java.util.List;

@Queue
@SuppressWarnings("all")
public class FileActor {

    private static final Annal LOGGER = Annal.get(FileActor.class);

    @Infusion
    private transient ExcelClient client;

    @Address(Addr.File.IMPORT)
    public Future<Envelop> importFile(final Envelop envelop) {
        /*
         *  Import Data from file here
         *  Extract `filename` as file
         */
        final IxRequest request = IxRequest.create(ApiSpec.BODY_STRING).build(envelop);
        final IxPanel panel = IxPanel.on(request);
        final Co co = Co.nextJ(request.active(), true);
        return Pre.excel(this.client).inJAAsync(request.dataF(), request.active()).compose(data -> panel
            .input(
                Tran.initial()::inAAsync,                   /* Initial */
                Tran.fabric(true)::inAAsync,          /* Dict */
                Tran.map(true)::inAAsync,             /* Mapping */
                Tran.tree(true)::inAAsync             /* Tree Transform in Importing */
            )
            .next(in -> co::next)
            .output(co::ok)
            .passion(Agonic.file()::runAAsync)
            .runA(data)
        );
    }

    @Address(Addr.File.EXPORT)
    public Future<Envelop> exportFile(final Envelop envelop) {
        /* Search full column and it will be used in another method */
        final IxRequest request = IxRequest.create(ApiSpec.BODY_JSON).build(envelop);

        /* Exported columns here for future calculation */
        final JsonObject condition = request.dataJ();
        final JsonArray projection = Ut.valueJArray(condition.getJsonArray(KName.Ui.COLUMNS));
        final List<String> columnList = Ut.toList(projection);
        /* Remove columns here and set criteria as condition
         * Here extract query by `criteria` node, it will be synced with
         * dynamic exporting here.
         **/
        JsonObject criteria = Ut.valueJObject(condition.getJsonObject(Ir.KEY_CRITERIA));
        final IxPanel panel = IxPanel.on(request);
        final IxMod mod = request.active();
        return T.fetchFull(request).runJ(request.dataV())
            /*
             * Data Processing
             */
            .compose(columns -> panel
                .input(
                    Pre.codex()::inJAsync /* Rule Vrify */
                )
                .passion(Agonic.fetch()::runJAAsync, null)
                .<JsonArray, JsonObject, JsonArray>runJ(criteria)
                /* Dict Transfer to Export */
                .compose(data -> Tran.map(false).inAAsync(data, mod))       /* Map */
                .compose(data -> Tran.fabric(false).inAAsync(data, mod))    /* Dict */
                .compose(data -> Tran.tree(false).inAAsync(data, mod))      /* Tree */
                .compose(data -> Pre.audit().inAAsync(data, mod))           /* Auditor */
                .compose(data -> Co.endE(columnList).ok(data, columns))
                .compose(data -> {
                    /*
                     * Data Extraction for file buffer here
                     */
                    if (data instanceof JsonArray) {
                        final IxMod active = mod;
                        final KModule in = active.module();
                        /*
                         * The system will calculate the type definition of static module
                         */
                        final HMetaAtom atom = Ix.onAtom(active, (JsonArray) columns);
                        return this.client.exportAsync(in.getTable(), (JsonArray) data, atom);
                    } else {
                        return Ux.future(Buffer.buffer());
                    }
                })
            ).compose(buffer -> Ux.future(Envelop.success(buffer)));
    }
}
