package com.example.bookshelfapp.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BookShelfApiService {

    @GET("volumes")
    suspend fun getVolumeBooks(@Query("q") query: String): Response<BookResponse>
}