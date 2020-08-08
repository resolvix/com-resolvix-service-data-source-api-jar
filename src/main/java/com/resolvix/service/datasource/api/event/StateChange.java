package com.resolvix.service.datasource.api.event;

import com.resolvix.lib.event.api.Change;

public interface StateChange<S>
    extends Change
{
    S getPreviousState();

    S getState();
}
