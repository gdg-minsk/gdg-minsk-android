package com.gdg.home_module.view

import androidx.lifecycle.LiveData
import com.gdg.domain.Event


interface HomeData {
    fun getUpcommingEvents():LiveData<Event>
    fun getPassedEvents():LiveData<Event>
}