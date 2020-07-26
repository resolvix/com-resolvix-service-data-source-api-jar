package com.resolvix.service.datasource.api;

public interface MonitorListener<A> {

    void updateAvailability(A availability);
}
