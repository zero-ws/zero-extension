package io.zerows.extension.runtime.report.atom;

import io.vertx.core.Future;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpFeature;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-11-04
 */
public class RGeneration implements Serializable {

    private final ConcurrentMap<String, RDimension> reportDimensions = new ConcurrentHashMap<>();
    private final List<KpFeature> reportFeatures = new ArrayList<>();
    private final ConcurrentMap<String, KpFeature> reportGlobal = new ConcurrentHashMap<>();
    private KpReport reportDefinition;

    public RGeneration() {
    }

    public Future<KpReport> setReport(final KpReport reportDefinition) {
        this.reportDefinition = reportDefinition;
        return Future.succeededFuture(this.reportDefinition);
    }

    public Future<ConcurrentMap<String, RDimension>> setDimension(final ConcurrentMap<String, RDimension> reportDimensions) {
        this.reportDimensions.clear();
        this.reportDimensions.putAll(reportDimensions);
        return Future.succeededFuture(this.reportDimensions);
    }

    public Future<List<KpFeature>> setFeatures(final List<KpFeature> reportFeatures) {
        this.reportFeatures.clear();
        this.reportFeatures.addAll(reportFeatures);
        return Future.succeededFuture(this.reportFeatures);
    }

    public Future<ConcurrentMap<String, KpFeature>> setGlobalFeatures(final ConcurrentMap<String, KpFeature> reportGlobal) {
        this.reportGlobal.clear();
        this.reportGlobal.putAll(reportGlobal);
        return Future.succeededFuture(this.reportGlobal);
    }

    public KpFeature reportGlobal(final String key) {
        return this.reportGlobal.getOrDefault(key, null);
    }

    public KpReport reportDefinition() {
        return this.reportDefinition;
    }

    public ConcurrentMap<String, RDimension> reportDimensions() {
        return this.reportDimensions;
    }

    public List<KpFeature> reportFeatures() {
        return this.reportFeatures;
    }
}
