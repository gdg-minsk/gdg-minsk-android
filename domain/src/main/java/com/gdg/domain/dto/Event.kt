package com.gdg.domain.dto

import com.gdg.domain.dto.Label
import com.gdg.domain.dto.Meetup
import java.text.DateFormat
import java.util.*

data class Event(

    val title: String,
    val date: Date,
    val labels: List<Label>,
    val meetups: List<Meetup>?
) {

    fun getDateInFormat(format: Int = DateFormat.LONG) =
        DateFormat.getDateInstance(format).format(date)

}