/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables;


import cn.vertxup.erp.domain.Indexes;
import cn.vertxup.erp.domain.Keys;
import cn.vertxup.erp.domain.Zdb;
import cn.vertxup.erp.domain.tables.records.ETeamRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function19;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row19;
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
public class ETeam extends TableImpl<ETeamRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.E_TEAM</code>
     */
    public static final ETeam E_TEAM = new ETeam();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ETeamRecord> getRecordType() {
        return ETeamRecord.class;
    }

    /**
     * The column <code>ZDB.E_TEAM.KEY</code>. 「key」- 组主键
     */
    public final TableField<ETeamRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 组主键");

    /**
     * The column <code>ZDB.E_TEAM.NAME</code>. 「name」- 组名称
     */
    public final TableField<ETeamRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 组名称");

    /**
     * The column <code>ZDB.E_TEAM.CODE</code>. 「code」- 组编号
     */
    public final TableField<ETeamRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 组编号");

    /**
     * The column <code>ZDB.E_TEAM.LEADER_ID</code>. 「leaderId」- 组长
     */
    public final TableField<ETeamRecord, String> LEADER_ID = createField(DSL.name("LEADER_ID"), SQLDataType.VARCHAR(36), this, "「leaderId」- 组长");

    /**
     * The column <code>ZDB.E_TEAM.LEADER_NAME</code>. 「leaderName」- 组长姓名
     */
    public final TableField<ETeamRecord, String> LEADER_NAME = createField(DSL.name("LEADER_NAME"), SQLDataType.VARCHAR(36), this, "「leaderName」- 组长姓名");

    /**
     * The column <code>ZDB.E_TEAM.DEPT_ID</code>. 「deptId」- 所属部门
     */
    public final TableField<ETeamRecord, String> DEPT_ID = createField(DSL.name("DEPT_ID"), SQLDataType.VARCHAR(36), this, "「deptId」- 所属部门");

    /**
     * The column <code>ZDB.E_TEAM.TEAM_ID</code>. 「teamId」- 父组ID
     */
    public final TableField<ETeamRecord, String> TEAM_ID = createField(DSL.name("TEAM_ID"), SQLDataType.VARCHAR(36), this, "「teamId」- 父组ID");

    /**
     * The column <code>ZDB.E_TEAM.COMMENT</code>. 「comment」- 组备注
     */
    public final TableField<ETeamRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 组备注");

    /**
     * The column <code>ZDB.E_TEAM.BIND_ID</code>. 「bindId」- 绑定用户组ID,安全专用处理
     */
    public final TableField<ETeamRecord, String> BIND_ID = createField(DSL.name("BIND_ID"), SQLDataType.VARCHAR(36), this, "「bindId」- 绑定用户组ID,安全专用处理");

    /**
     * The column <code>ZDB.E_TEAM.BIND_COMPONENT</code>. 「bindComponent」-
     * 绑定扩展组件
     */
    public final TableField<ETeamRecord, String> BIND_COMPONENT = createField(DSL.name("BIND_COMPONENT"), SQLDataType.VARCHAR(255), this, "「bindComponent」- 绑定扩展组件");

    /**
     * The column <code>ZDB.E_TEAM.BIND_CONFIG</code>. 「bindConfig」- 绑定JSON详细配置
     */
    public final TableField<ETeamRecord, String> BIND_CONFIG = createField(DSL.name("BIND_CONFIG"), SQLDataType.CLOB, this, "「bindConfig」- 绑定JSON详细配置");

    /**
     * The column <code>ZDB.E_TEAM.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<ETeamRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.E_TEAM.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<ETeamRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.E_TEAM.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<ETeamRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.E_TEAM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<ETeamRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.E_TEAM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<ETeamRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.E_TEAM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<ETeamRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.E_TEAM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<ETeamRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.E_TEAM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<ETeamRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private ETeam(Name alias, Table<ETeamRecord> aliased) {
        this(alias, aliased, null);
    }

    private ETeam(Name alias, Table<ETeamRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.E_TEAM</code> table reference
     */
    public ETeam(String alias) {
        this(DSL.name(alias), E_TEAM);
    }

    /**
     * Create an aliased <code>ZDB.E_TEAM</code> table reference
     */
    public ETeam(Name alias) {
        this(alias, E_TEAM);
    }

    /**
     * Create a <code>ZDB.E_TEAM</code> table reference
     */
    public ETeam() {
        this(DSL.name("E_TEAM"), null);
    }

    public <O extends Record> ETeam(Table<O> child, ForeignKey<O, ETeamRecord> key) {
        super(child, key, E_TEAM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.E_TEAM_IDX_E_TEAM_SIGMA, Indexes.E_TEAM_IDX_E_TEAM_SIGMA_ACTIVE);
    }

    @Override
    public UniqueKey<ETeamRecord> getPrimaryKey() {
        return Keys.KEY_E_TEAM_PRIMARY;
    }

    @Override
    public List<UniqueKey<ETeamRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_E_TEAM_NAME, Keys.KEY_E_TEAM_CODE);
    }

    @Override
    public ETeam as(String alias) {
        return new ETeam(DSL.name(alias), this);
    }

    @Override
    public ETeam as(Name alias) {
        return new ETeam(alias, this);
    }

    @Override
    public ETeam as(Table<?> alias) {
        return new ETeam(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ETeam rename(String name) {
        return new ETeam(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ETeam rename(Name name) {
        return new ETeam(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ETeam rename(Table<?> name) {
        return new ETeam(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function19<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function19<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
