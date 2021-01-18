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
            series_list("Agents of the S.H.I.E.L.D."),
            series_list("Black mirror"),
            series_list("Flash"),
            series_list("The Mandalorian"),
            series_list("Dexter lab")
        )
    val fantasy_list: List<series_list>

        get() = listOf<series_list>(
                series_list("Vampire Diaries"),
                series_list("Game Of Thrones"),
                series_list("The Originals"),
                series_list("Legacies"),
                series_list("Teen Wolf"),
                series_list("The Chilling Adventures of Sabrina"),
                series_list("The Shadowhunters"),
                series_list("The Witcher"),
                series_list("Titans"),
                series_list("American Gods")
        )
    val horror_list: List<series_list>

        get() = listOf<series_list>(
                series_list("Haunting of the Hill House"),
                series_list("Preacher"),
                series_list("Another"),
                series_list("Castle Rock"),
                series_list("Walking dead"),
                series_list("Haunting of the BLY Manor"),
                series_list("Ghoul"),
                series_list("Marianne"),
                series_list("The Purge"),
                series_list("Locke & Key")
        )
    val comedy_list: List<series_list>

        get() = listOf<series_list>(
                series_list("Friends"),
                series_list("Big Bang Theory"),
                series_list("Brooklyn Nine-Nine"),
                series_list("Suits"),
                series_list("How I Met Your Mother"),
                series_list("Family Guy"),
                series_list("Two and a half men"),
                series_list("Sex Education"),
                series_list("The Simpsons"),
                series_list("Modern Family")
        )
    val drama_list: List<series_list>

        get() = listOf<series_list>(
                series_list("Gossip Girl"),
                series_list("Money Heist"),
                series_list("You"),
                series_list("Breaking Bad"),
                series_list("Grey's Anatomy"),
                series_list("13 Reasons Why"),
                series_list("House of Cards"),
                series_list("Mr.Robert"),
                series_list("The Crown"),
                series_list("Criminal Justice")
        )
    val adventure_list: List<series_list>

        get() = listOf<series_list>(
                series_list("The Flash"),
                series_list("Rick and Morty"),
                series_list("Naruto"),
                series_list("Star Trek: The Original Series"),
                series_list("Cursed"),
                series_list("Dr.Stone"),
                series_list("Highschool of the Dead"),
                series_list("Once Upon a Time"),
                series_list("Arrow"),
                series_list("Marco Polo")
        )
}

