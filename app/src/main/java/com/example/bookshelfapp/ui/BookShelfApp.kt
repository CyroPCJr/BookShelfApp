@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.bookshelfapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bookshelfapp.R
import com.example.bookshelfapp.ui.screens.BookShelfViewModel
import com.example.bookshelfapp.ui.screens.HomeScreen

@Composable
fun BookShelfApp() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { TopAppBar(scrollBehavior = scrollBehavior) }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            val bookShelfViewModel: BookShelfViewModel =
                viewModel(factory = BookShelfViewModel.Factory)
            HomeScreen(
                bookUiState = bookShelfViewModel.bookUiState,
                retryAction = bookShelfViewModel::getVolumeBook,
                modifier = Modifier.fillMaxSize(),
                contentPadding = it,
            )
        }
    }
}

@Composable
fun TopAppBar(scrollBehavior: TopAppBarScrollBehavior, modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineMedium,
            )
        },
        modifier = modifier
    )
}