package com.example.incidentmanagement.domain.model.login

sealed class LoginUiState {
    object Loading : LoginUiState()
    object Success : LoginUiState()
    class Error(val message: String) : LoginUiState()
}