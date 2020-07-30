package com.resolvix.service.datasource.spi;

import com.resolvix.lib.monitor.api.Probe;

import javax.sql.DataSource;

/**
 * Defines an interface for a data source manager that provides access
 * to one or more data sources.
 */
public interface DataSourceManager {

    /**
     * Returns a {@link DataSource}.
     *
     * @param name the name of the data source
     * @param <D> the data source type
     * @return the data source
     */
    <D extends DataSource> D getDataSource(String name);

    /**
     * Returns a data source {@link Probe}.
     *
     * @param name the name of the monitor
     * @param <A> the type representing the availability
     *  of the data source being monitored
     * @param <M> the {@link Probe} type
     * @return the monitor
     */
    <A, M extends Probe<A>> M getMonitor(String name);

    /**
     * Returns a data source of type {@link com.resolvix.service.datasource.api.MonitoredDataSource},
     * monitored in accordance with the relevant monitor.
     *
     * @param dataSourceName the data source to be monitored
     * @param monitorName the monitor
     * @param <D> the data source type
     * @return the monitored data source
     */
    <D extends DataSource> D getMonitoredDataSource(String dataSourceName, String monitorName);
}
