package com.example.actbasiccomposable_0146

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginBackground(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.bg_masjid),
        contentDescription = null,
        modifier = modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun LoginHeader() {
    Text(
        text = "Login",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue
    )
    Text(
        text = "Ini adalah halaman login,",
        fontSize = 16.sp,
        color = Color.White
    )
}

@Composable
fun LoginLogo() {
    Image(
        painter = painterResource(id = R.drawable.logo_umy),
        contentDescription = null,
        modifier = Modifier.size(150.dp)
    )
}

@Composable
fun LoginInfo() {
    Text(
        text = "Nama",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Red
    )
    Text(
        text = "Nimra Tariq",
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue
    )
    Text(
        text = "20240140146",
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}