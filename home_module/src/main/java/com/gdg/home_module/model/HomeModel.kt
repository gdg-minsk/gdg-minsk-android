package com.gdg.home_module.model

import com.gdg.domain.dto.Event

interface HomeModel {
    fun getUpcomingEvents():List<Event>
    fun getPassedEvents():List<Event>
}