package io.zerows.extension.commerce.erp.osgi.spi.feature;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.commerce.erp.domain.tables.daos.EDeptDao;
import io.zerows.extension.runtime.skeleton.osgi.spi.phantom.AbstractArbor;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class DepartmentArbor extends AbstractArbor {
    @Override
    public Future<JsonArray> generate(final JsonObject category, final JsonObject configuration) {
        return Ux.Jooq.on(EDeptDao.class)
            .fetchJAsync(KName.SIGMA, category.getValue(KName.SIGMA))
            .compose(children -> {
                Ut.itJArray(children).forEach(json -> json.put(KName.PARENT_ID, json.getValue("deptId")));
                return Ux.future(children);
            })
            .compose(children -> this.combineArbor(category, children, configuration));
    }
}
