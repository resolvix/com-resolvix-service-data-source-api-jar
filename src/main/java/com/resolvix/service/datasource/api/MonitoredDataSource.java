package com.resolvix.service.datasource.api;

import com.resolvix.lib.event.api.RecentChangeHistory;

import javax.sql.DataSource;
import java.time.Duration;

public interface MonitoredDataSource<A extends Availability, R extends Reliability, P extends Performance>
    extends DataSource, RecentChangeHistory
{
    enum Event {

        CONNECTION_FAILED;

    }

    interface Listener
    {

        void signalEvent(Event event);
    }

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
