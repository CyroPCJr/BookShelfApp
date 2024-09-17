package com.example.bookshelfapp.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.bookshelfapp.BookShelfApplication
import com.example.bookshelfapp.data.BookShelfRepository
import com.example.bookshelfapp.network.BookItem
import kotlinx.coroutines.launch
import java.io.IOException

interface BookUiState {
    data class Success(var volumeBooks: List<BookItem>) : BookUiState
    data object Loading : BookUiState
    data object Error : BookUiState
}

class BookShelfViewModel(private val bookShelfRepository: BookShelfRepository) : ViewModel() {

    var bookUiState: BookUiState by mutableStateOf(BookUiState.Loading)
        private set

    init {
        getVolumeBook()
    }

    fun getVolumeBook() {
        viewModelScope.launch {
            bookUiState = try {
                BookUiState.Success(bookShelfRepository.getVolumeBooks())
            } catch (e: IOException) {
                BookUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as BookShelfApplication)
                val bookshelfRepository = application.container.bookRepository
                BookShelfViewModel(bookShelfRepository = bookshelfRepository)
            }
        }
    }

}