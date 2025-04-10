package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun LoginScreen() {

    Column {

        Image(painter = painterResource(R.drawable.login), contentDescription = "Login Image")
        Text(text = "Welcome Back!")
    }

}


