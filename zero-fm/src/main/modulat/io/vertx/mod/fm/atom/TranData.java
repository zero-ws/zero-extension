package io.vertx.mod.fm.atom;

import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lang : 2024-01-23
 */
public class TranData implements Serializable {
    private final List<FSettlement> settlements = new ArrayList<>();

    private final List<FDebt> debts = new ArrayList<>();

    public TranData settlement(final List<FSettlement> settlements) {
        this.debts.clear();
        this.settlements.clear();
        this.settlements.addAll(settlements);
        return this;
    }

    public TranData debt(final List<FDebt> debts) {
        this.debts.clear();
        this.settlements.clear();
        this.debts.addAll(debts);
        return this;
    }
}
