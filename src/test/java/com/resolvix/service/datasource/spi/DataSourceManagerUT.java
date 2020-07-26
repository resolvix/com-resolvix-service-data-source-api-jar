package com.resolvix.service.datasource.spi;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DataSourceManagerUT {

    @Mock
    private DataSourceManager dataSourceManager;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void useCase() {

        dataSourceManager.getDataSource("jdbc/ONLINE_DATA_SOURCE");

        dataSourceManager.getDataSource("jdbc/OFFLINE_DATA_SOURCE");

        dataSourceManager.getDataSource("sds/ONLINE_OFFLINE_SWITCHED_DATA_SOURCE");
    }
}
