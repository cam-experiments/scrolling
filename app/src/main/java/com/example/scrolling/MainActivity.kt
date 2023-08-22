package com.example.scrolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scrolling.data.AppData
import com.example.scrolling.data.RailData
import com.example.scrolling.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val railAdapter = AppsRailAdapter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rails.adapter = railAdapter
        railAdapter.updateList(RailData.dummyList.shuffled())
    }
}