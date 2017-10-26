package com.kevingann.facade;

import com.kevingann.beans.cicd.injectjs.InjectJSResponse;
import com.kevingann.beans.cicd.injectjs.Model;
import com.kevingann.beans.home.HealthStatus;
import com.kevingann.util.ConfigUtil;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;

public class TimingsFacade {

    private static final Logger LOG = LoggerFactory.getLogger(TimingsFacade.class);

    private static final String HEALTH_PATH = "/home";
    private static final String INJECTJS_PATH = "/v2/api/cicd/injectjs";

    public TimingsFacade() {
        RestAssured.defaultParser = Parser.JSON;
    }

    public HealthStatus getHealth() {
        // @formatter:off

        return given().
                spec(getRequestSpecification()).
                response().
                statusCode(200).
                when().
                get(ConfigUtil.getUri(HEALTH_PATH)).
                andReturn().
                as(HealthStatus.class);

        // @formatter:on
    }

    public InjectJSResponse getInjectJs(Model model) {
        // @formatter:off

        return given().
                spec(getRequestSpecification(model)).
                expect().
                response().
                statusCode(200).
                when().
                post(ConfigUtil.getUri(INJECTJS_PATH)).
                andReturn().
                as(InjectJSResponse.class);


        // @formatter:on
    }

    private RequestSpecification getRequestSpecification(Model model) {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBody(model);
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
