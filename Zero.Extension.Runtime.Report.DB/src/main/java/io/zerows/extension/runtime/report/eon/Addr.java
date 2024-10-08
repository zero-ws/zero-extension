package io.zerows.extension.runtime.report.eon;

interface Prefix {

    String _EVENT = "Ἀτλαντὶς νῆσος://Έντυπο αναφοράς/";
}
/**
 * @author lang : 2024-10-08
 */
public interface Addr {

    interface Report{
        String QUERY_ALL = Prefix._EVENT + "KP-REPORT/QUERY-ALL";
    }
}
