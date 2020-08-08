package com.resolvix.lib.event.api;

import java.util.List;

/**
 * Defines an interface for obtaining the recent change history of a
 * given property.
 *
 * @param <P> the type of the property
 */
public interface RecentChangeHistory<P> {

    /**
     * Returns the list of change events that have taken place recently,
     * sorted from the most latest change event to the earliest, as recorded
     * and maintained by the relevant component.
     *
     * The concept of "recently" is not defined, however, the implementation
     * should record a sufficient period of status change events to evidence
     * the state of the relevant component.
     *
     * @return a list of recent change events, in descending order
     *  according to the time the status change event took place
     */
    List<Change<P>> getRecentChangeHistory();
}
