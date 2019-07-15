package com.gdg.home_module.model

import com.gdg.domain.Event
import com.gdg.domain.constant.Constants
import java.util.*

class DefaultHomeModel : HomeModel {

    private val stubEvent =
        Event("Event name", Date(1563215804L), arrayOf(Constants.Label.ANDROID, Constants.Label.ANDROID), null)

    override fun getUpcomingEvents(): List<Event> {
        return listOf(stubEvent,stubEvent,stubEvent)
    }

    override fun getPassedEvents(): List<Event> {
        return listOf(stubEvent,stubEvent,stubEvent)
    }
}