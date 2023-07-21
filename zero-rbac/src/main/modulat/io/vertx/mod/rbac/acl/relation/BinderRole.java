package io.vertx.mod.rbac.acl.relation;

import cn.vertxup.rbac.domain.tables.daos.RUserRoleDao;
import cn.vertxup.rbac.domain.tables.daos.SRoleDao;
import cn.vertxup.rbac.domain.tables.pojos.RUserRole;
import cn.vertxup.rbac.domain.tables.pojos.SPacket;
import cn.vertxup.rbac.domain.tables.pojos.SRole;
import cn.vertxup.rbac.domain.tables.pojos.SUser;
import io.horizon.eon.VString;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.rbac.cv.AuthKey;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static io.vertx.mod.rbac.refine.Sc.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BinderRole extends AbstractBind<SRole> {

    BinderRole(final String sigma) {
        super(sigma);
    }

    @Override
    public Future<JsonArray> bindAsync(final List<SUser> users, final JsonArray inputData) {
        if (users.isEmpty()) {
            return Ux.futureA();
        }
        // fix issue: https://e.gitee.com/wei-code/issues/table?issue=I7MRXK
        final List<SUser> deleteUser = new ArrayList<>();
        users.forEach(user -> {
            Ut.itJArray(inputData).forEach(input -> {
                final String roles = input.getString(KName.ROLES);
                final String userName = input.getString(KName.USERNAME);
                if(Ut.isNotNil(roles) && userName.equals(user.getUsername())){
                    deleteUser.add(user);
                }
            });
        });
        return this.purgeAsync(deleteUser, RUserRoleDao.class, AuthKey.F_USER_ID)
            .compose(nil -> this.mapAsync(inputData, SRoleDao.class, KName.ROLES))
            .compose(roleMap -> {
                /*
                 * Build for each user
                 */
                final List<RUserRole> relationList = new ArrayList<>();
                users.forEach(user -> {
                    final List<SRole> roles = roleMap.getOrDefault(user.getUsername(), new ArrayList<>());
                    Ut.itList(roles, (role, index) -> {
                        final RUserRole relation = new RUserRole();
                        relation.setRoleId(role.getKey());
                        relation.setUserId(user.getKey());
                        relation.setPriority(index);
                        relationList.add(relation);
                    });
                    /*
                     * Building relation ship
                     */
                    LOG.Web.info(this.getClass(), "Will build username = {1}, role size = {0}",
                        String.valueOf(roles.size()), user.getUsername());
                });
                return Ux.future(relationList);
            })
            .compose(Ux.Jooq.on(RUserRoleDao.class)::insertAsync)
            .compose(nil -> Ux.futureA(users));
    }

    @Override
    protected Function<SRole, String> keyFn() {
        return SRole::getKey;
    }

    @Override
    protected Function<SRole, String> valueFn() {
        return SRole::getName;
    }
}
