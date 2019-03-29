package com.spidev.friends.dagger

import android.app.Activity
import android.content.Context
import com.spidev.core.dagger.CoreOkHttpModule
import com.spidev.core.dagger.CoreGsonModule
import com.spidev.core.dagger.SharedPreferencesModule
import com.spidev.core.dagger.user.UserDataModule
import dagger.Module
import dagger.Provides

@Module
    (
    includes = [
        CoreGsonModule::class,
        CoreOkHttpModule::class,
        SharedPreferencesModule::class,
        UserDataModule::class
    ]
)
class MainModule(private val activity: Activity) {

    @Provides
    fun context(): Context = activity

    @Provides
    fun activity(): Activity = activity

}