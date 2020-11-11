package ru.neti.arch.app

import android.app.Application

class NetiApp : Application() {


    override fun onCreate() {
        super.onCreate()
        initCrashlytics()
        initLeakCanary()
    }


    private fun initCrashlytics() {
        //TODO:#1 добавить инициализацию Crashlytics
    }

    private fun initLeakCanary() {
        //TODO:#2 добавить инициализацию leakCanary
    }

}