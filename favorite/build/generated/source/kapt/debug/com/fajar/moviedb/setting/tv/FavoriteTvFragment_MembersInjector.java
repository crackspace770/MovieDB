// Generated by Dagger (https://dagger.dev).
package com.fajar.moviedb.setting.tv;

import com.fajar.moviedb.setting.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavoriteTvFragment_MembersInjector implements MembersInjector<FavoriteTvFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public FavoriteTvFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<FavoriteTvFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new FavoriteTvFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(FavoriteTvFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("com.fajar.moviedb.setting.tv.FavoriteTvFragment.factory")
  public static void injectFactory(FavoriteTvFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
