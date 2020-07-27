package com.resolvix.service.datasource.api;

import com.resolvix.service.datasource.api.event.AvailabilityChange;
import com.resolvix.service.datasource.api.event.RecentChangeHistory;
import com.resolvix.service.datasource.api.monitor.Monitor;

import javax.sql.DataSource;
import java.time.Duration;
import java.util.List;

public interface MonitoredDataSource<A extends Availability, R extends Reliability, P extends Performance>
    extends DataSource, RecentChangeHistory
{
    /**
     * Returns a reference to the {@link Monitor} of the data source.
     *
     * @param <M> the type of monitor
     * @return the monitor
     */
    <M extends Monitor<A>> M getMonitor();

    /**
     * Returns the availability of the data source, according to the
     * relevant monitor.
     *
     * @return the reported availability of the data source.
     */
    A getAvailability();

    /**
     * Returns the reliability of the data source, according to the relevant
     * monitor.
     *
     * @return the reported reliability of the data source.
     */
    R getReliability();

    /**
     * Returns the performance of the data source, according to the relevant
     * monitor.
     *
     * @return the reported performance of the data source.
     */
    P getPerformance();

    /**
     * Indicates whether the relevant data source is up.
     *
     * @return true, if the data source is up and available; false, otherwise
     */
    boolean isUp();

    /**
     * Indicates whether the relevant data source is down.
     *
     * @return true, if the data source is down and therefore not available;
     *  false, otherwise
     */
    boolean isDown();

    /**
     * Returns the uptime for the data source; that is, the elapsed period
     * of time the data source has been 'up' since the last change in
     * availability.
     *
     * @return the duration the data source has been 'up'
     */
    Duration getUptime();

    /**
     * Returns the downtime for the data source; that is, the elapsed period
     * of time the data source has been 'down' since the last change in
     * availability.
     *
     * @return the duration the data source has been 'down'
     */
    Duration getDowntime();
}
