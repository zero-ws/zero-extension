package io.zerows.extension.runtime.report.atom;

import io.vertx.core.Future;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpFeature;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReport;
import io.zerows.extension.runtime.report.eon.em.EmReport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

    public Future<KpReport> reportMeta(final KpReport reportDefinition) {
        this.reportDefinition = reportDefinition;
        return Future.succeededFuture(this.reportDefinition);
    }

    public Future<ConcurrentMap<String, RDimension>> dimension(final ConcurrentMap<String, RDimension> reportDimensions) {
        this.reportDimensions.clear();
        this.reportDimensions.putAll(reportDimensions);
        return Future.succeededFuture(this.reportDimensions);
    }

    public Future<List<KpFeature>> featureData(final List<KpFeature> reportFeatures) {
        this.reportFeatures.clear();
        this.reportFeatures.addAll(reportFeatures.stream().filter(item -> {
            final EmReport.FeatureType type = Ut.toEnum(item::getType, EmReport.FeatureType.class, EmReport.FeatureType.NONE);
            return EmReport.FeatureType.GLOBAL != type && EmReport.FeatureType.NONE != type;
        }).toList());
        return Future.succeededFuture(this.reportFeatures);
    }

    public Future<ConcurrentMap<String, KpFeature>> featureGlobal(final ConcurrentMap<String, KpFeature> reportGlobal) {
        this.reportGlobal.clear();
        this.reportGlobal.putAll(reportGlobal);
        return Future.succeededFuture(this.reportGlobal);
    }

    public KpFeature featureGlobal(final String key) {
        return this.reportGlobal.getOrDefault(key, null);
    }

    public Set<String> featureGlobalKeys() {
        return this.reportGlobal.keySet();
    }

    public KpReport reportMeta() {
        return this.reportDefinition;
    }

    public ConcurrentMap<String, RDimension> dimension() {
        return this.reportDimensions;
    }

    public List<KpFeature> featureData() {
        return this.reportFeatures;
    }
}
