package com.spidev.core.dagger

import com.google.gson.Gson
import dagger.Module
import dagger.Provides

@Module
class CoreGsonModule {

    @Provides
    fun provideGson(): Gson = Gson()
}