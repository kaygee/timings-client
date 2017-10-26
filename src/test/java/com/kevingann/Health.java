package com.kevingann;

import com.kevingann.beans.health.HealthStatus;
import com.kevingann.facade.TimingsFacade;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Health {

    private static final Logger LOG = LoggerFactory.getLogger(Health.class);

    @Test
    public void canBeObtained() {
        TimingsFacade timingsFacade = new TimingsFacade();
        HealthStatus healthStatus = timingsFacade.getHealth();
        LOG.info(healthStatus.toString());
    }
}
