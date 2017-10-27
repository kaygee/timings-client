package com.kevingann.beans.cicd.usertiming;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Measure {

    @JsonProperty("name")
    private String name;

    @JsonProperty("entryType")
    private String entryType;

    @JsonProperty("startTime")
    private Double startTime;

    @JsonProperty("duration")
    private Double duration;

    public Measure(Builder builder) {
        this.name = builder.name;
        this.entryType = builder.entryType;
        this.startTime = builder.startTime;
        this.duration = builder.duration;
    }

    public static class Builder {
        private String name;
        private String entryType;
        private Double startTime;
        private Double duration;

        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder entryType(String entryType) {
            this.entryType = entryType;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Measure build() {
            return new Measure(this);
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
}
