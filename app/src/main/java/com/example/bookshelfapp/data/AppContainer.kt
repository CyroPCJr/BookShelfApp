package com.example.bookshelfapp.data

import com.example.bookshelfapp.network.BookShelfApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val bookRepository: BookShelfRepository
}

class DefaultContainer : AppContainer {

    private val baseUrl: String = "https://www.googleapis.com/books/v1/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()

    private val retrofitService: BookShelfApiService by lazy {
        retrofit.create(BookShelfApiService::class.java)
    }

    override val bookRepository: BookShelfRepository by lazy {
        NetworkBookShelfRepository(retrofitService)
    }

}