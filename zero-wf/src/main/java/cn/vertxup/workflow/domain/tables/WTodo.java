/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables;


import cn.vertxup.workflow.domain.Db;
import cn.vertxup.workflow.domain.Indexes;
import cn.vertxup.workflow.domain.Keys;
import cn.vertxup.workflow.domain.tables.records.WTodoRecord;
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
public class WTodo extends TableImpl<WTodoRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.W_TODO</code>
     */
    public static final WTodo W_TODO = new WTodo();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.W_TODO.KEY</code>. 「key」- 待办主键
     */
    public final TableField<WTodoRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 待办主键");
    /**
     * The column <code>DB_ETERNAL.W_TODO.SERIAL</code>. 「serial」- 待办编号，使用
     * X_NUMBER 生成
     */
    public final TableField<WTodoRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(128), this, "「serial」- 待办编号，使用 X_NUMBER 生成");
    /**
     * The column <code>DB_ETERNAL.W_TODO.NAME</code>. 「name」- 待办名称（标题）
     */
    public final TableField<WTodoRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 待办名称（标题）");
    /**
     * The column <code>DB_ETERNAL.W_TODO.CODE</code>. 「code」-
     * 待办系统码，使用流程时候关联流程的任务ID
     */
    public final TableField<WTodoRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(128), this, "「code」- 待办系统码，使用流程时候关联流程的任务ID");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ICON</code>. 「icon」- 待办显示的图标
     */
    public final TableField<WTodoRecord, String> ICON = createField(DSL.name("ICON"), SQLDataType.VARCHAR(255), this, "「icon」- 待办显示的图标");
    /**
     * The column <code>DB_ETERNAL.W_TODO.STATUS</code>. 「status」- 待办状态
     */
    public final TableField<WTodoRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(36), this, "「status」- 待办状态");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TODO_URL</code>. 「todoUrl」- 待办路径
     */
    public final TableField<WTodoRecord, String> TODO_URL = createField(DSL.name("TODO_URL"), SQLDataType.VARCHAR(255), this, "「todoUrl」- 待办路径");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TYPE</code>. 「type」- 待办类型
     */
    public final TableField<WTodoRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36), this, "「type」- 待办类型");
    /**
     * The column <code>DB_ETERNAL.W_TODO.EXPIRED_AT</code>. 「expiredAt」- 超时时间
     */
    public final TableField<WTodoRecord, LocalDateTime> EXPIRED_AT = createField(DSL.name("EXPIRED_AT"), SQLDataType.LOCALDATETIME(0), this, "「expiredAt」- 超时时间");
    /**
     * The column <code>DB_ETERNAL.W_TODO.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public final TableField<WTodoRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.W_TODO.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<WTodoRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.W_TODO.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    public final TableField<WTodoRecord, String> MODEL_CATEGORY = createField(DSL.name("MODEL_CATEGORY"), SQLDataType.VARCHAR(128), this, "「modelCategory」- 关联的category记录，只包含叶节点");
    /**
     * The column <code>DB_ETERNAL.W_TODO.PARENT_ID</code>. 「parentId」-
     * 待办支持父子集结构，父待办执行时候子待办同样执行
     */
    public final TableField<WTodoRecord, String> PARENT_ID = createField(DSL.name("PARENT_ID"), SQLDataType.VARCHAR(36), this, "「parentId」- 待办支持父子集结构，父待办执行时候子待办同样执行");
    /**
     * The column <code>DB_ETERNAL.W_TODO.SERIAL_FORK</code>. 「serialFork」-
     * 生成序号的分支序号
     */
    public final TableField<WTodoRecord, String> SERIAL_FORK = createField(DSL.name("SERIAL_FORK"), SQLDataType.VARCHAR(255), this, "「serialFork」- 生成序号的分支序号");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TRACE_ID</code>. 「traceId」-
     * 同一个流程的待办执行分组
     */
    public final TableField<WTodoRecord, String> TRACE_ID = createField(DSL.name("TRACE_ID"), SQLDataType.VARCHAR(36), this, "「traceId」- 同一个流程的待办执行分组");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TRACE_ORDER</code>. 「traceOrder」-
     * 待办的处理顺序
     */
    public final TableField<WTodoRecord, Integer> TRACE_ORDER = createField(DSL.name("TRACE_ORDER"), SQLDataType.INTEGER, this, "「traceOrder」- 待办的处理顺序");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TASK_ID</code>. 「taskId」-
     * 和待办绑定的taskId（任务）
     */
    public final TableField<WTodoRecord, String> TASK_ID = createField(DSL.name("TASK_ID"), SQLDataType.VARCHAR(36), this, "「taskId」- 和待办绑定的taskId（任务）");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TASK_KEY</code>. 「taskKey」-
     * 和待办绑定的taskKey
     */
    public final TableField<WTodoRecord, String> TASK_KEY = createField(DSL.name("TASK_KEY"), SQLDataType.VARCHAR(255), this, "「taskKey」- 和待办绑定的taskKey");
    /**
     * The column <code>DB_ETERNAL.W_TODO.COMMENT</code>. 「comment」- 待办描述
     */
    public final TableField<WTodoRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 待办描述");
    /**
     * The column <code>DB_ETERNAL.W_TODO.COMMENT_APPROVAL</code>.
     * 「commentApproval」- 审批描述
     */
    public final TableField<WTodoRecord, String> COMMENT_APPROVAL = createField(DSL.name("COMMENT_APPROVAL"), SQLDataType.CLOB, this, "「commentApproval」- 审批描述");
    /**
     * The column <code>DB_ETERNAL.W_TODO.COMMENT_REJECT</code>.
     * 「commentReject」- 拒绝理由
     */
    public final TableField<WTodoRecord, String> COMMENT_REJECT = createField(DSL.name("COMMENT_REJECT"), SQLDataType.CLOB, this, "「commentReject」- 拒绝理由");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TO_LOCATION</code>. 「toLocation」-
     * 指定地址区域
     */
    public final TableField<WTodoRecord, String> TO_LOCATION = createField(DSL.name("TO_LOCATION"), SQLDataType.VARCHAR(36), this, "「toLocation」- 指定地址区域");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TO_GROUP</code>. 「toGroup」- 指定用户组
     */
    public final TableField<WTodoRecord, String> TO_GROUP = createField(DSL.name("TO_GROUP"), SQLDataType.VARCHAR(36), this, "「toGroup」- 指定用户组");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TO_TEAM</code>. 「toTeam」- 指定业务组
     */
    public final TableField<WTodoRecord, String> TO_TEAM = createField(DSL.name("TO_TEAM"), SQLDataType.VARCHAR(36), this, "「toTeam」- 指定业务组");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TO_ROLE</code>. 「toRole」- 待办角色（集体）
     */
    public final TableField<WTodoRecord, String> TO_ROLE = createField(DSL.name("TO_ROLE"), SQLDataType.VARCHAR(36), this, "「toRole」- 待办角色（集体）");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TO_USER</code>. 「toUser」- 待办指定人
     */
    public final TableField<WTodoRecord, String> TO_USER = createField(DSL.name("TO_USER"), SQLDataType.VARCHAR(36), this, "「toUser」- 待办指定人");
    /**
     * The column <code>DB_ETERNAL.W_TODO.TO_DEPT</code>. 「toDept」- 指定部门
     */
    public final TableField<WTodoRecord, String> TO_DEPT = createField(DSL.name("TO_DEPT"), SQLDataType.VARCHAR(36), this, "「toDept」- 指定部门");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ESCALATE</code>. 「escalate」- 是否升级
     */
    public final TableField<WTodoRecord, Boolean> ESCALATE = createField(DSL.name("ESCALATE"), SQLDataType.BIT, this, "「escalate」- 是否升级");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ESCALATE_DATA</code>. 「escalateData」-
     * 升级单据数据
     */
    public final TableField<WTodoRecord, String> ESCALATE_DATA = createField(DSL.name("ESCALATE_DATA"), SQLDataType.CLOB, this, "「escalateData」- 升级单据数据");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ASSIGNED_BY</code>. 「assignedBy」-
     * 待办指派人
     */
    public final TableField<WTodoRecord, String> ASSIGNED_BY = createField(DSL.name("ASSIGNED_BY"), SQLDataType.VARCHAR(36), this, "「assignedBy」- 待办指派人");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ASSIGNED_AT</code>. 「assignedAt」- 指派时间
     */
    public final TableField<WTodoRecord, LocalDateTime> ASSIGNED_AT = createField(DSL.name("ASSIGNED_AT"), SQLDataType.LOCALDATETIME(0), this, "「assignedAt」- 指派时间");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ACCEPTED_BY</code>. 「acceptedBy」-
     * 待办接收人
     */
    public final TableField<WTodoRecord, String> ACCEPTED_BY = createField(DSL.name("ACCEPTED_BY"), SQLDataType.VARCHAR(36), this, "「acceptedBy」- 待办接收人");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ACCEPTED_GROUP</code>.
     * 「acceptedGroup」- 当前处理组
     */
    public final TableField<WTodoRecord, String> ACCEPTED_GROUP = createField(DSL.name("ACCEPTED_GROUP"), SQLDataType.CLOB, this, "「acceptedGroup」- 当前处理组");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ACCEPTED_AT</code>. 「acceptedAt」- 接收时间
     */
    public final TableField<WTodoRecord, LocalDateTime> ACCEPTED_AT = createField(DSL.name("ACCEPTED_AT"), SQLDataType.LOCALDATETIME(0), this, "「acceptedAt」- 接收时间");
    /**
     * The column <code>DB_ETERNAL.W_TODO.FINISHED_BY</code>. 「finishedBy」-
     * 待办完成人
     */
    public final TableField<WTodoRecord, String> FINISHED_BY = createField(DSL.name("FINISHED_BY"), SQLDataType.VARCHAR(36), this, "「finishedBy」- 待办完成人");
    /**
     * The column <code>DB_ETERNAL.W_TODO.FINISHED_AT</code>. 「finishedAt」- 完成时间
     */
    public final TableField<WTodoRecord, LocalDateTime> FINISHED_AT = createField(DSL.name("FINISHED_AT"), SQLDataType.LOCALDATETIME(0), this, "「finishedAt」- 完成时间");
    /**
     * The column <code>DB_ETERNAL.W_TODO.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<WTodoRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.W_TODO.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<WTodoRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.W_TODO.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<WTodoRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.W_TODO.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<WTodoRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.W_TODO.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<WTodoRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.W_TODO.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<WTodoRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.W_TODO.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<WTodoRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.W_TODO.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<WTodoRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private WTodo(Name alias, Table<WTodoRecord> aliased) {
        this(alias, aliased, null);
    }

    private WTodo(Name alias, Table<WTodoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.W_TODO</code> table reference
     */
    public WTodo(String alias) {
        this(DSL.name(alias), W_TODO);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.W_TODO</code> table reference
     */
    public WTodo(Name alias) {
        this(alias, W_TODO);
    }

    /**
     * Create a <code>DB_ETERNAL.W_TODO</code> table reference
     */
    public WTodo() {
        this(DSL.name("W_TODO"), null);
    }

    public <O extends Record> WTodo(Table<O> child, ForeignKey<O, WTodoRecord> key) {
        super(child, key, W_TODO);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WTodoRecord> getRecordType() {
        return WTodoRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.W_TODO_IDXM_W_TODO_SIGMA_STATUS, Indexes.W_TODO_IDXM_W_TODO_SIGMA_TYPE_STATUS);
    }

    @Override
    public UniqueKey<WTodoRecord> getPrimaryKey() {
        return Keys.KEY_W_TODO_PRIMARY;
    }

    @Override
    public List<UniqueKey<WTodoRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_W_TODO_SIGMA_2, Keys.KEY_W_TODO_SIGMA);
    }

    @Override
    public WTodo as(String alias) {
        return new WTodo(DSL.name(alias), this);
    }

    @Override
    public WTodo as(Name alias) {
        return new WTodo(alias, this);
    }

    @Override
    public WTodo as(Table<?> alias) {
        return new WTodo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public WTodo rename(String name) {
        return new WTodo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WTodo rename(Name name) {
        return new WTodo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public WTodo rename(Table<?> name) {
        return new WTodo(name.getQualifiedName(), null);
    }
}
