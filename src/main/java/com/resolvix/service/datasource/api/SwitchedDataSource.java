package com.resolvix.service.datasource.api;

import com.resolvix.lib.event.api.RecentChangeHistory;
import com.resolvix.service.datasource.api.selector.Selector;

import javax.sql.DataSource;

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
    extends DataSource, RecentChangeHistory
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
}
