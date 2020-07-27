package com.resolvix.service.datasource.api.selector;

public enum State
    implements com.resolvix.service.datasource.api.State
{
    ONLINE,

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
