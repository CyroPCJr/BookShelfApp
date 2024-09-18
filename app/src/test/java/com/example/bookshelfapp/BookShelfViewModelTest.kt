package com.example.bookshelfapp

import com.example.bookshelfapp.fake.FakeBookShelfRepository
import com.example.bookshelfapp.fake.FakeDataSource
import com.example.bookshelfapp.rules.TestDispatcherRule
import com.example.bookshelfapp.ui.screens.BookShelfViewModel
import com.example.bookshelfapp.ui.screens.BookUiState
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class BookShelfViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun bookShelfViewModel_getVolumeBook_verifyBookShelfUiStateSuccess(): Unit =
        runTest {
            val bookShelfViewModel =
                BookShelfViewModel(bookShelfRepository = FakeBookShelfRepository())

            assertEquals(
                BookUiState.Success(FakeDataSource.bookResponse.items),
                bookShelfViewModel.bookUiState
            )
        }

}