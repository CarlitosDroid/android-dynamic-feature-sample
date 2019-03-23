package com.spidev.friends.dagger

import android.app.Activity
import android.content.Context
import com.spidev.core.dagger.CoreDataModule
import com.spidev.core.detail.DetailDataModule
import dagger.Module
import dagger.Provides

@Module(
    includes = [
        CoreDataModule::class,
        DetailDataModule::class
    ]
)
class MainModule(private val activity: Activity) {

    @Provides
    fun context(): Context = activity

    @Provides
    fun activity(): Activity = activity

}