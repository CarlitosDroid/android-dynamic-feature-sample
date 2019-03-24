package com.spidev.user.dagger

import com.spidev.core.dagger.BaseComponent
import com.spidev.core.dagger.CoreComponent
import com.spidev.core.dagger.SharedPreferencesModule
import com.spidev.user.UserActivity
import dagger.Component

@Component(modules = [UserModule::class], dependencies = [CoreComponent::class])
interface UserComponent : BaseComponent<UserActivity> {

    @Component.Builder
    interface Builder {
        fun build(): UserComponent
        fun coreComponent(component: CoreComponent): Builder
        fun userModule(component: UserModule): Builder
        fun sharePreferencesModule(module: SharedPreferencesModule): Builder
    }
}