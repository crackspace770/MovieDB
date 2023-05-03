// Generated by Dagger (https://dagger.dev).
package com.fajar.moviedb.ui.tv;

import com.fajar.moviedb.core.domain.usecase.MovieUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TvViewModel_Factory implements Factory<TvViewModel> {
  private final Provider<MovieUseCase> movieUseCaseProvider;

  public TvViewModel_Factory(Provider<MovieUseCase> movieUseCaseProvider) {
    this.movieUseCaseProvider = movieUseCaseProvider;
  }

  @Override
  public TvViewModel get() {
    return newInstance(movieUseCaseProvider.get());
  }

  public static TvViewModel_Factory create(Provider<MovieUseCase> movieUseCaseProvider) {
    return new TvViewModel_Factory(movieUseCaseProvider);
  }

  public static TvViewModel newInstance(MovieUseCase movieUseCase) {
    return new TvViewModel(movieUseCase);
  }
}