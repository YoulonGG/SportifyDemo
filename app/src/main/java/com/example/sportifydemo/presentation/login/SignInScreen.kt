package com.example.sportifydemo.presentation.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sportifydemo.core.components.BackPressAndBackground

@Composable
fun SignInScreen(
    navController: NavController
) {
    BackPressAndBackground(
        showLogo = true,
//        navController = rememberNavController()
    ) {

    }

}