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
        String SOURCE = "ds.source";
    }

    interface DimField {
        String KEY = "dimKey";
        String DISPLAY = "dimDisplay";
        String CHILDREN = "dimChildren";
    }

    interface DimValue {
        String FIELD_GROUP = "field.group";
        String FIELD_VECTOR = "field.vector";
    }

    interface ValuePath {
        String PREFIX_PARAM = "P:";
        String PREFIX_REFER = "R:";
        String PREFIX_CLASS = "C:";
    }
}
