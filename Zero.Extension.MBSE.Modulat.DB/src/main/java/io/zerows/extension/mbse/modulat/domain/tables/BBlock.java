/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.modulat.domain.tables;


import io.zerows.extension.mbse.modulat.domain.Keys;
import io.zerows.extension.mbse.modulat.domain.Zdb;
import io.zerows.extension.mbse.modulat.domain.tables.records.BBlockRecord;
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
public class BBlock extends TableImpl<BBlockRecord> {

    /**
     * The reference instance of <code>ZDB.B_BLOCK</code>
     */
    public static final BBlock B_BLOCK = new BBlock();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.B_BLOCK.KEY</code>. 「key」- 模块主键
     */
    public final TableField<BBlockRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 模块主键");
    /**
     * The column <code>ZDB.B_BLOCK.CODE</code>. 「code」- 子模块编码
     */
    public final TableField<BBlockRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 子模块编码");
    /**
     * The column <code>ZDB.B_BLOCK.NAME</code>. 「name」- 子模块名称
     */
    public final TableField<BBlockRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 子模块名称");
    /**
     * The column <code>ZDB.B_BLOCK.VERSION</code>. 「version」- 子模块版本
     */
    public final TableField<BBlockRecord, String> VERSION = createField(DSL.name("VERSION"), SQLDataType.VARCHAR(64), this, "「version」- 子模块版本");
    /**
     * The column <code>ZDB.B_BLOCK.AUTHORIZED</code>. 「authorized」- 是否授权
     */
    public final TableField<BBlockRecord, Boolean> AUTHORIZED = createField(DSL.name("AUTHORIZED"), SQLDataType.BIT, this, "「authorized」- 是否授权");
    /**
     * The column <code>ZDB.B_BLOCK.UI_ICON</code>. 「uiIcon」- 子模块图标
     */
    public final TableField<BBlockRecord, String> UI_ICON = createField(DSL.name("UI_ICON"), SQLDataType.VARCHAR(255), this, "「uiIcon」- 子模块图标");
    /**
     * The column <code>ZDB.B_BLOCK.UI_STYLE</code>. 「uiStyle」- 子模块风格
     */
    public final TableField<BBlockRecord, String> UI_STYLE = createField(DSL.name("UI_STYLE"), SQLDataType.CLOB, this, "「uiStyle」- 子模块风格");
    /**
     * The column <code>ZDB.B_BLOCK.UI_SORT</code>. 「uiSort」- 子模块排序
     */
    public final TableField<BBlockRecord, Long> UI_SORT = createField(DSL.name("UI_SORT"), SQLDataType.BIGINT, this, "「uiSort」- 子模块排序");
    /**
     * The column <code>ZDB.B_BLOCK.UI_CONFIG</code>. 「uiConfig」- 子模块核心配置
     */
    public final TableField<BBlockRecord, String> UI_CONFIG = createField(DSL.name("UI_CONFIG"), SQLDataType.CLOB, this, "「uiConfig」- 子模块核心配置");
    /**
     * The column <code>ZDB.B_BLOCK.UI_CONTENT</code>. 「uiContent」- 配置数据
     */
    public final TableField<BBlockRecord, String> UI_CONTENT = createField(DSL.name("UI_CONTENT"), SQLDataType.CLOB, this, "「uiContent」- 配置数据");
    /**
     * The column <code>ZDB.B_BLOCK.SIGN_ISSUER</code>. 「signIssuer」- 许可证发证机构
     */
    public final TableField<BBlockRecord, String> SIGN_ISSUER = createField(DSL.name("SIGN_ISSUER"), SQLDataType.VARCHAR(255), this, "「signIssuer」- 许可证发证机构");
    /**
     * The column <code>ZDB.B_BLOCK.SIGN_NAME</code>. 「signName」- 许可证名称
     */
    public final TableField<BBlockRecord, String> SIGN_NAME = createField(DSL.name("SIGN_NAME"), SQLDataType.VARCHAR(255), this, "「signName」- 许可证名称");
    /**
     * The column <code>ZDB.B_BLOCK.SIGN_AT</code>. 「signAt」- 发证时间
     */
    public final TableField<BBlockRecord, LocalDateTime> SIGN_AT = createField(DSL.name("SIGN_AT"), SQLDataType.LOCALDATETIME(0), this, "「signAt」- 发证时间");
    /**
     * The column <code>ZDB.B_BLOCK.SIGN_SECRET</code>. 「signSecret」- 证书专用密钥
     */
    public final TableField<BBlockRecord, String> SIGN_SECRET = createField(DSL.name("SIGN_SECRET"), SQLDataType.VARCHAR(64), this, "「signSecret」- 证书专用密钥");
    /**
     * The column <code>ZDB.B_BLOCK.SIGN_LIC</code>. 「signLic」- 许可证内容
     */
    public final TableField<BBlockRecord, String> SIGN_LIC = createField(DSL.name("SIGN_LIC"), SQLDataType.CLOB, this, "「signLic」- 许可证内容");
    /**
     * The column <code>ZDB.B_BLOCK.SIGN_END</code>. 「signEnd」- 证书过期时间
     */
    public final TableField<BBlockRecord, LocalDateTime> SIGN_END = createField(DSL.name("SIGN_END"), SQLDataType.LOCALDATETIME(0), this, "「signEnd」- 证书过期时间");
    /**
     * The column <code>ZDB.B_BLOCK.SIGN_START</code>. 「signStart」- 证书过期时间
     */
    public final TableField<BBlockRecord, LocalDateTime> SIGN_START = createField(DSL.name("SIGN_START"), SQLDataType.LOCALDATETIME(0), this, "「signStart」- 证书过期时间");
    /**
     * The column <code>ZDB.B_BLOCK.LIC_IDENTIFIER</code>. 「licIdentifier」-
     * 允许的模型标识
     */
    public final TableField<BBlockRecord, String> LIC_IDENTIFIER = createField(DSL.name("LIC_IDENTIFIER"), SQLDataType.CLOB, this, "「licIdentifier」- 允许的模型标识");
    /**
     * The column <code>ZDB.B_BLOCK.LIC_MENU</code>. 「licMenu」- 该Block包含的菜单
     */
    public final TableField<BBlockRecord, String> LIC_MENU = createField(DSL.name("LIC_MENU"), SQLDataType.CLOB, this, "「licMenu」- 该Block包含的菜单");
    /**
     * The column <code>ZDB.B_BLOCK.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public final TableField<BBlockRecord, String> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.VARCHAR(36), this, "「appId」- 关联的应用程序ID");
    /**
     * The column <code>ZDB.B_BLOCK.BAG_ID</code>. 「bagId」- 所属包ID
     */
    public final TableField<BBlockRecord, String> BAG_ID = createField(DSL.name("BAG_ID"), SQLDataType.VARCHAR(36), this, "「bagId」- 所属包ID");
    /**
     * The column <code>ZDB.B_BLOCK.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<BBlockRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.B_BLOCK.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<BBlockRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.B_BLOCK.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<BBlockRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>ZDB.B_BLOCK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<BBlockRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.B_BLOCK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<BBlockRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.B_BLOCK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<BBlockRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.B_BLOCK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<BBlockRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.B_BLOCK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<BBlockRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private BBlock(Name alias, Table<BBlockRecord> aliased) {
        this(alias, aliased, null);
    }

    private BBlock(Name alias, Table<BBlockRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.B_BLOCK</code> table reference
     */
    public BBlock(String alias) {
        this(DSL.name(alias), B_BLOCK);
    }

    /**
     * Create an aliased <code>ZDB.B_BLOCK</code> table reference
     */
    public BBlock(Name alias) {
        this(alias, B_BLOCK);
    }

    /**
     * Create a <code>ZDB.B_BLOCK</code> table reference
     */
    public BBlock() {
        this(DSL.name("B_BLOCK"), null);
    }

    public <O extends Record> BBlock(Table<O> child, ForeignKey<O, BBlockRecord> key) {
        super(child, key, B_BLOCK);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BBlockRecord> getRecordType() {
        return BBlockRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<BBlockRecord> getPrimaryKey() {
        return Keys.KEY_B_BLOCK_PRIMARY;
    }

    @Override
    public List<UniqueKey<BBlockRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_B_BLOCK_CODE, Keys.KEY_B_BLOCK_NAME, Keys.KEY_B_BLOCK_SIGN_SECRET);
    }

    @Override
    public BBlock as(String alias) {
        return new BBlock(DSL.name(alias), this);
    }

    @Override
    public BBlock as(Name alias) {
        return new BBlock(alias, this);
    }

    @Override
    public BBlock as(Table<?> alias) {
        return new BBlock(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public BBlock rename(String name) {
        return new BBlock(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BBlock rename(Name name) {
        return new BBlock(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public BBlock rename(Table<?> name) {
        return new BBlock(name.getQualifiedName(), null);
    }
}
