package com.example.vladyslavromanikdemo.core

import android.app.Application
import com.example.vladyslavromanikdemo.di.getModuleList
import com.example.vladyslavromanikdemo.di.logger.TimberLogger
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class TestApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        startKoin {
            TimberLogger()

            androidContext(this@TestApplication)
            modules(this@TestApplication.getModuleList())
        }
    }
}
