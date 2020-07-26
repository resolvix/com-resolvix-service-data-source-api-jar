package com.resolvix.service.datasource.api.selector;

public enum State
    implements com.resolvix.service.datasource.api.State
{
    ONLINE;

    @Override
    public boolean isOnline() {
        return ONLINE.equals(this);
    }
}
