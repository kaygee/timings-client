package com.kevingann.beans.cicd.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Baseline {

    @JsonProperty("days")
    private int days;

    @JsonProperty("perc")
    private int percent;

    @JsonProperty("padding")
    private double padding;

    @JsonProperty("searchUrl")
    private String searchUrl;

    @JsonProperty("src")
    private String src;

    @JsonProperty("aggField")
    private String aggField;

    @JsonProperty("incl")
    private Include include;

    public Baseline(Builder builder) {
        this.days = builder.days;
        this.percent = builder.percent;
        this.padding = builder.padding;
        this.searchUrl = builder.searchUrl;
        this.src = builder.src;
        this.aggField = builder.aggField;
        this.include = builder.include;
    }

    public static class Builder {

        private int days;
        private int percent;
        private double padding;
        private String searchUrl;
        private String src;
        private String aggField;
        private Include include;

        public Builder incl(Include include) {
            this.include = include;
            return this;
        }

        public Builder aggField(String aggField) {
            this.aggField = aggField;
            return this;
        }

        public Builder src(String src) {
            this.src = src;
            return this;
        }

        /**
         * TODO: Not allowed to be empty.
         *
         * @param searchUrl
         * @return
         */
        public Builder searchUrl(String searchUrl) {
            this.searchUrl = searchUrl;
            return this;
        }

        public Builder padding(double padding) {
            this.padding = padding;
            return this;
        }

        public Builder percent(int percent) {
            this.percent = percent;
            return this;
        }

        public Builder days(int days) {
            this.days = days;
            return this;
        }

        public Baseline build() {
            return new Baseline(this);
        }
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }

}
