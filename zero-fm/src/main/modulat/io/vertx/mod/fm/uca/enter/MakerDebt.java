package io.vertx.mod.fm.uca.enter;

import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.mod.fm.cv.em.EmDebt;
import io.vertx.mod.fm.uca.replica.IkWay;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.unity.Ux;

import java.util.List;

/**
 * @author lang : 2024-01-22
 */
class MakerDebt implements Maker<List<FSettlementItem>, FDebt> {
    @Override
    public Future<FDebt> buildAsync(final JsonObject data, final List<FSettlementItem> items) {

        final FDebt debt = Ux.fromJson(data, FDebt.class);
        // UCA，此处要内部调用，因为这里会牵涉到类型的判断
        IkWay.ofSI2D().transfer(items, debt);

        final String type = debt.getType();
        final String indent = EmDebt.Type.DEBT.name().equals(type) ? FmCv.NUM.DEBT : FmCv.NUM.REFUND;

        return Ke.umIndent(debt, debt.getSigma(), indent, FDebt::setSerial).compose(generated -> {
            if (null == generated.getCode()) {
                generated.setCode(generated.getSerial());
            }
            return Ux.future(generated);
        });
    }
}
