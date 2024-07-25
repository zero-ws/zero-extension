-- liquibase formatted sql

-- changeset Lang:kp-feature-1
-- 报表特征表：KP_FEATURE
DROP TABLE IF EXISTS KP_FEATURE;
CREATE TABLE IF NOT EXISTS KP_FEATURE
(
    `KEY`           VARCHAR(36) COMMENT '「key」- 特征主键',
    `NAME`          VARCHAR(255) COMMENT '「name」- 特征名称',
    `TYPE`          VARCHAR(255) COMMENT '「type」- 特征类型',
    `STATUS`        VARCHAR(255) COMMENT '「status」- 特征状态',

    -- 查询维度配置
    `FIELD_NAME`    VARCHAR(255) COMMENT '「fieldName」- 特征名称',
    `IN_CONFIG`     LONGTEXT COMMENT '「inConfig」- 特殊输出配置',
    `IN_COMPONENT`  LONGTEXT COMMENT '「inComponent」- 特殊输出组件',
    `OUT_CONFIG`    LONGTEXT COMMENT '「outConfig」- 特殊输出配置',
    `OUT_COMPONENT` LONGTEXT COMMENT '「outComponent」- 特殊输出组件',

    -- 关联报表ID
    `REPORT_ID`     VARCHAR(36) COMMENT '「reportId」- 关联报表ID',

    -- 特殊字段
    `ACTIVE`        BIT         DEFAULT NULL COMMENT '「active」- 是否启用',
    `SIGMA`         VARCHAR(32) DEFAULT NULL COMMENT '「sigma」- 统一标识',
    `METADATA`      TEXT COMMENT '「metadata」- 附加配置',
    `LANGUAGE`      VARCHAR(8)  DEFAULT NULL COMMENT '「language」- 使用的语言',

    -- Auditor字段
    `CREATED_AT`    DATETIME COMMENT '「createdAt」- 创建时间',
    `CREATED_BY`    VARCHAR(36) COMMENT '「createdBy」- 创建人',
    `UPDATED_AT`    DATETIME COMMENT '「updatedAt」- 更新时间',
    `UPDATED_BY`    VARCHAR(36) COMMENT '「updatedBy」- 更新人',
    PRIMARY KEY (`KEY`)
)