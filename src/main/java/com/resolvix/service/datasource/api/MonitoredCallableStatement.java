package com.resolvix.service.datasource.api;

import java.sql.CallableStatement;

public interface MonitoredCallableStatement
    extends MonitoredPreparedStatement, CallableStatement
{
}
