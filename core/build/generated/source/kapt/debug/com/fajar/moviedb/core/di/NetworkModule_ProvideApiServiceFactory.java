// Generated by Dagger (https://dagger.dev).
package com.fajar.moviedb.core.di;

import com.fajar.moviedb.core.data.remote.network.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_ProvideApiServiceFactory(NetworkModule module,
      Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(module, clientProvider.get());
  }

  public static NetworkModule_ProvideApiServiceFactory create(NetworkModule module,
      Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_ProvideApiServiceFactory(module, clientProvider);
  }

  public static ApiService provideApiService(NetworkModule instance, OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiService(client));
  }
}