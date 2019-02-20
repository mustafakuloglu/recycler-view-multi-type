package com.kuloglu.app.recyclermultiitems.ui.main

import android.app.Application
import android.databinding.ObservableArrayList
import android.databinding.ObservableList
import com.kuloglu.app.recyclermultiitems.core.BaseViewModel
import com.kuloglu.app.recyclermultiitems.core.ListProvider
import com.kuloglu.app.recyclermultiitems.db.entities.BaseRecyclerEntity

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
     val list: ObservableList<BaseRecyclerEntity> = ObservableArrayList()

    fun create(){
        list.addAll(ListProvider().getList())
    }

}