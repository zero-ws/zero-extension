package io.vertx.mod.workflow.uca.transition;

import cn.vertxup.workflow.cv.em.TodoStatus;
import cn.vertxup.workflow.domain.tables.pojos.WTicket;
import cn.vertxup.workflow.domain.tables.pojos.WTodo;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.workflow.atom.runtime.WTransition;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author lang : 2023-06-29
 */
class VmReject implements Vm {
    @Override
    public void generate(final WTodo generated, final WTodo wTask, final WTicket ticket) {
        // 拒绝
        generated.setStatus(TodoStatus.DRAFT.name());
        if (Objects.isNull(generated.getToUser())) {
            // 拒绝到开单人手中
            generated.setToUser(ticket.getOpenBy());
            generated.setAcceptedBy(ticket.getOpenBy());
            generated.setAcceptedAt(LocalDateTime.now());
        }
    }

    @Override
    public void end(final JsonObject normalized, final WTransition transition) {
        final String phase = Ut.valueString(normalized, KName.PHASE);
        // phase = REJECTED ----> REJECTED
        normalized.put(KName.STATUS, phase);
    }
}
