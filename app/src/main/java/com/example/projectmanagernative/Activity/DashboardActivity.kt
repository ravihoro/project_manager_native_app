package com.example.projectmanagernative.Activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmanagernative.Adapter.OngoingAdapter
import com.example.projectmanagernative.R
import com.example.projectmanagernative.ViewModel.MainViewModel
import com.example.projectmanagernative.databinding.ActivityMainBinding
import com.example.projectmanagernative.ui.theme.ProjectManagerNativeTheme

class DashboardActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val ongoingAdapter by lazy{OngoingAdapter(mainViewModel.loadData())}

            viewOngoing.apply {
                adapter = ongoingAdapter

                layoutManager = GridLayoutManager(this@DashboardActivity,2 )
            }

        }

    }
}

