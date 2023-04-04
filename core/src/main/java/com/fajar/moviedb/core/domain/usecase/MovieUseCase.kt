package com.fajar.moviedb.core.domain.usecase

import com.fajar.moviedb.core.data.Resource
import com.fajar.moviedb.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {

    fun getTrendingMovie(sort: String): Flow<Resource<List<Movie>>>
    fun getTrendingTv(sort: String): Flow<Resource<List<Movie>>>

    fun getPopularMovie(): Flow<Resource<List<Movie>>>
    fun getPopularTv(): Flow<Resource<List<Movie>>>

    fun getSearchMovie(query: String):Flow<Resource<List<Movie>>>

    fun getMovieDetail(movie: Movie): Flow<Resource<Movie>>
    fun getTvDetail(tv: Movie): Flow<Resource<Movie>>

    fun getFavoriteMovie(): Flow<List<Movie>>
    fun getFavoriteTv():Flow<List<Movie>>

    fun setFavoriteMovie(tourism: Movie, state: Boolean)
    fun setFavoriteTv(tv:Movie, state: Boolean)
}