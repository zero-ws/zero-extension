package io.vertx.mod.workflow.uca.transition;

import cn.vertxup.workflow.domain.tables.pojos.WTicket;
import cn.vertxup.workflow.domain.tables.pojos.WTodo;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.workflow.atom.runtime.WTransition;

/**
 * @author lang : 2023-06-29
 */
class VmEmpty implements Vm {
    @Override
    public void generate(final WTodo generated, final WTodo wTask, final WTicket ticket) {

    }

    @Override
    public void end(final JsonObject normalized, final WTransition transition) {

    }
}
