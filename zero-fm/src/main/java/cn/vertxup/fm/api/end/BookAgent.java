package cn.vertxup.fm.api.end;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.zerows.core.web.io.annotations.BodyParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@EndPoint
@Path("/api")
public interface BookAgent {

    /*
     * Saving the book information when settlement on book information
     * - checked
     * - checkedDesc
     * - exceed
     * - exceedDesc
     */
    @PUT
    @Path("/settle/book/finalize")
    @Address(Addr.Settle.UP_BOOK)
    JsonObject finalizeBook(@BodyParam JsonArray books);
}
