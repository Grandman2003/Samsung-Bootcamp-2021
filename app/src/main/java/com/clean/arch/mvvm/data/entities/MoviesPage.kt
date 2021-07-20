package com.clean.arch.mvvm.data.entities

import com.google.gson.annotations.SerializedName

data class MoviesPage(
    val page: Int,
    @SerializedName("results")
    val movies : List<Movie>,
    @SerializedName("total_pages")
    val totalPages : Int,
    @SerializedName("total_results")
    val totalResults : Int,
    )