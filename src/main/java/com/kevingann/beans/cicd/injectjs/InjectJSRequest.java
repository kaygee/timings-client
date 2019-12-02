package com.kevingann.beans.cicd.injectjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevingann.constants.InjectType;

public class InjectJSRequest {

  @JsonProperty("injectType")
  private InjectType injectType;

  @JsonProperty("visualCompleteMark")
  private String visualCompleteMark;

  public String getInjectType() {
    return injectType.toString();
  }

  public void setInjectType(InjectType injectType) {
    this.injectType = injectType;
  }

  public String getVisualCompleteMark() {
    return visualCompleteMark;
  }

  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Performance/mark
   *
   * @param visualCompleteMark
   */
  public void setVisualCompleteMark(String visualCompleteMark) {
    this.visualCompleteMark = visualCompleteMark;
  }
}
