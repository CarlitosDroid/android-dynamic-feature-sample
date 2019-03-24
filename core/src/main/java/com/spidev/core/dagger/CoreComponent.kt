package com.spidev.core.dagger

import dagger.Component

@Component(
    modules = [
        CoreGsonModule::class,
        SharedPreferencesModule::class]
)
interface CoreComponent {

    @Component.Builder
    interface Builder {
        fun build(): CoreComponent
        fun sharedPreferencesModuleModule(module: SharedPreferencesModule): Builder
    }
}