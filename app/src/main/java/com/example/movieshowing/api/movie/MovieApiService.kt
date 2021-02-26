package com.example.movieshowing.api.movie

import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("popular")
    fun getPopularMovies(@Query("api_key") api_key: String,
                         @Query("page") page: Int?,
                         @Query("region") region: String?)

//    @GET("{movieId}/similar")
//    fun getSimilarMoviesAsync(@Path("movieId") movieId: Int, @Query("api_key") api_key: String?): Deferred<NetworkResponseObject>
//
//    @GET("{movieId}")
//    fun getMovieAsync(@Path("movieId") movieId: Int, @Query("api_key") api_key: String?): Deferred<NetworkMovieResponseObject>
}