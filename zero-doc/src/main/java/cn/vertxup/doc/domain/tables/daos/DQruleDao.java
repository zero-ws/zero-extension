/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.daos;


import cn.vertxup.doc.domain.tables.DQrule;
import cn.vertxup.doc.domain.tables.records.DQruleRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record3;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DQruleDao extends AbstractVertxDAO<DQruleRecord, cn.vertxup.doc.domain.tables.pojos.DQrule, Record3<String, String, String>, Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>>, Future<cn.vertxup.doc.domain.tables.pojos.DQrule>, Future<Integer>, Future<Record3<String, String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DQruleRecord,cn.vertxup.doc.domain.tables.pojos.DQrule,Record3<String, String, String>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public DQruleDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(DQrule.D_QRULE, cn.vertxup.doc.domain.tables.pojos.DQrule.class, new JDBCClassicQueryExecutor<DQruleRecord,cn.vertxup.doc.domain.tables.pojos.DQrule,Record3<String, String, String>>(configuration,cn.vertxup.doc.domain.tables.pojos.DQrule.class,vertx));
        }

        @Override
        protected Record3<String, String, String> getId(cn.vertxup.doc.domain.tables.pojos.DQrule object) {
                return compositeKeyRecord(object.getRuleSet(), object.getRefId(), object.getType());
        }

        /**
     * Find records that have <code>REF_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByRefId(Collection<String> values) {
                return findManyByCondition(DQrule.D_QRULE.REF_ID.in(values));
        }

        /**
     * Find records that have <code>REF_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByRefId(Collection<String> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.REF_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ANSWER_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByAnswerId(Collection<String> values) {
                return findManyByCondition(DQrule.D_QRULE.ANSWER_ID.in(values));
        }

        /**
     * Find records that have <code>ANSWER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByAnswerId(Collection<String> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.ANSWER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PAPER_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByPaperId(Collection<String> values) {
                return findManyByCondition(DQrule.D_QRULE.PAPER_ID.in(values));
        }

        /**
     * Find records that have <code>PAPER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByPaperId(Collection<String> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.PAPER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByType(Collection<String> values) {
                return findManyByCondition(DQrule.D_QRULE.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>QUESTION_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByQuestionId(Collection<String> values) {
                return findManyByCondition(DQrule.D_QRULE.QUESTION_ID.in(values));
        }

        /**
     * Find records that have <code>QUESTION_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByQuestionId(Collection<String> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.QUESTION_ID.in(values),limit);
        }

        /**
     * Find records that have <code>IS_REQUIRED IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByIsRequired(Collection<Boolean> values) {
                return findManyByCondition(DQrule.D_QRULE.IS_REQUIRED.in(values));
        }

        /**
     * Find records that have <code>IS_REQUIRED IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByIsRequired(Collection<Boolean> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.IS_REQUIRED.in(values),limit);
        }

        /**
     * Find records that have <code>IS_ATTACHED IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByIsAttached(Collection<Boolean> values) {
                return findManyByCondition(DQrule.D_QRULE.IS_ATTACHED.in(values));
        }

        /**
     * Find records that have <code>IS_ATTACHED IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByIsAttached(Collection<Boolean> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.IS_ATTACHED.in(values),limit);
        }

        /**
     * Find records that have <code>IS_PROOF IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByIsProof(Collection<Boolean> values) {
                return findManyByCondition(DQrule.D_QRULE.IS_PROOF.in(values));
        }

        /**
     * Find records that have <code>IS_PROOF IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByIsProof(Collection<Boolean> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.IS_PROOF.in(values),limit);
        }

        /**
     * Find records that have <code>RULE_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByRuleConfig(Collection<String> values) {
                return findManyByCondition(DQrule.D_QRULE.RULE_CONFIG.in(values));
        }

        /**
     * Find records that have <code>RULE_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByRuleConfig(Collection<String> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.RULE_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>RULE_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByRuleComponent(Collection<String> values) {
                return findManyByCondition(DQrule.D_QRULE.RULE_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>RULE_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DQrule>> findManyByRuleComponent(Collection<String> values, int limit) {
                return findManyByCondition(DQrule.D_QRULE.RULE_COMPONENT.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<DQruleRecord,cn.vertxup.doc.domain.tables.pojos.DQrule,Record3<String, String, String>> queryExecutor(){
                return (JDBCClassicQueryExecutor<DQruleRecord,cn.vertxup.doc.domain.tables.pojos.DQrule,Record3<String, String, String>>) super.queryExecutor();
        }
}