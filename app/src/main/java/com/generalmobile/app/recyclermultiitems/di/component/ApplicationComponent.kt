package com.kuloglu.app.recyclermultiitems.di.component

import android.content.Context
import android.content.SharedPreferences
import com.kuloglu.app.recyclermultiitems.App
import com.kuloglu.app.recyclermultiitems.di.module.ApplicationModule
import com.kuloglu.app.recyclermultiitems.di.module.DatabaseModule
import com.kuloglu.app.recyclermultiitems.ui.main.MainActivityViewModel

import dagger.Component
import javax.inject.Singleton


@Singleton


@Component(modules = arrayOf(ApplicationModule::class,DatabaseModule::class))

interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
}
