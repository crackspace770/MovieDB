package com.fajar.moviedb.setting

import android.content.Context
import com.fajar.moviedb.di.SettingModuleDependencies
import com.fajar.moviedb.setting.movie.FavoriteMovieFragment
import com.fajar.moviedb.setting.tv.FavoriteTvFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Inject

@Component(dependencies = [SettingModuleDependencies::class])
interface SettingComponent {

    fun inject(fragment: FavoriteMovieFragment)
    fun inject(fragment: FavoriteTvFragment)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(settingModuleDependencies: SettingModuleDependencies): Builder
        fun build(): SettingComponent
    }
}