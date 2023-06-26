-- liquibase formatted sql

-- changeset Lang:i-reference-1
-- 关联表：I_REFERENCE
DROP TABLE IF EXISTS I_REFERENCE;
CREATE TABLE IF NOT EXISTS I_REFERENCE
(
    `DOC_ID`         VARCHAR(36) COMMENT '「docId」- 文档ID',
    `ENTITY_TYPE`    VARCHAR(255) COMMENT '「entityType」- 关联类型',
    `ENTITY_ID`      VARCHAR(36) COMMENT '「entityId」- 关联实体ID',
    `LINK_COMPONENT` VARCHAR(255) COMMENT '「linkComponent」- 关联执行组件（扩展用）',
    `COMMENT`        TEXT COMMENT '「comment」- 关系备注',
    PRIMARY KEY (`TAG_ID`, `ENTITY_TYPE`, `ENTITY_ID`)
);