package com.spidev.friends.dagger

import android.app.Activity
import android.content.Context
import com.spidev.core.dagger.CoreDataModule
import com.spidev.core.dagger.DesignerNewsDataModule
import dagger.Module
import dagger.Provides

@Module(
    includes = [
        CoreDataModule::class,
        DesignerNewsDataModule::class
    ]
)
class MainModule(private val activity: Activity) {

    @Provides
    fun context(): Context = activity

    @Provides
    fun activity(): Activity = activity

}