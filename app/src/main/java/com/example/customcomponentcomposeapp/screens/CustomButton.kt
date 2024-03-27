package com.example.customcomponentcomposeapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun CustomButton(
    onClick: () -> Unit,
    content: @Composable() (RowScope.() -> Unit)
) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF3B8DE4),
                        Color(0xFF4FC2E8)
                    )
                ), shape = ButtonDefaults.shape
            ),
        //   .height(ButtonDefaults.MinHeight),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        onClick = { onClick() }) {

        content()
    }

}