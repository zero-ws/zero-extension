package io.vertx.mod.crud.uca.input.audit;

import io.vertx.mod.crud.cv.Pooled;
import io.vertx.mod.crud.uca.input.Pre;

/**
 * @author lang : 2023-08-04
 */
public interface PreAudit {

    static Pre audit(final boolean created) {
        if (created) {
            return Pooled.CC_PRE.pick(AuditCreatePre::new, AuditCreatePre.class.getName());
        } else {
            return Pooled.CC_PRE.pick(AuditUpdatePre::new, AuditUpdatePre.class.getName());
        }
    }

    static Pre audit() {
        return Pooled.CC_PRE.pick(AuditDeletePre::new, AuditDeletePre.class.getName());
    }
}
