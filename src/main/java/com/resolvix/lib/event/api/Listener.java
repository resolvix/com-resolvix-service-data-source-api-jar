package com.resolvix.lib.event.api;

/**
 * Defines a generic interface for a listener that may be registered to
 * receive advice of state changes in relation to the relevant property.
 *
 * @param <P> the type of the property
 */
public interface Listener<P> {

    /**
     * Accepts notice of the change in state of the relevant property.
     *
     * @param previous the previous value of the property
     * @param current the current value of the property
     */
    void notify(P previous, P current);
}
