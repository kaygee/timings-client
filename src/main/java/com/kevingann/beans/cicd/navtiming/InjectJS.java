package com.kevingann.beans.cicd.navtiming;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevingann.beans.cicd.usertiming.Mark;
import com.kevingann.beans.cicd.usertiming.Measure;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class InjectJS {

    @JsonProperty("time")
    private Long time;

    @JsonProperty("timing")
    private Timing timing;

    @JsonProperty("visualCompleteTime")
    private Long visualCompleteTime;

    @JsonProperty("url")
    private String url;

    @JsonProperty("resources")
    private Resource[] resources;

    @JsonProperty("measureArray")
    private Measure[] measures;

    @JsonProperty("marks")
    private Mark[] marks;

    public InjectJS(Builder builder) {
        this.time = builder.time;
        this.timing = builder.timing;
        this.visualCompleteTime = builder.visualCompleteTime;
        this.url = builder.url;
        this.resources = builder.resources;
        this.measures = builder.measures;
        this.marks = builder.marks;
    }

    public static class Builder {

        private Long time;
        private Timing timing;
        private Long visualCompleteTime;
        private String url;
        private Resource[] resources;
        private Measure[] measures;
        private Mark[] marks;

        public Builder measures(Measure[] measures) {
            this.measures = measures;
            return this;
        }

        public Builder marks(Mark[] marks) {
            this.marks = marks;
            return this;
        }

        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        public Builder timing(Timing timing) {
            this.timing = timing;
            return this;
        }

        public Builder visualCompleteTime(Long visualCompleteTime) {
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

    public Long getTime() {
        return time;
    }

    public Timing getTiming() {
        return timing;
    }

    public Long getVisualCompleteTime() {
        return visualCompleteTime;
    }

    public String getUrl() {
        return url;
    }

    public Resource[] getResources() {
        return resources;
    }

    public Measure[] getMeasures() {
        return measures;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
