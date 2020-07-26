package com.resolvix.service.datasource.api.selector;

import com.resolvix.service.datasource.api.SelectorListener;
import com.resolvix.service.datasource.api.event.StateChange;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class SelectorUT {

    private enum State {

        ONLINE,

        WARNING,

        OFFLINE,

        NOT_AVAILABLE;

    }

    @Mock
    private Selector<State> selector;

    @Mock
    private SelectorListener<State> listener;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void selectorLifecycle() {
        selector.addListener(listener);
        List<StateChange<State>> statusChanges = selector.getRecentChangeHistory();
        selector.removeListener(listener);
    }
}
