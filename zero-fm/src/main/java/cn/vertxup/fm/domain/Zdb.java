/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain;


import cn.vertxup.fm.domain.tables.*;
import io.zerows.extension.runtime.skeleton.refine.Ke;
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
     * The table <code>ZDB.F_BANK</code>.
     */
    public final FBank F_BANK = FBank.F_BANK;

    /**
     * The table <code>ZDB.F_BILL</code>.
     */
    public final FBill F_BILL = FBill.F_BILL;

    /**
     * The table <code>ZDB.F_BILL_ITEM</code>.
     */
    public final FBillItem F_BILL_ITEM = FBillItem.F_BILL_ITEM;

    /**
     * The table <code>ZDB.F_BOOK</code>.
     */
    public final FBook F_BOOK = FBook.F_BOOK;

    /**
     * The table <code>ZDB.F_CURRENCY</code>.
     */
    public final FCurrency F_CURRENCY = FCurrency.F_CURRENCY;

    /**
     * The table <code>ZDB.F_DEBT</code>.
     */
    public final FDebt F_DEBT = FDebt.F_DEBT;

    /**
     * The table <code>ZDB.F_INVOICE</code>.
     */
    public final FInvoice F_INVOICE = FInvoice.F_INVOICE;

    /**
     * The table <code>ZDB.F_PAY_TERM</code>.
     */
    public final FPayTerm F_PAY_TERM = FPayTerm.F_PAY_TERM;

    /**
     * The table <code>ZDB.F_PRE_AUTHORIZE</code>.
     */
    public final FPreAuthorize F_PRE_AUTHORIZE = FPreAuthorize.F_PRE_AUTHORIZE;

    /**
     * The table <code>ZDB.F_SETTLEMENT</code>.
     */
    public final FSettlement F_SETTLEMENT = FSettlement.F_SETTLEMENT;

    /**
     * The table <code>ZDB.F_SETTLEMENT_ITEM</code>.
     */
    public final FSettlementItem F_SETTLEMENT_ITEM = FSettlementItem.F_SETTLEMENT_ITEM;

    /**
     * The table <code>ZDB.F_SUBJECT</code>.
     */
    public final FSubject F_SUBJECT = FSubject.F_SUBJECT;

    /**
     * The table <code>ZDB.F_TRANS</code>.
     */
    public final FTrans F_TRANS = FTrans.F_TRANS;

    /**
     * The table <code>ZDB.F_TRANS_ITEM</code>.
     */
    public final FTransItem F_TRANS_ITEM = FTransItem.F_TRANS_ITEM;

    /**
     * The table <code>ZDB.F_TRANS_OF</code>.
     */
    public final FTransOf F_TRANS_OF = FTransOf.F_TRANS_OF;

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
            FBank.F_BANK,
            FBill.F_BILL,
            FBillItem.F_BILL_ITEM,
            FBook.F_BOOK,
            FCurrency.F_CURRENCY,
            FDebt.F_DEBT,
            FInvoice.F_INVOICE,
            FPayTerm.F_PAY_TERM,
            FPreAuthorize.F_PRE_AUTHORIZE,
            FSettlement.F_SETTLEMENT,
            FSettlementItem.F_SETTLEMENT_ITEM,
            FSubject.F_SUBJECT,
            FTrans.F_TRANS,
            FTransItem.F_TRANS_ITEM,
            FTransOf.F_TRANS_OF
        );
    }
}
