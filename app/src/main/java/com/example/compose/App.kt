package com.example.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.compose.landing.LandingScreen
import com.example.compose.ui.theme.ComposeTheme

@Composable
fun App() {
    ComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            LandingScreen()
        }
    }
}