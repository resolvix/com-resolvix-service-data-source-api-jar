package com.resolvix.service.datasource.api.monitor;

public enum Reliability
    implements com.resolvix.service.datasource.api.Reliability
{
    RELIABILE,

    UNRELIABLE;

    @Override
    public boolean isReliable() {
        return RELIABILE.equals(this);
    }
}
