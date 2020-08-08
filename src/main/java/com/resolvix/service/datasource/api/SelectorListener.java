package com.resolvix.service.datasource.api;

/**
 *
 * @param <S>
 */
@Deprecated
public interface SelectorListener<S> {

    void updateState(S state);
}
