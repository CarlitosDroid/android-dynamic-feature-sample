package com.spidev.friends.dagger

//import com.spidev.core.dagger.CoreOkHttpModule
//import com.spidev.core.dagger.CoreGsonModule
import com.spidev.core.dagger.CoreOkHttpModule
import com.spidev.core.dagger.SharedPreferencesModule
import com.spidev.friends.MainActivity
import com.spidev.friends.app.FriendsApplication

fun inject(
    activity: MainActivity
) {
    DaggerMainComponent.builder()
        .coreComponent(FriendsApplication.coreComponent(activity))
        .coreOkHttpModule(CoreOkHttpModule("BASEURL"))
        //.coreGsonModule(CoreGsonModule())
        .sharePreferencesModule(SharedPreferencesModule(activity, "MYSHARED"))
        .mainModule(MainModule(activity))
        .build()
        .inject(activity)

}