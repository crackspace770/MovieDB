package com.fajar.moviedb.ui.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.domain.usecase.MovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(private val movieUseCase: MovieUseCase): ViewModel() {

 //   val favoriteMovie = movieUseCase.getFavoriteMovie().asLiveData()

   // val favoriteTv = movieUseCase.getFavoriteTv().asLiveData()

    fun getFavoriteMovie(): LiveData<List<Movie>> {
        return movieUseCase.getFavoriteMovie().asLiveData()
    }

    fun getFavoriteTv(): LiveData<List<Movie>> {
        return movieUseCase.getFavoriteTv().asLiveData()
    }


}