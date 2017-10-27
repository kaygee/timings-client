package com.kevingann.beans.cicd.navtiming;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NavigationTimingRequest {

    @JsonProperty("injectJS")
    private InjectJS injectJS;

    @JsonProperty("sla")
    private ServiceLevelAgreement serviceLevelAgreement;

    @JsonProperty("baseline")
    private Baseline baseline;

    @JsonProperty("flags")
    private Flags flags;

    @JsonProperty("log")
    private Log log;

    public NavigationTimingRequest(Builder builder) {
        this.injectJS = builder.injectJS;
        this.serviceLevelAgreement = builder.serviceLevelAgreement;
        this.baseline = builder.baseline;
        this.flags = builder.flags;
        this.log = builder.log;
    }

    public static class Builder {

        private InjectJS injectJS;
        private ServiceLevelAgreement serviceLevelAgreement;
        private Baseline baseline;
        private Flags flags;
        private Log log;

        public Builder injectJS(InjectJS injectJS) {
            this.injectJS = injectJS;
            return this;
        }

        public Builder serviceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement) {
            this.serviceLevelAgreement = serviceLevelAgreement;
            return this;
        }

        public Builder baseline(Baseline baseline) {
            this.baseline = baseline;
            return this;
        }

        public Builder flags(Flags flags) {
            this.flags = flags;
            return this;
        }

        public Builder log(Log log) {
            this.log = log;
            return this;
        }

        public NavigationTimingRequest build() {
            return new NavigationTimingRequest(this);
        }

    }

    public InjectJS getInjectJS() {
        return injectJS;
    }

    public ServiceLevelAgreement getServiceLevelAgreement() {
        return serviceLevelAgreement;
    }

    public Baseline getBaseline() {
        return baseline;
    }

    public Flags getFlags() {
        return flags;
    }

    public Log getLog() {
        return log;
    }
}
