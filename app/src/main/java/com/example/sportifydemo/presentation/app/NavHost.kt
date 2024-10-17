package com.example.sportifydemo.presentation.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.example.sportifydemo.presentation.app.RouteDestinations.Companion.LOGIN
import com.example.sportifydemo.presentation.app.RouteDestinations.Companion.ONBOARDING
import com.example.sportifydemo.presentation.app.RouteDestinations.Companion.REGISTER
import com.example.sportifydemo.presentation.app.RouteDestinations.Companion.SIGNING
import com.example.sportifydemo.presentation.app.RouteDestinations.Companion.SPLASH
import com.example.sportifydemo.presentation.login.SplashScreen
import com.example.sportifydemo.presentation.login.LoginScreen
import com.example.sportifydemo.presentation.login.OnBoardingScreen
import com.example.sportifydemo.presentation.login.RegisterScreen
import com.example.sportifydemo.presentation.login.SignInScreen

//sealed class Route(val route: String) {
//    data object Splash : Route("splash")
//    data object OnBoarding : Route("onboarding")
//    data object Login : Route("login")
//    data object SignIn : Route("signing")
//    data object Register : Route("register")
//}
//
//@Composable
//fun Route(navController: NavHostController) {
//    NavHost(navController = navController, startDestination = Route.Splash.route) {
//        composable(Route.Splash.route) { SplashScreen(navController) }
//        composable(Route.OnBoarding.route) { OnBoardingScreen(navController) }
//        composable(Route.SignIn.route) { SignInScreen(navController) }
//        composable(Route.Register.route) { RegisterScreen(navController) }
//        composable(Route.Login.route) { LoginScreen(navController) }
//    }
//}

@Composable
fun Route(navController: NavHostController) {
    NavHost(navController, startDestination = SPLASH) {
        composable(SPLASH) { SplashScreen(navController) }
        composable(ONBOARDING) { OnBoardingScreen(navController) }
        composable(LOGIN) { LoginScreen(navController) }
        composable(SIGNING) { SignInScreen(navController) }
        composable(REGISTER) { RegisterScreen(navController) }
    }
}

class RouteDestinations {
    companion object {
        const val SPLASH = "splash"
        const val ONBOARDING = "onboarding"
        const val LOGIN = "login"
        const val SIGNING = "signing"
        const val REGISTER = "register"

    }
}