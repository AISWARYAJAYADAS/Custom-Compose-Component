package com.example.customcomponentcomposeapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customcomponentcomposeapp.R

@Composable
fun TextHeading() {
    Box(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Custom Component",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(16.dp),
            fontFamily = FontFamily(
                Font(R.font.sfpro),
            )
        )
    }
}