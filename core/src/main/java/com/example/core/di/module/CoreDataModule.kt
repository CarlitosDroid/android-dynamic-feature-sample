package com.example.core.di.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides

/**
 * Dagger module to provide core data functionality.
 */

class CoreDataModule {
    @Provides
    fun provideGson(): Gson = Gson()
}
