package com.fajar.moviedb.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\fH\u0002J\u0012\u0010%\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0016\u0010&\u001a\u00020\u001a*\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006*"}, d2 = {"Lcom/fajar/moviedb/ui/detail/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/fajar/moviedb/databinding/ActivityDetailsBinding;", "detailViewModel", "Lcom/fajar/moviedb/ui/detail/DetailViewModel;", "getDetailViewModel", "()Lcom/fajar/moviedb/ui/detail/DetailViewModel;", "detailViewModel$delegate", "Lkotlin/Lazy;", "isFavorite", "", "movieModel", "Lcom/fajar/moviedb/ui/movie/MovieViewModel;", "getMovieModel", "()Lcom/fajar/moviedb/ui/movie/MovieViewModel;", "movieModel$delegate", "movieTitle", "", "tvModel", "Lcom/fajar/moviedb/ui/tv/TvViewModel;", "getTvModel", "()Lcom/fajar/moviedb/ui/tv/TvViewModel;", "tvModel$delegate", "getDetailMovie", "", "movie", "Lcom/fajar/moviedb/core/domain/model/Movie;", "getDetailTvShow", "tvShow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setFavorite", "setStatusFavorite", "statusFavorite", "showDetailMovie", "loadImage", "Landroid/widget/ImageView;", "url", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.moviedb.ui.detail.DetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FILM = "extra_film";
    private final kotlin.Lazy detailViewModel$delegate = null;
    private com.fajar.moviedb.databinding.ActivityDetailsBinding binding;
    private boolean isFavorite = false;
    private java.lang.String movieTitle;
    private final kotlin.Lazy tvModel$delegate = null;
    private final kotlin.Lazy movieModel$delegate = null;
    
    public DetailActivity() {
        super();
    }
    
    private final com.fajar.moviedb.ui.detail.DetailViewModel getDetailViewModel() {
        return null;
    }
    
    private final com.fajar.moviedb.ui.tv.TvViewModel getTvModel() {
        return null;
    }
    
    private final com.fajar.moviedb.ui.movie.MovieViewModel getMovieModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getDetailMovie(com.fajar.moviedb.core.domain.model.Movie movie) {
    }
    
    private final void getDetailTvShow(com.fajar.moviedb.core.domain.model.Movie tvShow) {
    }
    
    private final void showDetailMovie(com.fajar.moviedb.core.domain.model.Movie movie) {
    }
    
    private final void setFavorite(com.fajar.moviedb.core.domain.model.Movie movie) {
    }
    
    private final void loadImage(android.widget.ImageView $this$loadImage, java.lang.String url) {
    }
    
    private final void setStatusFavorite(boolean statusFavorite) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/fajar/moviedb/ui/detail/DetailActivity$Companion;", "", "()V", "EXTRA_FILM", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}