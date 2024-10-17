package com.example.sportifydemo.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sportifydemo.R
import com.example.sportifydemo.core.components.BackPressAndBackground
import com.example.sportifydemo.core.components.CommonText
import com.example.sportifydemo.core.components.PrimaryButton
import com.example.sportifydemo.presentation.app.RouteDestinations
import com.example.sportifydemo.ui.theme.lightGray

@Composable
fun LoginScreen(
    navController: NavController
) {

    BackPressAndBackground(
        showLogo = false,
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.spotifylogo),
                contentDescription = null,
                modifier = Modifier
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .width(200.dp)
                    .height(80.dp)
            )
            CommonText(
                text = "Enjoy Listening To Music",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(top = 42.dp))
            CommonText(
                text = "Spotify is a proprietary Swedish audio streaming and media services provider",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                color = lightGray,
                modifier = Modifier.padding(top = 16.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 32.dp)
            ) {
                PrimaryButton(
                    modifier = Modifier.weight(1f),
                    onClick = {},
                    text = "Register"
                )
                Spacer(modifier = Modifier.width(16.dp))
                PrimaryButton(
                    backgroundColor = Color.Transparent,
                    modifier = Modifier.weight(1f),
                    onClick = {navController.navigate(RouteDestinations.SIGNING)},
                    text = "Sign In"
                )
            }
        }
    }
}

@Preview
@Composable
fun LoginPreview() {
    LoginScreen(navController = rememberNavController())
}
