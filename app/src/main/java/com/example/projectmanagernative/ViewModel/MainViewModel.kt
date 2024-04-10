package com.example.projectmanagernative.ViewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanagernative.Repository.MainRepository

class MainViewModel(
    val repository: MainRepository
) : ViewModel() {

    constructor(): this(MainRepository())

    fun loadData() = repository.items

}