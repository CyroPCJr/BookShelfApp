package com.example.bookshelfapp.data

import com.example.bookshelfapp.network.BookResponse
import com.example.bookshelfapp.network.BookShelfApiService

interface BookShelfRepository {

    suspend fun getVolumeBooks(): List<BookResponse>
}

class  NetworkBookShelfRepository(private val bookShelfApi: BookShelfApiService) : BookShelfRepository {

    override suspend fun getVolumeBooks(): List<BookResponse> = bookShelfApi.getVolumeBooks()
}