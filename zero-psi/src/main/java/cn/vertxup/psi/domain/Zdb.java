/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain;


import cn.vertxup.psi.domain.tables.*;
import io.zerows.extension.runtime.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Zdb extends SchemaImpl {

    /**
     * The reference instance of <code>ZDB</code>
     */
    public static final Zdb ZDB = new Zdb();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>ZDB.P_AMOUNT_SPEC</code>.
     */
    public final PAmountSpec P_AMOUNT_SPEC = PAmountSpec.P_AMOUNT_SPEC;

    /**
     * The table <code>ZDB.P_BUY_ITEM</code>.
     */
    public final PBuyItem P_BUY_ITEM = PBuyItem.P_BUY_ITEM;

    /**
     * The table <code>ZDB.P_BUY_ORDER</code>.
     */
    public final PBuyOrder P_BUY_ORDER = PBuyOrder.P_BUY_ORDER;

    /**
     * The table <code>ZDB.P_BUY_TICKET</code>.
     */
    public final PBuyTicket P_BUY_TICKET = PBuyTicket.P_BUY_TICKET;

    /**
     * The table <code>ZDB.P_COMMODITY</code>.
     */
    public final PCommodity P_COMMODITY = PCommodity.P_COMMODITY;

    /**
     * The table <code>ZDB.P_COMMODITY_HIS</code>.
     */
    public final PCommodityHis P_COMMODITY_HIS = PCommodityHis.P_COMMODITY_HIS;

    /**
     * The table <code>ZDB.P_IN_ITEM</code>.
     */
    public final PInItem P_IN_ITEM = PInItem.P_IN_ITEM;

    /**
     * The table <code>ZDB.P_IN_TICKET</code>.
     */
    public final PInTicket P_IN_TICKET = PInTicket.P_IN_TICKET;

    /**
     * The table <code>ZDB.P_OUT_ITEM</code>.
     */
    public final POutItem P_OUT_ITEM = POutItem.P_OUT_ITEM;

    /**
     * The table <code>ZDB.P_OUT_TICKET</code>.
     */
    public final POutTicket P_OUT_TICKET = POutTicket.P_OUT_TICKET;

    /**
     * The table <code>ZDB.P_POS</code>.
     */
    public final PPos P_POS = PPos.P_POS;

    /**
     * The table <code>ZDB.P_WH</code>.
     */
    public final PWh P_WH = PWh.P_WH;

    /**
     * No further instances allowed
     */
    private Zdb() {
        super(Ke.getDatabase(), null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            PAmountSpec.P_AMOUNT_SPEC,
            PBuyItem.P_BUY_ITEM,
            PBuyOrder.P_BUY_ORDER,
            PBuyTicket.P_BUY_TICKET,
            PCommodity.P_COMMODITY,
            PCommodityHis.P_COMMODITY_HIS,
            PInItem.P_IN_ITEM,
            PInTicket.P_IN_TICKET,
            POutItem.P_OUT_ITEM,
            POutTicket.P_OUT_TICKET,
            PPos.P_POS,
            PWh.P_WH
        );
    }
}
