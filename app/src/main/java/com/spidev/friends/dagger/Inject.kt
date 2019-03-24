package com.spidev.friends.dagger

import com.spidev.core.dagger.CoreOkHttpModule
import com.spidev.core.dagger.SharedPreferencesModule
import com.spidev.friends.MainActivity
import com.spidev.friends.app.FriendsApplication

fun MainActivity.inject() {
    DaggerMainComponent.builder()
        .coreComponent(FriendsApplication.coreComponent(this))
        .coreOkHttpModule(CoreOkHttpModule("BASEURL"))
        //.coreGsonModule(CoreGsonModule())
        .sharePreferencesModule(SharedPreferencesModule(this))
        .mainModule(MainModule(this))
        .build()
        .inject(this)

}