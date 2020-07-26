package com.resolvix.service.datasource.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MonitorListenerUT {

    private enum Availability
        implements com.resolvix.service.datasource.api.Availability
    {

        UP,

        DOWN;

        @Override
        public boolean isUp() {
            return UP.equals(this);
        }

        @Override
        public boolean isDown() {
            return DOWN.equals(this);
        }
    }



    @Mock
    private MonitorListener<Availability> monitorListener;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void monitorListenerLifecycle() {
        monitorListener.updateAvailability(Availability.UP);
        monitorListener.updateAvailability(Availability.DOWN);
    }
}
