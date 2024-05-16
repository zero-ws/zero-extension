/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables;


import io.zerows.extension.commerce.erp.domain.Keys;
import io.zerows.extension.commerce.erp.domain.Zdb;
import io.zerows.extension.commerce.erp.domain.tables.records.TVendorHourRecord;
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
public class TVendorHour extends TableImpl<TVendorHourRecord> {

    /**
     * The reference instance of <code>ZDB.T_VENDOR_HOUR</code>
     */
    public static final TVendorHour T_VENDOR_HOUR = new TVendorHour();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.KEY</code>. 「key」- Ticket Primary Key
     */
    public final TableField<TVendorHourRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- Ticket Primary Key");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    public final TableField<TVendorHourRecord, String> COMMENT_EXTENSION = createField(DSL.name("COMMENT_EXTENSION"), SQLDataType.CLOB, this, "「commentExtension」- Extension Comment");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.CLASSIFICATION</code>.
     * 「classification」- The ticket related income type
     */
    public final TableField<TVendorHourRecord, String> CLASSIFICATION = createField(DSL.name("CLASSIFICATION"), SQLDataType.VARCHAR(64), this, "「classification」- The ticket related income type");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.START_AT</code>. 「startAt」- From
     */
    public final TableField<TVendorHourRecord, LocalDateTime> START_AT = createField(DSL.name("START_AT"), SQLDataType.LOCALDATETIME(0), this, "「startAt」- From");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.END_AT</code>. 「endAt」- To
     */
    public final TableField<TVendorHourRecord, LocalDateTime> END_AT = createField(DSL.name("END_AT"), SQLDataType.LOCALDATETIME(0), this, "「endAt」- To");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.DAYS</code>. 「days」- Duration
     */
    public final TableField<TVendorHourRecord, Integer> DAYS = createField(DSL.name("DAYS"), SQLDataType.INTEGER, this, "「days」- Duration");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.REQUEST_TYPE</code>. 「requestType」-
     * Request type of hour
     */
    public final TableField<TVendorHourRecord, String> REQUEST_TYPE = createField(DSL.name("REQUEST_TYPE"), SQLDataType.VARCHAR(64), this, "「requestType」- Request type of hour");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.FROM_TYPE</code>. 「fromType」
     */
    public final TableField<TVendorHourRecord, String> FROM_TYPE = createField(DSL.name("FROM_TYPE"), SQLDataType.VARCHAR(36), this, "「fromType」");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.FROM_AT</code>. 「fromAt」
     */
    public final TableField<TVendorHourRecord, LocalDateTime> FROM_AT = createField(DSL.name("FROM_AT"), SQLDataType.LOCALDATETIME(0), this, "「fromAt」");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.TO_TYPE</code>. 「toType」
     */
    public final TableField<TVendorHourRecord, String> TO_TYPE = createField(DSL.name("TO_TYPE"), SQLDataType.VARCHAR(36), this, "「toType」");
    /**
     * The column <code>ZDB.T_VENDOR_HOUR.TO_AT</code>. 「toAt」
     */
    public final TableField<TVendorHourRecord, LocalDateTime> TO_AT = createField(DSL.name("TO_AT"), SQLDataType.LOCALDATETIME(0), this, "「toAt」");

    private TVendorHour(Name alias, Table<TVendorHourRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVendorHour(Name alias, Table<TVendorHourRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.T_VENDOR_HOUR</code> table reference
     */
    public TVendorHour(String alias) {
        this(DSL.name(alias), T_VENDOR_HOUR);
    }

    /**
     * Create an aliased <code>ZDB.T_VENDOR_HOUR</code> table reference
     */
    public TVendorHour(Name alias) {
        this(alias, T_VENDOR_HOUR);
    }

    /**
     * Create a <code>ZDB.T_VENDOR_HOUR</code> table reference
     */
    public TVendorHour() {
        this(DSL.name("T_VENDOR_HOUR"), null);
    }

    public <O extends Record> TVendorHour(Table<O> child, ForeignKey<O, TVendorHourRecord> key) {
        super(child, key, T_VENDOR_HOUR);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVendorHourRecord> getRecordType() {
        return TVendorHourRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<TVendorHourRecord> getPrimaryKey() {
        return Keys.KEY_T_VENDOR_HOUR_PRIMARY;
    }

    @Override
    public TVendorHour as(String alias) {
        return new TVendorHour(DSL.name(alias), this);
    }

    @Override
    public TVendorHour as(Name alias) {
        return new TVendorHour(alias, this);
    }

    @Override
    public TVendorHour as(Table<?> alias) {
        return new TVendorHour(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorHour rename(String name) {
        return new TVendorHour(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorHour rename(Name name) {
        return new TVendorHour(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorHour rename(Table<?> name) {
        return new TVendorHour(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super Integer, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super Integer, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}