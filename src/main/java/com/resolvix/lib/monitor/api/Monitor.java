package com.resolvix.lib.monitor.api;

import com.resolvix.lib.event.api.Subject;

import java.util.List;

/**
 * Defines an interface for a generic form of monitor the purpose
 * of which is to determine a given property of a given resource
 * by reference to one or more {@link Probe}.
 *
 * @param <P> the type representing the property
 */
public interface Monitor<P>
    extends Subject<P>
{

    /**
     * Returns the present state of the relevant property.
     *
     * @return the property state
     */
    P getState();

    /**
     * Adds a {@link Probe} to the list of probes registered to determine
     * the present state of the relevant property.
     *
     * @param probe the probe
     */
    void addProbe(Probe<P> probe);

    /**
     * Returns the list of {@link Probe} registered to determine the present
     * state of the relevant property.
     *
     * @return the list of probes
     */
    List<Probe<P>> getProbes();

    /**
     * Removes a {@link Probe} from the list of probes registered to determine
     * the present state of the relevant property.
     *
     * @param probe the probe
     */
    void removeProbe(Probe<P> probe);
}
