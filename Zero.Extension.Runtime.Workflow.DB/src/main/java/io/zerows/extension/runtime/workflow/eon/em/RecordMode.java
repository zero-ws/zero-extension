package io.zerows.extension.runtime.workflow.eon.em;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public enum RecordMode {
    CASE,       // Camunda Case Record
    DAO,        // ( Default ) Static Record
    ATOM,       // DataAtom related dynamic record
}
