package com.kevingann.beans.cicd.navtiming;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class InjectJS {

    @JsonProperty("time")
    private long time;

    @JsonProperty("timing")
    private Timing timing;

    @JsonProperty("visualCompleteTime")
    private long visualCompleteTime;

    @JsonProperty("url")
    private String url;

    @JsonProperty("resources")
    private Resource[] resources;

    public InjectJS(Builder builder) {
        this.time = builder.time;
        this.timing = builder.timing;
        this.visualCompleteTime = builder.visualCompleteTime;
        this.url = builder.url;
        this.resources = builder.resources;
    }

    public static class Builder {

        private long time;
        private Timing timing;
        private long visualCompleteTime;
        private String url;
        private Resource[] resources;

        public Builder time(long time) {
            this.time = time;
            return this;
        }

        public Builder timing(Timing timing) {
            this.timing = timing;
            return this;
        }

        public Builder visualCompleteTime(long visualCompleteTime) {
            this.visualCompleteTime = visualCompleteTime;
            return this;
        }

        /**
         * TODO: This must be a valid URL.
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder resources(Resource[] resources) {
            this.resources = resources;
            return this;
        }

        public InjectJS build() {
            return new InjectJS(this);
        }

    }

    public long getTime() {
        return time;
    }

    public Timing getTiming() {
        return timing;
    }

    public long getVisualCompleteTime() {
        return visualCompleteTime;
    }

    public String getUrl() {
        return url;
    }

    public Resource[] getResources() {
        return resources;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
