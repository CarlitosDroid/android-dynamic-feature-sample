package com.spidev.user.dagger

import android.content.Context
import com.spidev.core.dagger.SharedPreferencesModule
import com.spidev.user.UserActivity
import dagger.Module
import dagger.Provides

@Module(includes = [SharedPreferencesModule::class])
class UserModule(private val activity: UserActivity) {

    @Provides
    fun provideContext(): Context = activity

}