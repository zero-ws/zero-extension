package io.mature.extension.migration.restore;

import io.horizon.eon.em.Environment;
import io.mature.extension.migration.tookit.AbstractStatic;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.extension.commerce.erp.domain.tables.daos.*;

public class RestoreOrg extends AbstractStatic {
    public RestoreOrg(final Environment environment) {
        super(environment);
    }

    @Override
    public Future<JsonObject> procAsync(final JsonObject config) {
        this.banner("003.1 组织架构数据还原");
        final String folder = "org";
        return Ux.future(config)
            /* ECompany */
            .compose(this.restoreT(ECompanyDao.class, folder)::procAsync)
            /* EDept */
            .compose(this.restoreT(EDeptDao.class, folder)::procAsync)
            /* ETeam */
            .compose(this.restoreT(ETeamDao.class, folder)::procAsync)
            /* ECustomer */
            .compose(this.restoreT(ECustomerDao.class, folder)::procAsync)
            /* EIdentity */
            .compose(this.restoreT(EIdentityDao.class, folder)::procAsync)
            /* Employee */
            .compose(this.restoreT(EEmployeeDao.class, folder)::procAsync)
            .compose(nil -> Ux.future(config));
    }
}
