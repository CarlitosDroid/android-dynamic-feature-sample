package com.spidev.user.dagger

import android.content.Context
import androidx.lifecycle.ViewModelProviders
import com.spidev.core.dagger.SharedPreferencesModule
import com.spidev.user.UserActivity
import com.spidev.user.UserViewModel
import com.spidev.user.UserViewModelFactory
import dagger.Module
import dagger.Provides

@Module(includes = [SharedPreferencesModule::class])
class UserModule(private val activity: UserActivity) {

    @Provides
    fun provideContext(): Context = activity

    @Provides
    fun provideUserViewModelFactory(): UserViewModelFactory = UserViewModelFactory()

    @Provides
    fun provideUserViewModel(userViewModelFactory: UserViewModelFactory): UserViewModel =
        ViewModelProviders.of(activity, userViewModelFactory).get(UserViewModel::class.java)

}