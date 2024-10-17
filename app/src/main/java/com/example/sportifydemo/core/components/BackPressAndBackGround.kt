package com.example.sportifydemo.core.components

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sportifydemo.R
import com.example.sportifydemo.ui.theme.darkGray
import com.example.sportifydemo.ui.theme.mediumGray

@Composable
fun BackPressAndBackground(
//    navController: NavController,
    modifier: Modifier = Modifier,
    showLogo: Boolean = true,
    content: @Composable () -> Unit
) {
    val navController = rememberNavController()
    val context = LocalContext.current as? ComponentActivity

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = mediumGray)
            .statusBarsPadding()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 16.dp).height(40.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(30.dp)
                    .background(color = darkGray, shape = RoundedCornerShape(50.dp))
                    .clickable {
                        if (!navController.popBackStack()) {
                            context?.onBackPressedDispatcher?.onBackPressed()
                        }
                    }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrowback),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }
            if (showLogo) {
                Image(
                    painter = painterResource(R.drawable.spotifylogo),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .width(150.dp)
                        .height(50.dp)
                )
            } else {
                Spacer(modifier = Modifier.weight(1f))
            }
            Box(
                modifier = Modifier.size(30.dp)
            ) {}
        }
        content()
    }
}
