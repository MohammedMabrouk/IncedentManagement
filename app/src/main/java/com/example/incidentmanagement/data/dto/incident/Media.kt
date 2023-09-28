package com.example.incidentmanagement.data.dto.incident

data class Media(
    val id: String,
    val incidentId: String,
    val mimeType: String,
    val type: Int,
    val url: String
)