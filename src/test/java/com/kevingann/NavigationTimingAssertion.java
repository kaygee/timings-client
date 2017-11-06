package com.kevingann;

import com.kevingann.beans.cicd.common.Baseline;
import com.kevingann.beans.cicd.common.Flags;
import com.kevingann.beans.cicd.common.Include;
import com.kevingann.beans.cicd.common.InjectJS;
import com.kevingann.beans.cicd.common.Log;
import com.kevingann.beans.cicd.navtiming.NavigationTimingRequest;
import com.kevingann.beans.cicd.navtiming.NavigationTimingResponse;
import com.kevingann.beans.cicd.common.Resource;
import com.kevingann.beans.cicd.common.ServiceLevelAgreement;
import com.kevingann.beans.cicd.common.Timing;
import com.kevingann.facade.TimingsFacade;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigationTimingAssertion {

    private static final Logger LOG = LoggerFactory.getLogger(NavigationTimingAssertion.class);

    @Test
    public void canBeObtained() {
        // @formatter:off

        Timing timing = new Timing
                .Builder()
                .navigationStart(1496339132056L)
                .unloadEventStart(0L)
                .unloadEventEnd(0L)
                .redirectStart(0L)
                .redirectEnd(0L)
                .fetchStart(1496339132120L)
                .domainLookupStart(1496339132123L)
                .domainLookupEnd(1496339132123L)
                .connectStart(1496339132123L)
                .connectEnd(1496339132170L)
                .secureConnectionStart(1496339132137L)
                .requestStart(1496339132170L)
                .responseStart(1496339132300L)
                .responseEnd(1496339132829L)
                .domLoading(1496339132309L)
                .domInteractive(1496339132833L)
                .domContentLoadedEventStart(1496339132833L)
                .domContentLoadedEventEnd(1496339132848L)
                .domComplete(1496339132885L)
                .loadEventStart(1496339132886L)
                .loadEventEnd(1496339132889L)
                .build();

        Resource resource = new Resource
                .Builder()
                .name("https://img1.wsimg.com/ux/1.3.46-brand/css/uxcore-sales.min.css")
                .entryType("resource")
                .startTime(254.55)
                .duration(28.064999999999998)
                .initiatorType("link")
                .workerStart(0.0)
                .redirectStart(0.0)
                .redirectEnd(0.0)
                .fetchStart(254.55)
                .domainLookupStart(254.55)
                .domainLookupEnd(254.55)
                .connectStart(254.55)
                .connectEnd(254.55)
                .secureConnectionStart(0.0)
                .requestStart(256.665)
                .responseStart(279.37)
                .responseEnd(282.615)
                .transferSize(17008)
                .encodedBodySize(16731)
                .decodedBodySize(93840)
                .build();

        Resource[] resources = {resource};

        InjectJS injectJS = new InjectJS
                .Builder()
                .time(1496339132056L)
                .timing(timing)
                .visualCompleteTime(1734L)
                .url("http://www.example.com/")
                .resources(resources)
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
        include.setUserAgentFamily("*hrome*");
        include.setOsFamily("_agg_");

        Baseline baseline = new Baseline.
                Builder()
                .days(7)
                .percent(75)
                .padding(1.2)
                .searchUrl("http://www.google.com")
                .src("cicd")
                .aggField("act_pageLoadTime")
                .incl(include)
                .build();

        Log log = new Log.
                Builder()
                .team("perfeng")
                .testInfo("V2 - Test App (navtiming)")
                .environmentTester("test")
                .browser("Chrome")
                .environmentTarget("prod")
                .build();

        NavigationTimingRequest navigationTimingRequest = new NavigationTimingRequest
                .Builder()
                .injectJS(injectJS)
                .serviceLevelAgreement(sla)
                .baseline(baseline)
                .flags(flags)
                .log(log)
                .build();

        // @formatter:on

        LOG.info("SENDING");
        LOG.info(navigationTimingRequest.toString());
        TimingsFacade timingsFacade = new TimingsFacade();
        NavigationTimingResponse navigationTimingResponse = timingsFacade.getNavigationTiming(navigationTimingRequest);
        LOG.info("RESPONSE");
        LOG.info(navigationTimingResponse.toString());
    }
}
