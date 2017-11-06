package com.kevingann.beans.cicd.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TimingResponse {

    @JsonProperty("resourceSaved")
    private Boolean resourceSaved;

    @JsonProperty("esSaved")
    private Boolean elasticSearchSaved;

    @JsonProperty("esIndex")
    private String elasticSearchIndex;

    @JsonProperty("esServer")
    private String elasticSearchServer;

    @JsonProperty("api_version")
    private String apiVersion;

    @JsonProperty("status")
    private int status;

    @JsonProperty("took")
    private long took;

    @JsonProperty("assert")
    private Boolean assertion;

    @JsonIgnore
    @JsonProperty("errorMsg")
    private String errorMessage;

    @JsonIgnore
    @JsonProperty("debugMsg")
    private String debugMessage;

    @JsonIgnore
    @JsonProperty("export")
    private String export;

    @JsonIgnore
    @JsonProperty("params")
    private String parameters;

    @JsonIgnore
    @JsonProperty("timeingInfo")
    private String timingInformation;

    @JsonIgnore
    @JsonProperty("esTrace")
    private String esTrace;

    public int getStatus() {
        return status;
    }

    public long getTook() {
        return took;
    }

    public Boolean isAssertion() {
        return assertion;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public String getExport() {
        return export;
    }

    public String getParameters() {
        return parameters;
    }

    public String getTimingInformation() {
        return timingInformation;
    }

    /**
     * https://github.com/godaddy/timings#estrace-output
     *
     * TODO: This had to be renamed to match even with the @JsonProperty set.
     *
     * @return elasticsearch trace output.
     */
    public String getEsTrace() {
        return esTrace;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getElasticSearchServer() {
        return elasticSearchServer;
    }

    public Boolean isResourceSaved() {
        return resourceSaved;
    }

    public Boolean isElasticSearchSaved() {
        return elasticSearchSaved;
    }

    public String getElasticSearchIndex() {
        return elasticSearchIndex;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
