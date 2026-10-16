package com.example.actbasiccomposable_0146

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Praktikum Jetpack Compose",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF283593)
        )

        Text(
            text = "Nama: Nimra Tariq",
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "NIM: 20240140146",
            style = MaterialTheme.typography.bodyLarge
        )

        HorizontalDivider()

        Text(
            text = "1. Column Layout",
            fontWeight = FontWeight.Bold
        )
        TataLetakColumn()

        HorizontalDivider()

        Text(
            text = "2. Row Layout",
            fontWeight = FontWeight.Bold
        )
        TataLetakRow()

        HorizontalDivider()

        Text(
            text = "3. Box Layout",
            fontWeight = FontWeight.Bold
        )
        TataLetakBox()

        HorizontalDivider()

        Text(
            text = "4. Column and Row",
            fontWeight = FontWeight.Bold
        )
        TataLetakColumnRow()

        HorizontalDivider()

        Text(
            text = "5. Row and Column",
            fontWeight = FontWeight.Bold
        )
        TataLetakRowColumn()

        HorizontalDivider()

        Text(
            text = "6. Nested Box, Column, and Row",
            fontWeight = FontWeight.Bold
        )
        TataLetakBoxColumnRow()

        Spacer(modifier = Modifier.height(16.dp))
    }
}