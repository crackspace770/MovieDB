package com.fajar.moviedb.core.data.remote.response

import com.google.gson.annotations.SerializedName

data class ListSearchResponse (
    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String,

    @field:SerializedName("results")
    val results: List<SearchResponse>,

    )


