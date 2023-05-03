package com.fajar.moviedb.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u00062\u0006\u0010\f\u001a\u00020\bH\u0016J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b0\u0006H\u0016J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b0\u0006H\u0016J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b0\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J*\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b0\u00062\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b0\u0006H\u0016J*\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b0\u00062\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/fajar/moviedb/core/domain/usecase/MovieInteractor;", "Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;", "movieRepository", "Lcom/fajar/moviedb/core/domain/repository/IMovieRepository;", "(Lcom/fajar/moviedb/core/domain/repository/IMovieRepository;)V", "getFavoriteMovie", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/fajar/moviedb/core/domain/model/Movie;", "getFavoriteTv", "getMovieDetail", "Lcom/fajar/moviedb/core/data/Resource;", "movie", "getPopularMovie", "getPopularTv", "getSearchMovie", "query", "", "getTrendingMovie", "sort", "shouldFetchAgain", "", "getTrendingThisWeekList", "getTrendingTv", "getTvDetail", "tv", "insertFavoriteItem", "", "item", "state", "(Lcom/fajar/moviedb/core/domain/model/Movie;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class MovieInteractor implements com.fajar.moviedb.core.domain.usecase.MovieUseCase {
    private final com.fajar.moviedb.core.domain.repository.IMovieRepository movieRepository = null;
    
    @javax.inject.Inject()
    public MovieInteractor(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.repository.IMovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getTrendingMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String sort, boolean shouldFetchAgain) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getTrendingTv(@org.jetbrains.annotations.NotNull()
    java.lang.String sort, boolean shouldFetchAgain) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getTrendingThisWeekList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getPopularMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getPopularTv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getSearchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.domain.model.Movie>> getFavoriteMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.domain.model.Movie>> getFavoriteTv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<com.fajar.moviedb.core.domain.model.Movie>> getMovieDetail(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie movie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.fajar.moviedb.core.data.Resource<com.fajar.moviedb.core.domain.model.Movie>> getTvDetail(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie tv) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertFavoriteItem(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie item, boolean state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}