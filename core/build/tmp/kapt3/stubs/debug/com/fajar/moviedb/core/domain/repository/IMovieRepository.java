package com.fajar.moviedb.core.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b0\u0003H&J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b0\u0003H&J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b0\u00032\u0006\u0010\r\u001a\u00020\u000eH&J*\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b0\u00032\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H&J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b0\u0003H&J*\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b0\u00032\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H&J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/fajar/moviedb/core/domain/repository/IMovieRepository;", "", "getFavoriteMovie", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/fajar/moviedb/core/domain/model/Movie;", "getFavoriteTv", "getMovieDetail", "Lcom/fajar/moviedb/core/data/Resource;", "movie", "getPopularMovie", "getPopularTv", "getSearchMovie", "query", "", "getTrendingMovie", "sort", "shouldFetchAgain", "", "getTrendingThisWeekList", "getTrendingTv", "getTvDetail", "tv", "insertFavoriteItem", "", "item", "state", "(Lcom/fajar/moviedb/core/domain/model/Movie;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface IMovieRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getTrendingMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String sort, boolean shouldFetchAgain);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getTrendingTv(@org.jetbrains.annotations.NotNull()
    java.lang.String sort, boolean shouldFetchAgain);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getTrendingThisWeekList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getPopularMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getPopularTv();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getSearchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<com.fajar.moviedb.core.domain.model.Movie>> getMovieDetail(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie movie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<com.fajar.moviedb.core.domain.model.Movie>> getTvDetail(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie tv);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.domain.model.Movie>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.domain.model.Movie>> getFavoriteTv();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertFavoriteItem(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie item, boolean state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}