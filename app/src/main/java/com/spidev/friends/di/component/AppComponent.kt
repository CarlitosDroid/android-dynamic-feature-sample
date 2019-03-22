package com.spidev.friends.di.component

import android.app.Application
import com.example.core.BaseActivityComponent
import com.example.core.di.component.CoreComponent
import com.spidev.friends.MainActivity
import com.spidev.friends.di.modules.ActivityModule
import com.spidev.friends.di.modules.HandlerModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [ActivityModule::class],
    dependencies = [CoreComponent::class]
)
interface AppComponent : BaseActivityComponent<MainActivity> {

    @Component.Builder
    interface Builder {

        fun build(): AppComponent
        @BindsInstance fun mainActivity(activity: MainActivity): Builder
        fun coreComponent(module: CoreComponent): Builder
    }
}