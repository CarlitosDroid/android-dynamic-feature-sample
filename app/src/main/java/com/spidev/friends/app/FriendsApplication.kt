package com.spidev.friends.app

import android.app.Activity
import android.app.Application
import android.content.Context
import com.example.core.di.component.CoreComponent
import com.spidev.friends.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/*class FriendsApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder().application(this).build()
}*/

class FriendsApplication : Application() {

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent
            .create()
    }

    companion object {
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as FriendsApplication).coreComponent
    }
}

fun Activity.coreComponent() = FriendsApplication.coreComponent(this)