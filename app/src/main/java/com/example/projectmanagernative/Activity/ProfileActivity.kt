package com.example.projectmanagernative.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectmanagernative.Adapter.ArchiveAdapter
import com.example.projectmanagernative.Adapter.MyTeamAdapter
import com.example.projectmanagernative.Adapter.OngoingAdapter
import com.example.projectmanagernative.R
import com.example.projectmanagernative.ViewModel.ProfileViewModel
import com.example.projectmanagernative.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    lateinit var binding: ActivityProfileBinding
    val profileViewModel by viewModels<ProfileViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {

            val teamAdapter by lazy{ MyTeamAdapter(profileViewModel.loadDataMyTeam()) }

            viewTeam.apply {
                adapter = teamAdapter
                layoutManager = LinearLayoutManager(this@ProfileActivity, LinearLayoutManager.VERTICAL, false)
            }


            val archiveAdapter by lazy { ArchiveAdapter(profileViewModel.loadDataArchive())}

            viewArchive.apply {
                adapter = archiveAdapter
                layoutManager = LinearLayoutManager(this@ProfileActivity, LinearLayoutManager.HORIZONTAL, false)
            }


        }

    }
}