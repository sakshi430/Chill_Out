package com.example.chillout

data class scifi_list(var title:String)

object Supplier{

    val artists_list: List<scifi_list>

        get() = listOf<scifi_list>(
            scifi_list("Umbrella Academy"),
            scifi_list("Stranger things"),
            scifi_list("The Hundred"),
            scifi_list("Dr. Who"),
            scifi_list("Person of Interest"),
            scifi_list("Agents of shields"),
            scifi_list("Black mirror"),
            scifi_list("Flash"),
            scifi_list("The Mandlorian"),
            scifi_list("Dexter lab")
        )
}

