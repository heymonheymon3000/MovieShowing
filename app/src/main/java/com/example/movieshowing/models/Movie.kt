package com.example.movieshowing.models

data class Movie(
    var adult: Boolean = false,
    var backdrop_path: String? = null,
    var genre_ids: List<Int>? = null,
    var id: Int = 0,
    var original_language: String? = null,
    var original_title: String? = null,
    var overview: String? = null,
    var popularity: Double = 0.0,
    var poster_path: String? = null,
    var release_date: String? = null,
    var title: String? = null,
    var video: Boolean = false,
    var vote_average: Double = 0.0,
    var vote_count: Int = 0,
)