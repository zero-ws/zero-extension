package io.vertx.mod.crud.cv;

import io.horizon.uca.cache.Cc;
import io.vertx.mod.crud.uca.desk.IxJunc;
import io.vertx.mod.crud.uca.input.Pre;
import io.vertx.mod.crud.uca.next.Co;
import io.vertx.mod.crud.uca.op.Agonic;
import io.vertx.mod.crud.uca.trans.Tran;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@SuppressWarnings("all")
public interface Pooled {
    Cc<String, Agonic> CCT_AGONIC = Cc.openThread();
    Cc<String, Pre> CCT_PRE = Cc.openThread();
    Cc<String, Tran> CCT_TRAN = Cc.openThread();
    Cc<String, Co> CCT_CO = Cc.openThread();

    Cc<String, IxJunc> CCT_JUNC = Cc.openThread();
}
