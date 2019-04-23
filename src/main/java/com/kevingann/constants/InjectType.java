package com.kevingann.constants;

public enum InjectType {
  USER_TIMING("usertiming"),
  NAV_TIMING("navtiming");

  private final String val;

  InjectType(String val) {
    this.val = val;
  }

  @Override
  public String toString() {
    return val;
  }
}
