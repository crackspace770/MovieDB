package com.fajar.moviedb.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/fajar/moviedb/setting/FavoriteComponent;", "", "inject", "", "fragment", "Lcom/fajar/moviedb/setting/movie/FavoriteMovieFragment;", "Lcom/fajar/moviedb/setting/tv/FavoriteTvFragment;", "Builder", "favorite_debug"})
@dagger.Component(dependencies = {com.fajar.moviedb.di.FavoriteModuleDependencies.class})
public abstract interface FavoriteComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.setting.movie.FavoriteMovieFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.fajar.moviedb.setting.tv.FavoriteTvFragment fragment);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/fajar/moviedb/setting/FavoriteComponent$Builder;", "", "appDependencies", "favoriteModuleDependencies", "Lcom/fajar/moviedb/di/FavoriteModuleDependencies;", "build", "Lcom/fajar/moviedb/setting/FavoriteComponent;", "context", "Landroid/content/Context;", "favorite_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.fajar.moviedb.setting.FavoriteComponent.Builder context(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.fajar.moviedb.setting.FavoriteComponent.Builder appDependencies(@org.jetbrains.annotations.NotNull()
        com.fajar.moviedb.di.FavoriteModuleDependencies favoriteModuleDependencies);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.fajar.moviedb.setting.FavoriteComponent build();
    }
}