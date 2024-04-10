package com.example.projectmanagernative.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmanagernative.databinding.ViewholderArchiveBinding

class ArchiveAdapter(private val archives: List<String>) : RecyclerView.Adapter<ArchiveAdapter.ArchiveViewHolder>(){

    inner class ArchiveViewHolder(val binding: ViewholderArchiveBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(archive: String) {
            binding.apply {
                titleTxt.text = archive
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArchiveViewHolder {
        return ArchiveViewHolder(
            ViewholderArchiveBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return archives.size
    }

    override fun onBindViewHolder(holder: ArchiveViewHolder, position: Int) {
        val archive = archives[position]
        holder.bind(archive)
    }

}