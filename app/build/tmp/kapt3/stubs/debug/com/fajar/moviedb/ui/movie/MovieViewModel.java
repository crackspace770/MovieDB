package com.fajar.moviedb.ui.movie;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/fajar/moviedb/ui/movie/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;", "(Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;)V", "movieDetail", "Landroidx/lifecycle/LiveData;", "Lcom/fajar/moviedb/core/data/Resource;", "Lcom/fajar/moviedb/core/domain/model/Movie;", "getMovieDetail", "()Landroidx/lifecycle/LiveData;", "setMovieDetail", "(Landroidx/lifecycle/LiveData;)V", "selectedMovie", "Landroidx/lifecycle/MutableLiveData;", "getPopularMoviesList", "", "sort", "", "shouldFetchAgain", "", "setSelectedMovie", "", "movie", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.moviedb.core.domain.usecase.MovieUseCase movieUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.moviedb.core.domain.model.Movie> selectedMovie = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<com.fajar.moviedb.core.domain.model.Movie>> movieDetail;
    
    @javax.inject.Inject()
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.usecase.MovieUseCase movieUseCase) {
        super();
    }
    
    public final void setSelectedMovie(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<com.fajar.moviedb.core.domain.model.Movie>> getMovieDetail() {
        return null;
    }
    
    public final void setMovieDetail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<com.fajar.moviedb.core.domain.model.Movie>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getPopularMoviesList(@org.jetbrains.annotations.NotNull()
    java.lang.String sort, boolean shouldFetchAgain) {
        return null;
    }
}