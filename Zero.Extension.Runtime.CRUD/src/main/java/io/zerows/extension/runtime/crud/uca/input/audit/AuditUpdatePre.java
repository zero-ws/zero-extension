package io.zerows.extension.runtime.crud.uca.input.audit;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.zerows.extension.runtime.crud.uca.desk.IxMod;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.domain.atom.specification.KField;
import io.zerows.core.feature.web.mbse.atom.specification.KModule;
import io.zerows.core.web.model.commune.Envelop;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class AuditUpdatePre extends AuditAction {
    @Override
    public Future<JsonObject> inJAsync(final JsonObject data, final IxMod in) {
        /* UserId */
        this.auditor(data, in);
        return Ux.future(data);
    }

    private void auditor(final JsonObject data, final IxMod in) {
        /* UserId */
        final Envelop envelop = in.envelop();
        final User user = envelop.user();
        final KModule module = in.module();
        if (Objects.nonNull(user)) {
            final String userId = Ux.keyUser(user);
            if (Ut.isNotNil(userId)) {
                final KField field = module.getField();
                /* Created */
                this.setAuditor(data, field.getUpdated(), userId);
            }
        }
    }

    @Override
    public Future<JsonArray> inAAsync(final JsonArray data, final IxMod in) {
        Ut.itJArray(data).forEach(json -> this.auditor(json, in));
        return Ux.future(data);
    }
}
