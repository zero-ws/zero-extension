package io.vertx.mod.fm.uca.replica;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.up.util.Ut;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lang : 2024-01-24
 */
public class Settlement2Trans implements IkWay<List<FSettlement>, FTrans> {
    @Override
    public void transfer(final List<FSettlement> settlements, final FTrans trans) {
        /*
         * 金额计算
         */
        BigDecimal sum = new BigDecimal(0);
        final List<String> nameList = new ArrayList<>();
        for (final FSettlement settlement : settlements) {
            if (Objects.nonNull(settlement.getAmount())) {
                sum = sum.add(settlement.getAmount());
                nameList.add(settlement.getCode());
            }
        }
        trans.setAmount(sum);
        trans.setName("ST:" + Ut.fromJoin(nameList));
    }
}
