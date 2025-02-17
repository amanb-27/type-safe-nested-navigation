package com.example.nestedtype_safenavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(
    onClick : ()-> Unit,
    onRegisterClick : ()-> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login Screen")
        Button(onClick = onClick) {
            Text(text = "Login")
        }
        Button(onClick = onRegisterClick) {
            Text(text = "Register")
        }
    }
}

@Composable
fun RegisterScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Register Screen")
        Button(onClick = { /* Handle login button click */ }) {
            Text(text = "Register")
        }
    }
}

@Composable
fun ForgetPasswordScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Forget Password Screen")
    }
}
