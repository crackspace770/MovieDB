// Generated by Dagger (https://dagger.dev).
package com.fajar.moviedb.core.utils;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppExecutor_Factory implements Factory<AppExecutor> {
  @Override
  public AppExecutor get() {
    return newInstance();
  }

  public static AppExecutor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppExecutor newInstance() {
    return new AppExecutor();
  }

  private static final class InstanceHolder {
    private static final AppExecutor_Factory INSTANCE = new AppExecutor_Factory();
  }
}
