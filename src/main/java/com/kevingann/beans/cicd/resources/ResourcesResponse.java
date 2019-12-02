package com.kevingann.beans.cicd.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevingann.beans.cicd.common.Resource;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ResourcesResponse {

  @JsonProperty("kibana_rename")
  private String kibanaRename;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("kibana_host")
  private String kibanaHost;

  @JsonProperty("kibana_port")
  private Integer kibanaPort;

  @JsonProperty("resources")
  private Resource[] resources;

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Resource[] getResources() {
    return resources;
  }

  public void setResources(Resource[] resources) {
    this.resources = resources;
  }

  public String getKibanaHost() {
    return kibanaHost;
  }

  public void setKibanaHost(String kibanaHost) {
    this.kibanaHost = kibanaHost;
  }

  public Integer getKibanaPort() {
    return kibanaPort;
  }

  public void setKibanaPort(Integer kibanaPort) {
    this.kibanaPort = kibanaPort;
  }

  public String getKibanaRename() {
    return kibanaRename;
  }

  public void setKibanaRename(String kibanaRename) {
    this.kibanaRename = kibanaRename;
  }

  public String toString() {
    return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
  }
}
