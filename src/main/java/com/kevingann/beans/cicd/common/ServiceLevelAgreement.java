package com.kevingann.beans.cicd.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * This is the "flat" threshold value for the metric to be asserted. Currently, the API only
 * supports the pageLoadTime and visualCompleteTime metrics. Example: {"pageLoadTime": 4000}. Note:
 * The value will be used for assertion if (a) flags.assertBaseline = false or (b) it is lower than
 * the baseline value.
 */
public class ServiceLevelAgreement {

  @JsonProperty("pageLoadTime")
  private Long pageLoadTime;

  public Long getPageLoadTime() {
    return pageLoadTime;
  }

  public void setPageLoadTime(Long pageLoadTime) {
    this.pageLoadTime = pageLoadTime;
  }

  public String toString() {
    return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
  }
}
