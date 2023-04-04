package com.fajar.moviedb.core.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fajar.moviedb.core.databinding.ItemListBinding
import com.fajar.moviedb.core.databinding.ItemListTourismBinding
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.utils.Constant.Companion.IMAGE_BASE_URL
import com.fajar.moviedb.core.utils.MovieDiffUtil


import java.util.ArrayList

class TvAdapter: RecyclerView.Adapter<TvAdapter.MovieViewHolder>() {

    private var moviesList = ArrayList<Movie>()
    var onItemClick: ((Movie) -> Unit)? = null

    inner class MovieViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            binding.apply {
                tvItemTitle.text = movie.title
                tvItemSubtitle.text = movie.voteAverage.toString()
                Glide.with(itemView.context)
                    .load("${IMAGE_BASE_URL}${movie.posterPath}")
                    .into(ivPoster)
            }
        }
        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(moviesList[bindingAdapterPosition])
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsBinding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = moviesList[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int =  moviesList.size

    fun setData(newMovieList: List<Movie>){
        val diffUtil = MovieDiffUtil(moviesList,newMovieList)
        val diffResults = DiffUtil.calculateDiff(diffUtil)
        this.moviesList.clear()
        this.moviesList.addAll(newMovieList)
        diffResults.dispatchUpdatesTo(this)
    }

    fun clearList(){
        val size = moviesList.size
        moviesList.clear()
        notifyItemRangeRemoved(0, size)
    }


}