package com.dubboclub.dk.storage;

import net.dubboclub.tracing.api.Span;

import java.util.List;

/**
 * Created by Zetas on 2016/7/11.
 */
public interface TraceDataStorage {
    public void addSpan(List<Span> spanList);
}