package com.kevingann;

import com.kevingann.beans.cicd.injectjs.InjectJSResponse;
import com.kevingann.beans.cicd.injectjs.InjectJSRequest;
import com.kevingann.facade.TimingsFacade;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class InjectJS {

    private static final Logger LOG = LoggerFactory.getLogger(Health.class);

    @Test
    public void canBeObtained() {
        TimingsFacade timingsFacade = new TimingsFacade();

        InjectJSRequest injectJSRequest = new InjectJSRequest();
        injectJSRequest.setInjectType("navtiming");
        injectJSRequest.setVisualCompleteMark("initialPageLoad");

        InjectJSResponse injectJs = timingsFacade.getInjectJs(injectJSRequest);
        assertThat(injectJs.getStatus()).isEqualTo(200);
        assertThat(injectJs.getInjectCode()).isNotEmpty();
        LOG.info(injectJs.toString());
    }
}
