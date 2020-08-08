package com.resolvix.lib.monitor.api;

/**
 * Defines an interface for a generic form of probe the purpose of
 * which is to determine a given property of a given resource on
 * demand.
 *
 * @param <P> the type representing the property
 */
public interface Probe<P> {

    /**
     * Invokes the {@link Probe} to determine the relevant property
     * of the relevant resource.
     *
     * @return the property as determined by the probe
     */
    P probe();
}
