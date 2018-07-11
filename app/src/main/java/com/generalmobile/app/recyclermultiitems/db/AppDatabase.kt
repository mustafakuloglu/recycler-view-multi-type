package com.generalmobile.app.recyclermultiitems.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.generalmobile.app.recyclermultiitems.db.dao.ExampleDao
import com.generalmobile.app.recyclermultiitems.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}