package com.kevingann.beans.cicd.usertiming;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevingann.beans.cicd.navtiming.Baseline;
import com.kevingann.beans.cicd.navtiming.Flags;
import com.kevingann.beans.cicd.navtiming.InjectJS;
import com.kevingann.beans.cicd.navtiming.Log;
import com.kevingann.beans.cicd.navtiming.ServiceLevelAgreement;

public class UserTimingRequest {

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

    public UserTimingRequest(Builder builder) {
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

        public UserTimingRequest build() {
            return new UserTimingRequest(this);
        }


    }

    public InjectJS getInjectJS() {
        return injectJS;
    }

    public ServiceLevelAgreement getSla() {
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
