package com.kevingann.beans.cicd.navtiming;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Timing {

    @JsonProperty("navigationStart")
    private long navigationStart;

    @JsonProperty("unloadEventStart")
    private long unloadEventStart;

    @JsonProperty("unloadEventEnd")
    private long unloadEventEnd;

    @JsonProperty("redirectStart")
    private long redirectStart;

    @JsonProperty("redirectEnd")
    private long redirectEnd;

    @JsonProperty("fetchStart")
    private long fetchStart;

    @JsonProperty("domainLookupStart")
    private long domainLookupStart;

    @JsonProperty("domainLookupEnd")
    private long domainLookupEnd;

    @JsonProperty("connectStart")
    private long connectStart;

    @JsonProperty("connectEnd")
    private long connectEnd;

    @JsonProperty("secureConnectionStart")
    private long secureConnectionStart;

    @JsonProperty("requestStart")
    private long requestStart;

    @JsonProperty("responseStart")
    private long responseStart;

    @JsonProperty("responseEnd")
    private long responseEnd;

    @JsonProperty("domLoading")
    private long domLoading;

    @JsonProperty("domInteractive")
    private long domInteractive;

    @JsonProperty("domContentLoadedEventStart")
    private long domContentLoadedEventStart;

    @JsonProperty("domContentLoadedEventEnd")
    private long domContentLoadedEventEnd;

    @JsonProperty("domComplete")
    private long domComplete;

    @JsonProperty("loadEventStart")
    private long loadEventStart;

    @JsonProperty("loadEventEnd")
    private long loadEventEnd;

    public Timing(Builder builder) {

        this.navigationStart = builder.navigationStart;
        this.unloadEventStart = builder.unloadEventStart;
        this.unloadEventEnd = builder.unloadEventEnd;
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
        this.domLoading = builder.domLoading;
        this.domInteractive = builder.domInteractive;
        this.domContentLoadedEventStart = builder.domContentLoadedEventStart;
        this.domContentLoadedEventEnd = builder.domContentLoadedEventEnd;
        this.domComplete = builder.domComplete;
        this.loadEventStart = builder.loadEventStart;
        this.loadEventEnd = builder.loadEventEnd;

    }

    public static class Builder {

        private long navigationStart;
        private long unloadEventStart;
        private long unloadEventEnd;
        private long redirectStart;
        private long redirectEnd;
        private long fetchStart;
        private long domainLookupStart;
        private long domainLookupEnd;
        private long connectStart;
        private long connectEnd;
        private long secureConnectionStart;
        private long requestStart;
        private long responseStart;
        private long responseEnd;
        private long domLoading;
        private long domInteractive;
        private long domContentLoadedEventStart;
        private long domContentLoadedEventEnd;
        private long domComplete;
        private long loadEventStart;
        private long loadEventEnd;

        public Builder navigationStart(long navigationStart) {
            this.navigationStart = navigationStart;
            return this;
        }

        public Builder unloadEventStart(long unloadEventStart) {
            this.unloadEventStart = unloadEventStart;
            return this;
        }

        public Builder unloadEventEnd(long unloadEventEnd) {
            this.unloadEventEnd = unloadEventEnd;
            return this;
        }

        public Builder redirectStart(long redirectStart) {
            this.redirectStart = redirectStart;
            return this;
        }

        public Builder redirectEnd(long redirectEnd) {
            this.redirectEnd = redirectEnd;
            return this;
        }

        public Builder fetchStart(long fetchStart) {
            this.fetchStart = fetchStart;
            return this;
        }

        public Builder domainLookupStart(long domainLookupStart) {
            this.domainLookupStart = domainLookupStart;
            return this;
        }

        public Builder domainLookupEnd(long domainLookupEnd) {
            this.domainLookupEnd = domainLookupEnd;
            return this;
        }

        public Builder connectStart(long connectStart) {
            this.connectStart = connectStart;
            return this;
        }

        public Builder connectEnd(long connectEnd) {
            this.connectEnd = connectEnd;
            return this;
        }

        public Builder secureConnectionStart(long secureConnectionStart) {
            this.secureConnectionStart = secureConnectionStart;
            return this;
        }

        public Builder requestStart(long requestStart) {
            this.requestStart = requestStart;
            return this;
        }

        public Builder responseStart(long responseStart) {
            this.responseStart = responseStart;
            return this;
        }

        public Builder responseEnd(long responseEnd) {
            this.responseEnd = responseEnd;
            return this;
        }

        public Builder domLoading(long domLoading) {
            this.domLoading = domLoading;
            return this;
        }

        public Builder domInteractive(long domInteractive) {
            this.domInteractive = domInteractive;
            return this;
        }

        public Builder domContentLoadedEventStart(long domContentLoadedEventStart) {
            this.domContentLoadedEventStart = domContentLoadedEventStart;
            return this;
        }

        public Builder domContentLoadedEventEnd(long domContentLoadedEventEnd) {
            this.domContentLoadedEventEnd = domContentLoadedEventEnd;
            return this;
        }

        public Builder domComplete(long domComplete) {
            this.domComplete = domComplete;
            return this;
        }

        public Builder loadEventStart(long loadEventStart) {
            this.loadEventStart = loadEventStart;
            return this;
        }

        public Builder loadEventEnd(long loadEventEnd) {
            this.loadEventEnd = loadEventEnd;
            return this;
        }

        public Timing build() {
            return new Timing(this);
        }

    }

    public long getNavigationStart() {
        return navigationStart;
    }

    public long getUnloadEventStart() {
        return unloadEventStart;
    }

    public long getUnloadEventEnd() {
        return unloadEventEnd;
    }

    public long getRedirectStart() {
        return redirectStart;
    }

    public long getRedirectEnd() {
        return redirectEnd;
    }

    public long getDomainLookupStart() {
        return domainLookupStart;
    }

    public long getDomainLookupEnd() {
        return domainLookupEnd;
    }

    public long getConnectStart() {
        return connectStart;
    }

    public long getConnectEnd() {
        return connectEnd;
    }

    public long getSecureConnectionStart() {
        return secureConnectionStart;
    }

    public long getRequestStart() {
        return requestStart;
    }

    public long getResponseStart() {
        return responseStart;
    }

    public long getResponseEnd() {
        return responseEnd;
    }

    public long getDomLoading() {
        return domLoading;
    }

    public long getDomInteractive() {
        return domInteractive;
    }

    public long getDomContentLoadedEventStart() {
        return domContentLoadedEventStart;
    }

    public long getDomContentLoadedEventEnd() {
        return domContentLoadedEventEnd;
    }

    public long getDomComplete() {
        return domComplete;
    }

    public long getLoadEventStart() {
        return loadEventStart;
    }

    public long getLoadEventEnd() {
        return loadEventEnd;
    }

    public long getFetchStart() {
        return fetchStart;
    }


}
