package cn.vertxup.fm.api.end;

import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import jakarta.ws.rs.*;

/**
 * @author lang : 2024-02-20
 */
@EndPoint
@Path("/api")
public interface TransAgent {

    @Path("/trans-proc/standard")
    @PUT
    @Address(Addr.Trans.END_TRANS)
    JsonObject finishAsync(@BodyParam JsonObject body);

    @Path("/trans-proc/debt")
    @PUT
    @Address(Addr.Trans.END_DEBT)
    JsonObject debtAsync(@BodyParam JsonObject body);

    /**
     * 使用 Transaction 的 key 来查询本次交易信息，交易信息中主要包含以下几部分内容
     * <pre><code>
     *     {
     *         "debts": [本次交易关联的应收/应退单],
     *         "settlements": [本次交易关联的结算单],
     *         "items": [本次交易关联的结算明细],
     *         "payment": [本次交易关联的支付信息，交易的明细],
     *         "...": "...交易单的信息"
     *     }
     * </code></pre>
     * 此处的 items 到前端去计算，由于 items 和 结算单 和 应收/应退 单据是同时相关联的，所以此处不放到
     * 单独的结算单、应收/应退单中，而是独立在上层节点上，前端可直接计算，产生最终的交易单的主体内容。
     *
     * @param key 交易的唯一标识
     *
     * @return 交易信息
     */
    @Path("/trans/:key")
    @GET
    @Address(Addr.Trans.FETCH_BY_KEY)
    JsonObject fetchAsync(@PathParam(KName.KEY) String key);
}
