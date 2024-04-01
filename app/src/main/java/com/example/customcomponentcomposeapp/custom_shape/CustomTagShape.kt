package com.example.customcomponentcomposeapp.custom_shape

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun CustomTagShape1() {
    Card(
        modifier = Modifier
            .size(120.dp),
        shape = CutCornerShape(
            topStartPercent = 50,
            topEndPercent = 50,
            bottomStartPercent = 50,
            bottomEndPercent = 50
        )
    ) {


    }

}

@Preview
@Composable
private fun CustomTagShape2() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .size(120.dp),
        shape = CutCornerShape(
            topStartPercent = 50,
            topEndPercent = 25,
            bottomStartPercent = 50,
            bottomEndPercent = 50,
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.Red,
        )

    ) {
        Box {
            Text(
                text = "SALE",
                modifier = Modifier
                    .align(Alignment.Center)
                 //   .rotate(-45f)
            )
        }


    }

}