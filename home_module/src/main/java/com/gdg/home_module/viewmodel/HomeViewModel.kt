package com.gdg.home_module.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gdg.domain.Event
import com.gdg.home_module.model.HomeModel
import com.gdg.home_module.view.HomeData

class HomeViewModel(val model: HomeModel) : ViewModel(), HomeData {

    private val upcomingEvents = MutableLiveData<Event>()
   // internal get() {}

    private val passedEvents = MutableLiveData<Event>()

    override fun getUpcommingEvents(): LiveData<Event> = upcomingEvents

    override fun getPassedEvents(): LiveData<Event> = passedEvents

}
