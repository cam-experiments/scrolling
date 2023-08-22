package com.example.scrolling

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.scrolling.data.AppData
import com.example.scrolling.data.RailData
import com.example.scrolling.databinding.AppItemCardBinding
import com.example.scrolling.databinding.AppRailsBinding

class AppsRailAdapter : RecyclerView.Adapter<AppsRailDataVH>() {

    private val items: MutableList<RailData> = mutableListOf()
    private val appsAdapters: MutableList<AppsAdapter> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppsRailDataVH {
        return AppsRailDataVH(AppRailsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = items.size

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: AppsRailDataVH, position: Int) {
        with(holder.binding) {
            title.text = items[position].title
            apps.adapter = appsAdapters[position]
            appsAdapters[position].notifyDataSetChanged()
        }
    }

    fun updateList(incoming: List<RailData>) {
        this.items.clear()
        this.items.addAll(incoming)
        appsAdapters.clear()
        for (item in items) {
            appsAdapters.add(AppsAdapter(item.items))
        }
        notifyDataSetChanged()
    }

}

class AppsRailDataVH(val binding: AppRailsBinding) : RecyclerView.ViewHolder(binding.root)
