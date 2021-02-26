package com.example.movieshowing.modules

import com.example.movieshowing.api.movie.MovieApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(FragmentComponent::class)
class ApiModule {

    @Provides
    fun movieAPI(retrofit: Retrofit) = retrofit.create(MovieApiService::class.java)

    @Provides
    fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:3000/") //please check that it matches your current local ip
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}