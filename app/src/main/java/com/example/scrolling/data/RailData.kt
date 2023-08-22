package com.example.scrolling.data

data class RailData(
    val title: String,
    val items: List<AppData>,
) {

    companion object {
        val dummyList = listOf(
            "My Apps",
            "Recommendations",
            "User Awards",
            "Multiplayer games",
            "My Apps",
            "Recommendations",
            "User Awards",
            "Multiplayer games",
            "My Apps",
            "Recommendations",
            "User Awards",
            "Multiplayer games",
        ).map { RailData(it, AppData.dummyList.shuffled()) }
    }
}