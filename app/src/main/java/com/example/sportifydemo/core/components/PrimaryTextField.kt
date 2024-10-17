@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.sportifydemo.core.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.sportifydemo.ui.theme.black
import com.example.sportifydemo.ui.theme.lightGray

@Composable
fun PrimaryTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String,
    trailingIcon: (@Composable (() -> Unit))? = null
) {

    val colors = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = lightGray,
        unfocusedBorderColor = lightGray,
        focusedTextColor = black,
        unfocusedPlaceholderColor = lightGray,
        unfocusedTextColor = black
    )

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        colors = colors,
        modifier = modifier,
        shape = MaterialTheme.shapes.small,
        placeholder = { Text(placeholder) },
        textStyle = MaterialTheme.typography.bodyLarge,
        trailingIcon = trailingIcon
    )
}

