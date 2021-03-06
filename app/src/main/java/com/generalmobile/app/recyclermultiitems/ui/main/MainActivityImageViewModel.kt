package com.kuloglu.app.recyclermultiitems.ui.main

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableField
import com.kuloglu.app.recyclermultiitems.db.entities.Image

class MainActivityImageViewModel(app: Application) : AndroidViewModel(app) {
    val src: ObservableField<String> = ObservableField("")
    fun setItem(item: Image) = src.set(item .url)

}