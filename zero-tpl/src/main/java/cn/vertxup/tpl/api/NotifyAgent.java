package cn.vertxup.tpl.api;

import io.vertx.core.json.JsonObject;
import io.vertx.mod.tpl.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import jakarta.ws.rs.*;

/**
 * 保存当前设置，包括个人设置 / 以及角色设置
 * 现阶段主要针对提醒
 *
 * @author lang : 2024-04-02
 */
@EndPoint
@Path("/api")
public interface NotifyAgent {
    /**
     * 保存个人设置
     */
    @PUT
    @Path("/my/notify/:key")
    @Address(Addr.Notify.MY_FETCH)
    JsonObject saveNotify(@PathParam(KName.KEY) String user,
                          @BodyParam JsonObject data);

    /**
     * 读取个人设置
     */
    @GET
    @Path("/my/notify/:key")
    @Address(Addr.Notify.MY_SAVE)
    JsonObject fetchNotify(@PathParam(KName.KEY) String user);
}
