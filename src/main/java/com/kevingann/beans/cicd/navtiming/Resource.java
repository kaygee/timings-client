package com.kevingann.beans.cicd.navtiming;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Resource {

    private String name;
    private String entryType;
    private Double startTime;
    private Double duration;
    private String initiatorType;
    private Double workerStart;
    private Double redirectStart;
    private Double redirectEnd;
    private Double fetchStart;
    private Double domainLookupStart;
    private Double domainLookupEnd;
    private Double connectStart;
    private Double connectEnd;
    private Double secureConnectionStart;
    private Double requestStart;
    private Double responseStart;
    private Double responseEnd;
    private long transferSize;
    private long encodedBodySize;
    private long decodedBodySize;

    public Resource(Builder builder) {
        this.name = builder.name;
        this.entryType = builder.entryType;
        this.startTime = builder.startTime;
        this.duration = builder.duration;
        this.initiatorType = builder.initiatorType;
        this.workerStart = builder.workerStart;
        this.redirectStart = builder.redirectStart;
        this.redirectEnd = builder.redirectEnd;
        this.fetchStart = builder.fetchStart;
        this.domainLookupStart = builder.domainLookupStart;
        this.domainLookupEnd = builder.domainLookupEnd;
        this.connectStart = builder.connectStart;
        this.connectEnd = builder.connectEnd;
        this.secureConnectionStart = builder.secureConnectionStart;
        this.requestStart = builder.requestStart;
        this.responseStart = builder.responseStart;
        this.responseEnd = builder.responseEnd;
        this.transferSize = builder.transferSize;
        this.encodedBodySize = builder.encodedBodySize;
        this.decodedBodySize = builder.decodedBodySize;
    }

    public static class Builder {

        private String name;
        private String entryType;
        private String initiatorType;
        private Double startTime;
        private Double duration;
        private Double workerStart;
        private Double redirectStart;
        private Double redirectEnd;
        private Double fetchStart;
        private Double domainLookupStart;
        private Double domainLookupEnd;
        private Double connectStart;
        private Double connectEnd;
        private Double secureConnectionStart;
        private Double requestStart;
        private Double responseStart;
        private Double responseEnd;
        private long transferSize;
        private long encodedBodySize;
        private long decodedBodySize;

        public Builder decodedBodySize(long decodedBodySize) {
            this.decodedBodySize = decodedBodySize;
            return this;
        }

        public Builder encodedBodySize(long encodedBodySize) {
            this.encodedBodySize = encodedBodySize;
            return this;
        }

        public Builder transferSize(long transferSize) {
            this.transferSize = transferSize;
            return this;
        }

        public Builder responseEnd(Double responseEnd) {
            this.responseEnd = responseEnd;
            return this;
        }

        public Builder responseStart(Double responseStart) {
            this.responseStart = responseStart;
            return this;
        }

        public Builder requestStart(Double requestStart) {
            this.requestStart = requestStart;
            return this;
        }

        public Builder secureConnectionStart(Double secureConnectionStart) {
            this.secureConnectionStart = secureConnectionStart;
            return this;
        }

        public Builder connectEnd(Double connectEnd) {
            this.connectEnd = connectEnd;
            return this;
        }


        public Builder connectStart(Double connectStart) {
            this.connectStart = connectStart;
            return this;
        }

        public Builder domainLookupEnd(Double domainLookupEnd) {
            this.domainLookupEnd = domainLookupEnd;
            return this;
        }

        public Builder domainLookupStart(Double domainLookupStart) {
            this.domainLookupStart = domainLookupStart;
            return this;
        }

        public Builder fetchStart(Double fetchStart) {
            this.fetchStart = fetchStart;
            return this;
        }

        public Builder redirectEnd(Double redirectEnd) {
            this.redirectEnd = redirectEnd;
            return this;
        }

        public Builder redirectStart(Double redirectStart) {
            this.redirectStart = redirectStart;
            return this;
        }

        public Builder workerStart(Double workerStart) {
            this.workerStart = workerStart;
            return this;
        }

        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder initiatorType(String initiatorType) {
            this.initiatorType = initiatorType;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder entryType(String entryType) {
            this.entryType = entryType;
            return this;
        }

        public Resource build() {
            return new Resource(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getEntryType() {
        return entryType;
    }

    public Double getStartTime() {
        return startTime;
    }

    public Double getDuration() {
        return duration;
    }

    public String getInitiatorType() {
        return initiatorType;
    }

    public Double getWorkerStart() {
        return workerStart;
    }

    public Double getRedirectStart() {
        return redirectStart;
    }

    public Double getRedirectEnd() {
        return redirectEnd;
    }

    public Double getFetchStart() {
        return fetchStart;
    }

    public Double getDomainLookupStart() {
        return domainLookupStart;
    }

    public Double getDomainLookupEnd() {
        return domainLookupEnd;
    }

    public Double getConnectStart() {
        return connectStart;
    }

    public Double getConnectEnd() {
        return connectEnd;
    }

    public Double getSecureConnectionStart() {
        return secureConnectionStart;
    }

    public Double getRequestStart() {
        return requestStart;
    }

    public Double getResponseStart() {
        return responseStart;
    }

    public Double getResponseEnd() {
        return responseEnd;
    }

    public long getTransferSize() {
        return transferSize;
    }

    public long getEncodedBodySize() {
        return encodedBodySize;
    }

    public long getDecodedBodySize() {
        return decodedBodySize;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }

}
