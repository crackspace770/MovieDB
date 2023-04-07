package com.fajar.moviedb.ui.detail

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fajar.moviedb.R
import com.fajar.moviedb.core.data.Resource
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.utils.Constant.Companion.IMAGE_BASE_URL
import com.fajar.moviedb.databinding.ActivityDetailsBinding
import com.fajar.moviedb.ui.home.HomeViewModel
import com.fajar.moviedb.ui.tv.TvViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class DetailActivity: AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_FILM = "extra_film"
    }

    private val detailViewModel: DetailViewModel by viewModels()
    private lateinit var binding: ActivityDetailsBinding
    private var isFavorite: Boolean = false
    private lateinit var movieTitle: String
    private val tvModel: TvViewModel by viewModels()
    private val movieModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        //(application as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val film = intent.getParcelableExtra<Movie>(EXTRA_FILM)

        val detailMovie = intent.getParcelableExtra<Movie>(EXTRA_DATA)
        showDetailMovie(detailMovie)

        if (film != null){
            if (film.isTvShow) {
                getDetailTvShow(film)
            } else {
                getDetailMovie(film)

            }
        }


    }

    private fun getDetailMovie(movie: Movie?) {
        binding.apply {
            movie?.let { it ->
                isFavorite = it.isFavorite
                movieTitle = it.title ?: getString(R.string.no_data)
                showDetailMovie(it)
            }
             progressBar.visibility = View.VISIBLE
            //  onFailMsg.visibility = View.GONE
            movie?.let { movieModel.setSelectedMovie(it) }
            movieModel.movieDetail.observe(this@DetailActivity) { movie ->
                if (movie != null) {
                    when (movie) {
                        is Resource.Loading -> {
                            progressBar.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {
                            progressBar.visibility = View.GONE
                            movie.data?.let {
                                showDetailMovie(it)
                            }
                        }
                        is Resource.Error -> {
                            progressBar.visibility = View.GONE
                            //onFailMsg.visibility = View.VISIBLE
                        }
                    }
                }
            }
        }
    }

    private fun getDetailTvShow(tvShow: Movie?) {
        binding.apply {
            tvShow?.let { it ->
                isFavorite = it.isFavorite
                movieTitle = it.title ?: getString(R.string.no_data)
                showDetailMovie(it)
            }
            progressBar.visibility = View.VISIBLE
           // onFailMsg.visibility = View.GONE
            tvShow?.let { tvModel.setSelectedTv(it) }
            tvModel.tvDetail.observe(this@DetailActivity) { tvShow ->
                if (tvShow != null) {
                    when (tvShow) {
                        is Resource.Loading -> {
                            progressBar.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {
                            progressBar.visibility = View.GONE
                            tvShow.data?.let {
                                showDetailMovie(it)
                            }
                        }
                        is Resource.Error -> {
                            progressBar.visibility = View.GONE
                            //onFailMsg.visibility = View.VISIBLE
                        }
                    }
                }
            }
        }
    }

    private fun showDetailMovie(movie: Movie?) {
        binding.apply {
            movie?.apply {
                supportActionBar?.title = title
                tvTitle.text= title
                tvDescription.text = overview
                tvGenre.text=  if (genres == null || genres == "") getString(R.string.no_genre_data) else genres
                tvRating.text= voteAverage.toString()
              //  tvPopularity.text= popularity.toString()
                ivDetailImage.loadImage("${IMAGE_BASE_URL}${backdropPath}")
                ivPoster.loadImage("${IMAGE_BASE_URL}${posterPath}")


                if (releaseDate == null || releaseDate == "") {
                    tvRelease.text = getString(R.string.no_data)
                } else {
                    val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
                    val date = releaseDate.let { dateFormat.parse(it) }
                    if (date != null) {
                        val dateFormatted =
                            SimpleDateFormat("dd MM yyyy", Locale.ENGLISH).format(date)
                        tvRelease.text = dateFormatted
                    } else {
                        tvRelease.text = getString(R.string.no_data)
                    }
                }

                val category = if (isTvShow) "TV SHOW" else "MOVIE"


                tvRuntime.text = getString(R.string.category, category)
                if (runtime != null) {
                    if (category == "MOVIE") {
                        val hours = runtime!!.div(60)
                        val minutes = runtime!!.rem(60)
                        val duration = "${hours}h ${minutes}m"
                       tvRuntime.text = duration
                    } else {
                        tvRuntime.text = getString(R.string.episodeRuntime, runtime)
                    }
                } else {
                    tvRuntime.text = getString(R.string.no_data)
                }



                var statusFavorite = isFavorite
                setStatusFavorite(statusFavorite)

                favorite.setOnClickListener {
                    statusFavorite = !statusFavorite
                    detailViewModel.setFavoriteMovie(movie, statusFavorite)
                    setStatusFavorite(statusFavorite)
                }
            }
        }

    }




    private fun ImageView.loadImage(url: String?) {
        Glide.with(this.context)
            .load(url)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_refresh))
            .error(R.drawable.ic_error_image)
            .into(this)
    }

    private fun setStatusFavorite(statusFavorite: Boolean) {
        if (statusFavorite) {
            binding.favorite.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_unlove))
        } else {
            binding.favorite.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_love))
        }
    }


}