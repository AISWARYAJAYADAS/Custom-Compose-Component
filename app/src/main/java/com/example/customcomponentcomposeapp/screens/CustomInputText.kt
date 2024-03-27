package com.example.customcomponentcomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customcomponentcomposeapp.R

@Composable
fun CustomInputText(
    labelText: String,
    modifier: Modifier = Modifier,
    value: TextFieldValue = TextFieldValue(),
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    isError: Boolean = false,
    isMandatory: Boolean = false,
    onValueChange: (TextFieldValue) -> Unit
) {
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = labelText,
                fontFamily = FontFamily(Font(R.font.sfpro)),
                fontSize = 13.sp,
                color = Color(0xFF424242),
                modifier = Modifier.padding(vertical = 8.dp)
            )
            if (isMandatory) {
                Text(
                    text = "*",
                    fontFamily = FontFamily(Font(R.font.sfpro)),
                    color = Color.Red
                )
            }
        }




        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.fillMaxWidth(),
            isError = isError,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF4FC2E8),
                errorBorderColor = if (isError) Color.Red else Color.Unspecified
            ),
            textStyle = TextStyle(
                fontFamily = FontFamily(Font(R.font.sfpro))
            ),
            placeholder = placeholder,
            trailingIcon = trailingIcon,
            visualTransformation = visualTransformation

        )
    }

}