package com.kevingann.beans.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Server {

  @JsonProperty("LOG_LEVEL")
  private String logLevel;

  @JsonProperty("LOG_PATH")
  private String logPath;

  @JsonProperty("APP_CONFIG")
  private String appConfig;

  @JsonProperty("APP_HOST")
  private String appHost;

  @JsonProperty("APP_VERSION")
  private String appVersion;

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

  public String getAppHost() {
    return appHost;
  }

  public void setAppHost(String appHost) {
    this.appHost = appHost;
  }

  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public String getAppConfig() {
    return appConfig;
  }

  public void setAppConfig(String appConfig) {
    this.appConfig = appConfig;
  }

  public String getLogPath() {
    return logPath;
  }

  public void setLogPath(String logPath) {
    this.logPath = logPath;
  }

  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public String toString() {
    return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
  }
}
