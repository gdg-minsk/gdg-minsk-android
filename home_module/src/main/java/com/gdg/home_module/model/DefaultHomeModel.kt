package com.gdg.home_module.model

import com.gdg.domain.dto.Event
import com.gdg.domain.constant.Constants
import com.gdg.domain.dto.Label
import com.gdg.home_module.R
import java.util.*

class DefaultHomeModel : HomeModel {

    //Constants.Label.ANDROID
    private val stubEvent =
        Event(
            "Event name",
            Date(1563215804L),
            listOf(Label("#ffffcc", "android"), Label("#ffffcc","android")),
            null
        )

    override fun getUpcomingEvents(): List<Event> {
        return listOf(stubEvent,stubEvent,stubEvent)
    }

    override fun getPassedEvents(): List<Event> {
        return listOf(stubEvent,stubEvent,stubEvent)
    }
}