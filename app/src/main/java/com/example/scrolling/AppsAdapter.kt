package com.example.scrolling

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.scrolling.data.AppData
import com.example.scrolling.databinding.AppItemCardBinding

class AppsAdapter(val items: List<AppData>) : RecyclerView.Adapter<AppDataVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppDataVH {
        return AppDataVH(AppItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: AppDataVH, position: Int) {
        holder.binding.label.text = items[position].content
    }
}

class AppDataVH(val binding: AppItemCardBinding) : RecyclerView.ViewHolder(binding.root)
