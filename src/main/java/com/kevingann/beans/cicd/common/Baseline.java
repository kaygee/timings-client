package com.kevingann.beans.cicd.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Set of parameters that determine how the baseline is determined.
 */
public class Baseline {

    @JsonProperty("days")
    private int days;

    @JsonProperty("perc")
    private int percent;

    @JsonProperty("padding")
    private double padding;

    @JsonProperty("searchUrl")
    private String searchUrl;

    @JsonProperty("incl")
    private Include include;

    public Baseline(Builder builder) {
        this.days = builder.days;
        this.percent = builder.percent;
        this.padding = builder.padding;
        this.searchUrl = builder.searchUrl;
        this.include = builder.include;
    }

    public static class Builder {

        private int days;
        private int percent;
        private double padding;
        private String searchUrl;
        private Include include;

        /**
         * This can be used to fine-tune the baseline query. The key-value pair will be used as an "include-filter"
         * for the ElasticSearch query. Example: {"browser": "chrome"}.
         *
         * @param include used to fine-tune the baseline query.
         * @return builder instance
         */
        public Builder incl(Include include) {
            this.include = include;
            return this;
        }

        /**
         * A custom search string/wildcard for the baseline. This will be applied to the 'dl' field query. Has to be
         * a full, valid Kibana search string and can not be empty!
         *
         * @param searchUrl custom search string/wildcard for the baseline
         * @return builder instance
         */
        public Builder searchUrl(String searchUrl) {
            this.searchUrl = searchUrl;
            return this;
        }

        /**
         * Baseline multiplier that enabled you to "pad" the baseline. Value has to be greater than 1.
         *
         * @param padding amount fo pad.
         * @return builder instance
         */
        public Builder padding(double padding) {
            this.padding = padding;
            return this;
        }

        /**
         * The percentile for the baseline.
         *
         * @param percent percentile for the baseline
         * @return builder instance
         */
        public Builder percent(int percent) {
            this.percent = percent;
            return this;
        }

        /**
         * Number of days for the baseline.
         *
         * @param days days for the baseline
         * @return builder instance
         */
        public Builder days(int days) {
            this.days = days;
            return this;
        }

        public Baseline build() {
            if (!ObjectUtils.allNotNull(padding)) {
                throw new IllegalStateException("Missing required field.");
            }
            return new Baseline(this);
        }
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }

}
