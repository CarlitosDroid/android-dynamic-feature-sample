package com.example.core.di.module

import com.example.core.user.UserHandler
import dagger.Module
import dagger.Provides


class HandlerModule {
    @Provides
    fun provideUserHandler() = UserHandler()
}