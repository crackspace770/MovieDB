package com.fajar.moviedb.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006J\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\u0006H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\r\u001a\u00028\u0001H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/fajar/moviedb/core/data/NetworkOnlyResource;", "ResultType", "RequestType", "", "()V", "result", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fajar/moviedb/core/data/Resource;", "asFlow", "createCall", "Lcom/fajar/moviedb/core/data/remote/network/ApiResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromNetwork", "data", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract class NetworkOnlyResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<ResultType>> result = null;
    
    public NetworkOnlyResource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object createCall(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fajar.moviedb.core.data.remote.network.ApiResponse<? extends RequestType>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object loadFromNetwork(RequestType data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends ResultType>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<ResultType>> asFlow() {
        return null;
    }
}