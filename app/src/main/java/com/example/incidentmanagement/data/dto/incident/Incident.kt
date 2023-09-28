package com.example.incidentmanagement.data.dto.incident

import com.example.incidentmanagement.domain.model.Incident as DomainIncident

data class Incident(
    val assigneeId: Any,
    val createdAt: String,
    val description: String,
    val id: String,
    val issuerId: String,
    val latitude: Double,
    val longitude: Double,
    val medias: List<Media>,
    val priority: Any,
    val status: Int,
    val typeId: Int,
    val updatedAt: String
)

fun Incident.toIncident(): DomainIncident {
    return DomainIncident(
        createdAt = createdAt,
        description = description,
        medias = medias
    )
}