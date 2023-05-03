package com.fajar.moviedb.core.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fJ!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/fajar/moviedb/core/data/local/LocalDataSource;", "", "movieDao", "Lcom/fajar/moviedb/core/data/local/room/MovieDao;", "(Lcom/fajar/moviedb/core/data/local/room/MovieDao;)V", "getFavoriteMovie", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/fajar/moviedb/core/data/local/entity/MovieEntity;", "getFavoriteTv", "getMovieList", "sort", "", "getPopularMovie", "getPopularTv", "getTvList", "insertFavoriteItem", "", "item", "newState", "", "(Lcom/fajar/moviedb/core/data/local/entity/MovieEntity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMovie", "movie", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTv", "tv", "core_debug"})
@javax.inject.Singleton()
public final class LocalDataSource {
    private final com.fajar.moviedb.core.data.local.room.MovieDao movieDao = null;
    
    @javax.inject.Inject()
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.local.room.MovieDao movieDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getMovieList(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getTvList(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getPopularMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getPopularTv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getFavoriteMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getFavoriteTv() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity> movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTv(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity> tv, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFavoriteItem(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.local.entity.MovieEntity item, boolean newState, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}