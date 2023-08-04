package io.vertx.mod.crud.uca.input.qr;

import io.vertx.mod.crud.cv.Pooled;
import io.vertx.mod.crud.cv.em.QrType;
import io.vertx.mod.crud.uca.input.Pre;

/**
 * @author lang : 2023-08-04
 */
public interface PreQr {

    /*
     * 1) UniqueKey condition
     * 2) All key condition: sigma = xxx
     * 3) PrimaryKey condition
     * 4) View key
     */
    static Pre qr(final QrType type) {
        if (QrType.ALL == type) {
            return Pooled.CC_PRE.pick(KeyWholePre::new, KeyWholePre.class.getName());
        } else if (QrType.BY_UK == type) {
            return Pooled.CC_PRE.pick(KeyUniquePre::new, KeyUniquePre.class.getName());
        } else if (QrType.BY_VK == type) {
            return Pooled.CC_PRE.pick(KeyViewPre::new, KeyViewPre.class.getName());
        } else {
            return Pooled.CC_PRE.pick(KeyPrimaryPre::new, KeyPrimaryPre.class.getName());
        }
    }
}
