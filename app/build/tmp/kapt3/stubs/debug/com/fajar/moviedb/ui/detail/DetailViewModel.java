package com.fajar.moviedb.ui.detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/fajar/moviedb/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;", "(Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;)V", "setFavoriteMovie", "", "item", "Lcom/fajar/moviedb/core/domain/model/Movie;", "newState", "", "setFavoriteTv", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.moviedb.core.domain.usecase.MovieUseCase movieUseCase = null;
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.usecase.MovieUseCase movieUseCase) {
        super();
    }
    
    public final void setFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie item, boolean newState) {
    }
    
    public final void setFavoriteTv(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.model.Movie item, boolean newState) {
    }
}