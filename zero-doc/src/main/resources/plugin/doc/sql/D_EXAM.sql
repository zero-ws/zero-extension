-- liquibase formatted sql

-- changeset Lang:d-exam-1
-- 文档专用表：D_EXAM
/*
 * 问卷表
 * 考试表
 */
DROP TABLE IF EXISTS D_EXAM;
CREATE TABLE IF NOT EXISTS D_EXAM
(
    `KEY`        VARCHAR(36) COMMENT '「key」- 问卷主键',
    `CODE`       VARCHAR(255) COMMENT '「code」- 问卷编号',
    `NAME`       VARCHAR(255) COMMENT '「name」- 问卷标题',
    `TYPE`       VARCHAR(128) COMMENT '「type」- 问卷类型',

    `UI_COVER`   LONGTEXT COMMENT '「uiCover」- 封面图片',
    `UI_BG`      LONGTEXT COMMENT '「uiBg」- 问卷背景图',

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