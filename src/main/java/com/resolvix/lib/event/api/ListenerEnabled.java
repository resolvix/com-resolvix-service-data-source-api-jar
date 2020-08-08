package com.resolvix.lib.event.api;

import java.util.List;

/**
 * Defines a generic interface for the management of {@link Listener}
 * for state changes of a property, {@code P}.
 *
 * @param <P> the type of the property
 */
public interface ListenerEnabled<P> {

    /**
     * Adds a {@link Listener} to the list of listeners registered to receive
     * advice of state changes of the relevant property.
     *
     * @param listener the listener
     */
    void addListener(Listener<P> listener);

    /**
     * Returns the list of {@link Listener} registered to receive
     * advice of state changes in relation to the relevant property.
     *
     * @return the list of listeners
     */
    List<Listener<P>> getListeners();

    /**
     * Removes a {@link Listener} from the list of listeners registered to
     * received advice of state changes of the relevant property.
     *
     * @param listener the listener
     */
    void removeListener(Listener<P> listener);
}
