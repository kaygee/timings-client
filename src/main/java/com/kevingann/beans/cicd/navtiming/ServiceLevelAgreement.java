package com.kevingann.beans.cicd.navtiming;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ServiceLevelAgreement {

    @JsonProperty("pageLoadTime")
    private long pageLoadTime;

    public long getPageLoadTime() {
        return pageLoadTime;
    }

    public void setPageLoadTime(long pageLoadTime) {
        this.pageLoadTime = pageLoadTime;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
