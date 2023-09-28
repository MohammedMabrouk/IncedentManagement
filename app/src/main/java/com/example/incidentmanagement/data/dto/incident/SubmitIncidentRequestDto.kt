package com.example.incidentmanagement.data.dto.incident

data class SubmitIncidentRequestDto(
    val description: String,
    val typeId: Int,
    val latitude: Double,
    val longitude: Double
)