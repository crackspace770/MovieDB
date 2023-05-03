package com.fajar.moviedb.ui.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/fajar/moviedb/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;", "(Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;)V", "getTopTvShowList", "Landroidx/lifecycle/LiveData;", "Lcom/fajar/moviedb/core/data/Resource;", "", "Lcom/fajar/moviedb/core/domain/model/Movie;", "getTrendingThisWeekList", "getUpcomingMovies", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.moviedb.core.domain.usecase.MovieUseCase movieUseCase = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.usecase.MovieUseCase movieUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getTrendingThisWeekList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getUpcomingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getTopTvShowList() {
        return null;
    }
}