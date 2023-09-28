package com.example.incidentmanagement.data.remote

import com.example.incidentmanagement.data.dto.otp.OtpResponseDto
import okhttp3.MultipartBody
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface IncidentsApi {
    @POST("login")
    suspend fun userLogin(@Field("email") email: String)

    @POST("verify-otp")
    suspend fun verifyOto(@Field("email") email: String, @Field("otp") otp: String): OtpResponseDto

    @POST("incident")
    suspend fun submitIncident(
        @Field("description") description: String,
        @Field("typeId") typeId: Int,
        @Field("latitude") latitude: Double,
        @Field("longitude") longitude: Double
    )

    @Multipart
    @POST("incident/upload/{incidentId}")
    suspend fun uploadIncidentImage(
        @Path("incidentId") incidentId: String,
        @Part file: MultipartBody.Part
    )

}