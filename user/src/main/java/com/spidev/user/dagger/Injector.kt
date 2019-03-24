package com.spidev.user.dagger

import com.spidev.core.dagger.SharedPreferencesModule
import com.spidev.friends.app.FriendsApplication
import com.spidev.user.UserActivity

fun UserActivity.inject() {

    DaggerUserComponent.builder()
        .coreComponent(FriendsApplication.coreComponent(this))
        .sharePreferencesModule(SharedPreferencesModule(this))
        .userModule(UserModule(this))
        .build()
        .inject(this)

}