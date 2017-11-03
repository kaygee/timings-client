package com.kevingann.facade;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevingann.beans.cicd.apitiming.APITimingRequest;
import com.kevingann.beans.cicd.apitiming.APITimingResponse;
import com.kevingann.beans.cicd.injectjs.InjectJSRequest;
import com.kevingann.beans.cicd.injectjs.InjectJSResponse;
import com.kevingann.beans.cicd.navtiming.NavigationTimingRequest;
import com.kevingann.beans.cicd.navtiming.NavigationTimingResponse;
import com.kevingann.beans.cicd.resources.ResourcesRequest;
import com.kevingann.beans.cicd.resources.ResourcesResponse;
import com.kevingann.beans.cicd.usertiming.UserTimingRequest;
import com.kevingann.beans.cicd.usertiming.UserTimingResponse;
import com.kevingann.beans.home.HealthStatus;
import com.kevingann.util.TimingsClientConfig;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import static io.restassured.RestAssured.given;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;

public class TimingsFacade {

    private static final Logger LOG = LoggerFactory.getLogger(TimingsFacade.class);

    private static final String HEALTH_PATH = "/health";
    private static final String INJECTJS_PATH = "/v2/api/cicd/injectjs";
    private static final String NAVTIMING_PATH = "/v2/api/cicd/navtiming";
    private static final String USERTIMING_PATH = "/v2/api/cicd/usertiming";
    private static final String APITIMING_PATH = "/v2/api/cicd/apitiming";
    private static final String RESOURCES_PATH = "/v2/api/cicd/resources";

    public TimingsFacade() {
        RestAssured.defaultParser = Parser.JSON;

        RestAssured.config = RestAssuredConfig.config().objectMapperConfig(objectMapperConfig()
                .jackson2ObjectMapperFactory((aClass, s) -> {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            return objectMapper;
        }));
    }

    public HealthStatus getHealth() {
        // @formatter:off

        return given().
                spec(getRequestSpecification()).
                response().
                statusCode(200).
                when().
                get(TimingsClientConfig.getUri(HEALTH_PATH)).
                andReturn().
                as(HealthStatus.class);

        // @formatter:on
    }

    public ResourcesResponse getResources(ResourcesRequest resourcesRequest) {
        // @formatter:off

        return given().
                spec(getRequestSpecification(resourcesRequest)).
                expect().
                response().
                statusCode(200).
                when().
                post(TimingsClientConfig.getUri(RESOURCES_PATH)).
                andReturn().
                as(ResourcesResponse.class);

        // @formatter:on
    }

    public APITimingResponse getAPITiming(APITimingRequest apiTimingRequest) {
        // @formatter:off

        return given().
                spec(getRequestSpecification(apiTimingRequest)).
                expect().
                response().
                statusCode(200).
                when().
                post(TimingsClientConfig.getUri(APITIMING_PATH)).
                andReturn().
                as(APITimingResponse.class);

        // @formatter:on
    }

    public UserTimingResponse getUserTiming(UserTimingRequest userTimingRequest) {
        // @formatter:off

        return given().
                spec(getRequestSpecification(userTimingRequest)).
                expect().
                response().
                statusCode(200).
                when().
                post(TimingsClientConfig.getUri(USERTIMING_PATH)).
                andReturn().
                as(UserTimingResponse.class);

        // @formatter:on
    }

    public NavigationTimingResponse getNavigationTiming(NavigationTimingRequest navigationTimingRequest) {
        // @formatter:off

        return given().
                spec(getRequestSpecification(navigationTimingRequest)).
                expect().
                response().
                statusCode(200).
                when().
                post(TimingsClientConfig.getUri(NAVTIMING_PATH)).
                andReturn().
                as(NavigationTimingResponse.class);

        // @formatter:on
    }

    public InjectJSResponse getInjectJs(InjectJSRequest injectJSRequest) {
        // @formatter:off

        return given().
                spec(getRequestSpecification(injectJSRequest)).
                expect().
                response().
                statusCode(200).
                when().
                post(TimingsClientConfig.getUri(INJECTJS_PATH)).
                andReturn().
                as(InjectJSResponse.class);

        // @formatter:on
    }

    public String getInjectJsCode(InjectJSRequest injectJSRequest) throws UnsupportedEncodingException {
        // @formatter:off

        return URLDecoder.decode(given().
                spec(getRequestSpecification(injectJSRequest)).
                expect().
                response().
                statusCode(200).
                when().
                post(TimingsClientConfig.getUri(INJECTJS_PATH)).
                andReturn().
                as(InjectJSResponse.class).getInjectCode(), "UTF-8");

        // @formatter:on
    }

    private RequestSpecification getRequestSpecification(ResourcesRequest resourcesRequest) {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBody(resourcesRequest);
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.addFilter(new ErrorLoggingFilter());
        return requestSpecBuilder.build();
    }

    private RequestSpecification getRequestSpecification(APITimingRequest apiTimingRequest) {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBody(apiTimingRequest);
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.addFilter(new ErrorLoggingFilter());
        return requestSpecBuilder.build();
    }

    private RequestSpecification getRequestSpecification(UserTimingRequest userTimingRequest) {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBody(userTimingRequest);
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.addFilter(new ErrorLoggingFilter());
        return requestSpecBuilder.build();
    }

    private RequestSpecification getRequestSpecification(NavigationTimingRequest navigationTimingRequest) {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBody(navigationTimingRequest);
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.addFilter(new ErrorLoggingFilter());
        return requestSpecBuilder.build();
    }

    private RequestSpecification getRequestSpecification(InjectJSRequest injectJSRequest) {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBody(injectJSRequest);
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.addFilter(new ErrorLoggingFilter());
        return requestSpecBuilder.build();
    }

    private RequestSpecification getRequestSpecification() {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.addFilter(new ErrorLoggingFilter());
        return requestSpecBuilder.build();
    }
}
