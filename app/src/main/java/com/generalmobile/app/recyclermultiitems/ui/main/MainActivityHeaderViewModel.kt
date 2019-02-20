package com.kuloglu.app.recyclermultiitems.ui.main

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableField
import com.kuloglu.app.recyclermultiitems.db.entities.Header

class MainActivityHeaderViewModel(app: Application) : AndroidViewModel(app) {
    val header: ObservableField<String> = ObservableField("")
    fun setItem(item: Header) = header.set(item.header)
    }