package com.gdg.domain

import java.text.DateFormat
import java.util.*

data class Event(

    val title: String,
    val date: Date,
    val labels: Array<Int>,
    val meetups: Array<Meetup>?
) {

    fun getDateInFormat(format: Int = DateFormat.LONG) =
        DateFormat.getDateInstance(format).format(date)

}