/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables;


import cn.vertxup.workflow.domain.Indexes;
import cn.vertxup.workflow.domain.Keys;
import cn.vertxup.workflow.domain.Zdb;
import cn.vertxup.workflow.domain.tables.records.WTicketRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class WTicket extends TableImpl<WTicketRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.W_TICKET</code>
     */
    public static final WTicket W_TICKET = new WTicket();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WTicketRecord> getRecordType() {
        return WTicketRecord.class;
    }

    /**
     * The column <code>ZDB.W_TICKET.KEY</code>. 「key」- 单据主键
     */
    public final TableField<WTicketRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 单据主键");

    /**
     * The column <code>ZDB.W_TICKET.SERIAL</code>. 「serial」- 单据编号，使用 X_NUMBER
     * 生成
     */
    public final TableField<WTicketRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(255), this, "「serial」- 单据编号，使用 X_NUMBER 生成");

    /**
     * The column <code>ZDB.W_TICKET.NAME</code>. 「name」- 单据标题
     */
    public final TableField<WTicketRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 单据标题");

    /**
     * The column <code>ZDB.W_TICKET.CODE</code>. 「code」- 单据系统编号（内码）
     */
    public final TableField<WTicketRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(36), this, "「code」- 单据系统编号（内码）");

    /**
     * The column <code>ZDB.W_TICKET.TYPE</code>. 「type」- 主单类型类型
     */
    public final TableField<WTicketRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36), this, "「type」- 主单类型类型");

    /**
     * The column <code>ZDB.W_TICKET.PHASE</code>. 「phase」-
     * 主单据所属阶段（状态描述，由于挂TODO，所以不使用status）
     */
    public final TableField<WTicketRecord, String> PHASE = createField(DSL.name("PHASE"), SQLDataType.VARCHAR(36), this, "「phase」- 主单据所属阶段（状态描述，由于挂TODO，所以不使用status）");

    /**
     * The column <code>ZDB.W_TICKET.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public final TableField<WTicketRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");

    /**
     * The column <code>ZDB.W_TICKET.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<WTicketRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");

    /**
     * The column <code>ZDB.W_TICKET.MODEL_CATEGORY</code>. 「modelCategory」-
     * 关联的category记录，只包含叶节点
     */
    public final TableField<WTicketRecord, String> MODEL_CATEGORY = createField(DSL.name("MODEL_CATEGORY"), SQLDataType.VARCHAR(128), this, "「modelCategory」- 关联的category记录，只包含叶节点");

    /**
     * The column <code>ZDB.W_TICKET.MODEL_COMPONENT</code>. 「modelComponent」-
     * 关联的待办组件记录
     */
    public final TableField<WTicketRecord, String> MODEL_COMPONENT = createField(DSL.name("MODEL_COMPONENT"), SQLDataType.VARCHAR(255), this, "「modelComponent」- 关联的待办组件记录");

    /**
     * The column <code>ZDB.W_TICKET.MODEL_CHILD</code>. 「modelChild」-
     * 关联多个模型的记录ID，JsonArray格式
     */
    public final TableField<WTicketRecord, String> MODEL_CHILD = createField(DSL.name("MODEL_CHILD"), SQLDataType.CLOB, this, "「modelChild」- 关联多个模型的记录ID，JsonArray格式");

    /**
     * The column <code>ZDB.W_TICKET.QUANTITY</code>. 「quantity」-
     * 数量信息，多个模型记录时统计模型总数
     */
    public final TableField<WTicketRecord, Integer> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.INTEGER, this, "「quantity」- 数量信息，多个模型记录时统计模型总数");

    /**
     * The column <code>ZDB.W_TICKET.FLOW_DEFINITION_KEY</code>.
     * 「flowDefinitionKey」- 流程定义的KEY, getProcessDefinitionKey
     */
    public final TableField<WTicketRecord, String> FLOW_DEFINITION_KEY = createField(DSL.name("FLOW_DEFINITION_KEY"), SQLDataType.VARCHAR(64), this, "「flowDefinitionKey」- 流程定义的KEY, getProcessDefinitionKey");

    /**
     * The column <code>ZDB.W_TICKET.FLOW_DEFINITION_ID</code>.
     * 「flowDefinitionId」- 流程定义的ID，getProcessDefinitionKey
     */
    public final TableField<WTicketRecord, String> FLOW_DEFINITION_ID = createField(DSL.name("FLOW_DEFINITION_ID"), SQLDataType.VARCHAR(64), this, "「flowDefinitionId」- 流程定义的ID，getProcessDefinitionKey");

    /**
     * The column <code>ZDB.W_TICKET.FLOW_INSTANCE_ID</code>. 「flowInstanceId」-
     * 流程定义的ID，getProcessId
     */
    public final TableField<WTicketRecord, String> FLOW_INSTANCE_ID = createField(DSL.name("FLOW_INSTANCE_ID"), SQLDataType.VARCHAR(64), this, "「flowInstanceId」- 流程定义的ID，getProcessId");

    /**
     * The column <code>ZDB.W_TICKET.FLOW_END</code>. 「flowEnd」- 主单是否执行完成
     */
    public final TableField<WTicketRecord, Boolean> FLOW_END = createField(DSL.name("FLOW_END"), SQLDataType.BIT, this, "「flowEnd」- 主单是否执行完成");

    /**
     * The column <code>ZDB.W_TICKET.TITLE</code>. 「title」- 主单业务标题
     */
    public final TableField<WTicketRecord, String> TITLE = createField(DSL.name("TITLE"), SQLDataType.VARCHAR(1024), this, "「title」- 主单业务标题");

    /**
     * The column <code>ZDB.W_TICKET.DESCRIPTION</code>. 「description」- 主单描述内容
     */
    public final TableField<WTicketRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), SQLDataType.CLOB, this, "「description」- 主单描述内容");

    /**
     * The column <code>ZDB.W_TICKET.CATALOG</code>. 「catalog」- 关联服务目录
     */
    public final TableField<WTicketRecord, String> CATALOG = createField(DSL.name("CATALOG"), SQLDataType.VARCHAR(36), this, "「catalog」- 关联服务目录");

    /**
     * The column <code>ZDB.W_TICKET.CATEGORY</code>. 「category」- 业务类别
     */
    public final TableField<WTicketRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(36), this, "「category」- 业务类别");

    /**
     * The column <code>ZDB.W_TICKET.CATEGORY_SUB</code>. 「categorySub」- 子类别
     */
    public final TableField<WTicketRecord, String> CATEGORY_SUB = createField(DSL.name("CATEGORY_SUB"), SQLDataType.VARCHAR(36), this, "「categorySub」- 子类别");

    /**
     * The column <code>ZDB.W_TICKET.OWNER</code>. 「owner」- 制单人/拥有者
     */
    public final TableField<WTicketRecord, String> OWNER = createField(DSL.name("OWNER"), SQLDataType.VARCHAR(36), this, "「owner」- 制单人/拥有者");

    /**
     * The column <code>ZDB.W_TICKET.SUPERVISOR</code>. 「supervisor」- 监督人
     */
    public final TableField<WTicketRecord, String> SUPERVISOR = createField(DSL.name("SUPERVISOR"), SQLDataType.VARCHAR(36), this, "「supervisor」- 监督人");

    /**
     * The column <code>ZDB.W_TICKET.OPEN_BY</code>. 「openBy」- 开单人
     */
    public final TableField<WTicketRecord, String> OPEN_BY = createField(DSL.name("OPEN_BY"), SQLDataType.VARCHAR(36), this, "「openBy」- 开单人");

    /**
     * The column <code>ZDB.W_TICKET.OPEN_GROUP</code>. 「openGroup」- 开单组
     */
    public final TableField<WTicketRecord, String> OPEN_GROUP = createField(DSL.name("OPEN_GROUP"), SQLDataType.VARCHAR(36), this, "「openGroup」- 开单组");

    /**
     * The column <code>ZDB.W_TICKET.OPEN_AT</code>. 「openAt」- 开单时间
     */
    public final TableField<WTicketRecord, LocalDateTime> OPEN_AT = createField(DSL.name("OPEN_AT"), SQLDataType.LOCALDATETIME(0), this, "「openAt」- 开单时间");

    /**
     * The column <code>ZDB.W_TICKET.CANCEL_BY</code>. 「cancelBy」- 中断人
     */
    public final TableField<WTicketRecord, String> CANCEL_BY = createField(DSL.name("CANCEL_BY"), SQLDataType.VARCHAR(36), this, "「cancelBy」- 中断人");

    /**
     * The column <code>ZDB.W_TICKET.CANCEL_AT</code>. 「cancelAt」- 中断时间
     */
    public final TableField<WTicketRecord, LocalDateTime> CANCEL_AT = createField(DSL.name("CANCEL_AT"), SQLDataType.LOCALDATETIME(0), this, "「cancelAt」- 中断时间");

    /**
     * The column <code>ZDB.W_TICKET.CLOSE_BY</code>. 「closeBy」- 关闭人
     */
    public final TableField<WTicketRecord, String> CLOSE_BY = createField(DSL.name("CLOSE_BY"), SQLDataType.VARCHAR(36), this, "「closeBy」- 关闭人");

    /**
     * The column <code>ZDB.W_TICKET.CLOSE_AT</code>. 「closeAt」- 关闭时间
     */
    public final TableField<WTicketRecord, LocalDateTime> CLOSE_AT = createField(DSL.name("CLOSE_AT"), SQLDataType.LOCALDATETIME(0), this, "「closeAt」- 关闭时间");

    /**
     * The column <code>ZDB.W_TICKET.CLOSE_SOLUTION</code>. 「closeSolution」-
     * 关闭解决方案
     */
    public final TableField<WTicketRecord, String> CLOSE_SOLUTION = createField(DSL.name("CLOSE_SOLUTION"), SQLDataType.CLOB, this, "「closeSolution」- 关闭解决方案");

    /**
     * The column <code>ZDB.W_TICKET.CLOSE_CODE</code>. 「closeCode」- 关闭代码
     */
    public final TableField<WTicketRecord, String> CLOSE_CODE = createField(DSL.name("CLOSE_CODE"), SQLDataType.VARCHAR(255), this, "「closeCode」- 关闭代码");

    /**
     * The column <code>ZDB.W_TICKET.CLOSE_KB</code>. 「closeKb」- 关闭时KB链接地址
     */
    public final TableField<WTicketRecord, String> CLOSE_KB = createField(DSL.name("CLOSE_KB"), SQLDataType.VARCHAR(1024), this, "「closeKb」- 关闭时KB链接地址");

    /**
     * The column <code>ZDB.W_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<WTicketRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.W_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<WTicketRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.W_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<WTicketRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.W_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<WTicketRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.W_TICKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<WTicketRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.W_TICKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<WTicketRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.W_TICKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<WTicketRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.W_TICKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<WTicketRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private WTicket(Name alias, Table<WTicketRecord> aliased) {
        this(alias, aliased, null);
    }

    private WTicket(Name alias, Table<WTicketRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.W_TICKET</code> table reference
     */
    public WTicket(String alias) {
        this(DSL.name(alias), W_TICKET);
    }

    /**
     * Create an aliased <code>ZDB.W_TICKET</code> table reference
     */
    public WTicket(Name alias) {
        this(alias, W_TICKET);
    }

    /**
     * Create a <code>ZDB.W_TICKET</code> table reference
     */
    public WTicket() {
        this(DSL.name("W_TICKET"), null);
    }

    public <O extends Record> WTicket(Table<O> child, ForeignKey<O, WTicketRecord> key) {
        super(child, key, W_TICKET);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.W_TICKET_IDXM_W_TICKET_SIGMA_CATALOG, Indexes.W_TICKET_IDXM_W_TICKET_SIGMA_FLOW_DEFINITION_KEY, Indexes.W_TICKET_IDXM_W_TICKET_SIGMA_STATUS, Indexes.W_TICKET_IDXM_W_TICKET_SIGMA_TYPE_STATUS);
    }

    @Override
    public UniqueKey<WTicketRecord> getPrimaryKey() {
        return Keys.KEY_W_TICKET_PRIMARY;
    }

    @Override
    public List<UniqueKey<WTicketRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_W_TICKET_SIGMA_2, Keys.KEY_W_TICKET_SIGMA);
    }

    @Override
    public WTicket as(String alias) {
        return new WTicket(DSL.name(alias), this);
    }

    @Override
    public WTicket as(Name alias) {
        return new WTicket(alias, this);
    }

    @Override
    public WTicket as(Table<?> alias) {
        return new WTicket(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public WTicket rename(String name) {
        return new WTicket(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WTicket rename(Name name) {
        return new WTicket(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public WTicket rename(Table<?> name) {
        return new WTicket(name.getQualifiedName(), null);
    }
}
