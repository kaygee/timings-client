package com.kevingann.beans.cicd.apitiming;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevingann.beans.cicd.common.Baseline;
import com.kevingann.beans.cicd.common.Flags;
import com.kevingann.beans.cicd.common.Log;
import com.kevingann.beans.cicd.common.ServiceLevelAgreement;
import com.kevingann.beans.cicd.common.Timing;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class APITimingRequest {

    @JsonProperty("timing")
    private Timing timing;

    @JsonProperty("url")
    private String url;

    @JsonProperty("sla")
    private ServiceLevelAgreement serviceLevelAgreement;

    @JsonProperty("baseline")
    private Baseline baseline;

    @JsonProperty("flags")
    private Flags flags;

    @JsonProperty("log")
    private Log log;

    public APITimingRequest(Builder builder) {
        this.timing = builder.timing;
        this.url = builder.url;
        this.serviceLevelAgreement = builder.serviceLevelAgreement;
        this.baseline = builder.baseline;
        this.flags = builder.flags;
        this.log = builder.log;
    }

    public static class Builder {
        private Timing timing;
        private String url;
        private ServiceLevelAgreement serviceLevelAgreement;
        private Baseline baseline;
        private Flags flags;
        private Log log;

        public Builder log(Log log) {
            this.log = log;
            return this;
        }

        public Builder flags(Flags flags) {
            this.flags = flags;
            return this;
        }

        public Builder baseline(Baseline baseline) {
            this.baseline = baseline;
            return this;
        }

        public Builder serviceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement) {
            this.serviceLevelAgreement = serviceLevelAgreement;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder timing(Timing timing) {
            this.timing = timing;
            return this;
        }

        public APITimingRequest build() {
            return new APITimingRequest(this);
        }
    }

    public Timing getTiming() {
        return timing;
    }

    public String getUrl() {
        return url;
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

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }

}
