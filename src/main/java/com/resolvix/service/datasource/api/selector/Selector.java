package com.resolvix.service.datasource.api.selector;


import com.resolvix.service.datasource.api.SelectorListener;
import com.resolvix.service.datasource.api.event.StateChange;

import java.util.List;

/**
 *
 *
 * @param <S> the type representing the availability of
 *  the data source subject to monitoring
 */
@Deprecated
public interface Selector<S> {

    /**
     * Returns the state of the data source selector.
     *
     * @return the state of the data source selector
     */
    S getState();

    /**
     * Returns the list of change events that have taken place recently,
     * sorted from the most latest change event to the earliest, as recorded
     * and maintained by the monitor.
     *
     * The concept of "recently" is not defined, however, the implementation
     * should record a sufficient period of status change events to evidence
     * the monitors' assessment of the status of the data source.
     *
     * @return a list of recent change events, in descending order
     *  according to the time the status change event took place
     */
    List<StateChange<S>> getRecentChangeHistory();

    void addListener(SelectorListener<S> listener);

    void removeListener(SelectorListener<S> listener);
}
