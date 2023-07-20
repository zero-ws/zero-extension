/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain;


import cn.vertxup.fm.domain.tables.FBill;
import cn.vertxup.fm.domain.tables.FBillItem;
import cn.vertxup.fm.domain.tables.FBook;
import cn.vertxup.fm.domain.tables.FInvoice;
import cn.vertxup.fm.domain.tables.FPaymentItem;
import cn.vertxup.fm.domain.tables.FPreAuthorize;
import cn.vertxup.fm.domain.tables.FSettlement;
import cn.vertxup.fm.domain.tables.FSettlementItem;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in ZDB.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index F_BILL_IDX_F_BILL_BOOK_ID = Internal.createIndex(DSL.name("IDX_F_BILL_BOOK_ID"), FBill.F_BILL, new OrderField[] { FBill.F_BILL.BOOK_ID }, false);
    public static final Index F_BILL_ITEM_IDX_F_BILL_ITEM_BILL_ID = Internal.createIndex(DSL.name("IDX_F_BILL_ITEM_BILL_ID"), FBillItem.F_BILL_ITEM, new OrderField[] { FBillItem.F_BILL_ITEM.BILL_ID }, false);
    public static final Index F_BILL_ITEM_IDX_F_BILL_ITEM_SETTLEMENT_ID = Internal.createIndex(DSL.name("IDX_F_BILL_ITEM_SETTLEMENT_ID"), FBillItem.F_BILL_ITEM, new OrderField[] { FBillItem.F_BILL_ITEM.SETTLEMENT_ID }, false);
    public static final Index F_BILL_IDX_F_BILL_ORDER_ID = Internal.createIndex(DSL.name("IDX_F_BILL_ORDER_ID"), FBill.F_BILL, new OrderField[] { FBill.F_BILL.ORDER_ID }, false);
    public static final Index F_BOOK_IDX_F_BOOK_ORDER_ID = Internal.createIndex(DSL.name("IDX_F_BOOK_ORDER_ID"), FBook.F_BOOK, new OrderField[] { FBook.F_BOOK.ORDER_ID }, false);
    public static final Index F_INVOICE_IDX_F_INVOICE_ORDER_ID = Internal.createIndex(DSL.name("IDX_F_INVOICE_ORDER_ID"), FInvoice.F_INVOICE, new OrderField[] { FInvoice.F_INVOICE.ORDER_ID }, false);
    public static final Index F_PAYMENT_ITEM_IDX_F_PAYMENT_ITEM_PAYMENT_ID = Internal.createIndex(DSL.name("IDX_F_PAYMENT_ITEM_PAYMENT_ID"), FPaymentItem.F_PAYMENT_ITEM, new OrderField[] { FPaymentItem.F_PAYMENT_ITEM.PAYMENT_ID }, false);
    public static final Index F_PAYMENT_ITEM_IDX_F_PAYMENT_ITEM_SETTLEMENT_ID = Internal.createIndex(DSL.name("IDX_F_PAYMENT_ITEM_SETTLEMENT_ID"), FPaymentItem.F_PAYMENT_ITEM, new OrderField[] { FPaymentItem.F_PAYMENT_ITEM.SETTLEMENT_ID }, false);
    public static final Index F_PRE_AUTHORIZE_IDX_F_PRE_AUTHORIZE_BOOK_ID = Internal.createIndex(DSL.name("IDX_F_PRE_AUTHORIZE_BOOK_ID"), FPreAuthorize.F_PRE_AUTHORIZE, new OrderField[] { FPreAuthorize.F_PRE_AUTHORIZE.BOOK_ID }, false);
    public static final Index F_PRE_AUTHORIZE_IDX_F_PRE_AUTHORIZE_ORDER_ID = Internal.createIndex(DSL.name("IDX_F_PRE_AUTHORIZE_ORDER_ID"), FPreAuthorize.F_PRE_AUTHORIZE, new OrderField[] { FPreAuthorize.F_PRE_AUTHORIZE.ORDER_ID }, false);
    public static final Index F_SETTLEMENT_IDX_F_SETTLEMENT_CUSTOMER_ID = Internal.createIndex(DSL.name("IDX_F_SETTLEMENT_CUSTOMER_ID"), FSettlement.F_SETTLEMENT, new OrderField[] { FSettlement.F_SETTLEMENT.CUSTOMER_ID }, false);
    public static final Index F_SETTLEMENT_ITEM_IDX_F_SETTLEMENT_ITEM_DEBT_ID = Internal.createIndex(DSL.name("IDX_F_SETTLEMENT_ITEM_DEBT_ID"), FSettlementItem.F_SETTLEMENT_ITEM, new OrderField[] { FSettlementItem.F_SETTLEMENT_ITEM.DEBT_ID }, false);
    public static final Index F_SETTLEMENT_ITEM_IDX_F_SETTLEMENT_ITEM_SETTLEMENT_ID = Internal.createIndex(DSL.name("IDX_F_SETTLEMENT_ITEM_SETTLEMENT_ID"), FSettlementItem.F_SETTLEMENT_ITEM, new OrderField[] { FSettlementItem.F_SETTLEMENT_ITEM.SETTLEMENT_ID }, false);
}
