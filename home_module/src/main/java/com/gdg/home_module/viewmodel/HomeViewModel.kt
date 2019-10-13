package com.gdg.home_module.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gdg.domain.dto.Event
import com.gdg.home_module.model.HomeModel
import com.gdg.home_module.view.HomeData

class HomeViewModel(val model: HomeModel) : ViewModel(), HomeData {

    private var mutableUpcomingEvents = MutableLiveData<List<Event>>()
        get() {
             field.value = model.getUpcomingEvents()
            return field
        }

    private var mutablePassedEvents = MutableLiveData<List<Event>>()
        get() {
            field.value = model.getUpcomingEvents()
            return field
        }


    val stub = 0
    override val upcommingEvents: LiveData<List<Event>> = mutableUpcomingEvents

    override val passedEvents: LiveData<List<Event>> = mutablePassedEvents


}
