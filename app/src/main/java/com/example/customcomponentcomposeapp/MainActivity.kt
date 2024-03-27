package com.example.customcomponentcomposeapp


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customcomponentcomposeapp.screens.CustomButton
import com.example.customcomponentcomposeapp.screens.CustomInputText
import com.example.customcomponentcomposeapp.screens.TextHeading
import com.example.customcomponentcomposeapp.ui.theme.CustomComponentComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomComponentComposeAppTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    var lastNameValue by remember { mutableStateOf(TextFieldValue()) }
    var firstNameValue by remember { mutableStateOf(TextFieldValue()) }
    var passwordValue by remember { mutableStateOf(TextFieldValue()) }
    var showPassword by remember { mutableStateOf(false) }


    var passwordError by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val focusManager = LocalFocusManager.current


    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        TextHeading()

        CustomInputText(
            labelText = "お名前（姓)",
            value = lastNameValue,
            isError = false,
            isMandatory = true,
            onValueChange = {
                lastNameValue = it
            },
            placeholder = { Text(text = "小林", fontSize = 13.sp) }
        )

        CustomInputText(
            labelText = "お名前（名)",
            value = firstNameValue,
            isError = false,
            isMandatory = true,
            onValueChange = {
                firstNameValue = it
            },
            placeholder = { Text(text = "あきら", fontSize = 13.sp) }
        )

        CustomInputText(
            labelText = "パスワード",
            value = passwordValue,
            isError = passwordError,
            isMandatory = true,
            onValueChange = {
                passwordValue = it
            },
            placeholder = { Text(text = "Password", fontSize = 13.sp) },
            visualTransformation = if (showPassword) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                if (showPassword) {
                    IconButton(onClick = { showPassword = false }) {
                        Icon(
                            imageVector = Icons.Filled.Visibility,
                            contentDescription = "hide_password"
                        )
                    }
                } else {
                    IconButton(
                        onClick = { showPassword = true }) {
                        Icon(
                            imageVector = Icons.Filled.VisibilityOff,
                            contentDescription = "hide_password"
                        )
                    }
                }
            }
        )

        Spacer(modifier = Modifier.height(200.dp))


        CustomButton(onClick = {
            Toast.makeText(context, "test...", Toast.LENGTH_SHORT).show();
        }
        ) {
            Text(
                text = "次へ",
                Modifier.padding(8.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        CustomButton(onClick = {
            passwordError = passwordValue.text.isEmpty()
            focusManager.clearFocus()
            Toast.makeText(context, "test2...", Toast.LENGTH_SHORT).show();
        }
        ) {
            Text(
                text = "はい",
                Modifier.padding(8.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                style = TextStyle(color = Color.Black)
            )
        }

    }


}














