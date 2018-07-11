package com.generalmobile.app.recyclermultiitems.ui.main

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableField
import com.generalmobile.app.recyclermultiitems.db.entities.BaseRecyclerEntity
import com.generalmobile.app.recyclermultiitems.db.entities.Image

class MainActivityImageViewModel(app: Application) : AndroidViewModel(app) {
    val src: ObservableField<String> = ObservableField("")
    fun setItem(item: BaseRecyclerEntity?) {

        src.set((item as Image).url)

    }
}