package io.zerows.extension.runtime.report.eon;

/**
 * @author lang : 2024-07-25
 */
public interface RpConstant {
    
    String BUNDLE_SYMBOLIC_NAME = "zero-extension-runtime-report";

    interface SourceTypeField {
        String TABLE = "ds.table";
        String VIEW = "ds.view";
        String EXTENSION = "ds.extension";
    }
}
