package com.example.sportifydemo.presentation.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.sportifydemo.ui.theme.SpotifyDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpotifyDemoTheme {
                SpotifyDemo()
            }
        }
    }
}

@Composable
fun SpotifyDemo() {
    val navController = rememberNavController()
    Route(navController)
}
