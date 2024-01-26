package io.vertx.mod.fm.uca.enter;

import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.mod.fm.cv.em.EmTran;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author lang : 2024-01-18
 */
class MakerTrans implements Maker<String, FTrans> {
    @Override
    public Future<FTrans> buildFastAsync(final JsonObject data) {
        String indent = Ut.valueString(data, KName.INDENT);
        if (Ut.isNil(indent)) {
            indent = FmCv.NUM.TRANS;
        }
        return this.buildAsync(data, indent);
    }

    @Override
    public Future<FTrans> buildAsync(final JsonObject data, final String indent) {
        /*
         * active, sigma, language
         * createdAt, createdBy
         * updatedAt, updatedBy
         * comment
         */
        final FTrans trans = Ux.fromJson(data, FTrans.class);


        /*
         * 关闭预付
         * amountPre = 0.0
         * prepay = false
         */
        trans.setAmountPre(BigDecimal.ZERO);
        trans.setPrepay(Boolean.FALSE);


        trans.setType(EmTran.Type.SETTLEMENT.name());
        trans.setStatus(EmTran.Status.FINISHED.name());

        return Ke.umIndent(trans, trans.getSigma(), indent, FTrans::setSerial).compose(generated -> {
            if (Objects.isNull(generated.getCode())) {
                generated.setCode(generated.getSerial());
            }
            return Ux.future(generated);
        });
    }
}
