package io.vertx.mod.crud.uca.input.id;

import io.aeon.experiment.specification.KModule;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.input.Pre;
import io.vertx.up.atom.shape.KField;
import io.vertx.up.atom.shape.KJoin;
import io.vertx.up.atom.shape.KPoint;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.UUID;

/**
 * 只有引用模型优先创建 keyJoin 中的值，并且将会把此值拷贝到 standBy
 *
 * @author lang : 2023-08-24
 */
class RefPre implements Pre {
    @Override
    public Future<JsonObject> inJAsync(final JsonObject data, final IxMod in) {
        final KModule module = in.module();
        // 关联键生成
        if (in.canJoin()) {
            this.generateReference(data, module);
        }
        return Ux.future(data);
    }

    private void generateReference(final JsonObject data, final KModule module) {
        final KJoin join = module.getConnect();
        /* 限定必须是 reference 类型 */
        if (!join.isRefer()) {
            return;
        }

        /* 提取当前模型主键 */
        final KField field = module.getField();
        final String keyField = field.getKey();
        if (Ut.isNil(keyField)) {
            return;
        }

        final KPoint source = join.getSource();
        final String keyJoin = source.getKeyJoin();
        if (Ut.isNil(keyJoin) || keyField.equals(keyJoin)) {
            return;
        }
        /* UUID 主键 */
        final String keyValue = data.getString(keyJoin);
        if (Ut.isNil(keyValue)) {
            data.put(keyJoin, UUID.randomUUID().toString());
        }
    }

    @Override
    public Future<JsonArray> inAAsync(final JsonArray data, final IxMod in) {
        final KModule module = in.module();
        Ut.itJArray(data).forEach(json -> this.generateReference(json, module));
        return Ux.future(data);
    }
}
