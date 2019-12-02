package com.kevingann.beans.cicd.navtiming;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevingann.beans.cicd.common.Baseline;
import com.kevingann.beans.cicd.common.Flags;
import com.kevingann.beans.cicd.common.InjectJS;
import com.kevingann.beans.cicd.common.Log;
import com.kevingann.beans.cicd.common.ServiceLevelAgreement;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class NavigationTimingRequest {

  @JsonProperty("injectJS")
  private InjectJS injectJS;

  @JsonProperty("sla")
  private ServiceLevelAgreement serviceLevelAgreement;

  @JsonProperty("baseline")
  private Baseline baseline;

  @JsonProperty("flags")
  private Flags flags;

  @JsonProperty("log")
  private Log log;

  public NavigationTimingRequest(Builder builder) {
    this.injectJS = builder.injectJS;
    this.serviceLevelAgreement = builder.serviceLevelAgreement;
    this.baseline = builder.baseline;
    this.flags = builder.flags;
    this.log = builder.log;
  }

  public InjectJS getInjectJS() {
    return injectJS;
  }

  public ServiceLevelAgreement getServiceLevelAgreement() {
    return serviceLevelAgreement;
  }

  public Baseline getBaseline() {
    return baseline;
  }

  public Flags getFlags() {
    return flags;
  }

  public Log getLog() {
    return log;
  }

  public String toString() {
    return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
  }

  public static class Builder {

    private InjectJS injectJS;
    private ServiceLevelAgreement serviceLevelAgreement;
    private Baseline baseline;
    private Flags flags;
    private Log log;

    public Builder injectJS(InjectJS injectJS) {
      this.injectJS = injectJS;
      return this;
    }

    public Builder serviceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement) {
      this.serviceLevelAgreement = serviceLevelAgreement;
      return this;
    }

    public Builder baseline(Baseline baseline) {
      this.baseline = baseline;
      return this;
    }

    public Builder flags(Flags flags) {
      this.flags = flags;
      return this;
    }

    public Builder log(Log log) {
      this.log = log;
      return this;
    }

    public NavigationTimingRequest build() {
      if (!ObjectUtils.allNotNull(serviceLevelAgreement, log)) {
        throw new IllegalStateException("Missing required field.");
      }
      return new NavigationTimingRequest(this);
    }
  }
}
