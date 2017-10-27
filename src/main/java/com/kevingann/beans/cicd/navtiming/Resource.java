package com.kevingann.beans.cicd.navtiming;

public class Resource {

    private String name;
    private String entryType;
    private double startTime;
    private double duration;
    private String initiatorType;
    private double workerStart;
    private double redirectStart;
    private double redirectEnd;
    private double fetchStart;
    private double domainLookupStart;
    private double domainLookupEnd;
    private double connectStart;
    private double connectEnd;
    private double secureConnectionStart;
    private double requestStart;
    private double responseStart;
    private double responseEnd;
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
        private double startTime;
        private double duration;
        private double workerStart;
        private double redirectStart;
        private double redirectEnd;
        private double fetchStart;
        private double domainLookupStart;
        private double domainLookupEnd;
        private double connectStart;
        private double connectEnd;
        private double secureConnectionStart;
        private double requestStart;
        private double responseStart;
        private double responseEnd;
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

        public Builder responseEnd(double responseEnd) {
            this.responseEnd = responseEnd;
            return this;
        }

        public Builder responseStart(double responseStart) {
            this.responseStart = responseStart;
            return this;
        }

        public Builder requestStart(double requestStart) {
            this.requestStart = requestStart;
            return this;
        }

        public Builder secureConnectionStart(double secureConnectionStart) {
            this.secureConnectionStart = secureConnectionStart;
            return this;
        }

        public Builder connectEnd(double connectEnd) {
            this.connectEnd = connectEnd;
            return this;
        }


        public Builder connectStart(double connectStart) {
            this.connectStart = connectStart;
            return this;
        }

        public Builder domainLookupEnd(double domainLookupEnd) {
            this.domainLookupEnd = domainLookupEnd;
            return this;
        }

        public Builder domainLookupStart(double domainLookupStart) {
            this.domainLookupStart = domainLookupStart;
            return this;
        }

        public Builder fetchStart(double fetchStart) {
            this.fetchStart = fetchStart;
            return this;
        }

        public Builder redirectEnd(double redirectEnd) {
            this.redirectEnd = redirectEnd;
            return this;
        }

        public Builder redirectStart(double redirectStart) {
            this.redirectStart = redirectStart;
            return this;
        }

        public Builder workerStart(double workerStart) {
            this.workerStart = workerStart;
            return this;
        }

        public Builder duration(double duration) {
            this.duration = duration;
            return this;
        }

        public Builder startTime(double startTime) {
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

    public double getStartTime() {
        return startTime;
    }

    public double getDuration() {
        return duration;
    }

    public String getInitiatorType() {
        return initiatorType;
    }

    public double getWorkerStart() {
        return workerStart;
    }

    public double getRedirectStart() {
        return redirectStart;
    }

    public double getRedirectEnd() {
        return redirectEnd;
    }

    public double getFetchStart() {
        return fetchStart;
    }

    public double getDomainLookupStart() {
        return domainLookupStart;
    }

    public double getDomainLookupEnd() {
        return domainLookupEnd;
    }

    public double getConnectStart() {
        return connectStart;
    }

    public double getConnectEnd() {
        return connectEnd;
    }

    public double getSecureConnectionStart() {
        return secureConnectionStart;
    }

    public double getRequestStart() {
        return requestStart;
    }

    public double getResponseStart() {
        return responseStart;
    }

    public double getResponseEnd() {
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

}
