/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables;


import io.zerows.extension.commerce.rbac.domain.Indexes;
import io.zerows.extension.commerce.rbac.domain.Keys;
import io.zerows.extension.commerce.rbac.domain.Zdb;
import io.zerows.extension.commerce.rbac.domain.tables.records.SPacketRecord;
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
public class SPacket extends TableImpl<SPacketRecord> {

    /**
     * The reference instance of <code>ZDB.S_PACKET</code>
     */
    public static final SPacket S_PACKET = new SPacket();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.S_PACKET.KEY</code>. 「key」- 包信息
     */
    public final TableField<SPacketRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 包信息");
    /**
     * The column <code>ZDB.S_PACKET.CODE</code>. 「code」- 关联的 PATH 表对应的 code
     */
    public final TableField<SPacketRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 关联的 PATH 表对应的 code");
    /**
     * The column <code>ZDB.S_PACKET.RESOURCE</code>. 「resource」- 关联的资源表对应的 code
     */
    public final TableField<SPacketRecord, String> RESOURCE = createField(DSL.name("RESOURCE"), SQLDataType.VARCHAR(255), this, "「resource」- 关联的资源表对应的 code");
    /**
     * The column <code>ZDB.S_PACKET.H_TYPE</code>. 「hType」- 行过滤类型
     */
    public final TableField<SPacketRecord, String> H_TYPE = createField(DSL.name("H_TYPE"), SQLDataType.VARCHAR(16), this, "「hType」- 行过滤类型");
    /**
     * The column <code>ZDB.S_PACKET.H_MAPPING</code>. 「hMapping」-
     * 字段映射关系，存在转换时必须
     */
    public final TableField<SPacketRecord, String> H_MAPPING = createField(DSL.name("H_MAPPING"), SQLDataType.CLOB, this, "「hMapping」- 字段映射关系，存在转换时必须");
    /**
     * The column <code>ZDB.S_PACKET.H_CONFIG</code>. 「hConfig」- 字段附加配置
     */
    public final TableField<SPacketRecord, String> H_CONFIG = createField(DSL.name("H_CONFIG"), SQLDataType.CLOB, this, "「hConfig」- 字段附加配置");
    /**
     * The column <code>ZDB.S_PACKET.V_TYPE</code>. 「vType」- 列过滤类型
     */
    public final TableField<SPacketRecord, String> V_TYPE = createField(DSL.name("V_TYPE"), SQLDataType.VARCHAR(16), this, "「vType」- 列过滤类型");
    /**
     * The column <code>ZDB.S_PACKET.V_MAPPING</code>. 「vMapping」-
     * 列字段映射关系，存在转换时必须
     */
    public final TableField<SPacketRecord, String> V_MAPPING = createField(DSL.name("V_MAPPING"), SQLDataType.CLOB, this, "「vMapping」- 列字段映射关系，存在转换时必须");
    /**
     * The column <code>ZDB.S_PACKET.V_CONFIG</code>. 「vConfig」- 列配置
     */
    public final TableField<SPacketRecord, String> V_CONFIG = createField(DSL.name("V_CONFIG"), SQLDataType.CLOB, this, "「vConfig」- 列配置");
    /**
     * The column <code>ZDB.S_PACKET.Q_TYPE</code>. 「qType」- 条件模板
     */
    public final TableField<SPacketRecord, String> Q_TYPE = createField(DSL.name("Q_TYPE"), SQLDataType.VARCHAR(16), this, "「qType」- 条件模板");
    /**
     * The column <code>ZDB.S_PACKET.Q_MAPPING</code>. 「qMapping」- 查询条件映射关系
     */
    public final TableField<SPacketRecord, String> Q_MAPPING = createField(DSL.name("Q_MAPPING"), SQLDataType.CLOB, this, "「qMapping」- 查询条件映射关系");
    /**
     * The column <code>ZDB.S_PACKET.Q_CONFIG</code>. 「qConfig」- 条件配置（界面配置相关）
     */
    public final TableField<SPacketRecord, String> Q_CONFIG = createField(DSL.name("Q_CONFIG"), SQLDataType.CLOB, this, "「qConfig」- 条件配置（界面配置相关）");
    /**
     * The column <code>ZDB.S_PACKET.RUN_COMPONENT</code>. 「runComponent」-
     * 自定义模式下的组件
     */
    public final TableField<SPacketRecord, String> RUN_COMPONENT = createField(DSL.name("RUN_COMPONENT"), SQLDataType.VARCHAR(255), this, "「runComponent」- 自定义模式下的组件");
    /**
     * The column <code>ZDB.S_PACKET.RUN_CONFIG</code>. 「runConfig」- 运行专用配置
     */
    public final TableField<SPacketRecord, String> RUN_CONFIG = createField(DSL.name("RUN_CONFIG"), SQLDataType.CLOB, this, "「runConfig」- 运行专用配置");
    /**
     * The column <code>ZDB.S_PACKET.SEEK_SYNTAX</code>. 「seekSyntax」- 访问者语法
     */
    public final TableField<SPacketRecord, String> SEEK_SYNTAX = createField(DSL.name("SEEK_SYNTAX"), SQLDataType.CLOB, this, "「seekSyntax」- 访问者语法");
    /**
     * The column <code>ZDB.S_PACKET.SEEK_CONFIG</code>. 「seekConfig」- 访问者配置
     */
    public final TableField<SPacketRecord, String> SEEK_CONFIG = createField(DSL.name("SEEK_CONFIG"), SQLDataType.CLOB, this, "「seekConfig」- 访问者配置");
    /**
     * The column <code>ZDB.S_PACKET.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<SPacketRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.S_PACKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SPacketRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.S_PACKET.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SPacketRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.S_PACKET.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SPacketRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>ZDB.S_PACKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SPacketRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.S_PACKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SPacketRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.S_PACKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SPacketRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.S_PACKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SPacketRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private SPacket(Name alias, Table<SPacketRecord> aliased) {
        this(alias, aliased, null);
    }

    private SPacket(Name alias, Table<SPacketRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.S_PACKET</code> table reference
     */
    public SPacket(String alias) {
        this(DSL.name(alias), S_PACKET);
    }

    /**
     * Create an aliased <code>ZDB.S_PACKET</code> table reference
     */
    public SPacket(Name alias) {
        this(alias, S_PACKET);
    }

    /**
     * Create a <code>ZDB.S_PACKET</code> table reference
     */
    public SPacket() {
        this(DSL.name("S_PACKET"), null);
    }

    public <O extends Record> SPacket(Table<O> child, ForeignKey<O, SPacketRecord> key) {
        super(child, key, S_PACKET);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SPacketRecord> getRecordType() {
        return SPacketRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.S_PACKET_IDX_S_PACKET_PATH_CODE_SIGMA);
    }

    @Override
    public UniqueKey<SPacketRecord> getPrimaryKey() {
        return Keys.KEY_S_PACKET_PRIMARY;
    }

    @Override
    public List<UniqueKey<SPacketRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_S_PACKET_CODE);
    }

    @Override
    public SPacket as(String alias) {
        return new SPacket(DSL.name(alias), this);
    }

    @Override
    public SPacket as(Name alias) {
        return new SPacket(alias, this);
    }

    @Override
    public SPacket as(Table<?> alias) {
        return new SPacket(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SPacket rename(String name) {
        return new SPacket(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SPacket rename(Name name) {
        return new SPacket(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SPacket rename(Table<?> name) {
        return new SPacket(name.getQualifiedName(), null);
    }
}