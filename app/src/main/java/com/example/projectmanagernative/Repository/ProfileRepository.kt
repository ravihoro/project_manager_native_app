package com.example.projectmanagernative.Repository

import com.example.projectmanagernative.Domain.TeamDomain

class ProfileRepository {

    val myTeamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Food App Application", "Project in Progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend", "Project in Progress"),
        TeamDomain("Kotlin Developers", "Completed"),
    )

    val archives: MutableList<String> = mutableListOf(
        "UI/UX Screenshots",
        "Kotlin Source Code",
        "Source Codes"
    )

}