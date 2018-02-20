package com.murielgonzalez.androidmvp.data.network.model

import com.google.gson.annotations.SerializedName

/**
 * Created by muriel_gonzalez on 2/19/18.
 */

data class Result(
        @SerializedName("TotalPages") val totalPages: Int,
        @SerializedName("CurrentPage") val currentPage: Int,
        @SerializedName("Results") val results: List<Article>
)

data class Article (
        @SerializedName("Content") val content: String,
        @SerializedName("Title") val title: String,
        @SerializedName("Author") val author: Author,
        @SerializedName("Topics") val topics: List<Topic>
)

data class Author (
        @SerializedName("Name") val name: String
)

data class Topic (
        @SerializedName("Name") val name: String
)
