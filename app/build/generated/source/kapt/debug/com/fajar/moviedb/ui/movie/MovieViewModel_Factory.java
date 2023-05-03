// Generated by Dagger (https://dagger.dev).
package com.fajar.moviedb.ui.movie;

import com.fajar.moviedb.core.domain.usecase.MovieUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieViewModel_Factory implements Factory<MovieViewModel> {
  private final Provider<MovieUseCase> movieUseCaseProvider;

  public MovieViewModel_Factory(Provider<MovieUseCase> movieUseCaseProvider) {
    this.movieUseCaseProvider = movieUseCaseProvider;
  }

  @Override
  public MovieViewModel get() {
    return newInstance(movieUseCaseProvider.get());
  }

  public static MovieViewModel_Factory create(Provider<MovieUseCase> movieUseCaseProvider) {
    return new MovieViewModel_Factory(movieUseCaseProvider);
  }

  public static MovieViewModel newInstance(MovieUseCase movieUseCase) {
    return new MovieViewModel(movieUseCase);
  }
}