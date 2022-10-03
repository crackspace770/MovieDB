package com.fajar.moviedb.core.data.local

import com.fajar.moviedb.core.data.local.entity.MovieEntity
import com.fajar.moviedb.core.data.local.room.MovieDao
import com.fajar.moviedb.core.utils.SortUtils
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalDataSource @Inject constructor(private val movieDao: MovieDao) {

//    companion object {
//        private var instance: LocalDataSource? = null

 //       fun getInstance(tourismDao: MovieDao): LocalDataSource =
 //           instance ?: synchronized(this) {
 //               instance ?: LocalDataSource(tourismDao)
 //           }
 //   }

    fun getMovieList(sort: String): Flow<List<MovieEntity>> = movieDao.getTrendingMovies(
        SortUtils.getSortedQuery(sort, 0))

    fun getTvList(sort: String): Flow<List<MovieEntity>> =  movieDao.getTrendingTv(
        SortUtils.getSortedQuery(sort, 1))

    fun getPopularMovie(): Flow<List<MovieEntity>> = movieDao.getPopularMovies()

    fun getFavoriteMovie(): Flow<List<MovieEntity>> = movieDao.getFavoriteTourism()

    suspend fun insertMovie(movieList: List<MovieEntity>) = movieDao.insertMovie(movieList)

    fun setFavoriteMovie(movie: MovieEntity, newState: Boolean) {
        movie.isFavorite = newState
        movieDao.updateFavoriteMovie(movie)
    }
}