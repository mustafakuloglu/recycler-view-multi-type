package com.generalmobile.app.recyclermultiitems.ui.main

import android.app.Application
import android.databinding.ObservableArrayList
import android.databinding.ObservableList
import com.generalmobile.app.recyclermultiitems.db.AppDatabase
import com.generalmobile.app.recyclermultiitems.R
import com.generalmobile.app.recyclermultiitems.App
import com.generalmobile.app.recyclermultiitems.core.BaseViewModel
import com.generalmobile.app.recyclermultiitems.core.ListProvider
import com.generalmobile.app.recyclermultiitems.db.entities.BaseRecyclerEntity
import javax.inject.Inject

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
     val list: ObservableList<BaseRecyclerEntity> = ObservableArrayList()

    fun create(){
        list.addAll(ListProvider().getList())
    }

}