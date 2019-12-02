package com.kevingann.beans.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class System {

  @JsonProperty("OS")
  private String operatingSystem;

  @JsonProperty("RELEASE")
  private String release;

  @JsonProperty("OS_TYPE")
  private String operatingSystemType;

  @JsonProperty("ARCH")
  private String architecture;

  @JsonProperty("MEM")
  private String memory;

  @JsonProperty("HOSTNAME")
  private String hostname;

  @JsonProperty("UPTIME")
  private String uptime;

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }

  public String getOperatingSystemType() {
    return operatingSystemType;
  }

  public void setOperatingSystemType(String operatingSystemType) {
    this.operatingSystemType = operatingSystemType;
  }

  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public String getMemory() {
    return memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public String getUptime() {
    return uptime;
  }

  public void setUptime(String uptime) {
    this.uptime = uptime;
  }

  public String toString() {
    return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
  }
}
