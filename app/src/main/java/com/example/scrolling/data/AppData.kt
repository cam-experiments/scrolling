package com.example.scrolling.data

data class AppData(
    val content: String,
) {

    companion object {
        val dummyList = listOf(
            "Map Map ",
            "Map Map Map ",
            "Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map Map Map Map Map ",
            "Map Map ",
            "Map Map Map ",
            "Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map Map Map Map Map ",
            "Map Map ",
            "Map Map Map ",
            "Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map Map Map Map ",
            "Map Map Map Map Map Map Map Map Map Map Map Map Map Map Map ",
        ).map { AppData(it) }
    }
}