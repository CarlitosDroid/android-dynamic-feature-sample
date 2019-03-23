package com.spidev.friends.dagger

import com.spidev.core.dagger.BaseComponent
import com.spidev.core.dagger.CoreComponent
import com.spidev.core.dagger.CoreDataModule
import com.spidev.core.detail.DetailDataModule
import com.spidev.friends.MainActivity
import dagger.Component

@Component(modules = [MainModule::class], dependencies = [CoreComponent::class])
interface MainComponent : BaseComponent<MainActivity> {

    @Component.Builder
    interface Builder {

        fun build(): MainComponent
        fun coreComponent(module: CoreComponent): Builder
        fun coreDataModule(module: CoreDataModule): Builder
        fun designerNewsDataModule(module: DetailDataModule): Builder
        fun homeModule(module: MainModule): Builder
    }
}