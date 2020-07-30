package com.resolvix.lib.monitor.api;

import java.util.List;

public interface Monitor<P> {

    void addListener(Listener<P> listener);

    List<Listener<P>> getListeners();

    void removeListener(Listener<P> listener);

    void addProbe(Probe<P> probe);

    List<Probe<P>> getProbes();

    void removeProbe(Probe<P> probe);
}
