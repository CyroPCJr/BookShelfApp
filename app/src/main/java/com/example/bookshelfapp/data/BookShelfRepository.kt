package com.example.bookshelfapp.data

import com.example.bookshelfapp.network.BookItem
import com.example.bookshelfapp.network.BookShelfApiService

interface BookShelfRepository {

    suspend fun getVolumeBooks(query: String = "\"\""): List<BookItem>
}

class NetworkBookShelfRepository(private val bookShelfApi: BookShelfApiService) :
    BookShelfRepository {

    override suspend fun getVolumeBooks(query: String): List<BookItem> {
        val bookResponseGson = bookShelfApi.getVolumeBooks(query)
        if (!bookResponseGson.isSuccessful) return emptyList()
        return bookResponseGson.body()?.items ?: emptyList()
    }
}