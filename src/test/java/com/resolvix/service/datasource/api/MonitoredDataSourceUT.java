package com.resolvix.service.datasource.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MonitoredDataSourceUT {

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

    private enum Reliability
        implements com.resolvix.service.datasource.api.Reliability
    {

        RELIABLE,

        UNRELIABLE;

        @Override
        public boolean isReliable() {
            return RELIABLE.equals(this);
        }
    }



    private class Performance
        implements com.resolvix.service.datasource.api.Performance
    {

    }

    @Mock
    private MonitoredDataSource<Availability, Reliability, Performance>
        monitoredDataSource;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void monitoredDataSourceLifecycle() throws Exception {
        monitoredDataSource.getAvailability();
        monitoredDataSource.getReliability();
        monitoredDataSource.getPerformance();
        monitoredDataSource.isUp();
        monitoredDataSource.getUptime();
        monitoredDataSource.isDown();
        monitoredDataSource.getDowntime();
        monitoredDataSource.getConnection();
        monitoredDataSource.getRecentChangeHistory();
    }
}
