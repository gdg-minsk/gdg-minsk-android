package com.gdg.minsk

import android.app.Application
import com.gdg.home_module.di.homeModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(homeModule)
        }
    }
}