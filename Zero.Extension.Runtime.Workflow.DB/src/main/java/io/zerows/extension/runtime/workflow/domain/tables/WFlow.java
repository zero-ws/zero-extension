/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.workflow.domain.tables;


import io.zerows.extension.runtime.workflow.domain.Keys;
import io.zerows.extension.runtime.workflow.domain.Zdb;
import io.zerows.extension.runtime.workflow.domain.tables.records.WFlowRecord;
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
public class WFlow extends TableImpl<WFlowRecord> {

    /**
     * The reference instance of <code>ZDB.W_FLOW</code>
     */
    public static final WFlow W_FLOW = new WFlow();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.W_FLOW.KEY</code>. 「key」- 流程定义主键
     */
    public final TableField<WFlowRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 流程定义主键");
    /**
     * The column <code>ZDB.W_FLOW.NAME</code>. 「name」- 流程定义名称
     */
    public final TableField<WFlowRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 流程定义名称");
    /**
     * The column <code>ZDB.W_FLOW.CODE</code>. 「code」- 流程定义编号（系统可用）
     */
    public final TableField<WFlowRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 流程定义编号（系统可用）");
    /**
     * The column <code>ZDB.W_FLOW.TYPE</code>. 「type」- 流程类型，对接
     * zero.workflow.cat的X_TABULAR
     */
    public final TableField<WFlowRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36), this, "「type」- 流程类型，对接 zero.workflow.cat的X_TABULAR");
    /**
     * The column <code>ZDB.W_FLOW.DEFINITION_KEY</code>. 「definitionKey」-
     * 定义ID（读取流程图所需）, getProcessDefinitionId
     */
    public final TableField<WFlowRecord, String> DEFINITION_KEY = createField(DSL.name("DEFINITION_KEY"), SQLDataType.VARCHAR(128), this, "「definitionKey」- 定义ID（读取流程图所需）, getProcessDefinitionId");
    /**
     * The column <code>ZDB.W_FLOW.AUTHORIZED_COMPONENT</code>.
     * 「authorizedComponent」- 流程授权组件
     */
    public final TableField<WFlowRecord, String> AUTHORIZED_COMPONENT = createField(DSL.name("AUTHORIZED_COMPONENT"), SQLDataType.VARCHAR(255), this, "「authorizedComponent」- 流程授权组件");
    /**
     * The column <code>ZDB.W_FLOW.AUTHORIZED_CONFIG</code>. 「authorizedConfig」-
     * 流程授权配置
     */
    public final TableField<WFlowRecord, String> AUTHORIZED_CONFIG = createField(DSL.name("AUTHORIZED_CONFIG"), SQLDataType.CLOB, this, "「authorizedConfig」- 流程授权配置");
    /**
     * The column <code>ZDB.W_FLOW.GENERATE_COMPONENT</code>.
     * 「generateComponent」- Todo生成组件
     */
    public final TableField<WFlowRecord, String> GENERATE_COMPONENT = createField(DSL.name("GENERATE_COMPONENT"), SQLDataType.VARCHAR(255), this, "「generateComponent」- Todo生成组件");
    /**
     * The column <code>ZDB.W_FLOW.GENERATE_CONFIG</code>. 「generateConfig」-
     * Todo生成配置
     */
    public final TableField<WFlowRecord, String> GENERATE_CONFIG = createField(DSL.name("GENERATE_CONFIG"), SQLDataType.CLOB, this, "「generateConfig」- Todo生成配置");
    /**
     * The column <code>ZDB.W_FLOW.RUN_COMPONENT</code>. 「runComponent」- 执行组件
     */
    public final TableField<WFlowRecord, String> RUN_COMPONENT = createField(DSL.name("RUN_COMPONENT"), SQLDataType.VARCHAR(255), this, "「runComponent」- 执行组件");
    /**
     * The column <code>ZDB.W_FLOW.RUN_CONFIG</code>. 「runConfig」- 执行配置
     */
    public final TableField<WFlowRecord, String> RUN_CONFIG = createField(DSL.name("RUN_CONFIG"), SQLDataType.CLOB, this, "「runConfig」- 执行配置");
    /**
     * The column <code>ZDB.W_FLOW.START_COMPONENT</code>. 「startComponent」-
     * 启动组件
     */
    public final TableField<WFlowRecord, String> START_COMPONENT = createField(DSL.name("START_COMPONENT"), SQLDataType.VARCHAR(255), this, "「startComponent」- 启动组件");
    /**
     * The column <code>ZDB.W_FLOW.START_CONFIG</code>. 「startConfig」- 启动配置
     */
    public final TableField<WFlowRecord, String> START_CONFIG = createField(DSL.name("START_CONFIG"), SQLDataType.CLOB, this, "「startConfig」- 启动配置");
    /**
     * The column <code>ZDB.W_FLOW.END_COMPONENT</code>. 「endComponent」- 完成组件
     */
    public final TableField<WFlowRecord, String> END_COMPONENT = createField(DSL.name("END_COMPONENT"), SQLDataType.VARCHAR(255), this, "「endComponent」- 完成组件");
    /**
     * The column <code>ZDB.W_FLOW.END_CONFIG</code>. 「endConfig」- 完成配置
     */
    public final TableField<WFlowRecord, String> END_CONFIG = createField(DSL.name("END_CONFIG"), SQLDataType.CLOB, this, "「endConfig」- 完成配置");
    /**
     * The column <code>ZDB.W_FLOW.UI_COMPONENT</code>. 「uiComponent」- 界面组件
     */
    public final TableField<WFlowRecord, String> UI_COMPONENT = createField(DSL.name("UI_COMPONENT"), SQLDataType.VARCHAR(255), this, "「uiComponent」- 界面组件");
    /**
     * The column <code>ZDB.W_FLOW.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    public final TableField<WFlowRecord, String> UI_CONFIG = createField(DSL.name("UI_CONFIG"), SQLDataType.CLOB, this, "「uiConfig」- 界面配置");
    /**
     * The column <code>ZDB.W_FLOW.UI_ASSIST</code>. 「uiAssist」- 界面辅助数据专用配置
     */
    public final TableField<WFlowRecord, String> UI_ASSIST = createField(DSL.name("UI_ASSIST"), SQLDataType.CLOB, this, "「uiAssist」- 界面辅助数据专用配置");
    /**
     * The column <code>ZDB.W_FLOW.UI_LINKAGE</code>. 「uiLinkage」-
     * 关联部分专用配置：关联工单、关联资产、关联附件
     */
    public final TableField<WFlowRecord, String> UI_LINKAGE = createField(DSL.name("UI_LINKAGE"), SQLDataType.CLOB, this, "「uiLinkage」- 关联部分专用配置：关联工单、关联资产、关联附件");
    /**
     * The column <code>ZDB.W_FLOW.COMMENT</code>. 「comment」 - 流程定义备注
     */
    public final TableField<WFlowRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 流程定义备注");
    /**
     * The column <code>ZDB.W_FLOW.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<WFlowRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.W_FLOW.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<WFlowRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.W_FLOW.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<WFlowRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>ZDB.W_FLOW.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<WFlowRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.W_FLOW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<WFlowRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.W_FLOW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<WFlowRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.W_FLOW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<WFlowRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.W_FLOW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<WFlowRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private WFlow(Name alias, Table<WFlowRecord> aliased) {
        this(alias, aliased, null);
    }

    private WFlow(Name alias, Table<WFlowRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.W_FLOW</code> table reference
     */
    public WFlow(String alias) {
        this(DSL.name(alias), W_FLOW);
    }

    /**
     * Create an aliased <code>ZDB.W_FLOW</code> table reference
     */
    public WFlow(Name alias) {
        this(alias, W_FLOW);
    }

    /**
     * Create a <code>ZDB.W_FLOW</code> table reference
     */
    public WFlow() {
        this(DSL.name("W_FLOW"), null);
    }

    public <O extends Record> WFlow(Table<O> child, ForeignKey<O, WFlowRecord> key) {
        super(child, key, W_FLOW);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WFlowRecord> getRecordType() {
        return WFlowRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<WFlowRecord> getPrimaryKey() {
        return Keys.KEY_W_FLOW_PRIMARY;
    }

    @Override
    public List<UniqueKey<WFlowRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_W_FLOW_NAME, Keys.KEY_W_FLOW_CODE);
    }

    @Override
    public WFlow as(String alias) {
        return new WFlow(DSL.name(alias), this);
    }

    @Override
    public WFlow as(Name alias) {
        return new WFlow(alias, this);
    }

    @Override
    public WFlow as(Table<?> alias) {
        return new WFlow(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public WFlow rename(String name) {
        return new WFlow(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WFlow rename(Name name) {
        return new WFlow(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public WFlow rename(Table<?> name) {
        return new WFlow(name.getQualifiedName(), null);
    }
}