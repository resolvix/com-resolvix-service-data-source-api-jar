package com.resolvix.lib.monitor.api;

/**
 * Defines an interface for a generic form of monitor the purpose of
 * which is to monitor a given resource for a given property.
 *
 * @param <P> the type representing the nature of the property
 *  subject to monitoring
 */
public interface Probe<P> {

    /**
     * Invokes the monitor to obtain an assessment of a given property
     * of the relevant resource.
     *
     * @return the availability of the monitored resource
     */
    P probe();
}
