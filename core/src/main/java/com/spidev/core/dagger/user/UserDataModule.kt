package com.spidev.core.dagger.user

import com.spidev.core.user.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserDataModule {

    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepository()
    }

}