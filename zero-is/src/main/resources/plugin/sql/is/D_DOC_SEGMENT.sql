-- liquibase formatted sql

-- changeset Lang:d-doc-chapter-1
-- 文档章节表：D_DOC_SEGMENT
/*
 * 章节支持树型结构，可以直接反向构造某一份文档的章节相关信息
 * 文档本身只带简介、描述，不带章节
 */
DROP TABLE IF EXISTS D_DOC_SEGMENT;
CREATE TABLE IF NOT EXISTS D_DOC_SEGMENT
(
    `KEY`        VARCHAR(36) COMMENT '「key」- 文档主键，唯一标识',

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
);
