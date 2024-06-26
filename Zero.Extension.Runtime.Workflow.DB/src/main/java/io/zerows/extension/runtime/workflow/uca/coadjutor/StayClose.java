package io.zerows.extension.runtime.workflow.uca.coadjutor;

import io.zerows.extension.runtime.workflow.eon.em.TodoStatus;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.workflow.atom.runtime.WRecord;
import io.zerows.extension.runtime.workflow.atom.runtime.WRequest;
import io.zerows.extension.runtime.workflow.atom.runtime.WTransition;
import io.zerows.extension.runtime.workflow.uca.camunda.Io;
import io.zerows.extension.runtime.workflow.uca.camunda.RunOn;
import io.zerows.extension.runtime.workflow.uca.central.AbstractMovement;
import io.zerows.extension.runtime.workflow.uca.toolkit.URequest;
import io.vertx.up.unity.Ux;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class StayClose extends AbstractMovement implements Stay {
    @Override
    public Future<WRecord> keepAsync(final WRequest request, final WTransition wTransition) {
        /*
         * Instance deleting, but fetch the history and stored into `metadata` field as the final processing
         * Cancel for W_TODO and Camunda
         */
        final ProcessInstance instance = wTransition.instance();
        final Io<Set<String>> ioHistory = Io.ioHistory();
        return ioHistory.run(instance).compose(historySet -> {
            // Cancel data processing
            final JsonObject todoData = URequest.closeJ(request.request(), wTransition, historySet);
            return this.updateAsync(todoData, wTransition);
        }).compose(record -> {
            // Remove ProcessDefinition
            final RunOn runOn = RunOn.get();
            return runOn.stopAsync(TodoStatus.FINISHED, wTransition)
                .compose(removed -> Ux.future(record));
        }).compose(record -> this.afterAsync(record, wTransition));
    }
}
