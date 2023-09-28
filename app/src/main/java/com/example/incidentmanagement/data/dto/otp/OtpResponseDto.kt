package com.example.incidentmanagement.data.dto.otp

data class OtpResponseDto(
    val token: String,
    val roles: List<Int>
)