package com.resolvix.lib.event.api;

public interface Listener<P> {

    void notify(P property);
}
