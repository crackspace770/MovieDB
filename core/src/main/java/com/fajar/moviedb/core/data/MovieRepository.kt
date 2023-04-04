package com.fajar.moviedb.core.data


import com.fajar.moviedb.core.data.local.LocalDataSource
import com.fajar.moviedb.core.data.remote.RemoteDataSource
import com.fajar.moviedb.core.data.remote.network.ApiResponse
import com.fajar.moviedb.core.data.remote.response.*
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.domain.repository.IMovieRepository
import com.fajar.moviedb.core.utils.AppExecutor
import com.fajar.moviedb.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutor
    ): IMovieRepository {

    override fun getTrendingMovie(sort: String): Flow<Resource<List<Movie>>> {
        return object :
            NetworkBoundResource<List<Movie>, ListMovieResponse>() {

            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getMovieList(sort).map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Movie>?): Boolean {
                return data == null || data.isEmpty() || data.size <= 10
            }

            override suspend fun createCall(): Flow<ApiResponse<ListMovieResponse>> =
                remoteDataSource.getPopularMovie()

            override suspend fun saveCallResult(data: ListMovieResponse) {
                val movieList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertMovie(movieList)
            }


        }.asFlow()
    }


    override fun getTrendingTv(sort: String): Flow<Resource<List<Movie>>> {
        return object :
            NetworkBoundResource<List<Movie>, ListTvResponse>() {
            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getTvList(sort).map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Movie>?): Boolean {
                return data == null || data.isEmpty() || data.size <= 10
            }

            override suspend fun createCall(): Flow<ApiResponse<ListTvResponse>> {
                return remoteDataSource.getPopularTv()
            }

            override suspend fun saveCallResult(data: ListTvResponse) {
                localDataSource.insertTv(DataMapper.mapTvToEntities(data))
            }
        }.asFlow()
    }


    override fun getPopularMovie(): Flow<Resource<List<Movie>>> {
        return object :
            NetworkBoundResource<List<Movie>, ListMovieResponse>(){

            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getPopularMovie().map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Movie>?): Boolean {
                return data == null || data.isEmpty() || data.size <= 15
            }

            override suspend fun createCall(): Flow<ApiResponse<ListMovieResponse>> =
                remoteDataSource.getMovie()

            override suspend fun saveCallResult(data: ListMovieResponse) {
                val movieList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertMovie(movieList)
            }
        }.asFlow()
    }


    override fun getPopularTv(): Flow<Resource<List<Movie>>> =
        object : NetworkBoundResource<List<Movie>, ListTvResponse>(){
            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getPopularTv().map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Movie>?): Boolean {
                return data == null || data.isEmpty() || data.size <= 15
            }


            override suspend fun createCall(): Flow<ApiResponse<ListTvResponse>> =
                remoteDataSource.getTv()

            override suspend fun saveCallResult(data: ListTvResponse) {
                val movieList = DataMapper.mapTvToEntities(data)
                localDataSource.insertTv(movieList)
            }
        }.asFlow()



    override fun getSearchMovie(query: String): Flow<Resource<List<Movie>>> {
        return object :
            NetworkOnlyResource<List<Movie>, MultiResponse>() {

            override suspend fun createCall(): Flow<ApiResponse<MultiResponse>> {
                return remoteDataSource.searchMovie(query)
            }

            override suspend fun loadFromNetwork(data: MultiResponse): Flow<List<Movie>> {
                return flowOf(DataMapper.mapMultiResponsesToDomain(data))
            }
        }.asFlow()
    }

    override fun getMovieDetail(movie: Movie): Flow<Resource<Movie>> {
        return object : NetworkOnlyResource<Movie, MovieDetailResponse>() {
            override suspend fun createCall(): Flow<ApiResponse<MovieDetailResponse>> {
                return remoteDataSource.getMovieDetail(movie.id)
            }

            override suspend fun loadFromNetwork(data: MovieDetailResponse): Flow<Movie> {
                return flowOf(DataMapper.mapDetailMovieResponseToDomain(data))
            }
        }.asFlow()
    }



    override fun getTvDetail(tv: Movie): Flow<Resource<Movie>> {
        return object : NetworkOnlyResource<Movie, TvDetailResponse>() {
            override suspend fun createCall(): Flow<ApiResponse<TvDetailResponse>> {
                return remoteDataSource.getTvDetail(tv.id)
            }

            override suspend fun loadFromNetwork(data: TvDetailResponse): Flow<Movie> {
                return flowOf(DataMapper.mapDetailTvResponseToDomain(data))
            }
        }.asFlow()
    }


    override fun getFavoriteMovie(): Flow<List<Movie>> {
        return localDataSource.getFavoriteMovie().map {
            DataMapper.mapEntitiesToDomain(it)
        }
    }

    override fun getFavoriteTv(): Flow<List<Movie>> {
        return localDataSource.getFavoriteTv().map {
            DataMapper.mapEntitiesToDomain(it)
        }
    }


    override fun setFavoriteMovie(movie: Movie, state: Boolean) {
        val movieEntity = DataMapper.mapDomainToEntity(movie)
        appExecutors.diskIO().execute { localDataSource.setFavoriteMovie(movieEntity, state) }
    }

    override fun setFavoriteTv(tv: Movie, state: Boolean) {
        val movieEntity = DataMapper.mapDomainToEntity(tv)
        appExecutors.diskIO().execute { localDataSource.setFavoriteMovie(movieEntity, state) }
    }

}