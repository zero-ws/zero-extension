/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.psi.domain;


import io.zerows.extension.commerce.psi.domain.tables.*;
import io.zerows.extension.commerce.psi.domain.tables.records.*;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in ZDB.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PAmountSpecRecord> KEY_P_AMOUNT_SPEC_PRIMARY = Internal.createUniqueKey(PAmountSpec.P_AMOUNT_SPEC, DSL.name("KEY_P_AMOUNT_SPEC_PRIMARY"), new TableField[]{PAmountSpec.P_AMOUNT_SPEC.KEY}, true);
    public static final UniqueKey<PAmountSpecRecord> KEY_P_AMOUNT_SPEC_SERIAL = Internal.createUniqueKey(PAmountSpec.P_AMOUNT_SPEC, DSL.name("KEY_P_AMOUNT_SPEC_SERIAL"), new TableField[]{PAmountSpec.P_AMOUNT_SPEC.SERIAL, PAmountSpec.P_AMOUNT_SPEC.SIGMA}, true);
    public static final UniqueKey<PBuyItemRecord> KEY_P_BUY_ITEM_PRIMARY = Internal.createUniqueKey(PBuyItem.P_BUY_ITEM, DSL.name("KEY_P_BUY_ITEM_PRIMARY"), new TableField[]{PBuyItem.P_BUY_ITEM.KEY}, true);
    public static final UniqueKey<PBuyItemRecord> KEY_P_BUY_ITEM_SERIAL = Internal.createUniqueKey(PBuyItem.P_BUY_ITEM, DSL.name("KEY_P_BUY_ITEM_SERIAL"), new TableField[]{PBuyItem.P_BUY_ITEM.SERIAL, PBuyItem.P_BUY_ITEM.SIGMA}, true);
    public static final UniqueKey<PBuyOrderRecord> KEY_P_BUY_ORDER_PRIMARY = Internal.createUniqueKey(PBuyOrder.P_BUY_ORDER, DSL.name("KEY_P_BUY_ORDER_PRIMARY"), new TableField[]{PBuyOrder.P_BUY_ORDER.KEY}, true);
    public static final UniqueKey<PBuyOrderRecord> KEY_P_BUY_ORDER_SERIAL = Internal.createUniqueKey(PBuyOrder.P_BUY_ORDER, DSL.name("KEY_P_BUY_ORDER_SERIAL"), new TableField[]{PBuyOrder.P_BUY_ORDER.SERIAL, PBuyOrder.P_BUY_ORDER.SIGMA}, true);
    public static final UniqueKey<PBuyTicketRecord> KEY_P_BUY_TICKET_PRIMARY = Internal.createUniqueKey(PBuyTicket.P_BUY_TICKET, DSL.name("KEY_P_BUY_TICKET_PRIMARY"), new TableField[]{PBuyTicket.P_BUY_TICKET.KEY}, true);
    public static final UniqueKey<PBuyTicketRecord> KEY_P_BUY_TICKET_SERIAL = Internal.createUniqueKey(PBuyTicket.P_BUY_TICKET, DSL.name("KEY_P_BUY_TICKET_SERIAL"), new TableField[]{PBuyTicket.P_BUY_TICKET.SERIAL, PBuyTicket.P_BUY_TICKET.SIGMA}, true);
    public static final UniqueKey<PCommodityRecord> KEY_P_COMMODITY_CODE = Internal.createUniqueKey(PCommodity.P_COMMODITY, DSL.name("KEY_P_COMMODITY_CODE"), new TableField[]{PCommodity.P_COMMODITY.CODE, PCommodity.P_COMMODITY.SIGMA}, true);
    public static final UniqueKey<PCommodityRecord> KEY_P_COMMODITY_PRIMARY = Internal.createUniqueKey(PCommodity.P_COMMODITY, DSL.name("KEY_P_COMMODITY_PRIMARY"), new TableField[]{PCommodity.P_COMMODITY.KEY}, true);
    public static final UniqueKey<PCommodityHisRecord> KEY_P_COMMODITY_HIS_CODE = Internal.createUniqueKey(PCommodityHis.P_COMMODITY_HIS, DSL.name("KEY_P_COMMODITY_HIS_CODE"), new TableField[]{PCommodityHis.P_COMMODITY_HIS.CODE, PCommodityHis.P_COMMODITY_HIS.SIGMA}, true);
    public static final UniqueKey<PCommodityHisRecord> KEY_P_COMMODITY_HIS_PRIMARY = Internal.createUniqueKey(PCommodityHis.P_COMMODITY_HIS, DSL.name("KEY_P_COMMODITY_HIS_PRIMARY"), new TableField[]{PCommodityHis.P_COMMODITY_HIS.KEY}, true);
    public static final UniqueKey<PInItemRecord> KEY_P_IN_ITEM_PRIMARY = Internal.createUniqueKey(PInItem.P_IN_ITEM, DSL.name("KEY_P_IN_ITEM_PRIMARY"), new TableField[]{PInItem.P_IN_ITEM.KEY}, true);
    public static final UniqueKey<PInItemRecord> KEY_P_IN_ITEM_SERIAL = Internal.createUniqueKey(PInItem.P_IN_ITEM, DSL.name("KEY_P_IN_ITEM_SERIAL"), new TableField[]{PInItem.P_IN_ITEM.SERIAL, PInItem.P_IN_ITEM.SIGMA}, true);
    public static final UniqueKey<PInTicketRecord> KEY_P_IN_TICKET_PRIMARY = Internal.createUniqueKey(PInTicket.P_IN_TICKET, DSL.name("KEY_P_IN_TICKET_PRIMARY"), new TableField[]{PInTicket.P_IN_TICKET.KEY}, true);
    public static final UniqueKey<PInTicketRecord> KEY_P_IN_TICKET_SERIAL = Internal.createUniqueKey(PInTicket.P_IN_TICKET, DSL.name("KEY_P_IN_TICKET_SERIAL"), new TableField[]{PInTicket.P_IN_TICKET.SERIAL, PInTicket.P_IN_TICKET.SIGMA}, true);
    public static final UniqueKey<POutItemRecord> KEY_P_OUT_ITEM_PRIMARY = Internal.createUniqueKey(POutItem.P_OUT_ITEM, DSL.name("KEY_P_OUT_ITEM_PRIMARY"), new TableField[]{POutItem.P_OUT_ITEM.KEY}, true);
    public static final UniqueKey<POutItemRecord> KEY_P_OUT_ITEM_SERIAL = Internal.createUniqueKey(POutItem.P_OUT_ITEM, DSL.name("KEY_P_OUT_ITEM_SERIAL"), new TableField[]{POutItem.P_OUT_ITEM.SERIAL, POutItem.P_OUT_ITEM.SIGMA}, true);
    public static final UniqueKey<POutTicketRecord> KEY_P_OUT_TICKET_PRIMARY = Internal.createUniqueKey(POutTicket.P_OUT_TICKET, DSL.name("KEY_P_OUT_TICKET_PRIMARY"), new TableField[]{POutTicket.P_OUT_TICKET.KEY}, true);
    public static final UniqueKey<POutTicketRecord> KEY_P_OUT_TICKET_SERIAL = Internal.createUniqueKey(POutTicket.P_OUT_TICKET, DSL.name("KEY_P_OUT_TICKET_SERIAL"), new TableField[]{POutTicket.P_OUT_TICKET.SERIAL, POutTicket.P_OUT_TICKET.SIGMA}, true);
    public static final UniqueKey<PPosRecord> KEY_P_POS_CODE = Internal.createUniqueKey(PPos.P_POS, DSL.name("KEY_P_POS_CODE"), new TableField[]{PPos.P_POS.CODE, PPos.P_POS.SIGMA, PPos.P_POS.WH_ID}, true);
    public static final UniqueKey<PPosRecord> KEY_P_POS_PRIMARY = Internal.createUniqueKey(PPos.P_POS, DSL.name("KEY_P_POS_PRIMARY"), new TableField[]{PPos.P_POS.KEY}, true);
    public static final UniqueKey<PWhRecord> KEY_P_WH_CODE = Internal.createUniqueKey(PWh.P_WH, DSL.name("KEY_P_WH_CODE"), new TableField[]{PWh.P_WH.CODE, PWh.P_WH.SIGMA}, true);
    public static final UniqueKey<PWhRecord> KEY_P_WH_PRIMARY = Internal.createUniqueKey(PWh.P_WH, DSL.name("KEY_P_WH_PRIMARY"), new TableField[]{PWh.P_WH.KEY}, true);
}