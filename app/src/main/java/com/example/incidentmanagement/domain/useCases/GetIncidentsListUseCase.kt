package com.example.incidentmanagement.domain.useCases

import com.example.incidentmanagement.domain.repository.IncidentRepository
import javax.inject.Inject

class GetIncidentsListUseCase @Inject constructor(
    private val repository: IncidentRepository
) {
}