package com.resolvix.lib.monitor.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProbeUT {

    private enum Availability {

        UP,

        DOWN;

    }

    @Mock
    private Probe<Availability> monitor;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void monitorLifecycle() {
        monitor.probe();
    }
}
