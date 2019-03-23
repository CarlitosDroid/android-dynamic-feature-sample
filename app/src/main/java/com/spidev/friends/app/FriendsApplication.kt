package com.spidev.friends.app

import android.app.Application
import android.content.Context
import com.spidev.core.dagger.CoreComponent
import com.spidev.core.dagger.DaggerCoreComponent

class FriendsApplication : Application() {

    val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent
            .builder()
            .build()
    }

    companion object {
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as FriendsApplication).coreComponent
    }
}