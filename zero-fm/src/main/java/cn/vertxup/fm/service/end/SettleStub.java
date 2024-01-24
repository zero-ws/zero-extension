package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.em.EmPay;

import java.util.List;

/**
 * 结算步骤
 *
 * @author lang : 2024-01-23
 */
public interface SettleStub {
    Future<FSettlement> createAsync(JsonObject body, EmPay.Type type);

    /**
     * 「保留方法」
     * <pre><code>
     * 保留接口，现阶段批量结算的创建是不会出现的，只会出现单量结算功能，结算批量只有在更新过程
     * 中才会出现，简单说就是结算管理的时候多选才会出现批量结算的处理功能，而此处处理时，结算单
     * 以及结算明细都已经创建完成，只需要处理后续步骤即可。
     * </code></pre>
     */
    Future<List<FSettlement>> createAsync(JsonArray body, EmPay.Type type);
}
