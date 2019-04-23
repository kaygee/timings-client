package com.kevingann;

import com.kevingann.beans.cicd.resources.ResourcesRequest;
import com.kevingann.beans.cicd.resources.ResourcesResponse;
import com.kevingann.facade.TimingsFacade;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Resources {

    private static final Logger LOG = LoggerFactory.getLogger(Resources.class);

    @Test
    public void canBeObtained() {
        ResourcesRequest resourcesRequest = new ResourcesRequest();
        resourcesRequest.setId("944f735e-0214-4e0d-8b3b-9fef0f4cadc3");

        TimingsFacade timingsFacade = new TimingsFacade();
        ResourcesResponse resourcesResponse = timingsFacade.getResources(resourcesRequest);
        LOG.info(resourcesResponse.toString());
    }
}
