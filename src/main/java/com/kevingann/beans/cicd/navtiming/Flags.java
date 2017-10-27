package com.kevingann.beans.cicd.navtiming;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Flags {

    /**
     * TODO: This isn't allowed?
     */
    //    @JsonProperty("assertRum")
    //    private boolean assertRum;

    @JsonProperty("debug")
    private boolean debug;

    @JsonProperty("esTrace")
    private boolean esTrace;

    @JsonProperty("esCreate")
    private boolean esCreate;

    @JsonProperty("passOnFailedAssert")
    private boolean passOnFailedAssert;

    public Flags(Builder builder) {
        //        this.assertRum = builder.assertRum;
        this.debug = builder.debug;
        this.esTrace = builder.esTrace;
        this.esCreate = builder.esCreate;
        this.passOnFailedAssert = builder.passOnFailedAssert;
    }

    public static class Builder {
        //        private boolean assertRum;
        private boolean debug;
        private boolean esTrace;
        private boolean esCreate;
        private boolean passOnFailedAssert;

        //        public Builder assertRum(boolean assertRum) {
        //            this.assertRum = assertRum;
        //            return this;
        //        }

        public Builder debug(boolean debug) {
            this.debug = debug;
            return this;
        }

        public Builder esTrace(boolean esTrace) {
            this.esTrace = esTrace;
            return this;
        }

        public Builder esCreate(boolean esCreate) {
            this.esCreate = esCreate;
            return this;
        }

        public Builder passOnFailedAssert(boolean passOnFailedAssert) {
            this.passOnFailedAssert = passOnFailedAssert;
            return this;
        }

        public Flags build() {
            return new Flags(this);
        }

    }

    //    public boolean isAssertRum() {
    //        return assertRum;
    //    }

    public boolean isDebug() {
        return debug;
    }

    public boolean isEsTrace() {
        return esTrace;
    }

    public boolean isEsCreate() {
        return esCreate;
    }

    public boolean isPassOnFailedAssert() {
        return passOnFailedAssert;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
