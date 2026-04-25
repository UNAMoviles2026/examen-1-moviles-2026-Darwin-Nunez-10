package com.moviles.examenmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.moviles.examenmoviles.screens.DetailScreen
import com.moviles.examenmoviles.screens.ListScreen
import com.moviles.examenmoviles.ui.theme.ExamenMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var currentScreen by remember { mutableStateOf("list") }
            var selectedSpaceId by remember { mutableStateOf(1) }

            if (currentScreen == "list") {
                ListScreen(onSpaceClick = { id ->
                    selectedSpaceId = id
                    currentScreen = "detail"
                })
            } else {
                DetailScreen(spaceId = selectedSpaceId, onBack = {
                    currentScreen = "list"
                })
            }
        }
    }
}

