package com.example.customcomponentcomposeapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CustomText(
    text: String,
    fontSize: TextUnit = 16.sp,
    color: Color = Color.Cyan,
    style: TextStyle = TextStyle()
) {

    Box {
        Text(
            text = text,
            fontSize = fontSize,
            color = color,
            style = style
        )
    }

}