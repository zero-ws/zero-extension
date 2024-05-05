package io.zerows.extension.commerce.erp.osgi.spi.dict;

import io.horizon.atom.datamation.KDictSource;
import io.vertx.core.Future;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonArray;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.cloud.zdk.spi.DictionaryPlugin;
import io.zerows.extension.commerce.erp.domain.tables.daos.ECompanyDao;

/*
 * Dict for `resource.companys` here
 */
public class CompanyDict implements DictionaryPlugin {

    @Override
    public Future<JsonArray> fetchAsync(final KDictSource source,
                                        final MultiMap paramMap) {
        final String sigma = paramMap.get(KName.SIGMA);
        if (Ut.isNotNil(sigma)) {
            return Ux.Jooq.on(ECompanyDao.class)
                .fetchAsync(KName.SIGMA, sigma)
                .compose(Ux::futureA);
        } else {
            return Ux.future(new JsonArray());
        }
    }
}
