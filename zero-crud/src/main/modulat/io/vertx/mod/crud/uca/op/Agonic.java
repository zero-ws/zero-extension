package io.vertx.mod.crud.uca.op;

import io.horizon.eon.em.typed.ChangeFlag;
import io.horizon.exception.web._501NotSupportException;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.cv.Pooled;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.op.aop.AgonicAop;
import io.vertx.mod.crud.uca.op.view.AgonicView;

/**
 * 此处有一个特殊点需要说明，关于这些组件命名有特殊约定
 * <pre><code>
 *     1. 带 Join 前缀的内置使用了 JOIN 语法，双表或多表直接执行 JOIN
 *     2. 带 Step 为步骤执行，优先考虑主表执行，再考虑子表执行
 * </code></pre>
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface Agonic {

    int EXPIRED = 2 * 60 * 60;

    static Agonic write(final ChangeFlag flag) {
        return AgonicAop.write(flag);
    }

    static Agonic write(final IxMod module) {
        return AgonicAop.write(module);
    }

    static Agonic file() {
        return Pooled.CC_AGONIC.pick(StepImport::new, StepImport.class.getName());
    }

    static Agonic get() {
        return Pooled.CC_AGONIC.pick(StepByID::new, StepByID.class.getName());
    }

    static Agonic search() {
        return Pooled.CC_AGONIC.pick(JoinSearch::new, JoinSearch.class.getName());
    }

    static Agonic count() {
        return Pooled.CC_AGONIC.pick(JoinCount::new, JoinCount.class.getName());
    }

    static Agonic view(final boolean isMy) {
        return AgonicView.view(isMy);
    }

    static Agonic view() {
        return AgonicView.view();
    }

    static Agonic fetch() {
        return Pooled.CC_AGONIC.pick(JoinFetch::new, JoinFetch.class.getName());
    }

    default Future<JsonObject> runJAsync(final JsonObject input, final IxMod in) {
        return Future.failedFuture(new _501NotSupportException(this.getClass()));
    }

    default Future<JsonArray> runAAsync(final JsonArray input, final IxMod in) {
        return Future.failedFuture(new _501NotSupportException(this.getClass()));
    }

    default Future<JsonArray> runJAAsync(final JsonObject input, final IxMod in) {
        return Future.failedFuture(new _501NotSupportException(this.getClass()));
    }

    default Future<JsonObject> runAJAsync(final JsonArray input, final IxMod in) {
        return Future.failedFuture(new _501NotSupportException(this.getClass()));
    }
}
