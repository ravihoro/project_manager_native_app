package com.example.projectmanagernative.ViewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanagernative.Repository.ProfileRepository

class ProfileViewModel(val repository: ProfileRepository) : ViewModel() {
    constructor(): this(ProfileRepository())

    fun loadDataMyTeam() = repository.myTeamItems
    fun loadDataArchive() = repository.archives

}