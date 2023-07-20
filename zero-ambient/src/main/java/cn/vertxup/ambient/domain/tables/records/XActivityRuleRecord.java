/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.records;


import cn.vertxup.ambient.domain.tables.XActivityRule;
import cn.vertxup.ambient.domain.tables.interfaces.IXActivityRule;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XActivityRuleRecord extends UpdatableRecordImpl<XActivityRuleRecord> implements VertxPojo, IXActivityRule {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.KEY</code>. 「key」- 规则主键
     */
    @Override
    public XActivityRuleRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.KEY</code>. 「key」- 规则主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.DEFINITION_KEY</code>.
     * 「definitionKey」- 流程对应的 definitionKey，用于查询所有规则用
     */
    @Override
    public XActivityRuleRecord setDefinitionKey(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.DEFINITION_KEY</code>.
     * 「definitionKey」- 流程对应的 definitionKey，用于查询所有规则用
     */
    @Override
    public String getDefinitionKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.TASK_KEY</code>. 「taskKey」-
     * 和待办绑定的taskKey
     */
    @Override
    public XActivityRuleRecord setTaskKey(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.TASK_KEY</code>. 「taskKey」-
     * 和待办绑定的taskKey
     */
    @Override
    public String getTaskKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.TYPE</code>. 「type」- 规则类型
     */
    @Override
    public XActivityRuleRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.TYPE</code>. 「type」- 规则类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_NAME</code>. 「ruleName」-
     * 规则名称，如果 type = ATOM 时读取，并设置到 typeName 中
     */
    @Override
    public XActivityRuleRecord setRuleName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_NAME</code>. 「ruleName」-
     * 规则名称，如果 type = ATOM 时读取，并设置到 typeName 中
     */
    @Override
    public String getRuleName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_ORDER</code>. 「ruleOrder」-
     * 规则触发顺序，修正两个时间戳，生成时序号统一，先生成的规则排序在上边
     */
    @Override
    public XActivityRuleRecord setRuleOrder(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_ORDER</code>. 「ruleOrder」-
     * 规则触发顺序，修正两个时间戳，生成时序号统一，先生成的规则排序在上边
     */
    @Override
    public Long getRuleOrder() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_NS</code>. 「ruleNs」- 规则所属主模型名空间
     */
    @Override
    public XActivityRuleRecord setRuleNs(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_NS</code>. 「ruleNs」- 规则所属主模型名空间
     */
    @Override
    public String getRuleNs() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_IDENTIFIER</code>.
     * 「ruleIdentifier」- 主模型ID
     */
    @Override
    public XActivityRuleRecord setRuleIdentifier(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_IDENTIFIER</code>.
     * 「ruleIdentifier」- 主模型ID
     */
    @Override
    public String getRuleIdentifier() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_FIELD</code>. 「ruleField」- 主字段名
     */
    @Override
    public XActivityRuleRecord setRuleField(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_FIELD</code>. 「ruleField」- 主字段名
     */
    @Override
    public String getRuleField() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_EXPRESSION</code>.
     * 「ruleExpression」- 规则触发表达式 ( 可以是多个，JsonArray格式 )
     */
    @Override
    public XActivityRuleRecord setRuleExpression(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_EXPRESSION</code>.
     * 「ruleExpression」- 规则触发表达式 ( 可以是多个，JsonArray格式 )
     */
    @Override
    public String getRuleExpression() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_TPL</code>. 「ruleTpl」-
     * 参数模板专用，JsonObject结构
     */
    @Override
    public XActivityRuleRecord setRuleTpl(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_TPL</code>. 「ruleTpl」-
     * 参数模板专用，JsonObject结构
     */
    @Override
    public String getRuleTpl() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_CONFIG</code>. 「ruleConfig」-
     * 规则对应的额外配置
     */
    @Override
    public XActivityRuleRecord setRuleConfig(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_CONFIG</code>. 「ruleConfig」-
     * 规则对应的额外配置
     */
    @Override
    public String getRuleConfig() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_MESSAGE</code>. 「ruleMessage」-
     * 输出消息专用, Ut.fromExpression解析（特殊解析）
     */
    @Override
    public XActivityRuleRecord setRuleMessage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_MESSAGE</code>. 「ruleMessage」-
     * 输出消息专用, Ut.fromExpression解析（特殊解析）
     */
    @Override
    public String getRuleMessage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.HOOK_COMPONENT</code>.
     * 「hookComponent」-- 回调钩子组件
     */
    @Override
    public XActivityRuleRecord setHookComponent(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.HOOK_COMPONENT</code>.
     * 「hookComponent」-- 回调钩子组件
     */
    @Override
    public String getHookComponent() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.HOOK_CONFIG</code>. 「hookConfig」--
     * 回调钩子组件配置
     */
    @Override
    public XActivityRuleRecord setHookConfig(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.HOOK_CONFIG</code>. 「hookConfig」--
     * 回调钩子组件配置
     */
    @Override
    public String getHookConfig() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.LOGGING</code>. 「logging」- 是否记录日志
     */
    @Override
    public XActivityRuleRecord setLogging(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.LOGGING</code>. 「logging」- 是否记录日志
     */
    @Override
    public Boolean getLogging() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XActivityRuleRecord setActive(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XActivityRuleRecord setSigma(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XActivityRuleRecord setMetadata(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XActivityRuleRecord setLanguage(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(19);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XActivityRuleRecord setCreatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XActivityRuleRecord setCreatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(21);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XActivityRuleRecord setUpdatedAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XActivityRuleRecord setUpdatedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IXActivityRule from) {
        setKey(from.getKey());
        setDefinitionKey(from.getDefinitionKey());
        setTaskKey(from.getTaskKey());
        setType(from.getType());
        setRuleName(from.getRuleName());
        setRuleOrder(from.getRuleOrder());
        setRuleNs(from.getRuleNs());
        setRuleIdentifier(from.getRuleIdentifier());
        setRuleField(from.getRuleField());
        setRuleExpression(from.getRuleExpression());
        setRuleTpl(from.getRuleTpl());
        setRuleConfig(from.getRuleConfig());
        setRuleMessage(from.getRuleMessage());
        setHookComponent(from.getHookComponent());
        setHookConfig(from.getHookConfig());
        setLogging(from.getLogging());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IXActivityRule> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XActivityRuleRecord
     */
    public XActivityRuleRecord() {
        super(XActivityRule.X_ACTIVITY_RULE);
    }

    /**
     * Create a detached, initialised XActivityRuleRecord
     */
    public XActivityRuleRecord(String key, String definitionKey, String taskKey, String type, String ruleName, Long ruleOrder, String ruleNs, String ruleIdentifier, String ruleField, String ruleExpression, String ruleTpl, String ruleConfig, String ruleMessage, String hookComponent, String hookConfig, Boolean logging, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XActivityRule.X_ACTIVITY_RULE);

        setKey(key);
        setDefinitionKey(definitionKey);
        setTaskKey(taskKey);
        setType(type);
        setRuleName(ruleName);
        setRuleOrder(ruleOrder);
        setRuleNs(ruleNs);
        setRuleIdentifier(ruleIdentifier);
        setRuleField(ruleField);
        setRuleExpression(ruleExpression);
        setRuleTpl(ruleTpl);
        setRuleConfig(ruleConfig);
        setRuleMessage(ruleMessage);
        setHookComponent(hookComponent);
        setHookConfig(hookConfig);
        setLogging(logging);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised XActivityRuleRecord
     */
    public XActivityRuleRecord(cn.vertxup.ambient.domain.tables.pojos.XActivityRule value) {
        super(XActivityRule.X_ACTIVITY_RULE);

        if (value != null) {
            setKey(value.getKey());
            setDefinitionKey(value.getDefinitionKey());
            setTaskKey(value.getTaskKey());
            setType(value.getType());
            setRuleName(value.getRuleName());
            setRuleOrder(value.getRuleOrder());
            setRuleNs(value.getRuleNs());
            setRuleIdentifier(value.getRuleIdentifier());
            setRuleField(value.getRuleField());
            setRuleExpression(value.getRuleExpression());
            setRuleTpl(value.getRuleTpl());
            setRuleConfig(value.getRuleConfig());
            setRuleMessage(value.getRuleMessage());
            setHookComponent(value.getHookComponent());
            setHookConfig(value.getHookConfig());
            setLogging(value.getLogging());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public XActivityRuleRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
