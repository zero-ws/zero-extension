package io.zerows.extension.mbse.action.atom;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.zerows.extension.mbse.action.eon.em.WorkerType;
import io.zerows.jackson.databind.ClassDeserializer;
import io.zerows.jackson.databind.ClassSerializer;

import java.io.Serializable;

/*
 * Worker information
 * workerType
 * workerAddress
 * workerConsumer
 * workerClass
 * workerJs
 */
public class JtWorker implements Serializable {
    private transient WorkerType workerType;
    private transient String workerAddress;
    private transient String workerJs;
    @JsonSerialize(using = ClassSerializer.class)
    @JsonDeserialize(using = ClassDeserializer.class)
    private transient Class<?> workerClass;
    @JsonSerialize(using = ClassSerializer.class)
    @JsonDeserialize(using = ClassDeserializer.class)
    private transient Class<?> workerConsumer;

    public WorkerType getWorkerType() {
        return this.workerType;
    }

    public void setWorkerType(final WorkerType workerType) {
        this.workerType = workerType;
    }

    public String getWorkerAddress() {
        return this.workerAddress;
    }

    public void setWorkerAddress(final String workerAddress) {
        this.workerAddress = workerAddress;
    }

    public String getWorkerJs() {
        return this.workerJs;
    }

    public void setWorkerJs(final String workerJs) {
        this.workerJs = workerJs;
    }

    public Class<?> getWorkerClass() {
        return this.workerClass;
    }

    public void setWorkerClass(final Class<?> workerClass) {
        this.workerClass = workerClass;
    }

    public Class<?> getWorkerConsumer() {
        return this.workerConsumer;
    }

    public void setWorkerConsumer(final Class<?> workerConsumer) {
        this.workerConsumer = workerConsumer;
    }
}
