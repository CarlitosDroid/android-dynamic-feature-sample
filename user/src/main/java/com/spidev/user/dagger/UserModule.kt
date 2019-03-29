package com.spidev.user.dagger

import android.content.Context
import androidx.lifecycle.ViewModelProviders
import com.spidev.core.dagger.CoreGsonModule
import com.spidev.core.dagger.SharedPreferencesModule
import com.spidev.core.dagger.user.UserDataModule
import com.spidev.core.user.UserRepository
import com.spidev.user.UserActivity
import com.spidev.user.UserViewModel
import com.spidev.user.UserViewModelFactory
import dagger.Module
import dagger.Provides

@Module(
    includes = [SharedPreferencesModule::class,
        UserDataModule::class,
        CoreGsonModule::class]
)
class UserModule(private val activity: UserActivity) {

    @Provides
    fun provideContext(): Context = activity

    @Provides
    fun provideUserViewModel(factory: UserViewModelFactory): UserViewModel {
        return ViewModelProviders.of(activity, factory).get(UserViewModel::class.java)
    }

    @Provides
    fun provideUserViewModelFactory(userRepository: UserRepository): UserViewModelFactory {
        return UserViewModelFactory(userRepository)
    }

}