package com.resolvix.service.datasource.api.monitor;

public enum Availability
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
