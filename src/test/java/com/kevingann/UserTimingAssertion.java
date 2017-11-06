package com.kevingann;

import com.kevingann.beans.cicd.common.Baseline;
import com.kevingann.beans.cicd.common.Flags;
import com.kevingann.beans.cicd.common.Include;
import com.kevingann.beans.cicd.common.InjectJS;
import com.kevingann.beans.cicd.common.Log;
import com.kevingann.beans.cicd.common.Mark;
import com.kevingann.beans.cicd.common.Measure;
import com.kevingann.beans.cicd.common.ServiceLevelAgreement;
import com.kevingann.beans.cicd.usertiming.UserTimingRequest;
import com.kevingann.beans.cicd.usertiming.UserTimingResponse;
import com.kevingann.facade.TimingsFacade;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserTimingAssertion {

    private static final Logger LOG = LoggerFactory.getLogger(UserTimingAssertion.class);

    @Test
    public void canBeObtained() {
        // @formatter:off

        Measure measure = new Measure
                .Builder()
                .name("test")
                .entryType("measure")
                .startTime(236377.80000000002)
                .duration(5345.174999999988)
                .build();

        Measure[] measures = {measure};

        Mark mark = new Mark
                .Builder()
                .name("test_start")
                .entryType("mark")
                .startTime(236377.80000000002)
                .duration(0.0)
                .build();

        Mark[] marks = {mark};

        InjectJS injectJS = new InjectJS
                .Builder()
                .time(1496339132056L)
                .measures(measures)
                .url("http://www.example.com/")
                .marks(marks)
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

        Flags flags = new Flags
                .Builder()
                .debug(false)
                .esTrace(false)
                .esCreate(false)
                .passOnFailedAssert(false)
                .build();

        Log log = new Log.
                Builder()
                .team("perfeng")
                .testInfo("V2 - Test App (usertiming)")
                .environmentTester("chromeEmulator")
                .browser("Chrome")
                .environmentTarget("prod")
                .build();

        UserTimingRequest userTimingRequest = new UserTimingRequest
                .Builder()
                .injectJS(injectJS)
                .serviceLevelAgreement(sla)
                .baseline(baseline)
                .flags(flags)
                .log(log)
                .build();

        // @formatter:on

        TimingsFacade timingsFacade = new TimingsFacade();
        UserTimingResponse userTimingResponse = timingsFacade.getUserTiming(userTimingRequest);
        LOG.info(userTimingResponse.toString());
    }
}
