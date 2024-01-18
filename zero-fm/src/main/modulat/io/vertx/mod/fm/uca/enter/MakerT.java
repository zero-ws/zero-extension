package io.vertx.mod.fm.uca.enter;

import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

/**
 * @author lang : 2024-01-18
 */
class MakerT implements Maker<String, FTrans> {

    @Override
    public Future<FTrans> buildFastAsync(final JsonObject data) {
        final String indent = Ut.valueString(data, KName.INDENT);
        return this.buildAsync(data, indent);
    }

    /**
     * 「付款单」
     * 此处用来构造付款单的信息，一般为创建付款时专用，内置 `indent` 配置处理序号问题。
     *
     * @param data   输入数据
     * @param indent 编号定义
     *
     * @return {@link FTrans}
     */
    @Override
    public Future<FTrans> buildAsync(final JsonObject data, final String indent) {
        Objects.requireNonNull(indent);
        final FTrans trans = Ux.fromJson(data, FTrans.class);
        return Ke.umIndent(trans, trans.getSigma(), indent, FTrans::setSerial).compose(generated -> {
            if (Objects.isNull(generated.getCode())) {
                generated.setCode(generated.getSerial());
            }
            return Ux.future(generated);
        });
    }
}
