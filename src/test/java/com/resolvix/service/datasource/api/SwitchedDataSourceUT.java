package com.resolvix.service.datasource.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SwitchedDataSourceUT {

    private enum State
        implements com.resolvix.service.datasource.api.State
    {

        ONLINE,

        WARNING,

        OFFLINE,

        NOT_AVAILABLE;

        @Override
        public boolean isOnline() {
            return ONLINE.equals(this);
        }
    }

    @Mock
    private SwitchedDataSource<State> switchedDataSource;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void switchedDataSourceLifecycle() throws Exception {
        switchedDataSource.getSelector();
        switchedDataSource.getState();
        switchedDataSource.getRecentChangeHistory();
    }
}
