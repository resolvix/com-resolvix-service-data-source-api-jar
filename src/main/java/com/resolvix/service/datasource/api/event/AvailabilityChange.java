package com.resolvix.service.datasource.api.event;

public interface AvailabilityChange<A>
    extends Change
{
    A getPreviousAvailability();

    A getAvailability();
}
