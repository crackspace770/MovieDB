package com.fajar.moviedb.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u000b\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0005\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u000b\u001a\u00020\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/fajar/moviedb/core/utils/DataMapper;", "", "()V", "mapDetailMovieResponseToDomain", "Lcom/fajar/moviedb/core/domain/model/Movie;", "data", "Lcom/fajar/moviedb/core/data/remote/response/MovieDetailResponse;", "mapDetailTvResponseToDomain", "Lcom/fajar/moviedb/core/data/remote/response/TvDetailResponse;", "mapDomainToEntity", "Lcom/fajar/moviedb/core/data/local/entity/MovieEntity;", "input", "mapEntitiesToDomain", "", "mapEntityToDomain", "mapMultiResponsesToDomain", "Lcom/fajar/moviedb/core/data/remote/response/MultiResponse;", "mapResponsesToEntities", "Lcom/fajar/moviedb/core/data/remote/response/ListMovieResponse;", "mapTvResponsesToEntities", "Lcom/fajar/moviedb/core/data/remote/response/ListTvResponse;", "mapTvToEntities", "core_debug"})
public final class DataMapper {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.moviedb.core.utils.DataMapper INSTANCE = null;
    
    private DataMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity> mapResponsesToEntities(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.remote.response.ListMovieResponse input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity> mapTvResponsesToEntities(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.remote.response.ListTvResponse data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity> mapTvToEntities(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.remote.response.ListTvResponse input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.moviedb.core.domain.model.Movie mapDetailMovieResponseToDomain(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.remote.response.MovieDetailResponse data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.moviedb.core.domain.model.Movie mapDetailTvResponseToDomain(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.remote.response.TvDetailResponse data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fajar.moviedb.core.domain.model.Movie> mapEntitiesToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fajar.moviedb.core.data.local.entity.MovieEntity> data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.moviedb.core.data.local.entity.MovieEntity mapDomainToEntity(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie input) {
        return null;
    }
    
    private final com.fajar.moviedb.core.domain.model.Movie mapEntityToDomain(com.fajar.moviedb.core.data.local.entity.MovieEntity data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fajar.moviedb.core.domain.model.Movie> mapMultiResponsesToDomain(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.data.remote.response.MultiResponse data) {
        return null;
    }
}