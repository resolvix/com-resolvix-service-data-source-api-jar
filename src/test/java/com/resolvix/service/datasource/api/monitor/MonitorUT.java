package com.resolvix.service.datasource.api.monitor;

import com.resolvix.service.datasource.api.MonitorListener;
import com.resolvix.service.datasource.api.event.AvailabilityChange;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class MonitorUT {

    private enum Availability {

        UP,

        DOWN;

    }

    @Mock
    private Monitor<Availability> monitor;

    @Mock
    private MonitorListener<Availability> listener;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void monitorLifecycle() {
        monitor.addListener(listener);
        List<AvailabilityChange<Availability>> changeEvents = monitor.getRecentChangeHistory();
        monitor.removeListener(listener);
    }
}
