package com.spidev.friends.dagger

import com.spidev.core.dagger.CoreDataModule
import com.spidev.core.detail.DetailDataModule
import com.spidev.friends.MainActivity
import com.spidev.friends.app.FriendsApplication

fun inject(
    activity: MainActivity
) {
    DaggerMainComponent.builder()
        .coreComponent(FriendsApplication.coreComponent(activity))
        .coreDataModule(CoreDataModule("BASEURL"))
        .designerNewsDataModule(DetailDataModule())
        .build()
        .inject(activity)
}