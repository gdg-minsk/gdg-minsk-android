package com.gdg.domain

import java.util.*

data class Meetup(

    val title: String,
    val type: Int,
    val date: Date,
    val duration: String,
    val description: String,
    val speakers: Array<Speaker>,
    val links: Array<String>

)