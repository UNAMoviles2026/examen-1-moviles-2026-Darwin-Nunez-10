package com.moviles.examenmoviles.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.moviles.examenmoviles.components.AppBottomBar
import com.moviles.examenmoviles.components.SpaceCard
import com.moviles.examenmoviles.data.MockData

@Composable
fun ListScreen(onSpaceClick: (Int) -> Unit) {
    Scaffold(
        bottomBar = { AppBottomBar(onNavigateToList = {}, onNavigateToDetail = {}) }
    ) { paddingValues ->
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            items(MockData.spaces) { space ->
                SpaceCard(space = space, onClick = { onSpaceClick(space.id) })
            }
        }
    }
}