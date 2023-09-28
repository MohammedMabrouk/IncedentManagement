package com.example.incidentmanagement.domain.di

import com.example.incidentmanagement.data.remote.IncidentsApi
import com.example.incidentmanagement.data.repository.IncidentRepositoryImpl
import com.example.incidentmanagement.domain.repository.IncidentRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideIncidentsRepository(
        api: IncidentsApi
    ): IncidentRepository {
        return IncidentRepositoryImpl(api)
    }
}