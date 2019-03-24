package com.spidev.core.dagger

import dagger.Component

@Component(
    modules = [
        CoreGsonModule::class,
        CoreOkHttpModule::class,
        SharedPreferencesModule::class]
)
interface CoreComponent {

    @Component.Builder
    interface Builder {
        fun build(): CoreComponent
        fun coreOkHttpModule(module: CoreOkHttpModule): Builder
        fun sharedPreferencesModuleModule(module: SharedPreferencesModule): Builder
    }
}