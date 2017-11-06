package com.kevingann.constants;

public enum InjectType {

    // @formatter:off
    USER_TIMING("usertiming"),
    NAV_TIMING("navtiming");

    // @formatter:on

    private final String val;

    InjectType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
