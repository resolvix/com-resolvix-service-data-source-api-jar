package com.resolvix.lib.junction.api;


import com.resolvix.lib.event.api.Listener;
import com.resolvix.lib.event.api.RecentChangeHistory;
import com.resolvix.lib.event.api.ListenerEnabled;

/**
 * Defines an interface for a {@link Selector}, the purpose of which is to -
 *
 * <ol>
 *   <li>determine the state of the selector property, {@code P}, from time
 *       to time;</li>
 *   <li>signal any changes in the state of the selector property, {@code P},
 *       to one or more objects implementing the {@link Listener} interface;</li>
 * </ol>
 *
 * @param <P> the type representing the state of the selector property
 */
public interface Selector<P>
    extends ListenerEnabled<P>, RecentChangeHistory<P>
{

    /**
     * Returns the state of the selector property.
     *
     * @return the state of the selector property
     */
    P getState();
}
