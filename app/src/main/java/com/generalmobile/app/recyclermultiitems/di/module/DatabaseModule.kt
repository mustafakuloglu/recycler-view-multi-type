package com.generalmobile.app.recyclermultiitems.di.module

import android.arch.persistence.room.Room
import android.content.Context
import com.generalmobile.app.recyclermultiitems.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun getDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context,
                AppDatabase::class.java, "example-db").build()
    }

}