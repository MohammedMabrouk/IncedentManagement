package com.example.incidentmanagement.presentation

sealed class Screen(val route: String) {
    object LoginScreen : Screen("login_screen")
    object IncidentListScreen : Screen("incident_list_screen")
    object AddIncidentScreen : Screen("add_incident_screen")
}