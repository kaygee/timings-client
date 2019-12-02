package com.kevingann.beans.cicd.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/** https://www.w3.org/TR/navigation-timing/#performancetiming */
@JsonDeserialize(builder = Timing.Builder.class)
public class Timing {

  @JsonProperty("startTime")
  private Long startTime;

  @JsonProperty("endTime")
  private Long endTime;

  @JsonProperty("navigationStart")
  private Long navigationStart;

  @JsonProperty("unloadEventStart")
  private Long unloadEventStart;

  @JsonProperty("unloadEventEnd")
  private Long unloadEventEnd;

  @JsonProperty("redirectStart")
  private Long redirectStart;

  @JsonProperty("redirectEnd")
  private Long redirectEnd;

  @JsonProperty("fetchStart")
  private Long fetchStart;

  @JsonProperty("domainLookupStart")
  private Long domainLookupStart;

  @JsonProperty("domainLookupEnd")
  private Long domainLookupEnd;

  @JsonProperty("connectStart")
  private Long connectStart;

  @JsonProperty("connectEnd")
  private Long connectEnd;

  @JsonProperty("secureConnectionStart")
  private Long secureConnectionStart;

  @JsonProperty("requestStart")
  private Long requestStart;

  @JsonProperty("responseStart")
  private Long responseStart;

  @JsonProperty("responseEnd")
  private Long responseEnd;

  @JsonProperty("domLoading")
  private Long domLoading;

  @JsonProperty("domInteractive")
  private Long domInteractive;

  @JsonProperty("domContentLoadedEventStart")
  private Long domContentLoadedEventStart;

  @JsonProperty("domContentLoadedEventEnd")
  private Long domContentLoadedEventEnd;

  @JsonProperty("domComplete")
  private Long domComplete;

  @JsonProperty("loadEventStart")
  private Long loadEventStart;

  @JsonProperty("loadEventEnd")
  private Long loadEventEnd;

  @JsonIgnore
  @JsonProperty("toJSON")
  private ToJSON toJson;

  public Timing(Builder builder) {
    this.startTime = builder.startTime;
    this.endTime = builder.endTime;
    this.navigationStart = builder.navigationStart;
    this.unloadEventStart = builder.unloadEventStart;
    this.unloadEventEnd = builder.unloadEventEnd;
    this.redirectStart = builder.redirectStart;
    this.redirectEnd = builder.redirectEnd;
    this.fetchStart = builder.fetchStart;
    this.domainLookupStart = builder.domainLookupStart;
    this.domainLookupEnd = builder.domainLookupEnd;
    this.connectStart = builder.connectStart;
    this.connectEnd = builder.connectEnd;
    this.secureConnectionStart = builder.secureConnectionStart;
    this.requestStart = builder.requestStart;
    this.responseStart = builder.responseStart;
    this.responseEnd = builder.responseEnd;
    this.domLoading = builder.domLoading;
    this.domInteractive = builder.domInteractive;
    this.domContentLoadedEventStart = builder.domContentLoadedEventStart;
    this.domContentLoadedEventEnd = builder.domContentLoadedEventEnd;
    this.domComplete = builder.domComplete;
    this.loadEventStart = builder.loadEventStart;
    this.loadEventEnd = builder.loadEventEnd;
  }

  public Long getNavigationStart() {
    return navigationStart;
  }

  public void setNavigationStart(Long navigationStart) {
    this.navigationStart = navigationStart;
  }

  public Long getUnloadEventStart() {
    return unloadEventStart;
  }

  public void setUnloadEventStart(Long unloadEventStart) {
    this.unloadEventStart = unloadEventStart;
  }

  public Long getUnloadEventEnd() {
    return unloadEventEnd;
  }

  public void setUnloadEventEnd(Long unloadEventEnd) {
    this.unloadEventEnd = unloadEventEnd;
  }

  public Long getRedirectStart() {
    return redirectStart;
  }

  public void setRedirectStart(Long redirectStart) {
    this.redirectStart = redirectStart;
  }

  public Long getRedirectEnd() {
    return redirectEnd;
  }

  public void setRedirectEnd(Long redirectEnd) {
    this.redirectEnd = redirectEnd;
  }

  public Long getDomainLookupStart() {
    return domainLookupStart;
  }

  public void setDomainLookupStart(Long domainLookupStart) {
    this.domainLookupStart = domainLookupStart;
  }

  public Long getDomainLookupEnd() {
    return domainLookupEnd;
  }

  public void setDomainLookupEnd(Long domainLookupEnd) {
    this.domainLookupEnd = domainLookupEnd;
  }

  public Long getConnectStart() {
    return connectStart;
  }

  public void setConnectStart(Long connectStart) {
    this.connectStart = connectStart;
  }

  public Long getConnectEnd() {
    return connectEnd;
  }

  public void setConnectEnd(Long connectEnd) {
    this.connectEnd = connectEnd;
  }

  public Long getSecureConnectionStart() {
    return secureConnectionStart;
  }

  public void setSecureConnectionStart(Long secureConnectionStart) {
    this.secureConnectionStart = secureConnectionStart;
  }

  public Long getRequestStart() {
    return requestStart;
  }

  public void setRequestStart(Long requestStart) {
    this.requestStart = requestStart;
  }

  public Long getResponseStart() {
    return responseStart;
  }

  public void setResponseStart(Long responseStart) {
    this.responseStart = responseStart;
  }

  public Long getResponseEnd() {
    return responseEnd;
  }

  public void setResponseEnd(Long responseEnd) {
    this.responseEnd = responseEnd;
  }

  public Long getDomLoading() {
    return domLoading;
  }

  public void setDomLoading(Long domLoading) {
    this.domLoading = domLoading;
  }

  public Long getDomInteractive() {
    return domInteractive;
  }

  public void setDomInteractive(Long domInteractive) {
    this.domInteractive = domInteractive;
  }

  public Long getDomContentLoadedEventStart() {
    return domContentLoadedEventStart;
  }

  public void setDomContentLoadedEventStart(Long domContentLoadedEventStart) {
    this.domContentLoadedEventStart = domContentLoadedEventStart;
  }

  public Long getDomContentLoadedEventEnd() {
    return domContentLoadedEventEnd;
  }

  public void setDomContentLoadedEventEnd(Long domContentLoadedEventEnd) {
    this.domContentLoadedEventEnd = domContentLoadedEventEnd;
  }

  public Long getDomComplete() {
    return domComplete;
  }

  public void setDomComplete(Long domComplete) {
    this.domComplete = domComplete;
  }

  public Long getLoadEventStart() {
    return loadEventStart;
  }

  public void setLoadEventStart(Long loadEventStart) {
    this.loadEventStart = loadEventStart;
  }

  public Long getLoadEventEnd() {
    return loadEventEnd;
  }

  public void setLoadEventEnd(Long loadEventEnd) {
    this.loadEventEnd = loadEventEnd;
  }

  public Long getFetchStart() {
    return fetchStart;
  }

  public void setFetchStart(Long fetchStart) {
    this.fetchStart = fetchStart;
  }

  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public ToJSON getToJson() {
    return toJson;
  }

  public void setToJson(ToJSON toJson) {
    this.toJson = toJson;
  }

  public String toString() {
    return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
  }

  @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
  public static class Builder {
    private Long startTime;
    private Long endTime;
    private Long navigationStart;
    private Long unloadEventStart;
    private Long unloadEventEnd;
    private Long redirectStart;
    private Long redirectEnd;
    private Long fetchStart;
    private Long domainLookupStart;
    private Long domainLookupEnd;
    private Long connectStart;
    private Long connectEnd;
    private Long secureConnectionStart;
    private Long requestStart;
    private Long responseStart;
    private Long responseEnd;
    private Long domLoading;
    private Long domInteractive;
    private Long domContentLoadedEventStart;
    private Long domContentLoadedEventEnd;
    private Long domComplete;
    private Long loadEventStart;
    private Long loadEventEnd;
    private ToJSON toJSON;

    public Builder toJSON(ToJSON toJSON) {
      this.toJSON = toJSON;
      return this;
    }

    public Builder startTime(Long startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder endTime(Long endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder navigationStart(Long navigationStart) {
      this.navigationStart = navigationStart;
      return this;
    }

    public Builder unloadEventStart(Long unloadEventStart) {
      this.unloadEventStart = unloadEventStart;
      return this;
    }

    public Builder unloadEventEnd(Long unloadEventEnd) {
      this.unloadEventEnd = unloadEventEnd;
      return this;
    }

    public Builder redirectStart(Long redirectStart) {
      this.redirectStart = redirectStart;
      return this;
    }

    public Builder redirectEnd(Long redirectEnd) {
      this.redirectEnd = redirectEnd;
      return this;
    }

    public Builder fetchStart(Long fetchStart) {
      this.fetchStart = fetchStart;
      return this;
    }

    public Builder domainLookupStart(Long domainLookupStart) {
      this.domainLookupStart = domainLookupStart;
      return this;
    }

    public Builder domainLookupEnd(Long domainLookupEnd) {
      this.domainLookupEnd = domainLookupEnd;
      return this;
    }

    public Builder connectStart(Long connectStart) {
      this.connectStart = connectStart;
      return this;
    }

    public Builder connectEnd(Long connectEnd) {
      this.connectEnd = connectEnd;
      return this;
    }

    public Builder secureConnectionStart(Long secureConnectionStart) {
      this.secureConnectionStart = secureConnectionStart;
      return this;
    }

    public Builder requestStart(Long requestStart) {
      this.requestStart = requestStart;
      return this;
    }

    public Builder responseStart(Long responseStart) {
      this.responseStart = responseStart;
      return this;
    }

    public Builder responseEnd(Long responseEnd) {
      this.responseEnd = responseEnd;
      return this;
    }

    public Builder domLoading(Long domLoading) {
      this.domLoading = domLoading;
      return this;
    }

    public Builder domInteractive(Long domInteractive) {
      this.domInteractive = domInteractive;
      return this;
    }

    public Builder domContentLoadedEventStart(Long domContentLoadedEventStart) {
      this.domContentLoadedEventStart = domContentLoadedEventStart;
      return this;
    }

    public Builder domContentLoadedEventEnd(Long domContentLoadedEventEnd) {
      this.domContentLoadedEventEnd = domContentLoadedEventEnd;
      return this;
    }

    public Builder domComplete(Long domComplete) {
      this.domComplete = domComplete;
      return this;
    }

    public Builder loadEventStart(Long loadEventStart) {
      this.loadEventStart = loadEventStart;
      return this;
    }

    public Builder loadEventEnd(Long loadEventEnd) {
      this.loadEventEnd = loadEventEnd;
      return this;
    }

    public Timing build() {
      return new Timing(this);
    }
  }
}
