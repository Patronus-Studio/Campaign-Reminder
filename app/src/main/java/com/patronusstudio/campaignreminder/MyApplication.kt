package com.patronusstudio.campaignreminder

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @author iamcodder
 * Created 30.11.2024 at 15:21
 */
@HiltAndroidApp
class MyApplication:Application() {

    override fun onCreate() {
        super.onCreate()
    }
}