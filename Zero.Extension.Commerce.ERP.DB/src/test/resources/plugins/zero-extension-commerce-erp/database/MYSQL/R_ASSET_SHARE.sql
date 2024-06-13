-- liquibase formatted sql

-- changeset Lang:h-asset-share-1
-- 关联表：R_ASSET_SHARE
DROP TABLE IF EXISTS R_ASSET_SHARE;
CREATE TABLE IF NOT EXISTS R_ASSET_SHARE
(
    `ASSET_ID`       VARCHAR(36) COMMENT '「assetId」- 资产ID',
    `ENTITY_TYPE`    VARCHAR(64) COMMENT '「entityType」- 关联类型',
    `ENTITY_ID`      VARCHAR(36) COMMENT '「entityId」- 关联实体ID',
    `LINK_COMPONENT` VARCHAR(255) COMMENT '「linkComponent」- 关联执行组件（扩展用）',
    `COMMENT`        TEXT COMMENT '「comment」- 关系备注',
    PRIMARY KEY (`ASSET_ID`, `ENTITY_TYPE`, `ENTITY_ID`)
);