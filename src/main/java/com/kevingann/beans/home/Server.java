package com.kevingann.beans.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Server {

    @JsonProperty("host")
    private String host;

    @JsonProperty("version")
    private String version;

    @JsonProperty("NODE_ENV")
    private String nodeEnv;

    @JsonProperty("useES")
    private boolean useElasticSearch;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNodeEnv() {
        return nodeEnv;
    }

    public void setNodeEnv(String nodeEnv) {
        this.nodeEnv = nodeEnv;
    }

    public boolean isUseElasticSearch() {
        return useElasticSearch;
    }

    public void setUseElasticSearch(boolean useElasticSearch) {
        this.useElasticSearch = useElasticSearch;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
