package com.kuloglu.app.recyclermultiitems

import com.kuloglu.app.recyclermultiitems.di.component.DaggerApplicationComponent
import com.kuloglu.app.recyclermultiitems.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

