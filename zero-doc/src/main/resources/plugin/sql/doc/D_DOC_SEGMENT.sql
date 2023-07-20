-- liquibase formatted sql

-- changeset Lang:d-doc-segment-1
-- 文档章节表：D_DOC_SEGMENT
/*
 * 章节支持树型结构，可以直接反向构造某一份文档的章节相关信息
 * 文档本身只带简介、描述，不带章节
 */
DROP TABLE IF EXISTS D_DOC_SEGMENT;
CREATE TABLE IF NOT EXISTS D_DOC_SEGMENT
(
    `KEY`           VARCHAR(36) COMMENT '「key」- 文档主键，唯一标识',
    -- 章节基础属性
    `CODE`          VARCHAR(255) COMMENT '「code」- 章节编号',
    -- 章节大类：目录、序、正文、附录，即使是有父章节关系，章节本身也可以带有内容，作为章节前置文本
    `NAME`          VARCHAR(255) COMMENT '「name」- 章节标题',
    `TYPE`          VARCHAR(128) COMMENT '「type」- 章节类型',
    `PREFIX`        VARCHAR(255) COMMENT '「prefix」- 章节前缀',
    `STATUS`        VARCHAR(12) COMMENT '「status」- 状态',
    /*
     * 主格式使用 content
     * 1. 文本格式多为去掉 HTML 标签之后的纯文本格式
     * 2. 存储格式为底层存储格式，可能是一个 XML 或一个 JSON
     */
    `CONTENT`       LONGTEXT COMMENT '「content」- 章节内容（带格式）',
    `CONTENT_TEXT`  LONGTEXT COMMENT '「contentText」- 无格式章节内容',
    `CONTENT_STORE` LONGTEXT COMMENT '「contentStore」- 存储格式',
    -- 章节排序、层级
    `SORT`          INT COMMENT '「sort」- 排序',
    `LEVEL`         INT COMMENT '「level」- 章节层级',
    -- 章节关系
    `DOC_ID`        VARCHAR(36) COMMENT '「docId」- 章节所属文档ID',
    `PARENT_ID`     VARCHAR(36) COMMENT '「parentId」- 父章节ID',

    -- 特殊字段
    `SIGMA`         VARCHAR(32) COMMENT '「sigma」- 统一标识',
    `LANGUAGE`      VARCHAR(10) COMMENT '「language」- 使用的语言',
    `ACTIVE`        BIT COMMENT '「active」- 是否启用',
    `METADATA`      TEXT COMMENT '「metadata」- 附加配置数据',

    -- Auditor字段
    `CREATED_AT`    DATETIME COMMENT '「createdAt」- 创建时间',
    `CREATED_BY`    VARCHAR(36) COMMENT '「createdBy」- 创建人',
    `UPDATED_AT`    DATETIME COMMENT '「updatedAt」- 更新时间',
    `UPDATED_BY`    VARCHAR(36) COMMENT '「updatedBy」- 更新人',
    PRIMARY KEY (`KEY`) USING BTREE
);
-- changeset Lang:d-doc-segment-2
ALTER TABLE D_DOC_SEGMENT
    ADD UNIQUE (`NAME`, `DOC_ID`, `PARENT_ID`) USING BTREE;