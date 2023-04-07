package com.fajar.moviedb.ui.home


import androidx.lifecycle.*
import com.fajar.moviedb.core.data.Resource
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.domain.usecase.MovieUseCase
import com.fajar.moviedb.core.utils.SortUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val movieUseCase: MovieUseCase) : ViewModel() {

    private val selectedMovie = MutableLiveData<Movie>()

    fun setSelectedMovie(movie: Movie) {
        this.selectedMovie.value = movie
    }

    var movieDetail: LiveData<Resource<Movie>> =
        Transformations.switchMap(selectedMovie) { movie ->
            movieUseCase.getMovieDetail(movie).asLiveData()
        }

    fun getPopularMoviesList(sort: String, shouldFetchAgain: Boolean): LiveData<Resource<List<Movie>>> {
        return movieUseCase.getTrendingMovie(sort, shouldFetchAgain).asLiveData()
    }

    fun getPopularMoviesList(): LiveData<Resource<List<Movie>>> {
        return movieUseCase.getPopularMovie().asLiveData()
    }

    val popularMovie= movieUseCase.getPopularMovie().asLiveData()



}