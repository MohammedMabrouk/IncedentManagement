package com.example.incidentmanagement.domain.useCases

import com.example.incidentmanagement.domain.repository.IncidentRepository
import javax.inject.Inject

class VerifyOtpUseCase @Inject constructor(
    private val repository: IncidentRepository
) {

}