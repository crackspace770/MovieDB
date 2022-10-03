package com.fajar.moviedb.core.data


import com.fajar.moviedb.core.data.local.LocalDataSource
import com.fajar.moviedb.core.data.remote.RemoteDataSource
import com.fajar.moviedb.core.data.remote.network.ApiResponse
import com.fajar.moviedb.core.data.remote.response.MovieResponse
import com.fajar.moviedb.core.data.remote.response.SearchResponse
import com.fajar.moviedb.core.data.remote.response.TvResponse
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.domain.repository.IMovieRepository
import com.fajar.moviedb.core.utils.AppExecutor
import com.fajar.moviedb.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutor
    ): IMovieRepository {

    override fun getTrendingMovie(sort: String): Flow<Resource<List<Movie>>> =
        object : NetworkBoundResource<List<Movie>, List<MovieResponse>>()
        {
            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getMovieList(sort).map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Movie>?): Boolean {
                return data == null || data.isEmpty() || data.size <= 15
            }

            override suspend fun createCall(): Flow<ApiResponse<List<MovieResponse>>> =
                remoteDataSource.getPopularMovie()

            override suspend fun saveCallResult(data: List<MovieResponse>) {
                val movieList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertMovie(movieList)
            }


        }.asFlow()

    override fun getTrendingTv(sort: String): Flow<Resource<List<Movie>>> =
        object : NetworkBoundResource<List<Movie>, List<TvResponse>>()
        {
            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getTvList(sort).map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Movie>?): Boolean {
                return data == null || data.isEmpty() || data.size <= 15
            }

            override suspend fun createCall(): Flow<ApiResponse<List<TvResponse>>> =
                remoteDataSource.getPopularTv()

            override suspend fun saveCallResult(data: List<TvResponse>) {
                val movieList = DataMapper.mapTvToEntities(data)
                localDataSource.insertMovie(movieList)
            }


        }.asFlow()





    override fun getSearchMovie(query: String): Flow<Resource<List<Movie>>> {
        return object :
            NetworkBoundResource<List<Movie>, List<SearchResponse>>(){

            override fun shouldFetch(data: List<Movie>?): Boolean =
//                data == null || data.isEmpty()
                true // ganti dengan true jika ingin selalu mengambil data dari internet

            override suspend fun createCall(): Flow<ApiResponse<List<SearchResponse>>> =
                remoteDataSource.searchMovie(query)

            override suspend fun saveCallResult(data: List<SearchResponse>) {
                val movieList = DataMapper.mapSearchResponsesToEntities(data)
                localDataSource.insertMovie(movieList)

            }

            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getPopularMovie().map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

        }.asFlow()
    }




    override fun getFavoriteMovie(): Flow<List<Movie>> {
        return localDataSource.getFavoriteMovie().map {
            DataMapper.mapEntitiesToDomain(it)
        }
    }

    override fun setFavoriteMovie(movie: Movie, state: Boolean) {
        val movieEntity = DataMapper.mapDomainToEntity(movie)
        appExecutors.diskIO().execute { localDataSource.setFavoriteMovie(movieEntity, state) }
    }

}