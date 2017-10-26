package com.kevingann;

import com.kevingann.beans.cicd.injectjs.InjectJSResponse;
import com.kevingann.beans.cicd.injectjs.Model;
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

        Model model = new Model();
        model.setInjectType("navtiming");
        model.setVisualCompleteMark("initialPageLoad");

        InjectJSResponse injectJs = timingsFacade.getInjectJs(model);
        assertThat(injectJs.getStatus()).isEqualTo(200);
        assertThat(injectJs.getInjectCode()).isNotEmpty();
        LOG.info(injectJs.toString());
    }
}
