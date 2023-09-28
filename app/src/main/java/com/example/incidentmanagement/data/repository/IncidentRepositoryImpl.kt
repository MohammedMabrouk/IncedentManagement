package com.example.incidentmanagement.data.repository

import com.example.incidentmanagement.data.dto.incident.GetIncidentTypesResponseDto
import com.example.incidentmanagement.data.dto.incident.GetIncidentsListResponseDto
import com.example.incidentmanagement.data.dto.incident.toIncidentsListResponse
import com.example.incidentmanagement.data.dto.otp.OtpResponseDto
import com.example.incidentmanagement.data.remote.IncidentsApi
import com.example.incidentmanagement.domain.model.IncidentsListResponse
import com.example.incidentmanagement.domain.repository.IncidentRepository
import okhttp3.MultipartBody
import javax.inject.Inject

class IncidentRepositoryImpl @Inject constructor(private val api: IncidentsApi) :
    IncidentRepository {
    override suspend fun userLogin(email: String): Result<Unit> {
        return api.userLogin(email)
    }

    override suspend fun verifyOtp(email: String, otp: String): OtpResponseDto {
        return api.verifyOtp(email, otp)
    }

    override suspend fun submitIncident(
        description: String,
        typeId: Int,
        latitude: Double,
        longitude: Double
    ): Result<Unit> {
        return api.submitIncident(
            description,
            typeId,
            latitude,
            longitude
        )
    }

    override suspend fun uploadIncidentImage(
        incidentId: String,
        file: MultipartBody.Part
    ): Result<Unit> {
        return api.uploadIncidentImage(
            incidentId,
            file
        )
    }

    override suspend fun getIncidentsList(): IncidentsListResponse {
        return api.getIncidentsList().toIncidentsListResponse()
    }

    override suspend fun getIncidentTypes(): GetIncidentTypesResponseDto {
        return api.getIncidentTypes()
    }
}