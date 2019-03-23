package com.spidev.core.detail

import com.google.gson.Gson
import dagger.Module
import dagger.Provides

@Module
class DetailDataModule {

    @Provides
    fun provideGson(): Gson = Gson()
}