package io.vertx.mod.crud.uca.input.view;

import io.vertx.mod.crud.cv.Pooled;
import io.vertx.mod.crud.uca.input.Pre;

/**
 * @author lang : 2023-08-04
 */
public interface PreView {

    static Pre apeak(final boolean isMy) {
        if (isMy) {
            return Pooled.CC_PRE.pick(ApeakMyPre::new, ApeakMyPre.class.getName());
        } else {
            return Pooled.CC_PRE.pick(ApeakPre::new, ApeakPre.class.getName());
        }
    }
}
