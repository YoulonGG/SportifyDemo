package com.example.sportifydemo.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sportifydemo.R
import com.example.sportifydemo.core.components.CommonText
import com.example.sportifydemo.core.components.PrimaryButton
import com.example.sportifydemo.presentation.app.Route
import com.example.sportifydemo.presentation.app.RouteDestinations
import com.example.sportifydemo.ui.theme.lightGray

@Composable
fun OnBoardingScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.boarding),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(vertical = 32.dp, horizontal = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.spotifylogo),
                contentDescription = null,
                modifier = Modifier.width(150.dp).height(60.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            CommonText(
                text = "Enjoy Listening To Music",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            CommonText(
                text = "Spotify is an audio streaming service that offers users access to music tracks, podcasts, and other media through a subscription model.",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                color = lightGray,
                modifier = Modifier.padding(top = 16.dp)
            )
            PrimaryButton(
                modifier = Modifier.padding(top = 24.dp),
                onClick = {navController.navigate(RouteDestinations.LOGIN)},
                text = "Get Start",
            )
        }
    }
}

@Preview
@Composable
fun OnBoardingPreview() {
    OnBoardingScreen(navController = rememberNavController())
}