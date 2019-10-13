package com.gdg.domain.dto

import com.gdg.domain.dto.Speaker
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