package com.example.customcomponentcomposeapp.custom_shape

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CustomSpeechBubble() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(20.dp)
    ) {
        drawRect(
            color = Color.DarkGray,
            size = size
        )
        drawCircle(
            radius = 100f,
            brush = Brush.linearGradient(
                colors = listOf(Color.Cyan, Color.DarkGray)
            )
        )
        drawArc(
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = 270f,
            useCenter = true,
            topLeft = Offset(100f, 200f),
            size = Size(200f, 200f),
            style = Stroke(
                width = 3.dp.toPx()
            )
        )

        drawOval(
            color = Color.Magenta,
            topLeft = Offset(20f, 100f),
            size = Size(100f, 40f),
            style = Stroke(
                width = 2.dp.toPx()
            )
        )
        drawLine(
            color = Color.Blue,
            start = Offset(300f, 700f),
            end = Offset(700f, 700f),
            strokeWidth = 5.dp.toPx()
        )

    }

}