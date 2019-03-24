package com.spidev.core.dagger

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
class SharedPreferencesModule(val context: Context, val name: String) {

    @Provides
    fun provideSharedPreferences(): SharedPreferences {
        return context.applicationContext.getSharedPreferences(name, Context.MODE_PRIVATE)
    }
}

/*@Module
class SharedPreferencesModule {


    @Provides
    fun provideSharedPreferences(application: Application): SharedPreferences =
        application.getSharedPreferences(FRIENDS_PREFERENCES, Context.MODE_PRIVATE)

    private companion object {
        private const val FRIENDS_PREFERENCES = "friends_preferences"
    }

}*/