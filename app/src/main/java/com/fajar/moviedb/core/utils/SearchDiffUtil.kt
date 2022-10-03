package com.fajar.moviedb.core.utils

import androidx.recyclerview.widget.DiffUtil
import com.fajar.moviedb.core.domain.model.Movie


class SearchDiffUtil(
    private val oldList: List<Movie>,
    private val newList: List<Movie>
): DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition].title == newList[newItemPosition].title

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition] == newList[newItemPosition]
}