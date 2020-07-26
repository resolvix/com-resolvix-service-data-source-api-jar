package com.resolvix.service.datasource.api;

import com.resolvix.service.datasource.api.event.StateChange;
import com.resolvix.service.datasource.api.selector.Selector;

import javax.sql.DataSource;
import java.util.List;

/**
 * Defines an interface for a switched data source examples of which
 * may include -
 *
 * <ol>
 *     <li>an online / offline switched data source; or</li>
 *     <li>a failover switched data source.</li>
 * </ol>
 *
 * @param <S> the type representing the state of the
 *  data source selector
 */
public interface SwitchedDataSource<S>
    extends DataSource
{

    /**
     * Returns the data source {@link Selector}.
     *
     * @return the selector
     */
    Selector<S> getSelector();

    /**
     * Returns the state of the data source selector.
     *
     * @return the reported status of the data source
     */
    S getState();

    /**
     * Returns the list of change events that have taken place recently,
     * sorted from the most latest change event to the earliest, as recorded
     * and maintained by the selector.
     *
     * The concept of "recently" is not defined, however, the implementation
     * should record a sufficient period of state change events to evidence
     * the selectors' assessment of the state of the data source selector.
     *
     * @return a list of recent change events, in descending order
     *  according to the time the state change event took place
     */
    default List<StateChange<S>> getRecentChangeHistory() {
        return getSelector().getRecentChangeHistory();
    }
}
