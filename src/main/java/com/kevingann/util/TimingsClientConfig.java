package com.kevingann.util;

import org.apache.commons.validator.routines.UrlValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import static org.apache.commons.validator.routines.UrlValidator.ALLOW_LOCAL_URLS;

public class TimingsClientConfig {

    private static final Logger LOG = LoggerFactory.getLogger(TimingsClientConfig.class);

    private static final String CONFIG_FILE_NAME = "timings-client.properties";
    private static final Properties CONFIG_PROPERTIES = new Properties();

    /**
     * @return the properties
     */
    private static Properties getProperties() {
        try {
            InputStream inputStream = new FileInputStream(CONFIG_FILE_NAME);
            CONFIG_PROPERTIES.load(inputStream);
        } catch (IOException e) {
            LOG.info("The file '" + CONFIG_FILE_NAME + "' couldn't be found or isn't a valid properties file.");
        }
        return CONFIG_PROPERTIES;
    }

    /**
     * For people who run tests from eclipse and need to be able to pass in properties as environment variables or
     * system properties.
     *
     * @param key the key to use
     * @return the var/property or default
     */
    public static String getEnvVarOrProperty(String key) {
        String value = null;
        if (System.getenv().containsKey(key)) {
            value = System.getenv(key);
        } else if (System.getProperties().containsKey(key)) {
            value = System.getProperty(key);
        } else if (TimingsClientConfig.getProperties().containsKey(key)) {
            value = TimingsClientConfig.getProperties().getProperty(key);
        } else {
            LOG.error("Environment variable or property file entry not found for '" + key + "'.");
            System.exit(1);
        }
        return value;
    }

    public static String getUrl(String url) {
        // Test to see if it's a valid URL.
        UrlValidator defaultValidator = new UrlValidator(ALLOW_LOCAL_URLS);
        if (!defaultValidator.isValid(url)) {
            LOG.error("The url [" + url + "] isn't a valid URL.");
            System.exit(1);
        }
        return url;
    }

    public static String provideEndpointUrl() {
        String url = TimingsClientConfig.getEnvVarOrProperty("PERF_API_URL");
        return getUrl(url);
    }

    public static String provideTeam() {
        return TimingsClientConfig.getEnvVarOrProperty("TEAM");
    }

    public static Long provideTestInfo() {
        return Long.valueOf(TimingsClientConfig.getEnvVarOrProperty("TEST_INFO"));
    }

    public static Long providePageLoadTime() {
        return Long.valueOf(TimingsClientConfig.getEnvVarOrProperty("PAGE_LOAD_TIME_MS"));
    }

    public static URI getUri(String path) {
        String fullPath = getFullPath(path);
        URI uri = null;
        try {
            uri = new URI(fullPath);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }

    public static String getFullPath(String path) {
        String endpointUrl = TimingsClientConfig.provideEndpointUrl();
        if (endpointUrl.endsWith("/")) {
            String substring = endpointUrl.substring(0, endpointUrl.length() - 1);
            return substring + path;
        } else {
            return endpointUrl + path;
        }
    }

}
