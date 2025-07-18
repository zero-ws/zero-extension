-- liquibase formatted sql

-- changeset Lang:f-trans-item-1
DROP TABLE IF EXISTS `F_TRANS_ITEM`;
CREATE TABLE `F_TRANS_ITEM`
(
    `KEY`            VARCHAR(36) COMMENT '「key」- 收款明细账单主键ID',
    `NAME`           VARCHAR(255) COMMENT '「name」 - 收款明细单标题',
    `CODE`           VARCHAR(255)   NOT NULL COMMENT '「code」 - 收款明细单编号',
    `SERIAL`         VARCHAR(36)    NOT NULL COMMENT '「serial」 - 收款明细单据号',

    -- 基本信息
    `AMOUNT`         DECIMAL(18, 2) NOT NULL COMMENT '「amount」——价税合计，所有明细对应的实际结算金额',

    `TRANSACTION_ID` VARCHAR(36)  DEFAULT NULL COMMENT '「transactionId」交易ID',

    `PAY_NAME`       VARCHAR(128) DEFAULT NULL COMMENT '「payName」打款人姓名',
    `PAY_MOBILE`     VARCHAR(128) DEFAULT NULL COMMENT '「payMobile」打款人电话',
    `PAY_METHOD`     VARCHAR(255) DEFAULT NULL COMMENT '「payMethod」付款方式',
    `PAY_ID`         VARCHAR(255) DEFAULT NULL COMMENT '「payId」付款账号',

    `START_AT`   DATETIME COMMENT '「startAt」- 开始时间',
    `END_AT`     DATETIME COMMENT '「endAt」- 结束时间',
    `GROUP_BY`   VARCHAR(64) COMMENT '「groupBy」- 分组',

    -- 特殊字段
    `SIGMA`          VARCHAR(32) COMMENT '「sigma」- 统一标识',
    `LANGUAGE`       VARCHAR(10) COMMENT '「language」- 使用的语言',
    `ACTIVE`         BIT COMMENT '「active」- 是否启用',
    `METADATA`       TEXT COMMENT '「metadata」- 附加配置数据',

    -- Auditor字段
    `CREATED_AT`     DATETIME COMMENT '「createdAt」- 创建时间',
    `CREATED_BY`     VARCHAR(36) COMMENT '「createdBy」- 创建人',
    `UPDATED_AT`     DATETIME COMMENT '「updatedAt」- 更新时间',
    `UPDATED_BY`     VARCHAR(36) COMMENT '「updatedBy」- 更新人',
    PRIMARY KEY (`KEY`)
);
-- changeset Lang:f-trans-item-2
ALTER TABLE F_TRANS_ITEM
    ADD UNIQUE (`CODE`, `SIGMA`);
ALTER TABLE F_TRANS_ITEM
    ADD UNIQUE (`SERIAL`, `SIGMA`);

ALTER TABLE F_TRANS_ITEM
    ADD INDEX IDX_F_PAYMENT_ITEM_PAYMENT_ID (`TRANSACTION_ID`);
