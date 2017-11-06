package com.kevingann;

import com.kevingann.beans.cicd.apitiming.APITimingRequest;
import com.kevingann.beans.cicd.apitiming.APITimingResponse;
import com.kevingann.beans.cicd.common.Baseline;
import com.kevingann.beans.cicd.common.Flags;
import com.kevingann.beans.cicd.common.Include;
import com.kevingann.beans.cicd.common.Log;
import com.kevingann.beans.cicd.common.ServiceLevelAgreement;
import com.kevingann.beans.cicd.common.Timing;
import com.kevingann.facade.TimingsFacade;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class APITimingAssertion {

    private static final Logger LOG = LoggerFactory.getLogger(APITimingAssertion.class);

    @Test
    public void canBeObtained() {
        // @formatter:off

        Timing timing = new Timing
                .Builder()
                .startTime(1474997676867L)
                .endTime(1474997676905L)
                .build();

        Flags flags = new Flags
                .Builder()
                .debug(false)
                .esTrace(false)
                .esCreate(false)
                .passOnFailedAssert(false)
                .build();

        ServiceLevelAgreement sla = new ServiceLevelAgreement();
        sla.setPageLoadTime(4000L);

        Include include = new Include();
        include.setEnvironmentTester("_log_");

        Baseline baseline = new Baseline.
                Builder()
                .days(7)
                .percent(75)
                .padding(1.2)
                .searchUrl("http://www.google.com")
                .incl(include)
                .build();

        Log log = new Log.
                Builder()
                .team("perfeng")
                .testInfo("V2 - Test App (apitiming)")
                .environmentTester("linux")
                .browser("api_call")
                .environmentTarget("prod")
                .build();

        APITimingRequest apiTimingRequest = new APITimingRequest
                .Builder()
                .timing(timing)
                .url("https://api.example.com")
                .serviceLevelAgreement(sla)
                .baseline(baseline)
                .flags(flags)
                .log(log)
                .build();

        // @formatter:on

        TimingsFacade timingsFacade = new TimingsFacade();
        APITimingResponse apiTimingResponse = timingsFacade.getAPITiming(apiTimingRequest);
        LOG.info(apiTimingResponse.toString());
    }
}
