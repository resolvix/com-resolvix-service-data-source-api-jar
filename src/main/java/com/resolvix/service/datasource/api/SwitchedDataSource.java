package com.resolvix.service.datasource.api;

import com.resolvix.lib.event.api.RecentChangeHistory;
import com.resolvix.lib.junction.api.Selector;

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
public interface SwitchedDataSource<P, S extends Selector<P>>
    extends DataSource, RecentChangeHistory<P>
{

    /**
     * Returns the data source {@link Selector}.
     *
     * @return the selector
     */
    S getSelector();

    /**
     * Returns the state of the data source selector.
     *
     * @return the reported status of the data source
     */
    P getState();
}
