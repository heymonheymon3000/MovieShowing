package com.example.movieshowing

import android.app.Application
import timber.log.Timber

class MovieShowingApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}