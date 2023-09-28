package com.example.incidentmanagement.domain.model

import com.example.incidentmanagement.data.dto.incident.Media

data class Incident(
    val createdAt: String,
    val description: String,
    val medias: List<Media>
)