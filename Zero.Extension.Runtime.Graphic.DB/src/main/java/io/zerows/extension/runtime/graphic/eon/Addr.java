package io.zerows.extension.runtime.graphic.eon;

/*
 * Address for Event Bus of Graphic
 */
interface Prefix {
    String _EVENT = "Ἀτλαντὶς νῆσος://γραφικό/";
}

public interface Addr {
    /*
     * Get graph by node key ( analyze )
     */
    String GRAPH_ANALYZE = Prefix._EVENT + "X-GRAPH/BY/NODE";
}
