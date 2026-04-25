package com.moviles.examenmoviles.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun AppBottomBar(onNavigateToList: () -> Unit, onNavigateToDetail: () -> Unit) {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Spaces") },
            selected = true,
            onClick = onNavigateToList
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Info, contentDescription = "Detail") },
            label = { Text("Details") },
            selected = false,
            onClick = onNavigateToDetail
        )
    }
}