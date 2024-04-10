package com.example.projectmanagernative.Adapter

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectmanagernative.Domain.OngoingDomain
import com.example.projectmanagernative.R
import com.example.projectmanagernative.databinding.ViewholderOngoingBinding

class OngoingAdapter (private val items: List<OngoingDomain>) : RecyclerView.Adapter<OngoingAdapter.OngoingViewHolder>(){

    inner class OngoingViewHolder(private val binding: ViewholderOngoingBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: OngoingDomain, position: Int) {
            var colorRes: Int

           binding.apply {
               if(position == 0){
                   layout.setBackgroundResource(R.drawable.dark_bg)
                   colorRes = R.color.white
               }else{
                   layout.setBackgroundResource(R.drawable.light_purple_background)
                   colorRes = R.color.dark_purple
               }

               titleTxt.text = item.title
               dateTxt.text = item.date
               percentTxt.text = "${item.progressPercent}%"
               val drawableResourceId = itemView.resources.getIdentifier(
                    item.picPath, "drawable", itemView.context.packageName
               )

                Glide.with(itemView.context).load(drawableResourceId).into(pic)

                progressBar.progress = item.progressPercent

                titleTxt.setTextColor(itemView.context.getColor(colorRes))
                titleTxt.setTextColor(itemView.context.getColor(colorRes))
                dateTxt.setTextColor(itemView.context.getColor(colorRes))
                progressTxt.setTextColor(itemView.context.getColor(colorRes))
                percentTxt.setTextColor(itemView.context.getColor(colorRes))
                pic.setColorFilter(ContextCompat.getColor(itemView.context, colorRes), PorterDuff.Mode.SRC_IN)
                progressBar.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(itemView.context,colorRes))
           }
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OngoingViewHolder {
        return OngoingViewHolder(
            ViewholderOngoingBinding.inflate(
                LayoutInflater.from(parent.context), parent, false,
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: OngoingViewHolder, position: Int) {
        var item = items[position]
        holder.bind(item, position)
    }
}