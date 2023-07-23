/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.daos;


import cn.vertxup.doc.domain.tables.DReplyItem;
import cn.vertxup.doc.domain.tables.records.DReplyItemRecord;

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
public class DReplyItemDao extends AbstractVertxDAO<DReplyItemRecord, cn.vertxup.doc.domain.tables.pojos.DReplyItem, Record2<String, String>, Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>>, Future<cn.vertxup.doc.domain.tables.pojos.DReplyItem>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DReplyItemRecord,cn.vertxup.doc.domain.tables.pojos.DReplyItem,Record2<String, String>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public DReplyItemDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(DReplyItem.D_REPLY_ITEM, cn.vertxup.doc.domain.tables.pojos.DReplyItem.class, new JDBCClassicQueryExecutor<DReplyItemRecord,cn.vertxup.doc.domain.tables.pojos.DReplyItem,Record2<String, String>>(configuration,cn.vertxup.doc.domain.tables.pojos.DReplyItem.class,vertx));
        }

        @Override
        protected Record2<String, String> getId(cn.vertxup.doc.domain.tables.pojos.DReplyItem object) {
                return compositeKeyRecord(object.getReplyId(), object.getQuestionCode());
        }

        /**
     * Find records that have <code>QUESTION_CODE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByQuestionCode(Collection<String> values) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.QUESTION_CODE.in(values));
        }

        /**
     * Find records that have <code>QUESTION_CODE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByQuestionCode(Collection<String> values, int limit) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.QUESTION_CODE.in(values),limit);
        }

        /**
     * Find records that have <code>ANSWER_CONTENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByAnswerContent(Collection<String> values) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.ANSWER_CONTENT.in(values));
        }

        /**
     * Find records that have <code>ANSWER_CONTENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByAnswerContent(Collection<String> values, int limit) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.ANSWER_CONTENT.in(values),limit);
        }

        /**
     * Find records that have <code>ANSWER_FILES IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByAnswerFiles(Collection<String> values) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.ANSWER_FILES.in(values));
        }

        /**
     * Find records that have <code>ANSWER_FILES IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByAnswerFiles(Collection<String> values, int limit) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.ANSWER_FILES.in(values),limit);
        }

        /**
     * Find records that have <code>ANSWER_PROOF IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByAnswerProof(Collection<String> values) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.ANSWER_PROOF.in(values));
        }

        /**
     * Find records that have <code>ANSWER_PROOF IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByAnswerProof(Collection<String> values, int limit) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.ANSWER_PROOF.in(values),limit);
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyBySort(Collection<Integer> values) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.SORT.in(values));
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyBySort(Collection<Integer> values, int limit) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.SORT.in(values),limit);
        }

        /**
     * Find records that have <code>ANSWER_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByAnswerComponent(Collection<String> values) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.ANSWER_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>ANSWER_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DReplyItem>> findManyByAnswerComponent(Collection<String> values, int limit) {
                return findManyByCondition(DReplyItem.D_REPLY_ITEM.ANSWER_COMPONENT.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<DReplyItemRecord,cn.vertxup.doc.domain.tables.pojos.DReplyItem,Record2<String, String>> queryExecutor(){
                return (JDBCClassicQueryExecutor<DReplyItemRecord,cn.vertxup.doc.domain.tables.pojos.DReplyItem,Record2<String, String>>) super.queryExecutor();
        }
}