package com.example.incidentmanagement.presentation.loginScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.incidentmanagement.R
import com.example.incidentmanagement.domain.model.login.LoginUiState
import com.example.incidentmanagement.domain.useCases.UserLoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val userLoginUseCase: UserLoginUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow<LoginUiState>(LoginUiState.Loading)
    val uiState: StateFlow<LoginUiState> = _uiState

    fun login(email: String){
        _uiState.value = LoginUiState.Loading
        viewModelScope.launch {
            try {
                if(userLoginUseCase.invoke(email).isSuccess){
                    _uiState.value = LoginUiState.Success
                }else{
                    _uiState.value = LoginUiState.Error("error")
                }
            }catch (exception: Exception){
                _uiState.value = LoginUiState.Error(exception.message.toString())
            }
        }
    }
}