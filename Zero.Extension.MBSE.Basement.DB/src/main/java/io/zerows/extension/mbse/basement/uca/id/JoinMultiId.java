package io.zerows.extension.mbse.basement.uca.id;

import io.modello.specification.HRecord;
import io.vertx.up.fn.Fn;
import io.zerows.extension.mbse.basement.atom.Model;
import io.zerows.extension.mbse.basement.domain.tables.pojos.MJoin;
import io.zerows.extension.mbse.basement.exception._417PrimaryKeySizeException;
import io.zerows.extension.mbse.basement.util.Ao;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

class JoinMultiId extends AbstractId {

    @Override
    @SuppressWarnings("unchecked")
    public <ID> ID key(final HRecord record,
                       final Model model) {
        // 检查定义
        this.ensure(model);
        final ConcurrentMap<String, Object> keyMap = Ao.joinKeys(model, record);
        return (ID) keyMap.keySet().stream()
            .map(keyMap::get).findFirst()
            .orElse(null);
    }

    @Override
    public <ID> void key(final HRecord record,
                         final Model model,
                         final ID id) {
        // 检查定义
        this.ensure(model);
        // 非唯一主键设置，包括关联键也需要设置
        model.dbJoins().stream()
            .map(MJoin::getEntityKey)
            .filter(Objects::nonNull)
            .forEach(field -> record.set(field, Ao.toKey(id)));
    }

    private void ensure(final Model model) {
        final Set<Boolean> valid = Ensurer.join(this.getClass(), model);
        final long falseCount = valid.stream().filter(item -> !item)
            .count();
        /*
         * 第四检查条件：keyMap必须有一个字段不是主键
         */
        Fn.outWeb(0 == falseCount, _417PrimaryKeySizeException.class, this.getClass(),
            /* ARG1：实际的主键数量 */ valid.size(),
            /* ARG2：期望的主键数量 */ "> 0");
    }
}
