package io.vertx.mod.crud.uca.input.id;

import io.vertx.mod.crud.cv.Pooled;
import io.vertx.mod.crud.uca.input.Pre;

/**
 * @author lang : 2023-08-04
 */
public interface PreId {

    static Pre key(final boolean isNew) {
        if (isNew) {
            return Pooled.CCT_PRE.pick(UuidPre::new, UuidPre.class.getName());
        } else {
            return Pooled.CCT_PRE.pick(KeyPre::new, KeyPre.class.getName());
        }
    }

    static Pre ref() {
        return Pooled.CCT_PRE.pick(RefPre::new, RefPre.class.getName());
    }
}
