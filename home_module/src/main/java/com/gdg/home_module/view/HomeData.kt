package com.gdg.home_module.view

import androidx.lifecycle.LiveData
import com.gdg.domain.Event


interface HomeData {
    val upcommingEvents:LiveData<List<Event>>
    val passedEvents:LiveData<List<Event>>
}