package com.kevingann.beans.cicd.injectjs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InjectJSRequest {

    @JsonProperty("injectType")
    private String injectType;

    @JsonProperty("visualCompleteMark")
    private String visualCompleteMark;

    public String getInjectType() {
        return injectType;
    }

    public void setInjectType(String injectType) {
        this.injectType = injectType;
    }

    public String getVisualCompleteMark() {
        return visualCompleteMark;
    }

    public void setVisualCompleteMark(String visualCompleteMark) {
        this.visualCompleteMark = visualCompleteMark;
    }
}
