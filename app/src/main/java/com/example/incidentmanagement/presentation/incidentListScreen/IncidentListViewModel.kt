package com.example.incidentmanagement.presentation.incidentListScreen

import androidx.lifecycle.ViewModel
import com.example.incidentmanagement.domain.useCases.GetIncidentTypesUseCase
import com.example.incidentmanagement.domain.useCases.GetIncidentsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IncidentListViewModel @Inject constructor(
    private val getIncidentTypesUseCase: GetIncidentTypesUseCase,
    private val getIncidentsListUseCase: GetIncidentsListUseCase
) : ViewModel() {

}