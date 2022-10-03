package com.fajar.moviedb.core.domain.repository

import com.fajar.moviedb.core.data.Resource
import com.fajar.moviedb.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {


    fun getTrendingMovie(sort: String): Flow<Resource<List<Movie>>>
    fun getTrendingTv(sort: String): Flow<Resource<List<Movie>>>

    fun getSearchMovie(query: String) : Flow<Resource<List<Movie>>>
    fun getFavoriteMovie(): Flow<List<Movie>>
    fun setFavoriteMovie(movie: Movie, state: Boolean)

}