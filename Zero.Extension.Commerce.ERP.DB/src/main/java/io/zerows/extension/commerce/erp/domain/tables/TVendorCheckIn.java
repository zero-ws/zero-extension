/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables;


import io.zerows.extension.commerce.erp.domain.Keys;
import io.zerows.extension.commerce.erp.domain.Zdb;
import io.zerows.extension.commerce.erp.domain.tables.records.TVendorCheckInRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.function.Function;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TVendorCheckIn extends TableImpl<TVendorCheckInRecord> {

    /**
     * The reference instance of <code>ZDB.T_VENDOR_CHECK_IN</code>
     */
    public static final TVendorCheckIn T_VENDOR_CHECK_IN = new TVendorCheckIn();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.T_VENDOR_CHECK_IN.KEY</code>. 「key」- Ticket Primary
     * Key
     */
    public final TableField<TVendorCheckInRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- Ticket Primary Key");
    /**
     * The column <code>ZDB.T_VENDOR_CHECK_IN.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    public final TableField<TVendorCheckInRecord, String> COMMENT_EXTENSION = createField(DSL.name("COMMENT_EXTENSION"), SQLDataType.CLOB, this, "「commentExtension」- Extension Comment");
    /**
     * The column <code>ZDB.T_VENDOR_CHECK_IN.CLASSIFICATION</code>.
     * 「classification」- The ticket related income type
     */
    public final TableField<TVendorCheckInRecord, String> CLASSIFICATION = createField(DSL.name("CLASSIFICATION"), SQLDataType.VARCHAR(64), this, "「classification」- The ticket related income type");
    /**
     * The column <code>ZDB.T_VENDOR_CHECK_IN.START_AT</code>. 「startAt」- From
     */
    public final TableField<TVendorCheckInRecord, LocalDateTime> START_AT = createField(DSL.name("START_AT"), SQLDataType.LOCALDATETIME(0), this, "「startAt」- From");
    /**
     * The column <code>ZDB.T_VENDOR_CHECK_IN.END_AT</code>. 「endAt」- To
     */
    public final TableField<TVendorCheckInRecord, LocalDateTime> END_AT = createField(DSL.name("END_AT"), SQLDataType.LOCALDATETIME(0), this, "「endAt」- To");
    /**
     * The column <code>ZDB.T_VENDOR_CHECK_IN.DAYS</code>. 「days」- Duration
     */
    public final TableField<TVendorCheckInRecord, Integer> DAYS = createField(DSL.name("DAYS"), SQLDataType.INTEGER, this, "「days」- Duration");
    /**
     * The column <code>ZDB.T_VENDOR_CHECK_IN.ONBOARD_AT</code>. 「onboardAt」- To
     */
    public final TableField<TVendorCheckInRecord, LocalDateTime> ONBOARD_AT = createField(DSL.name("ONBOARD_AT"), SQLDataType.LOCALDATETIME(0), this, "「onboardAt」- To");

    private TVendorCheckIn(Name alias, Table<TVendorCheckInRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVendorCheckIn(Name alias, Table<TVendorCheckInRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.T_VENDOR_CHECK_IN</code> table reference
     */
    public TVendorCheckIn(String alias) {
        this(DSL.name(alias), T_VENDOR_CHECK_IN);
    }

    /**
     * Create an aliased <code>ZDB.T_VENDOR_CHECK_IN</code> table reference
     */
    public TVendorCheckIn(Name alias) {
        this(alias, T_VENDOR_CHECK_IN);
    }

    /**
     * Create a <code>ZDB.T_VENDOR_CHECK_IN</code> table reference
     */
    public TVendorCheckIn() {
        this(DSL.name("T_VENDOR_CHECK_IN"), null);
    }

    public <O extends Record> TVendorCheckIn(Table<O> child, ForeignKey<O, TVendorCheckInRecord> key) {
        super(child, key, T_VENDOR_CHECK_IN);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVendorCheckInRecord> getRecordType() {
        return TVendorCheckInRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<TVendorCheckInRecord> getPrimaryKey() {
        return Keys.KEY_T_VENDOR_CHECK_IN_PRIMARY;
    }

    @Override
    public TVendorCheckIn as(String alias) {
        return new TVendorCheckIn(DSL.name(alias), this);
    }

    @Override
    public TVendorCheckIn as(Name alias) {
        return new TVendorCheckIn(alias, this);
    }

    @Override
    public TVendorCheckIn as(Table<?> alias) {
        return new TVendorCheckIn(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorCheckIn rename(String name) {
        return new TVendorCheckIn(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorCheckIn rename(Name name) {
        return new TVendorCheckIn(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorCheckIn rename(Table<?> name) {
        return new TVendorCheckIn(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, LocalDateTime, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super Integer, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super Integer, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
