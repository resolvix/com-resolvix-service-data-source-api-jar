package com.resolvix.service.datasource.api.event;

import java.util.List;

public interface RecentChangeHistory {

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
    List<Change> getRecentChangeHistory();
}
