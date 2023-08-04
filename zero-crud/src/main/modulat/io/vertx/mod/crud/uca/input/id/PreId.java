package io.vertx.mod.crud.uca.input.id;

import io.vertx.mod.crud.cv.Pooled;
import io.vertx.mod.crud.uca.input.Pre;

/**
 * @author lang : 2023-08-04
 */
public interface PreId {

    static Pre key(final boolean isNew) {
        if (isNew) {
            return Pooled.CC_PRE.pick(UuidPre::new, UuidPre.class.getName());
        } else {
            return Pooled.CC_PRE.pick(KeyPre::new, KeyPre.class.getName());
        }
    }
}
