// Generated by Dagger (https://dagger.dev).
package com.fajar.moviedb.setting;

import android.content.Context;
import com.fajar.moviedb.di.FavoriteModuleDependencies;
import com.fajar.moviedb.setting.movie.FavoriteMovieFragment;
import com.fajar.moviedb.setting.movie.FavoriteMovieFragment_MembersInjector;
import com.fajar.moviedb.setting.tv.FavoriteTvFragment;
import com.fajar.moviedb.setting.tv.FavoriteTvFragment_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerFavoriteComponent implements FavoriteComponent {
  private final FavoriteModuleDependencies favoriteModuleDependencies;

  private final DaggerFavoriteComponent favoriteComponent = this;

  private DaggerFavoriteComponent(FavoriteModuleDependencies favoriteModuleDependenciesParam,
      Context contextParam) {
    this.favoriteModuleDependencies = favoriteModuleDependenciesParam;

  }

  public static FavoriteComponent.Builder builder() {
    return new Builder();
  }

  private ViewModelFactory viewModelFactory() {
    return new ViewModelFactory(Preconditions.checkNotNullFromComponent(favoriteModuleDependencies.movieUseCase()));
  }

  @Override
  public void inject(FavoriteMovieFragment fragment) {
    injectFavoriteMovieFragment(fragment);
  }

  @Override
  public void inject(FavoriteTvFragment fragment) {
    injectFavoriteTvFragment(fragment);
  }

  private FavoriteMovieFragment injectFavoriteMovieFragment(FavoriteMovieFragment instance) {
    FavoriteMovieFragment_MembersInjector.injectFactory(instance, viewModelFactory());
    return instance;
  }

  private FavoriteTvFragment injectFavoriteTvFragment(FavoriteTvFragment instance) {
    FavoriteTvFragment_MembersInjector.injectFactory(instance, viewModelFactory());
    return instance;
  }

  private static final class Builder implements FavoriteComponent.Builder {
    private Context context;

    private FavoriteModuleDependencies favoriteModuleDependencies;

    @Override
    public Builder context(Context context) {
      this.context = Preconditions.checkNotNull(context);
      return this;
    }

    @Override
    public Builder appDependencies(FavoriteModuleDependencies favoriteModuleDependencies) {
      this.favoriteModuleDependencies = Preconditions.checkNotNull(favoriteModuleDependencies);
      return this;
    }

    @Override
    public FavoriteComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      Preconditions.checkBuilderRequirement(favoriteModuleDependencies, FavoriteModuleDependencies.class);
      return new DaggerFavoriteComponent(favoriteModuleDependencies, context);
    }
  }
}
