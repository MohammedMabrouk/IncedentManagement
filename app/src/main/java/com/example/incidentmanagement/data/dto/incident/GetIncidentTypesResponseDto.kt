package com.example.incidentmanagement.data.dto.incident

class GetIncidentTypesResponseDto : ArrayList<GetIncidentTypesItem>()

data class GetIncidentTypesItem(
    val arabicName: String,
    val englishName: String,
    val id: Int,
    val subTypes: List<SubType>
)

data class SubType(
    val arabicName: String,
    val categoryId: Int,
    val englishName: String,
    val id: Int
)