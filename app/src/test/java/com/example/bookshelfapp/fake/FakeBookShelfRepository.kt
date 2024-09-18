package com.example.bookshelfapp.fake

import com.example.bookshelfapp.data.BookShelfRepository
import com.example.bookshelfapp.network.BookItem

class FakeBookShelfRepository : BookShelfRepository {

    override suspend fun getVolumeBooks(query: String): List<BookItem> {
        return FakeDataSource.bookResponse.items
    }
}