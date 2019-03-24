package com.spidev.friends.dagger

import com.spidev.core.dagger.*
import com.spidev.friends.MainActivity
import dagger.Component

@Component(modules = [MainModule::class], dependencies = [CoreComponent::class])
interface MainComponent : BaseComponent<MainActivity> {

    @Component.Builder
    interface Builder {

        fun build(): MainComponent
        fun coreComponent(module: CoreComponent): Builder
        fun coreGsonModule(module: CoreGsonModule): Builder
        fun coreOkHttpModule(module: CoreOkHttpModule): Builder
        fun sharePreferencesModule(module: SharedPreferencesModule): Builder
        fun mainModule(module: MainModule): Builder
    }
}