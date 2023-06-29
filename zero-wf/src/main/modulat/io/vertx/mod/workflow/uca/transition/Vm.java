package io.vertx.mod.workflow.uca.transition;

import cn.vertxup.workflow.cv.em.TodoStatus;
import cn.vertxup.workflow.domain.tables.pojos.WTicket;
import cn.vertxup.workflow.domain.tables.pojos.WTodo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.workflow.atom.runtime.WTransition;

/**
 * 状态基专用类
 * <pre><code>
 *     1. 工单状态机转换，上一个单据结束
 *     2. 状态机生成，下一个单据开始
 * </code></pre>
 *
 * @author lang : 2023-06-29
 */
public interface Vm {

    // 生成下一个单据
    void generate(WTodo generated, WTodo wTask, WTicket ticket);

    // 关闭上一个单据
    void end(JsonObject normalized, WTransition transition);

    interface Status {
        // Basic
        JsonArray QUEUE = new JsonArray()
            .add(TodoStatus.PENDING.name())
            .add(TodoStatus.ACCEPTED.name())    // Accepted, Accepted for long term ticket
            .add(TodoStatus.DRAFT.name());       // Draft,  Edit the draft for redo submitting

        JsonArray FAILURE = new JsonArray()
            .add(TodoStatus.REJECTED.name())
            .add(TodoStatus.REDO.name());
    }
}
