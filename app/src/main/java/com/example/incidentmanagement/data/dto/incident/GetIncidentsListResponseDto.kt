package com.example.incidentmanagement.data.dto.incident

import com.example.incidentmanagement.domain.model.IncidentsListResponse

data class GetIncidentsListResponseDto(
    val baseURL: String,
    val incidents: List<Incident>
)

fun GetIncidentsListResponseDto.toIncidentsListResponse(): IncidentsListResponse{
    return IncidentsListResponse(
        incidents.map { item -> item.toIncident() }
    )
}