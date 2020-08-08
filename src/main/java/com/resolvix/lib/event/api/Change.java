package com.resolvix.lib.event.api;

import java.time.Instant;

/**
 * Defines an interface representing a change in state of a given property
 * at a given point in time.
 *
 * @param <P> the type representing the property
 */
public interface Change<P> {

    /**
     * Returns the new state of the relevant property.
     *
     * @return the property state
     */
    P getState();

    /**
     * Returns the {@link Instant} that the relevant change in state was
     * determined.
     *
     * @return the instant
     */
    Instant getInstant();
}
