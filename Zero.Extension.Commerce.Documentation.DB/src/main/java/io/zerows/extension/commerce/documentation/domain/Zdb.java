/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain;


import io.zerows.extension.commerce.documentation.domain.tables.*;
import io.zerows.extension.runtime.skeleton.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Zdb extends SchemaImpl {

    /**
     * The reference instance of <code>ZDB</code>
     */
    public static final Zdb ZDB = new Zdb();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>ZDB.D_COMMENT</code>.
     */
    public final DComment D_COMMENT = DComment.D_COMMENT;

    /**
     * The table <code>ZDB.D_DOC</code>.
     */
    public final DDoc D_DOC = DDoc.D_DOC;

    /**
     * The table <code>ZDB.D_DOC_CLAUSE</code>.
     */
    public final DDocClause D_DOC_CLAUSE = DDocClause.D_DOC_CLAUSE;

    /**
     * The table <code>ZDB.D_DOC_SEGMENT</code>.
     */
    public final DDocSegment D_DOC_SEGMENT = DDocSegment.D_DOC_SEGMENT;

    /**
     * The table <code>ZDB.D_EXAM</code>.
     */
    public final DExam D_EXAM = DExam.D_EXAM;

    /**
     * The table <code>ZDB.D_PAPER</code>.
     */
    public final DPaper D_PAPER = DPaper.D_PAPER;

    /**
     * The table <code>ZDB.D_PAPER_REF</code>.
     */
    public final DPaperRef D_PAPER_REF = DPaperRef.D_PAPER_REF;

    /**
     * The table <code>ZDB.D_QANSWER</code>.
     */
    public final DQanswer D_QANSWER = DQanswer.D_QANSWER;

    /**
     * The table <code>ZDB.D_QRULE</code>.
     */
    public final DQrule D_QRULE = DQrule.D_QRULE;

    /**
     * The table <code>ZDB.D_QSTORE</code>.
     */
    public final DQstore D_QSTORE = DQstore.D_QSTORE;

    /**
     * The table <code>ZDB.D_QUESTION</code>.
     */
    public final DQuestion D_QUESTION = DQuestion.D_QUESTION;

    /**
     * The table <code>ZDB.D_REFER</code>.
     */
    public final DRefer D_REFER = DRefer.D_REFER;

    /**
     * The table <code>ZDB.D_REPLY</code>.
     */
    public final DReply D_REPLY = DReply.D_REPLY;

    /**
     * The table <code>ZDB.D_REPLY_ITEM</code>.
     */
    public final DReplyItem D_REPLY_ITEM = DReplyItem.D_REPLY_ITEM;

    /**
     * The table <code>ZDB.D_RESULT</code>.
     */
    public final DResult D_RESULT = DResult.D_RESULT;

    /**
     * No further instances allowed
     */
    private Zdb() {
        super(Ke.getDatabase(), null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            DComment.D_COMMENT,
            DDoc.D_DOC,
            DDocClause.D_DOC_CLAUSE,
            DDocSegment.D_DOC_SEGMENT,
            DExam.D_EXAM,
            DPaper.D_PAPER,
            DPaperRef.D_PAPER_REF,
            DQanswer.D_QANSWER,
            DQrule.D_QRULE,
            DQstore.D_QSTORE,
            DQuestion.D_QUESTION,
            DRefer.D_REFER,
            DReply.D_REPLY,
            DReplyItem.D_REPLY_ITEM,
            DResult.D_RESULT
        );
    }
}
