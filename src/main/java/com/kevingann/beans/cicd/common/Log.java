package com.kevingann.beans.cicd.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Set of key/value pairs that will be saved to ElasticSearch. You can add any key-value pair here but the following
 * are mandatory / recommended.
 */
public class Log {

    @JsonProperty("team")
    private String team;

    @JsonProperty("test_info")
    private String testInfo;

    @JsonProperty("env_tester")
    private String environmentTester;

    @JsonProperty("browser")
    private String browser;

    @JsonProperty("env_target")
    private String environmentTarget;

    public Log(Builder builder) {
        this.team = builder.team;
        this.testInfo = builder.testInfo;
        this.environmentTester = builder.environmentTester;
        this.browser = builder.browser;
        this.environmentTarget = builder.environmentTarget;
    }

    public static class Builder {
        private String team;
        private String testInfo;
        private String environmentTester;
        private String browser;
        private String environmentTarget;

        /**
         * Environment of the test target. Examples: "test", "prod".
         *
         * @param environmentTarget
         * @return
         */
        public Builder environmentTarget(String environmentTarget) {
            this.environmentTarget = environmentTarget;
            return this;
        }

        /**
         * The browser used to run the test. Examples: "chrome", "firefox".
         *
         * @param browser
         * @return
         */
        public Builder browser(String browser) {
            this.browser = browser;
            return this;
        }

        /**
         * The platform of the test source. Examples: "local", "saucelabs-windows-firefox47".
         *
         * @param environmentTester
         * @return
         */
        public Builder environmentTester(String environmentTester) {
            this.environmentTester = environmentTester;
            return this;
        }

        /**
         * String describing the page/transaction being tested. Example: "Login to home page".
         *
         * @param testInfo
         * @return
         */
        public Builder testInfo(String testInfo) {
            this.testInfo = testInfo;
            return this;
        }

        /**
         * Short string describing the product or test team.
         *
         * @param team
         * @return
         */
        public Builder team(String team) {
            this.team = team;
            return this;
        }

        public Log build() {
            return new Log(this);
        }
    }

    public String getTeam() {
        return team;
    }

    public String getTestInfo() {
        return testInfo;
    }

    public String getEnvironmentTester() {
        return environmentTester;
    }

    public String getBrowser() {
        return browser;
    }

    public String getEnvironmentTarget() {
        return environmentTarget;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
