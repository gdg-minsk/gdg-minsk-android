package com.gdg.home_module.di

import com.gdg.home_module.model.DefaultHomeModel
import com.gdg.home_module.model.HomeModel
import com.gdg.home_module.viewmodel.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

class HomeModule {}

val homeModule = module {
    factory { DefaultHomeModel() as HomeModel }
    viewModel { HomeViewModel(get()) }
}
