package com.example.incidentmanagement.domain.repository

import com.example.incidentmanagement.data.dto.incident.GetIncidentTypesResponseDto
import com.example.incidentmanagement.data.dto.incident.GetIncidentsListResponseDto
import com.example.incidentmanagement.data.dto.otp.OtpResponseDto
import com.example.incidentmanagement.domain.model.IncidentsListResponse
import okhttp3.MultipartBody

interface IncidentRepository {
    suspend fun userLogin(email: String): Result<Unit>

    suspend fun verifyOtp(email: String, otp: String): OtpResponseDto

    suspend fun submitIncident(
        description: String,
        typeId: Int,
        latitude: Double,
        longitude: Double
    ): Result<Unit>

    suspend fun uploadIncidentImage(incidentId: String, file: MultipartBody.Part) : Result<Unit>

    suspend fun getIncidentsList(): IncidentsListResponse

    suspend fun getIncidentTypes(): GetIncidentTypesResponseDto
}