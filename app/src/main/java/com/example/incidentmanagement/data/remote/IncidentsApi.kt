package com.example.incidentmanagement.data.remote

import com.example.incidentmanagement.data.dto.otp.OtpResponseDto
import com.example.incidentmanagement.data.dto.incident.GetIncidentsListResponseDto
import com.example.incidentmanagement.data.dto.incident.GetIncidentTypesResponseDto
import com.example.incidentmanagement.data.dto.login.LoginRequestDto
import okhttp3.MultipartBody
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface IncidentsApi {
    @POST("login")
    suspend fun userLogin(@Body request: LoginRequestDto) : Result<Unit>

    @POST("verify-otp")
    suspend fun verifyOtp(@Field("email") email: String, @Field("otp") otp: String): OtpResponseDto

    @POST("incident")
    suspend fun submitIncident(
        @Field("description") description: String,
        @Field("typeId") typeId: Int,
        @Field("latitude") latitude: Double,
        @Field("longitude") longitude: Double
    ) : Result<Unit>

    @Multipart
    @POST("incident/upload/{incidentId}")
    suspend fun uploadIncidentImage(
        @Path("incidentId") incidentId: String,
        @Part file: MultipartBody.Part
    ) : Result<Unit>

    @GET("incident")
    suspend fun getIncidentsList(): GetIncidentsListResponseDto

    @GET("types")
    suspend fun getIncidentTypes(): GetIncidentTypesResponseDto
}