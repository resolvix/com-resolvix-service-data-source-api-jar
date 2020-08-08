package com.resolvix.lib.junction.api;

import com.resolvix.lib.event.api.ListenerEnabled;
import com.resolvix.lib.event.api.RecentChangeHistory;

/**
 * Defines an interface for a junction that switches objects of type
 * {@code R}, depending on the value of the selector property, {@code P},
 * as determined from time to time by the {@link Selector}, {@code S}.
 *
 * @param <P> the type representing the state of the selector property
 * @param <S> the type representing the selector
 * @param <R> the type for which junction services are provided by reference
 *  to the state of the selector property
 */
public interface Junction<P, S extends Selector<P>, R>
    extends ListenerEnabled<P>, RecentChangeHistory<P>
{

    /**
     * Returns the {@link Selector} associated with the switch.
     *
     * @return the selector
     */
    S getSelector();

    /**
     * Returns the current state of the {@link Selector}.
     *
     * @return the state of the selector
     */
    P getState();
}
