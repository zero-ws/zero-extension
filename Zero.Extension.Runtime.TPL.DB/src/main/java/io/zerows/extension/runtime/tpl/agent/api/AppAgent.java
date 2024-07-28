package io.zerows.extension.runtime.tpl.agent.api;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.zerows.core.web.io.annotations.BodyParam;
import io.zerows.extension.runtime.tpl.eon.Addr;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * 个人应用接口相关配置，对应 ExApps 应用组件（新版），个人应用设置处理
 * <pre><code>
 *     1. 一对一关系：
 *        X_APP -> entry
 *        X_MENU -> name
 *        B_BAG -> entryId
 *        上述三者依靠对应字段关联到一起，所以最终会导致 appId / bagId 产生关联即可，作为 MY_APP 设置的第一级
 *     2. 当前账号的个人主键 S_USER -> key
 *     3. 穿透关联，所有设置都会用到
 *        个人设置：ownerType = USER AND owner = S_USER.key
 *        角色设置：ownerType = ROLE AND owner = S_ROLE.key
 *     4. 租户信息计算：S_USER.key -> S_USER.sigma -> S_TENANT.key
 * </code></pre>
 *
 * @author lang : 2024-07-28
 */
@EndPoint
@Path("/api")
public interface AppAgent {
    /**
     * 个人应用列表
     * <pre><code>
     *     {
     *         "page": "??",
     *         "position": "??"
     *     }
     * </code></pre>
     *
     * @param body 请求数据
     *
     * @return 当前用户绑定的应用列表
     */
    @POST
    @Path("/my/app/fetch")
    @Address(Addr.App.MY_FETCH)
    JsonArray fetchMy(@BodyParam JsonObject body);
}
