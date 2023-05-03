package com.fajar.moviedb.core.data.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/fajar/moviedb/core/data/local/room/MovieDao;", "", "getFavoriteMovie", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/fajar/moviedb/core/data/local/entity/MovieEntity;", "getFavoriteTv", "getPopularMovies", "getPopularTv", "getTrendingMovies", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getTrendingTv", "insertFavoriteItem", "", "catalogueItem", "(Lcom/fajar/moviedb/core/data/local/entity/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMovie", "movie", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFavorite", "updateFavoriteMovie", "core_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.fajar.moviedb.core.data.local.entity.MovieEntity.class})
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getTrendingMovies(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.fajar.moviedb.core.data.local.entity.MovieEntity.class})
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getTrendingTv(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MovieEntities")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getPopularMovies();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MovieEntities ")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getPopularTv();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MovieEntities WHERE isFavorite = 1 AND isTvShow = 0")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MovieEntities WHERE isFavorite = 1 AND isTvShow = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity>> getFavoriteTv();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity> movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Update()
    public abstract void updateFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.local.entity.MovieEntity movie);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeFavorite(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.local.entity.MovieEntity catalogueItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertFavoriteItem(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.local.entity.MovieEntity catalogueItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}