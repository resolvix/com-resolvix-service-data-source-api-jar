package com.resolvix.service.datasource.api;

import com.resolvix.lib.junction.api.Selector;
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

        @Override
        public boolean isOffline() {
            return OFFLINE.equals(this);
        }

        @Override
        public boolean isNotAvailable() {
            return NOT_AVAILABLE.equals(this);
        }
    }

    @Mock
    private Selector<State> selector;

    @Mock
    private SwitchedDataSource<State, Selector<State>> switchedDataSource;

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
