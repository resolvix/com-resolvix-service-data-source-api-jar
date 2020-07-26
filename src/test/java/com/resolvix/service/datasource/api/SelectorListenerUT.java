package com.resolvix.service.datasource.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SelectorListenerUT {

    private enum State
        implements com.resolvix.service.datasource.api.State
    {

        ONLINE,

        WARNING_OFFLINE,

        OFFLINE,

        WARNING_ONLINE,

        WARNING_NOT_AVAILABLE,

        NOT_AVAILABLE;

        @Override
        public boolean isOnline() {
            return ONLINE.equals(this);
        }
    }

    @Mock
    private SelectorListener<State> selectorListener;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void monitorSelectorLifecycle() {
        selectorListener.updateState(State.ONLINE);
        selectorListener.updateState(State.WARNING_OFFLINE);
        selectorListener.updateState(State.OFFLINE);
        selectorListener.updateState(State.WARNING_NOT_AVAILABLE);
        selectorListener.updateState(State.NOT_AVAILABLE);
        selectorListener.updateState(State.WARNING_ONLINE);
    }
}
