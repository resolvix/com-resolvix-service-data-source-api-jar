package com.resolvix.service.datasource.api.event;

import com.resolvix.lib.event.api.Change;

public interface AvailabilityChange<A>
    extends Change
{
    A getPreviousAvailability();

    A getAvailability();
}
