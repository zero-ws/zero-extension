package io.zerows.extension.commerce.erp.osgi.spi.business;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.extension.commerce.erp.domain.tables.daos.ECompanyDao;
import io.zerows.extension.runtime.skeleton.osgi.spi.business.ExCompany;

/*
 * Get user information from database
 * Company Information
 */
public class ExCompanyEpic implements ExCompany {
    @Override
    public Future<JsonObject> fetchAsync(final String id) {
        return Ux.Jooq.on(ECompanyDao.class)
            .fetchByIdAsync(id)
            .compose(Ux::futureJ);
    }
}
