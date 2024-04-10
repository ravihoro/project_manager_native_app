package com.example.projectmanagernative.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmanagernative.Domain.TeamDomain
import com.example.projectmanagernative.databinding.ViewholderTeamBinding

class MyTeamAdapter(private val teams: List<TeamDomain>): RecyclerView.Adapter<MyTeamAdapter.MyTeamViewHolder>() {

    inner class MyTeamViewHolder(val binding: ViewholderTeamBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(team: TeamDomain) {
            binding.apply {
                titleTxt.text =  team.title
                statusTxt.text = team.status
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyTeamViewHolder {
        return MyTeamViewHolder(
            ViewholderTeamBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
       return teams.size
    }

    override fun onBindViewHolder(holder: MyTeamViewHolder, position: Int) {
        val team = teams[position]
        holder.bind(team)
    }

}