package com.kevingann.beans.health;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Elasticsearch {

    @JsonProperty("HOST")
    private String host;

    @JsonProperty("PORT")
    private String port;

    @JsonProperty("INDEX_PERF")
    private String indexPerf;

    @JsonProperty("INDEX_RES")
    private String indexRes;

    @JsonProperty("INDEX_ERR")
    private String indexErr;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getIndexPerf() {
        return indexPerf;
    }

    public void setIndexPerf(String indexPerf) {
        this.indexPerf = indexPerf;
    }

    public String getIndexRes() {
        return indexRes;
    }

    public void setIndexRes(String indexRes) {
        this.indexRes = indexRes;
    }

    public String getIndexErr() {
        return indexErr;
    }

    public void setIndexErr(String indexErr) {
        this.indexErr = indexErr;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
