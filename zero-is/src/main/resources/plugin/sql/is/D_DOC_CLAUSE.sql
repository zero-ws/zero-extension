-- liquibase formatted sql

-- changeset Lang:d-doc-clause-1
/*
 * 另外一个维度的文档处理，非树型结构，但所属谋一份文档
 * 在法规和制度中，用于表示条款信息
 */
DROP TABLE IF EXISTS D_DOC_CLAUSE;
CREATE TABLE IF NOT EXISTS D_DOC_CLAUSE
(
    `KEY`        VARCHAR(36) COMMENT '「key」- 条款主键',

    `NAME`       VARCHAR(255) COMMENT '「name」- 条款标题',
    `TYPE`       VARCHAR(128) COMMENT '「type」- 条款类型',
    `PREFIX`     VARCHAR(255) COMMENT '「prefix」- 条款前缀',
    `STATUS`     VARCHAR(12) COMMENT '「status」- 状态',
    `CONTENT`    LONGTEXT COMMENT '「content」- 条款内容（带格式）',
    -- 条款排序、层级
    `SORT`       INT COMMENT '「sort」- 排序',
    `LEVEL`      INT COMMENT '「level」- 条款层级',
    /**
     * 条款关系、只有父子关系，条款和文档的直接关系反应到
     * D_REFER 中，通过一般通过下边两种模式关联
     * 1）条款到章节的关系（条款关联的章节，可树型章节）
     * 2）条款到文档的关系（条款关联到文档，所属文档）
     * 网状结构，所以条款位于文档之外，虽然也是法规和制度的一部分，但最终落实时，还是落实到文档上
     * 条款本身可以支持
     * - 拆分
     * - 合并
     */
    `PARENT_ID`  VARCHAR(36) COMMENT '「parentId」- 父条款ID',

    -- 特殊字段
    `SIGMA`      VARCHAR(32) COMMENT '「sigma」- 统一标识',
    `LANGUAGE`   VARCHAR(10) COMMENT '「language」- 使用的语言',
    `ACTIVE`     BIT COMMENT '「active」- 是否启用',
    `METADATA`   TEXT COMMENT '「metadata」- 附加配置数据',

    -- Auditor字段
    `CREATED_AT` DATETIME COMMENT '「createdAt」- 创建时间',
    `CREATED_BY` VARCHAR(36) COMMENT '「createdBy」- 创建人',
    `UPDATED_AT` DATETIME COMMENT '「updatedAt」- 更新时间',
    `UPDATED_BY` VARCHAR(36) COMMENT '「updatedBy」- 更新人',
    PRIMARY KEY (`KEY`) USING BTREE
)