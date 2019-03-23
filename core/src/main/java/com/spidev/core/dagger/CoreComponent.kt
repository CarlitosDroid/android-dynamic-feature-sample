package com.spidev.core.dagger

import dagger.Component

@Component(
    modules = [
        DesignerNewsDataModule::class
    ]
)
interface CoreComponent {

    @Component.Builder interface Builder {
        fun build(): CoreComponent
    }
}