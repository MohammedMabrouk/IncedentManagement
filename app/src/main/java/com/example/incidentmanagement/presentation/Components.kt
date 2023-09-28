package com.example.incidentmanagement.presentation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FilledButton(label: String, onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text(label)
    }
}