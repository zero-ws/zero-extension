package io.vertx.mod.crud.uca.op.aop;

import io.horizon.eon.em.typed.ChangeFlag;
import io.vertx.mod.crud.cv.Pooled;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.op.Agonic;

/**
 * @author lang : 2023-08-04
 */
public interface AgonicAop {
    static Agonic write(final ChangeFlag flag) {
        if (ChangeFlag.ADD == flag) {
            return Pooled.CCT_AGONIC.pick(AgonicCreate::new, AgonicCreate.class.getName());
        } else if (ChangeFlag.DELETE == flag) {
            return Pooled.CCT_AGONIC.pick(AgonicDelete::new, AgonicDelete.class.getName());
        } else {
            return Pooled.CCT_AGONIC.pick(AgonicUpdate::new, AgonicUpdate.class.getName());
        }
    }

    static Agonic write(final IxMod module) {
        return Pooled.CCT_AGONIC.pick(() -> new StandBySave(module), StandBySave.class.getName());
    }
}
