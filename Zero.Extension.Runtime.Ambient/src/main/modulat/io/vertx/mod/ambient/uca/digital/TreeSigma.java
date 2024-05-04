package io.vertx.mod.ambient.uca.digital;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.ambient.domain.tables.daos.XCategoryDao;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TreeSigma extends AbstractTree {
    @Override
    public Future<JsonArray> fetch(final String field, final JsonArray types) {
        return this.fetchTree(this.condSigma(field, types, null));
    }

    @Override
    public Future<JsonObject> fetch(final String field, final String type, final String code) {
        return Ux.Jooq.on(XCategoryDao.class)
            .fetchOneAsync(this.condSigma(field, type, code))
            .compose(Ux::futureJ).compose(Fn.ofJObject(KName.METADATA));
    }

    @Override
    public Future<JsonArray> fetch(final String field, final String type, final Boolean leaf) {
        return this.fetchTree(this.condSigma(field, type, null, leaf));
    }
}
