package com.resolvix.service.datasource.api.event;

import com.resolvix.lib.event.api.Change;

@Deprecated
public interface AvailabilityChange<A>
    extends Change
{
    A getPreviousAvailability();

    A getAvailability();
}
