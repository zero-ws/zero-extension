-- liquibase formatted sql

-- changeset Lang:d-doc-q-1
-- 问题专用表：D_DOC_QUESTION
/*
 * 题目专用表
 * - 非考试模式（不依赖标准答案）
 * - 考试模式（依赖标准答案）
 */
DROP TABLE IF EXISTS D_DOC_QUESTION;
CREATE TABLE IF NOT EXISTS D_DOC_QUESTION
(
    `KEY`         VARCHAR(36) COMMENT '「key」- 问题主键',
    `CODE`        VARCHAR(255) COMMENT '「code」- 问题编号',
    `NAME`        VARCHAR(255) COMMENT '「name」- 题干',
    `TYPE`        VARCHAR(128) COMMENT '「type」- 题目类型',
    `SORT`        INT COMMENT '「sort」- 题目排序',

    `BRIEF`       LONGTEXT COMMENT '「brief」- 题目描述信息',
    `OPTIONS`     LONGTEXT COMMENT '「options」- 题目选项',
    `SCORE`       DECIMAL(18, 4) COMMENT '「score」- 题目分值',
    `SCORE_GRADE` INTEGER COMMENT '「scoreGrade」- 题目难度',

    -- 本题的源头，用于记录题目关联的文档结构中的某部分
    `MODEL_ID`    VARCHAR(255) COMMENT '「modelId」- 关联的模型identifier，用于描述',
    `MODEL_KEY`   VARCHAR(36) COMMENT '「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录',

    -- 特殊字段
    `SIGMA`       VARCHAR(32) COMMENT '「sigma」- 统一标识',
    `LANGUAGE`    VARCHAR(10) COMMENT '「language」- 使用的语言',
    `ACTIVE`      BIT COMMENT '「active」- 是否启用',
    `METADATA`    TEXT COMMENT '「metadata」- 附加配置数据',

    -- Auditor字段
    `CREATED_AT`  DATETIME COMMENT '「createdAt」- 创建时间',
    `CREATED_BY`  VARCHAR(36) COMMENT '「createdBy」- 创建人',
    `UPDATED_AT`  DATETIME COMMENT '「updatedAt」- 更新时间',
    `UPDATED_BY`  VARCHAR(36) COMMENT '「updatedBy」- 更新人',
    PRIMARY KEY (`KEY`) USING BTREE
)