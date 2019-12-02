package com.kevingann.beans.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Elasticsearch {

  @JsonProperty("ES_HOST")
  private String host;

  @JsonProperty("ES_PORT")
  private String port;

  @JsonProperty("INDEX_PERF")
  private String indexPerf;

  @JsonProperty("INDEX_RES")
  private String indexRes;

  @JsonProperty("INDEX_ERR")
  private String indexErr;

  @JsonProperty("ES_PROTOCOL")
  private String protocol;

  @JsonProperty("ES_TIMEOUT")
  private String timeout;

  @JsonProperty("ES_VERSION")
  private String version;

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

  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public String getTimeout() {
    return timeout;
  }

  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String toString() {
    return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
  }
}
