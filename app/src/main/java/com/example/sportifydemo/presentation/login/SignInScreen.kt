package com.example.sportifydemo.presentation.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.sportifydemo.core.components.PrimaryTextField
import com.example.sportifydemo.ui.theme.green
import com.example.sportifydemo.ui.theme.lightGray
import com.example.sportifydemo.ui.theme.white

@Composable
fun SignInScreen(
    navController: NavController
) {

    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    BackPressAndBackground(
        showLogo = true,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CommonText(
                text = "Sign In",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(top = 42.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                CommonText(
                    text = "If You Need Any Support",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyMedium,
                    color = white,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                CommonText(
                    text = "Click Here",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyMedium,
                    color = green,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
            PrimaryTextField(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 16.dp),
                value = userName,
                onValueChange = { userName = it },
                placeholder = "Enter Username or Email",
            )
            PrimaryTextField(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                value = password,
                onValueChange = { password = it },
                placeholder = "Password",
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_remove_red_eye_24),
                        contentDescription = "Visibility Icon",
                        modifier = Modifier.clickable {  }
                    )
                }
            )
            CommonText(
                modifier = Modifier.padding(start = 16.dp, top = 10.dp, bottom = 32.dp).fillMaxWidth(),
                textAlign = TextAlign.Start,
                text = "Recovery Password",
                style = MaterialTheme.typography.bodyMedium,
            )
            PrimaryButton(
                modifier = Modifier.padding(bottom = 16.dp).padding(horizontal = 16.dp),
                text = "Sign In",
                onClick = {}
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                HorizontalDivider(color = lightGray, modifier = Modifier.weight(1f))
                CommonText(
                    color = lightGray,
                    text = "Or",
                    modifier = Modifier.padding(horizontal = 4.dp))
                HorizontalDivider(color = lightGray, modifier = Modifier.weight(1f))
            }
        }
    }
}

@Preview
@Composable
fun SignInPreView() {
    SignInScreen(navController = rememberNavController())
}