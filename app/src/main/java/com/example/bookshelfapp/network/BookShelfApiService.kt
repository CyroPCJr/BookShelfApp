package com.example.bookshelfapp.network

import retrofit2.http.GET

interface BookShelfApiService {

    @GET("volumes?q=\"\"\"")
    suspend fun getVolumeBooks() : List<BookResponse>
}