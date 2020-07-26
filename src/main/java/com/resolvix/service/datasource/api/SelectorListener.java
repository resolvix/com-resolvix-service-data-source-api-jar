package com.resolvix.service.datasource.api;

/**
 *
 * @param <S>
 */
public interface SelectorListener<S> {

    void updateState(S state);
}
