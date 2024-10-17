package com.example.sportifydemo.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sportifydemo.R
import com.example.sportifydemo.presentation.app.RouteDestinations
import com.example.sportifydemo.ui.theme.black
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = black),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.spotifylogo),
                contentDescription = null,
                modifier = Modifier.width(250.dp).height(180.dp)
            )
        }
    }
    LaunchedEffect(Unit) {
        delay(2000L)
        navController.navigate(RouteDestinations.ONBOARDING) {
            popUpTo(RouteDestinations.ONBOARDING) { inclusive = true }
        }
    }
}