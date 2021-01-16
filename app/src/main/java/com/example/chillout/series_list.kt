package com.example.chillout

data class series_list(var title:String)

object Supplier{

    val scifi_list: List<series_list>

        get() = listOf<series_list>(
            series_list("Umbrella Academy"),
            series_list("Stranger things"),
            series_list("The Hundred"),
            series_list("Dr. Who"),
            series_list("Person of Interest"),
            series_list("Agents of shields"),
            series_list("Black mirror"),
            series_list("Flash"),
            series_list("The Mandalorian"),
            series_list("Dexter lab")
        )

    val fantasy_list: List<series_list>
        get() = listOf<series_list>(
            series_list("Umbrella Academy"),
            series_list("Stranger things"),
            series_list("The Hundred"),
            series_list("Dr. Who"),
            series_list("Person of Interest"),
            series_list("Agents of shields"),
            series_list("Black mirror"),
            series_list("Flash"),
            series_list("The Mandalorian"),
            series_list("Dexter lab")
    )
}

