package com.spidev.friends.di.modules

import com.spidev.friends.MainHandler
import dagger.Module
import dagger.Provides

@Module
class HandlerModule {

    @Provides
    fun provideHandler(): MainHandler {
        return MainHandler()
    }
}