/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain;


import io.zerows.extension.runtime.ambient.domain.tables.RTagObject;
import io.zerows.extension.runtime.ambient.domain.tables.XActivity;
import io.zerows.extension.runtime.ambient.domain.tables.XActivityChange;
import io.zerows.extension.runtime.ambient.domain.tables.XActivityRule;
import io.zerows.extension.runtime.ambient.domain.tables.XApp;
import io.zerows.extension.runtime.ambient.domain.tables.XAttachment;
import io.zerows.extension.runtime.ambient.domain.tables.XCategory;
import io.zerows.extension.runtime.ambient.domain.tables.XLinkage;
import io.zerows.extension.runtime.ambient.domain.tables.XLog;
import io.zerows.extension.runtime.ambient.domain.tables.XMenu;
import io.zerows.extension.runtime.ambient.domain.tables.XModule;
import io.zerows.extension.runtime.ambient.domain.tables.XNotice;
import io.zerows.extension.runtime.ambient.domain.tables.XNumber;
import io.zerows.extension.runtime.ambient.domain.tables.XSource;
import io.zerows.extension.runtime.ambient.domain.tables.XTabular;
import io.zerows.extension.runtime.ambient.domain.tables.XTag;
import io.zerows.extension.runtime.ambient.domain.tables.XTenant;
import io.zerows.extension.runtime.ambient.domain.tables.records.RTagObjectRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XActivityChangeRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XActivityRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XActivityRuleRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XAppRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XAttachmentRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XCategoryRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XLinkageRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XLogRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XMenuRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XModuleRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XNoticeRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XNumberRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XSourceRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XTabularRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XTagRecord;
import io.zerows.extension.runtime.ambient.domain.tables.records.XTenantRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in ZDB.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RTagObjectRecord> KEY_R_TAG_OBJECT_PRIMARY = Internal.createUniqueKey(RTagObject.R_TAG_OBJECT, DSL.name("KEY_R_TAG_OBJECT_PRIMARY"), new TableField[] { RTagObject.R_TAG_OBJECT.TAG_ID, RTagObject.R_TAG_OBJECT.ENTITY_TYPE, RTagObject.R_TAG_OBJECT.ENTITY_ID }, true);
    public static final UniqueKey<XActivityRecord> KEY_X_ACTIVITY_PRIMARY = Internal.createUniqueKey(XActivity.X_ACTIVITY, DSL.name("KEY_X_ACTIVITY_PRIMARY"), new TableField[] { XActivity.X_ACTIVITY.KEY }, true);
    public static final UniqueKey<XActivityChangeRecord> KEY_X_ACTIVITY_CHANGE_PRIMARY = Internal.createUniqueKey(XActivityChange.X_ACTIVITY_CHANGE, DSL.name("KEY_X_ACTIVITY_CHANGE_PRIMARY"), new TableField[] { XActivityChange.X_ACTIVITY_CHANGE.KEY }, true);
    public static final UniqueKey<XActivityRuleRecord> KEY_X_ACTIVITY_RULE_PRIMARY = Internal.createUniqueKey(XActivityRule.X_ACTIVITY_RULE, DSL.name("KEY_X_ACTIVITY_RULE_PRIMARY"), new TableField[] { XActivityRule.X_ACTIVITY_RULE.KEY }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_CODE = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_CODE"), new TableField[] { XApp.X_APP.CODE }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_CONTEXT = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_CONTEXT"), new TableField[] { XApp.X_APP.CONTEXT, XApp.X_APP.URL_LOGIN }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_CONTEXT_2 = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_CONTEXT_2"), new TableField[] { XApp.X_APP.CONTEXT, XApp.X_APP.URL_ADMIN }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_NAME = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_NAME"), new TableField[] { XApp.X_APP.NAME }, true);
    public static final UniqueKey<XAppRecord> KEY_X_APP_PRIMARY = Internal.createUniqueKey(XApp.X_APP, DSL.name("KEY_X_APP_PRIMARY"), new TableField[] { XApp.X_APP.KEY }, true);
    public static final UniqueKey<XAttachmentRecord> KEY_X_ATTACHMENT_FILE_KEY = Internal.createUniqueKey(XAttachment.X_ATTACHMENT, DSL.name("KEY_X_ATTACHMENT_FILE_KEY"), new TableField[] { XAttachment.X_ATTACHMENT.FILE_KEY }, true);
    public static final UniqueKey<XAttachmentRecord> KEY_X_ATTACHMENT_FILE_PATH = Internal.createUniqueKey(XAttachment.X_ATTACHMENT, DSL.name("KEY_X_ATTACHMENT_FILE_PATH"), new TableField[] { XAttachment.X_ATTACHMENT.FILE_PATH }, true);
    public static final UniqueKey<XAttachmentRecord> KEY_X_ATTACHMENT_FILE_URL = Internal.createUniqueKey(XAttachment.X_ATTACHMENT, DSL.name("KEY_X_ATTACHMENT_FILE_URL"), new TableField[] { XAttachment.X_ATTACHMENT.FILE_URL }, true);
    public static final UniqueKey<XAttachmentRecord> KEY_X_ATTACHMENT_PRIMARY = Internal.createUniqueKey(XAttachment.X_ATTACHMENT, DSL.name("KEY_X_ATTACHMENT_PRIMARY"), new TableField[] { XAttachment.X_ATTACHMENT.KEY }, true);
    public static final UniqueKey<XCategoryRecord> KEY_X_CATEGORY_APP_ID = Internal.createUniqueKey(XCategory.X_CATEGORY, DSL.name("KEY_X_CATEGORY_APP_ID"), new TableField[] { XCategory.X_CATEGORY.APP_ID, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.CODE }, true);
    public static final UniqueKey<XCategoryRecord> KEY_X_CATEGORY_PRIMARY = Internal.createUniqueKey(XCategory.X_CATEGORY, DSL.name("KEY_X_CATEGORY_PRIMARY"), new TableField[] { XCategory.X_CATEGORY.KEY }, true);
    public static final UniqueKey<XCategoryRecord> KEY_X_CATEGORY_SIGMA = Internal.createUniqueKey(XCategory.X_CATEGORY, DSL.name("KEY_X_CATEGORY_SIGMA"), new TableField[] { XCategory.X_CATEGORY.SIGMA, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.CODE }, true);
    public static final UniqueKey<XLinkageRecord> KEY_X_LINKAGE_LINK_KEY = Internal.createUniqueKey(XLinkage.X_LINKAGE, DSL.name("KEY_X_LINKAGE_LINK_KEY"), new TableField[] { XLinkage.X_LINKAGE.LINK_KEY }, true);
    public static final UniqueKey<XLinkageRecord> KEY_X_LINKAGE_PRIMARY = Internal.createUniqueKey(XLinkage.X_LINKAGE, DSL.name("KEY_X_LINKAGE_PRIMARY"), new TableField[] { XLinkage.X_LINKAGE.KEY }, true);
    public static final UniqueKey<XLinkageRecord> KEY_X_LINKAGE_REGION = Internal.createUniqueKey(XLinkage.X_LINKAGE, DSL.name("KEY_X_LINKAGE_REGION"), new TableField[] { XLinkage.X_LINKAGE.REGION, XLinkage.X_LINKAGE.NAME }, true);
    public static final UniqueKey<XLogRecord> KEY_X_LOG_PRIMARY = Internal.createUniqueKey(XLog.X_LOG, DSL.name("KEY_X_LOG_PRIMARY"), new TableField[] { XLog.X_LOG.KEY }, true);
    public static final UniqueKey<XMenuRecord> KEY_X_MENU_NAME = Internal.createUniqueKey(XMenu.X_MENU, DSL.name("KEY_X_MENU_NAME"), new TableField[] { XMenu.X_MENU.NAME, XMenu.X_MENU.APP_ID }, true);
    public static final UniqueKey<XMenuRecord> KEY_X_MENU_PRIMARY = Internal.createUniqueKey(XMenu.X_MENU, DSL.name("KEY_X_MENU_PRIMARY"), new TableField[] { XMenu.X_MENU.KEY }, true);
    public static final UniqueKey<XModuleRecord> KEY_X_MODULE_ENTRY = Internal.createUniqueKey(XModule.X_MODULE, DSL.name("KEY_X_MODULE_ENTRY"), new TableField[] { XModule.X_MODULE.ENTRY, XModule.X_MODULE.APP_ID }, true);
    public static final UniqueKey<XModuleRecord> KEY_X_MODULE_PRIMARY = Internal.createUniqueKey(XModule.X_MODULE, DSL.name("KEY_X_MODULE_PRIMARY"), new TableField[] { XModule.X_MODULE.KEY }, true);
    public static final UniqueKey<XNoticeRecord> KEY_X_NOTICE_APP_ID = Internal.createUniqueKey(XNotice.X_NOTICE, DSL.name("KEY_X_NOTICE_APP_ID"), new TableField[] { XNotice.X_NOTICE.APP_ID, XNotice.X_NOTICE.CODE }, true);
    public static final UniqueKey<XNoticeRecord> KEY_X_NOTICE_APP_ID_2 = Internal.createUniqueKey(XNotice.X_NOTICE, DSL.name("KEY_X_NOTICE_APP_ID_2"), new TableField[] { XNotice.X_NOTICE.APP_ID, XNotice.X_NOTICE.NAME }, true);
    public static final UniqueKey<XNoticeRecord> KEY_X_NOTICE_PRIMARY = Internal.createUniqueKey(XNotice.X_NOTICE, DSL.name("KEY_X_NOTICE_PRIMARY"), new TableField[] { XNotice.X_NOTICE.KEY }, true);
    public static final UniqueKey<XNumberRecord> KEY_X_NUMBER_APP_ID = Internal.createUniqueKey(XNumber.X_NUMBER, DSL.name("KEY_X_NUMBER_APP_ID"), new TableField[] { XNumber.X_NUMBER.APP_ID, XNumber.X_NUMBER.IDENTIFIER, XNumber.X_NUMBER.CODE }, true);
    public static final UniqueKey<XNumberRecord> KEY_X_NUMBER_PRIMARY = Internal.createUniqueKey(XNumber.X_NUMBER, DSL.name("KEY_X_NUMBER_PRIMARY"), new TableField[] { XNumber.X_NUMBER.KEY }, true);
    public static final UniqueKey<XSourceRecord> KEY_X_SOURCE_APP_ID = Internal.createUniqueKey(XSource.X_SOURCE, DSL.name("KEY_X_SOURCE_APP_ID"), new TableField[] { XSource.X_SOURCE.APP_ID }, true);
    public static final UniqueKey<XSourceRecord> KEY_X_SOURCE_PRIMARY = Internal.createUniqueKey(XSource.X_SOURCE, DSL.name("KEY_X_SOURCE_PRIMARY"), new TableField[] { XSource.X_SOURCE.KEY }, true);
    public static final UniqueKey<XTabularRecord> KEY_X_TABULAR_APP_ID = Internal.createUniqueKey(XTabular.X_TABULAR, DSL.name("KEY_X_TABULAR_APP_ID"), new TableField[] { XTabular.X_TABULAR.APP_ID, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.CODE }, true);
    public static final UniqueKey<XTabularRecord> KEY_X_TABULAR_PRIMARY = Internal.createUniqueKey(XTabular.X_TABULAR, DSL.name("KEY_X_TABULAR_PRIMARY"), new TableField[] { XTabular.X_TABULAR.KEY }, true);
    public static final UniqueKey<XTabularRecord> KEY_X_TABULAR_SIGMA = Internal.createUniqueKey(XTabular.X_TABULAR, DSL.name("KEY_X_TABULAR_SIGMA"), new TableField[] { XTabular.X_TABULAR.SIGMA, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.CODE }, true);
    public static final UniqueKey<XTagRecord> KEY_X_TAG_NAME = Internal.createUniqueKey(XTag.X_TAG, DSL.name("KEY_X_TAG_NAME"), new TableField[] { XTag.X_TAG.NAME, XTag.X_TAG.APP_ID }, true);
    public static final UniqueKey<XTagRecord> KEY_X_TAG_PRIMARY = Internal.createUniqueKey(XTag.X_TAG, DSL.name("KEY_X_TAG_PRIMARY"), new TableField[] { XTag.X_TAG.KEY }, true);
    public static final UniqueKey<XTenantRecord> KEY_X_TENANT_CODE = Internal.createUniqueKey(XTenant.X_TENANT, DSL.name("KEY_X_TENANT_CODE"), new TableField[] { XTenant.X_TENANT.CODE }, true);
    public static final UniqueKey<XTenantRecord> KEY_X_TENANT_PRIMARY = Internal.createUniqueKey(XTenant.X_TENANT, DSL.name("KEY_X_TENANT_PRIMARY"), new TableField[] { XTenant.X_TENANT.KEY }, true);
    public static final UniqueKey<XTenantRecord> KEY_X_TENANT_SIGMA = Internal.createUniqueKey(XTenant.X_TENANT, DSL.name("KEY_X_TENANT_SIGMA"), new TableField[] { XTenant.X_TENANT.SIGMA }, true);
}
