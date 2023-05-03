package com.fajar.moviedb.ui.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/fajar/moviedb/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;", "(Lcom/fajar/moviedb/core/domain/usecase/MovieUseCase;)V", "searchQuery", "Landroidx/lifecycle/MutableLiveData;", "", "searchResult", "Landroidx/lifecycle/LiveData;", "Lcom/fajar/moviedb/core/data/Resource;", "", "Lcom/fajar/moviedb/core/domain/model/Movie;", "getSearchResult", "()Landroidx/lifecycle/LiveData;", "setSearchResult", "(Landroidx/lifecycle/LiveData;)V", "setSearchQuery", "", "query", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.moviedb.core.domain.usecase.MovieUseCase movieUseCase = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> searchResult;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.core.domain.usecase.MovieUseCase movieUseCase) {
        super();
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> getSearchResult() {
        return null;
    }
    
    public final void setSearchResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.fajar.moviedb.core.data.Resource<java.util.List<com.fajar.moviedb.core.domain.model.Movie>>> p0) {
    }
}