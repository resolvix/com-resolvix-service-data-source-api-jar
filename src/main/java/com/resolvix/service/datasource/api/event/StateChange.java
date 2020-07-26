package com.resolvix.service.datasource.api.event;

public interface StateChange<S>
    extends Change
{
    S getPreviousState();

    S getState();
}
