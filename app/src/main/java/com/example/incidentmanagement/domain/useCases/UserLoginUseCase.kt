package com.example.incidentmanagement.domain.useCases

import com.example.incidentmanagement.domain.repository.IncidentRepository
import javax.inject.Inject

class UserLoginUseCase @Inject constructor(
    private val repository: IncidentRepository
) {
    suspend operator fun invoke(email: String): Result<Unit> {
//        repository.userLogin(email)

        return repository.userLogin(email)
//        return if (isLoggedInUseCase().first())
//            addressRepository.deleteAddress(addressId)
//        else
//            Result.failure(UserNotLoggedInException())
    }
}