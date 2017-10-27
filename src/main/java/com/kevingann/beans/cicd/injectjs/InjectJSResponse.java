package com.kevingann.beans.cicd.injectjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class InjectJSResponse {

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("inject_code")
    private String injectCode;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInjectCode() {
        return injectCode;
    }

    public void setInjectCode(String injectCode) {
        this.injectCode = injectCode;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }

}
