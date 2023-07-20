-- liquibase formatted sql

-- changeset Lang:d-comment-1
DROP TABLE IF EXISTS D_COMMENT;
CREATE TABLE IF NOT EXISTS D_COMMENT
(
    `KEY`        VARCHAR(36) COMMENT '「key」- 解读主键',
    `CODE`       VARCHAR(255) COMMENT '「code」- 备注编号',
    `NAME`       VARCHAR(255) COMMENT '「name」- 备注标题',
    `TYPE`       VARCHAR(128) COMMENT '「type」- 备注类型',
    `SORT`       INT COMMENT '「sort」- 备注排序',
    `CONTENT`    LONGTEXT COMMENT '「content」- 备注内容、解读内容',
    -- 章节、条款、文档解读，不同解读关联不同模型，解读信息不走 D_REFER 表结
    `MODEL_ID`   VARCHAR(255) COMMENT '「modelId」- 关联的模型identifier，用于描述',
    `MODEL_KEY`  VARCHAR(36) COMMENT '「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录',
    -- 特殊字段
    `SIGMA`      VARCHAR(32) COMMENT '「sigma」- 统一标识',
    `LANGUAGE`   VARCHAR(10) COMMENT '「language」- 使用的语言',
    `ACTIVE`     BIT COMMENT '「active」- 是否启用',
    `METADATA`   TEXT COMMENT '「metadata」- 附加配置数据',

    -- 评价人
    `MADE_NAME`  VARCHAR(123) COMMENT '「madeName」- 备注人姓名',
    `MADE_AT`    DATETIME COMMENT '「madeAt」- 备注时间',

    -- Auditor字段
    `CREATED_AT` DATETIME COMMENT '「createdAt」- 创建时间',
    `CREATED_BY` VARCHAR(36) COMMENT '「createdBy」- 创建人',
    `UPDATED_AT` DATETIME COMMENT '「updatedAt」- 更新时间',
    `UPDATED_BY` VARCHAR(36) COMMENT '「updatedBy」- 更新人',
    PRIMARY KEY (`KEY`) USING BTREE
)