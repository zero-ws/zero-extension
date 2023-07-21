/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.daos;


import cn.vertxup.doc.domain.tables.DPaperRef;
import cn.vertxup.doc.domain.tables.records.DPaperRefRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DPaperRefDao extends AbstractVertxDAO<DPaperRefRecord, cn.vertxup.doc.domain.tables.pojos.DPaperRef, Record2<String, String>, Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>>, Future<cn.vertxup.doc.domain.tables.pojos.DPaperRef>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DPaperRefRecord,cn.vertxup.doc.domain.tables.pojos.DPaperRef,Record2<String, String>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public DPaperRefDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(DPaperRef.D_PAPER_REF, cn.vertxup.doc.domain.tables.pojos.DPaperRef.class, new JDBCClassicQueryExecutor<DPaperRefRecord,cn.vertxup.doc.domain.tables.pojos.DPaperRef,Record2<String, String>>(configuration,cn.vertxup.doc.domain.tables.pojos.DPaperRef.class,vertx));
        }

        @Override
        protected Record2<String, String> getId(cn.vertxup.doc.domain.tables.pojos.DPaperRef object) {
                return compositeKeyRecord(object.getPaperId(), object.getQuestionId());
        }

        /**
     * Find records that have <code>QUESTION_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>> findManyByQuestionId(Collection<String> values) {
                return findManyByCondition(DPaperRef.D_PAPER_REF.QUESTION_ID.in(values));
        }

        /**
     * Find records that have <code>QUESTION_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>> findManyByQuestionId(Collection<String> values, int limit) {
                return findManyByCondition(DPaperRef.D_PAPER_REF.QUESTION_ID.in(values),limit);
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>> findManyBySort(Collection<Integer> values) {
                return findManyByCondition(DPaperRef.D_PAPER_REF.SORT.in(values));
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>> findManyBySort(Collection<Integer> values, int limit) {
                return findManyByCondition(DPaperRef.D_PAPER_REF.SORT.in(values),limit);
        }

        /**
     * Find records that have <code>REQUIRED IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>> findManyByRequired(Collection<Boolean> values) {
                return findManyByCondition(DPaperRef.D_PAPER_REF.REQUIRED.in(values));
        }

        /**
     * Find records that have <code>REQUIRED IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>> findManyByRequired(Collection<Boolean> values, int limit) {
                return findManyByCondition(DPaperRef.D_PAPER_REF.REQUIRED.in(values),limit);
        }

        /**
     * Find records that have <code>RULE_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>> findManyByRuleComponent(Collection<String> values) {
                return findManyByCondition(DPaperRef.D_PAPER_REF.RULE_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>RULE_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DPaperRef>> findManyByRuleComponent(Collection<String> values, int limit) {
                return findManyByCondition(DPaperRef.D_PAPER_REF.RULE_COMPONENT.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<DPaperRefRecord,cn.vertxup.doc.domain.tables.pojos.DPaperRef,Record2<String, String>> queryExecutor(){
                return (JDBCClassicQueryExecutor<DPaperRefRecord,cn.vertxup.doc.domain.tables.pojos.DPaperRef,Record2<String, String>>) super.queryExecutor();
        }
}
