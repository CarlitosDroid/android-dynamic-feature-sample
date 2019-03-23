package com.spidev.core.dagger

import com.spidev.core.detail.DetailDataModule
import dagger.Component

@Component(
    modules = [
        DetailDataModule::class
    ]
)
interface CoreComponent {

    @Component.Builder interface Builder {
        fun build(): CoreComponent
    }
}