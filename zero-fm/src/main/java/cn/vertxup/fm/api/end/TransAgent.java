package cn.vertxup.fm.api.end;

import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

/**
 * 生命周期概述
 * <pre><code>
 *     1. 结算单
 *        现结：finished = true，其他：finished = false
 *     2. 结算明细
 *        不转应收：debtId = null, 转应收：debtId 有值
 *     3. 应收单类型
 *        应收：type = DEBT, 应退：type = REFUND
 *        已处理：finished = true, 未处理：finished = false
 *     4. 交易完成的单：finished = true
 *     5. 交易单类型
 *        直接结算：type = SETTLEMENT
 *        针对应收交易：type = DEBT
 *        针对应退交易：type = REFUND
 * </code></pre>
 *
 * @author lang : 2024-01-17
 */
@EndPoint
@Path("/api")
public interface TransAgent {

    /**
     * 直接结算专用接口
     * <pre><code>
     *     「结算周期」
     *     创建核心结算数据（可创建多张结算单）
     *     - 结算单 x N
     *     - 结算明细 x N
     *     「交易周期」
     *     创建结算单对应的交易信息
     *     - 交易关联 x N
     *     - 交易单 x 1
     *     - 交易明细（根据 payment 计算）
     * </code></pre>
     *
     * @param body 传入的数据
     *
     * @return 结算结果
     */
    @Path("/trans/direct")
    @POST
    @Address(Addr.Trans.START_DIRECT)
    JsonObject directAsync(@BodyParam JsonObject body);

    /**
     * 延迟结算专用接口（纯结算创建）
     * <pre><code>
     *     「结算周期」
     *     此接口作为延迟结算的主要接口，用于创建
     *     - 结算单 x N
     *     - 结算明细 x N
     *     由于使用了延迟结算，所以此处结算之后仅创建上述结算单、结算明细即可，不再执行后续操作
     * </code></pre>
     *
     * @param body 传入的数据
     *
     * @return 结算结果
     */
    @Path("/trans/delay")
    @POST
    @Address(Addr.Trans.START_DELAY)
    JsonObject delayAsync(@BodyParam JsonObject body);

    /**
     * 交易专用接口（纯交易更新）
     * <pre><code>
     *     「交易周期」
     *     1. 单结算单交易：结算单 x 1
     *        跨结算单交易：结算单 x N
     *     2. 单应收单交易：应收单 x 1
     *        跨应收单交易：应收单 x N
     *     3. 单应退单交易：应退单 x 1
     *        跨应退单交易：应退单 x N
     *     4. 应收/应退混合交易：应退 x N，应收 x N
     * </code></pre>
     *
     * @param body 传入的数据
     *
     * @return 交易结果
     */
    @Path("/trans-end/finish")
    @PUT
    @Address(Addr.Trans.END_TRANS)
    JsonObject endTrans(@BodyParam JsonObject body);

    /**
     * 应收处理接口
     * <pre><code>
     *     「交易周期」
     *     1. 单应收单交易：应收单 x 1
     *        跨应收单交易：应收单 x N
     *     2. 单应退单交易：应退单 x 1
     *        跨应退单交易：应退单 x N
     *     3. 应收/应退混合交易：应退 x N，应收 x N
     * </code></pre>
     *
     * @param body 传入的数据
     *
     * @return 交易结果
     */
    @Path("/trans-end/debt")
    @PUT
    @Address(Addr.Trans.END_DEBT)
    JsonObject endDebt(@BodyParam JsonObject body);

    /**
     * 直接转应收
     * <pre><code>
     *     「结算周期」
     *     此接口作为延迟结算的主要接口，用于创建
     *     - 结算单 x N
     *     - 结算明细 x N
     *     「应收周期」只创建不处理
     *     - 应收单 / 应退单据计算 x N
     * </code></pre>
     *
     * @param body 传入的数据
     *
     * @return 结算结果
     */
    @Path("/trans/debt")
    @POST
    @Address(Addr.Trans.START_DEBT)
    JsonObject debtAsync(@BodyParam JsonObject body);
}
