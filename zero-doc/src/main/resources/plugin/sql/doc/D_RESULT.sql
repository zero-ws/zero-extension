-- liquibase formatted sql

-- changeset Lang:d-result-1
DROP TABLE IF EXISTS D_RESULT;
CREATE TABLE IF NOT EXISTS D_RESULT
(
    `KEY`         VARCHAR(36) COMMENT '「key」- 评价主键',
    `CODE`        VARCHAR(255) COMMENT '「code」- 评价编号',
    `NAME`        VARCHAR(255) COMMENT '「name」- 评价标题',
    `TYPE`        VARCHAR(128) COMMENT '「type」- 评价类型',
    `SORT`        INT COMMENT '「sort」- 评价排序',

    `CONTENT`     LONGTEXT COMMENT '「content」- 备注内容、评价内容',
    `SCORE`       DECIMAL(18, 4) COMMENT '「score」- 分数',
    `SCORE_MARK`  VARCHAR(128) COMMENT '「scoreMark」- 评价对应文字描述，符号',
    `SCORE_GRADE` INTEGER COMMENT '「scoreGrade」- 等级信息，数值越大等级越高',
    -- 章节、条款、文档评价，不同评价关联不同模型，评价信息不走 D_REFER 表结
    `MODEL_ID`    VARCHAR(255) COMMENT '「modelId」- 关联的模型identifier，用于描述',
    `MODEL_KEY`   VARCHAR(36) COMMENT '「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录',

    -- 评价人
    `MADE_NAME`   VARCHAR(123) COMMENT '「madeName」- 评价人姓名',
    `MADE_AT`     DATETIME COMMENT '「madeAt」- 评价时间',

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