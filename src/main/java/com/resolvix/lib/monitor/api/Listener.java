package com.resolvix.lib.monitor.api;

public interface Listener<P> {

    void signal(P property);
}
