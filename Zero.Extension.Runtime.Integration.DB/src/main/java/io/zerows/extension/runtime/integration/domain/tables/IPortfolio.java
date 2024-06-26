/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.integration.domain.tables;


import io.zerows.extension.runtime.integration.domain.Keys;
import io.zerows.extension.runtime.integration.domain.Zdb;
import io.zerows.extension.runtime.integration.domain.tables.records.IPortfolioRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IPortfolio extends TableImpl<IPortfolioRecord> {

    /**
     * The reference instance of <code>ZDB.I_PORTFOLIO</code>
     */
    public static final IPortfolio I_PORTFOLIO = new IPortfolio();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.I_PORTFOLIO.KEY</code>. 「key」- 目录专用ID
     */
    public final TableField<IPortfolioRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 目录专用ID");
    /**
     * The column <code>ZDB.I_PORTFOLIO.NAME</code>. 「name」- 目录名称
     */
    public final TableField<IPortfolioRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 目录名称");
    /**
     * The column <code>ZDB.I_PORTFOLIO.CODE</code>. 「code」- 目录系统编码
     */
    public final TableField<IPortfolioRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 目录系统编码");
    /**
     * The column <code>ZDB.I_PORTFOLIO.STATUS</code>. 「status」- 目录状态
     */
    public final TableField<IPortfolioRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(255), this, "「status」- 目录状态");
    /**
     * The column <code>ZDB.I_PORTFOLIO.TYPE</code>. 「type」- 目录类型
     */
    public final TableField<IPortfolioRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(255), this, "「type」- 目录类型");
    /**
     * The column <code>ZDB.I_PORTFOLIO.INTEGRATION_ID</code>. 「integrationId」-
     * 是否关联集成配置，管理时直接同步
     */
    public final TableField<IPortfolioRecord, String> INTEGRATION_ID = createField(DSL.name("INTEGRATION_ID"), SQLDataType.VARCHAR(36), this, "「integrationId」- 是否关联集成配置，管理时直接同步");
    /**
     * The column <code>ZDB.I_PORTFOLIO.OWNER_TYPE</code>. 「ownerType」- 关联主体类型
     */
    public final TableField<IPortfolioRecord, String> OWNER_TYPE = createField(DSL.name("OWNER_TYPE"), SQLDataType.VARCHAR(20), this, "「ownerType」- 关联主体类型");
    /**
     * The column <code>ZDB.I_PORTFOLIO.OWNER</code>. 「owner」- 关联主体主键
     */
    public final TableField<IPortfolioRecord, String> OWNER = createField(DSL.name("OWNER"), SQLDataType.VARCHAR(36), this, "「owner」- 关联主体主键");
    /**
     * The column <code>ZDB.I_PORTFOLIO.RUN_COMPONENT</code>. 「runComponent」-
     * 执行组件，LDAP执行专用
     */
    public final TableField<IPortfolioRecord, String> RUN_COMPONENT = createField(DSL.name("RUN_COMPONENT"), SQLDataType.CLOB, this, "「runComponent」- 执行组件，LDAP执行专用");
    /**
     * The column <code>ZDB.I_PORTFOLIO.RUN_CONFIG</code>. 「runConfig」- 执行组件额外配置
     */
    public final TableField<IPortfolioRecord, String> RUN_CONFIG = createField(DSL.name("RUN_CONFIG"), SQLDataType.CLOB, this, "「runConfig」- 执行组件额外配置");
    /**
     * The column <code>ZDB.I_PORTFOLIO.DATA_KEY</code>. 「dataKey」- LDAP路径做完整标识
     */
    public final TableField<IPortfolioRecord, String> DATA_KEY = createField(DSL.name("DATA_KEY"), SQLDataType.VARCHAR(512), this, "「dataKey」- LDAP路径做完整标识");
    /**
     * The column <code>ZDB.I_PORTFOLIO.DATA_CONFIG</code>. 「dataConfig」- 数据基础配置
     */
    public final TableField<IPortfolioRecord, String> DATA_CONFIG = createField(DSL.name("DATA_CONFIG"), SQLDataType.CLOB, this, "「dataConfig」- 数据基础配置");
    /**
     * The column <code>ZDB.I_PORTFOLIO.DATA_SECURE</code>. 「dataSecure」- 安全专用配置
     */
    public final TableField<IPortfolioRecord, String> DATA_SECURE = createField(DSL.name("DATA_SECURE"), SQLDataType.CLOB, this, "「dataSecure」- 安全专用配置");
    /**
     * The column <code>ZDB.I_PORTFOLIO.DATA_INTEGRATION</code>.
     * 「dataIntegration」- 绑定好过后，导入/导出数据专用配置
     */
    public final TableField<IPortfolioRecord, String> DATA_INTEGRATION = createField(DSL.name("DATA_INTEGRATION"), SQLDataType.CLOB, this, "「dataIntegration」- 绑定好过后，导入/导出数据专用配置");
    /**
     * The column <code>ZDB.I_PORTFOLIO.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public final TableField<IPortfolioRecord, String> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.VARCHAR(36), this, "「appId」- 关联的应用程序ID");
    /**
     * The column <code>ZDB.I_PORTFOLIO.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<IPortfolioRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.I_PORTFOLIO.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<IPortfolioRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.I_PORTFOLIO.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<IPortfolioRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>ZDB.I_PORTFOLIO.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<IPortfolioRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.I_PORTFOLIO.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<IPortfolioRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.I_PORTFOLIO.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<IPortfolioRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.I_PORTFOLIO.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<IPortfolioRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.I_PORTFOLIO.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<IPortfolioRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private IPortfolio(Name alias, Table<IPortfolioRecord> aliased) {
        this(alias, aliased, null);
    }

    private IPortfolio(Name alias, Table<IPortfolioRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.I_PORTFOLIO</code> table reference
     */
    public IPortfolio(String alias) {
        this(DSL.name(alias), I_PORTFOLIO);
    }

    /**
     * Create an aliased <code>ZDB.I_PORTFOLIO</code> table reference
     */
    public IPortfolio(Name alias) {
        this(alias, I_PORTFOLIO);
    }

    /**
     * Create a <code>ZDB.I_PORTFOLIO</code> table reference
     */
    public IPortfolio() {
        this(DSL.name("I_PORTFOLIO"), null);
    }

    public <O extends Record> IPortfolio(Table<O> child, ForeignKey<O, IPortfolioRecord> key) {
        super(child, key, I_PORTFOLIO);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IPortfolioRecord> getRecordType() {
        return IPortfolioRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<IPortfolioRecord> getPrimaryKey() {
        return Keys.KEY_I_PORTFOLIO_PRIMARY;
    }

    @Override
    public List<UniqueKey<IPortfolioRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_I_PORTFOLIO_CODE);
    }

    @Override
    public IPortfolio as(String alias) {
        return new IPortfolio(DSL.name(alias), this);
    }

    @Override
    public IPortfolio as(Name alias) {
        return new IPortfolio(alias, this);
    }

    @Override
    public IPortfolio as(Table<?> alias) {
        return new IPortfolio(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public IPortfolio rename(String name) {
        return new IPortfolio(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IPortfolio rename(Name name) {
        return new IPortfolio(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public IPortfolio rename(Table<?> name) {
        return new IPortfolio(name.getQualifiedName(), null);
    }
}
