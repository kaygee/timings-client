package com.kevingann.beans.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class HealthStatus {

    @JsonProperty("server")
    private Server server;

    @JsonProperty("es")
    private Elasticsearch elasticsearch;

    @JsonProperty("kibana")
    private Kibana kibana;

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public Elasticsearch getElasticsearch() {
        return elasticsearch;
    }

    public void setElasticsearch(Elasticsearch elasticsearch) {
        this.elasticsearch = elasticsearch;
    }

    public Kibana getKibana() {
        return kibana;
    }

    public void setKibana(Kibana kibana) {
        this.kibana = kibana;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
