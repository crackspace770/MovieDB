package com.fajar.moviedb.core.data.local.room

import androidx.room.*
import androidx.sqlite.db.SupportSQLiteQuery
import com.fajar.moviedb.core.data.local.entity.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @RawQuery(observedEntities = [MovieEntity::class])
    fun getTrendingMovies(query: SupportSQLiteQuery): Flow<List<MovieEntity>>

    @RawQuery(observedEntities = [MovieEntity::class])
    fun getTrendingTv(query: SupportSQLiteQuery): Flow<List<MovieEntity>>

    @Query("SELECT * FROM MovieEntities")
    fun getPopularMovies(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM MovieEntities ")
    fun getPopularTv(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM MovieEntities WHERE isFavorite = 1")
    fun getFavoriteMovie(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM MovieEntities WHERE isFavorite = 1")
    fun getFavoriteTv(): Flow<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(tourism: List<MovieEntity>)

    @Update
    fun updateFavoriteMovie(tourism: MovieEntity)
}