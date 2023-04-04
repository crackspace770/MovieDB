package com.fajar.moviedb.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fajar.moviedb.core.data.Resource
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.domain.usecase.MovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val movieUseCase: MovieUseCase): ViewModel() {

    fun getPopularTvList(sort: String): LiveData<Resource<List<Movie>>> {
        return movieUseCase.getTrendingTv(sort).asLiveData()
    }

    fun getPopularMoviesList(sort: String): LiveData<Resource<List<Movie>>> {
        return movieUseCase.getTrendingMovie(sort).asLiveData()
    }

    val popularTv = movieUseCase.getPopularTv().asLiveData()

    val popularMovie= movieUseCase.getPopularMovie().asLiveData()

}