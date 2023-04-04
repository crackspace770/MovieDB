package com.fajar.moviedb.core.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fajar.moviedb.core.R
import com.fajar.moviedb.core.databinding.ItemListTourismBinding

import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.utils.Constant.Companion.IMAGE_BASE_URL
import com.fajar.moviedb.core.utils.MovieDiffUtil

import java.util.ArrayList

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.ListViewHolder>() {

    private var listData = ArrayList<Movie>()
    var onItemClick: ((Movie) -> Unit)? = null


    fun setData(newListData: List<Movie>) {
        val diffUtil = MovieDiffUtil(listData,newListData)
        val diffResults = DiffUtil.calculateDiff(diffUtil)
        this.listData.clear()
        this.listData.addAll(newListData)
        diffResults.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_tourism, parent, false))

    override fun getItemCount() = listData.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemListTourismBinding.bind(itemView)
        fun bind(data: Movie) {
            with(binding) {
                Glide.with(itemView.context)
                    .load("${IMAGE_BASE_URL}${data.posterPath}")
                    .into(ivItemImage)
                tvItemTitle.text = data.title
                tvItemSubtitle.text = data.voteAverage.toString()
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[adapterPosition])
            }
        }
    }

    fun clearList(){
        val size = listData.size
        listData.clear()
        notifyItemRangeRemoved(0, size)
    }


}