package com.kevingann.beans.cicd.navtiming;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Include {

    @JsonProperty("useragent_family")
    private String userAgentFamily;

    @JsonProperty("os_family")
    private String osFamily;

    public String getUserAgentFamily() {
        return userAgentFamily;
    }

    public void setUserAgentFamily(String userAgentFamily) {
        this.userAgentFamily = userAgentFamily;
    }

    public String getOsFamily() {
        return osFamily;
    }

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }
}
