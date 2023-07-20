/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables;


import cn.vertxup.erp.domain.Keys;
import cn.vertxup.erp.domain.Zdb;
import cn.vertxup.erp.domain.tables.records.RAssetShareRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RAssetShare extends TableImpl<RAssetShareRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.R_ASSET_SHARE</code>
     */
    public static final RAssetShare R_ASSET_SHARE = new RAssetShare();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RAssetShareRecord> getRecordType() {
        return RAssetShareRecord.class;
    }

    /**
     * The column <code>ZDB.R_ASSET_SHARE.ASSET_ID</code>. 「assetId」- 资产ID
     */
    public final TableField<RAssetShareRecord, String> ASSET_ID = createField(DSL.name("ASSET_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「assetId」- 资产ID");

    /**
     * The column <code>ZDB.R_ASSET_SHARE.ENTITY_TYPE</code>. 「entityType」- 关联类型
     */
    public final TableField<RAssetShareRecord, String> ENTITY_TYPE = createField(DSL.name("ENTITY_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "「entityType」- 关联类型");

    /**
     * The column <code>ZDB.R_ASSET_SHARE.ENTITY_ID</code>. 「entityId」- 关联实体ID
     */
    public final TableField<RAssetShareRecord, String> ENTITY_ID = createField(DSL.name("ENTITY_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「entityId」- 关联实体ID");

    /**
     * The column <code>ZDB.R_ASSET_SHARE.LINK_COMPONENT</code>.
     * 「linkComponent」- 关联执行组件（扩展用）
     */
    public final TableField<RAssetShareRecord, String> LINK_COMPONENT = createField(DSL.name("LINK_COMPONENT"), SQLDataType.VARCHAR(255), this, "「linkComponent」- 关联执行组件（扩展用）");

    /**
     * The column <code>ZDB.R_ASSET_SHARE.COMMENT</code>. 「comment」- 关系备注
     */
    public final TableField<RAssetShareRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 关系备注");

    private RAssetShare(Name alias, Table<RAssetShareRecord> aliased) {
        this(alias, aliased, null);
    }

    private RAssetShare(Name alias, Table<RAssetShareRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.R_ASSET_SHARE</code> table reference
     */
    public RAssetShare(String alias) {
        this(DSL.name(alias), R_ASSET_SHARE);
    }

    /**
     * Create an aliased <code>ZDB.R_ASSET_SHARE</code> table reference
     */
    public RAssetShare(Name alias) {
        this(alias, R_ASSET_SHARE);
    }

    /**
     * Create a <code>ZDB.R_ASSET_SHARE</code> table reference
     */
    public RAssetShare() {
        this(DSL.name("R_ASSET_SHARE"), null);
    }

    public <O extends Record> RAssetShare(Table<O> child, ForeignKey<O, RAssetShareRecord> key) {
        super(child, key, R_ASSET_SHARE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<RAssetShareRecord> getPrimaryKey() {
        return Keys.KEY_R_ASSET_SHARE_PRIMARY;
    }

    @Override
    public RAssetShare as(String alias) {
        return new RAssetShare(DSL.name(alias), this);
    }

    @Override
    public RAssetShare as(Name alias) {
        return new RAssetShare(alias, this);
    }

    @Override
    public RAssetShare as(Table<?> alias) {
        return new RAssetShare(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RAssetShare rename(String name) {
        return new RAssetShare(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RAssetShare rename(Name name) {
        return new RAssetShare(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RAssetShare rename(Table<?> name) {
        return new RAssetShare(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
