package com.resolvix.service.datasource.api;

import com.resolvix.service.datasource.api.monitor.Availability;

import java.sql.Connection;

public interface MonitoredConnection
    extends Connection
{

    Availability getAvailability();
}
