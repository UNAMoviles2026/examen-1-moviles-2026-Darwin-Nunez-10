package com.moviles.examenmoviles.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moviles.examenmoviles.components.AppBottomBar
import com.moviles.examenmoviles.data.MockData

@Composable
fun DetailScreen(spaceId: Int, onBack: () -> Unit) {
    val space = MockData.spaces.find { it.id == spaceId } ?: MockData.spaces[0]

    Scaffold(
        bottomBar = { AppBottomBar(onNavigateToList = onBack, onNavigateToDetail = {}) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(text = space.name, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = space.description)
            Text(text = "Capacity: ${space.capacity} people")
            Text(text = "Price: $${space.pricePerHour} per hour")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Simulated Reservation Action */ }) {
                Text("Reserve Now")
            }
        }
    }
}