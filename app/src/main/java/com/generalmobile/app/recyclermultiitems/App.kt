package com.generalmobile.app.recyclermultiitems

import com.generalmobile.app.recyclermultiitems.di.component.DaggerApplicationComponent
import com.generalmobile.app.recyclermultiitems.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

