/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain.tables;


import cn.vertxup.tpl.domain.Keys;
import cn.vertxup.tpl.domain.Zdb;
import cn.vertxup.tpl.domain.tables.records.TplModelRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
public class TplModel extends TableImpl<TplModelRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.TPL_MODEL</code>
     */
    public static final TplModel TPL_MODEL = new TplModel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TplModelRecord> getRecordType() {
        return TplModelRecord.class;
    }

    /**
     * The column <code>ZDB.TPL_MODEL.KEY</code>. 「key」- 模板ID
     */
    public final TableField<TplModelRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 模板ID");

    /**
     * The column <code>ZDB.TPL_MODEL.NAME</code>. 「name」- 模板名称
     */
    public final TableField<TplModelRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(256), this, "「name」- 模板名称");

    /**
     * The column <code>ZDB.TPL_MODEL.CODE</code>. 「code」- 模板编码
     */
    public final TableField<TplModelRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(256), this, "「code」- 模板编码");

    /**
     * The column <code>ZDB.TPL_MODEL.TYPE</code>. 「type」- 模板类型
     */
    public final TableField<TplModelRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36), this, "「type」- 模板类型");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_CATEGORY</code>. 「tplCategory」- 分类配置
     */
    public final TableField<TplModelRecord, String> TPL_CATEGORY = createField(DSL.name("TPL_CATEGORY"), SQLDataType.CLOB, this, "「tplCategory」- 分类配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_INTEGRATION</code>. 「tplIntegration」-
     * 集成配置
     */
    public final TableField<TplModelRecord, String> TPL_INTEGRATION = createField(DSL.name("TPL_INTEGRATION"), SQLDataType.CLOB, this, "「tplIntegration」- 集成配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_ACL</code>. 「tplAcl」- 安全配置
     */
    public final TableField<TplModelRecord, String> TPL_ACL = createField(DSL.name("TPL_ACL"), SQLDataType.CLOB, this, "「tplAcl」- 安全配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_ACL_VISIT</code>. 「tplAclVisit」-
     * 资源访问者配置
     */
    public final TableField<TplModelRecord, String> TPL_ACL_VISIT = createField(DSL.name("TPL_ACL_VISIT"), SQLDataType.CLOB, this, "「tplAclVisit」- 资源访问者配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_MODEL</code>. 「tplModel」- 模型配置
     */
    public final TableField<TplModelRecord, String> TPL_MODEL_ = createField(DSL.name("TPL_MODEL"), SQLDataType.CLOB, this, "「tplModel」- 模型配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_ENTITY</code>. 「tplEntity」- 实体配置
     */
    public final TableField<TplModelRecord, String> TPL_ENTITY = createField(DSL.name("TPL_ENTITY"), SQLDataType.CLOB, this, "「tplEntity」- 实体配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_API</code>. 「tplApi」- 接口配置
     */
    public final TableField<TplModelRecord, String> TPL_API = createField(DSL.name("TPL_API"), SQLDataType.CLOB, this, "「tplApi」- 接口配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_JOB</code>. 「tplJob」- 任务配置
     */
    public final TableField<TplModelRecord, String> TPL_JOB = createField(DSL.name("TPL_JOB"), SQLDataType.CLOB, this, "「tplJob」- 任务配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_UI</code>. 「tplUi」- 界面配置
     */
    public final TableField<TplModelRecord, String> TPL_UI = createField(DSL.name("TPL_UI"), SQLDataType.CLOB, this, "「tplUi」- 界面配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_UI_LIST</code>. 「tplUiList」- 界面列表配置
     */
    public final TableField<TplModelRecord, String> TPL_UI_LIST = createField(DSL.name("TPL_UI_LIST"), SQLDataType.CLOB, this, "「tplUiList」- 界面列表配置");

    /**
     * The column <code>ZDB.TPL_MODEL.TPL_UI_FORM</code>. 「tplUiForm」- 界面表单配置
     */
    public final TableField<TplModelRecord, String> TPL_UI_FORM = createField(DSL.name("TPL_UI_FORM"), SQLDataType.CLOB, this, "「tplUiForm」- 界面表单配置");

    /**
     * The column <code>ZDB.TPL_MODEL.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<TplModelRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.TPL_MODEL.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<TplModelRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.TPL_MODEL.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<TplModelRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.TPL_MODEL.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<TplModelRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.TPL_MODEL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<TplModelRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.TPL_MODEL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<TplModelRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.TPL_MODEL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<TplModelRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.TPL_MODEL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<TplModelRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private TplModel(Name alias, Table<TplModelRecord> aliased) {
        this(alias, aliased, null);
    }

    private TplModel(Name alias, Table<TplModelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.TPL_MODEL</code> table reference
     */
    public TplModel(String alias) {
        this(DSL.name(alias), TPL_MODEL);
    }

    /**
     * Create an aliased <code>ZDB.TPL_MODEL</code> table reference
     */
    public TplModel(Name alias) {
        this(alias, TPL_MODEL);
    }

    /**
     * Create a <code>ZDB.TPL_MODEL</code> table reference
     */
    public TplModel() {
        this(DSL.name("TPL_MODEL"), null);
    }

    public <O extends Record> TplModel(Table<O> child, ForeignKey<O, TplModelRecord> key) {
        super(child, key, TPL_MODEL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<TplModelRecord> getPrimaryKey() {
        return Keys.KEY_TPL_MODEL_PRIMARY;
    }

    @Override
    public List<UniqueKey<TplModelRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_TPL_MODEL_CODE);
    }

    @Override
    public TplModel as(String alias) {
        return new TplModel(DSL.name(alias), this);
    }

    @Override
    public TplModel as(Name alias) {
        return new TplModel(alias, this);
    }

    @Override
    public TplModel as(Table<?> alias) {
        return new TplModel(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TplModel rename(String name) {
        return new TplModel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TplModel rename(Name name) {
        return new TplModel(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TplModel rename(Table<?> name) {
        return new TplModel(name.getQualifiedName(), null);
    }
}
