package cn.vertxup.ambient.api.application;

import cn.vertxup.ambient.service.application.AppStub;
import cn.vertxup.ambient.service.application.MenuStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ambient.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.core.domain.atom.commune.XHeader;
import io.zerows.core.feature.database.atom.Database;
import io.zerows.core.feature.database.jooq.operation.UxJooq;
import io.zerows.extension.runtime.ambient.domain.tables.daos.XNoticeDao;
import io.zerows.extension.runtime.ambient.domain.tables.pojos.XNotice;
import jakarta.inject.Inject;

import java.time.Instant;
import java.util.function.Function;

@Queue
public class AppActor {

    @Inject
    private transient AppStub appStub;

    @Inject
    private transient MenuStub menuStub;

    @Address(Addr.App.BY_NAME)
    public Future<JsonObject> byName(final String name) {
        return this.appStub.fetchByName(name);
    }

    @Address(Addr.App.BY_ID)
    public Future<JsonObject> byId(final String appId, final XHeader header) {
        return this.appStub.fetchById(appId);
    }

    @Address(Addr.Menu.BY_APP_ID)
    public Future<JsonArray> fetchMenus(final String appId) {
        return this.menuStub.fetchByApp(appId);
    }

    @Address(Addr.App.UP_BY_ID)
    public Future<JsonObject> updateBy(final String appId, final JsonObject data) {
        return this.appStub.updateBy(appId, data);
    }


    /*
     * Fetch all datasource
     * {
     *      "database": "",
     *      "history": "",
     *      "workflow": "",
     *      "argument": ""
     * }
     */
    @Address(Addr.Init.SOURCE)
    public Future<JsonObject> database(final String appId) {
        return this.appStub.fetchSource(appId).compose(atom -> {
            /*
             * 一个动态库
             */
            final Function<JsonObject, JsonObject> consumer = json -> {
                json.remove(KName.PASSWORD);
                json.remove(KName.USERNAME);
                return json;
            };
            /*
             * 三个静态库
             */
            final Database current = Database.getCurrent();
            final Database orbit = Database.getHistory();
            final Database workflow = Database.getCamunda();
            final JsonObject response = new JsonObject();
            response.put("database", consumer.apply(current.toJson()));
            response.put("history", consumer.apply(orbit.toJson()));
            response.put("workflow", consumer.apply(workflow.toJson()));
            response.put("argument", consumer.apply(atom));
            return Ux.future(response);
        });
    }

    /*
     * New interface for expired notices updating
     */
    @Address(Addr.Init.NOTICE)
    public Future<JsonArray> notice(final String appId, final JsonObject criteria) {
        // ExpiredAt Updating first
        final JsonObject expiredQr = Ux.whereAnd();
        expiredQr.put("expiredAt,<", Instant.now());
        expiredQr.put(KName.APP_ID, appId);
        final UxJooq jq = Ux.Jooq.on(XNoticeDao.class);
        return jq.<XNotice>fetchAsync(expiredQr).compose(notices -> {
            // Turn Off the expired notices
            notices.forEach(notice -> notice.setStatus("FINISHED"));
            return jq.updateAsync(notices);
        }).compose(nil -> {
            // Query again
            final JsonObject dashboardQr = Ux.whereAnd();
            dashboardQr.put(KName.APP_ID, appId);
            dashboardQr.put("$IN$", criteria);
            return jq.fetchJAsync(dashboardQr);
        });
    }
}
