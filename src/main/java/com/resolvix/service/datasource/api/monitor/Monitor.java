package com.resolvix.service.datasource.api.monitor;

import com.resolvix.service.datasource.api.MonitorListener;
import com.resolvix.service.datasource.api.event.AvailabilityChange;
import com.resolvix.service.datasource.api.event.Change;

import java.util.List;

/**
 * Defines an interface for a data source monitor.
 *
 * @param <A> the type representing the availability of
 *  the data source subject to monitoring
 */
public interface Monitor<A>
{

    /**
     * Returns the availability of the data source for the relevant
     * monitor.
     *
     * @return the availability of the monitor data source.
     */
    A getAvailability();

    /**
     * Returns the reliability of the data source for the relevant
     * monitor.
     *
     * @return the reliability of the monitor data source.
     */
    Reliability getReliability();

    /**
     * Returns the list of change events that have taken place recently,
     * sorted from the most latest change event to the earliest, as recorded
     * and maintained by the monitor.
     *
     * The concept of "recently" is not defined, however, the implementation
     * should record a sufficient period of status change events to evidence
     * the monitors' assessment of the availability and status of the data
     * source.
     *
     * @return a list of recent change events, in descending order
     *  according to the time the status change event took place
     */
    List<AvailabilityChange<A>> getRecentChangeHistory();

    void addListener(MonitorListener<A> listener);

    void removeListener(MonitorListener<A> listener);
}
