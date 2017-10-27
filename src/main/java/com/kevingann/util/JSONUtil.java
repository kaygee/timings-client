package com.kevingann.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevingann.beans.cicd.common.InjectJS;

import java.io.IOException;

public class JSONUtil {

    /**
     * Consumes the result of executing the code obtained from the InjectJSResponse.getInjectCode() method.
     *
     * @param getInjectCodeResult
     * @return
     */
    public static InjectJS getFrom(Object getInjectCodeResult) throws IOException {
        String json = new ObjectMapper().writeValueAsString(getInjectCodeResult);
        return new ObjectMapper().readValue(json, InjectJS.class);
    }
}
