package com.moviles.examenmoviles.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moviles.examenmoviles.model.CoworkingSpace

@Composable
fun SpaceCard(space: CoworkingSpace, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = onClick
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = space.name, style = MaterialTheme.typography.titleLarge)
            Text(text = "Location: ${space.location}")
            Text(text = "Price: $${space.pricePerHour}/hr")
            Text(
                text = if (space.isAvailable) "Available" else "Occupied",
                color = if (space.isAvailable) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error
            )
        }
    }
}