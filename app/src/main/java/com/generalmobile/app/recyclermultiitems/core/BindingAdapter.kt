package com.generalmobile.app.recyclermultiitems.core

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.generalmobile.app.recyclermultiitems.db.entities.BaseRecyclerEntity
import com.generalmobile.app.recyclermultiitems.ui.main.MainActivityAdapter
import com.squareup.picasso.Picasso

object BindingAdapter {
    @JvmStatic
    @BindingAdapter("app:set_src")
    fun setSrc(imageView: ImageView, path: String) {
        if (path.isNotEmpty()) {
            Picasso.get().load(path).into(imageView)
        }
    }


    @JvmStatic
    @BindingAdapter("app:set_list")
    fun setList(recyclerView: RecyclerView, list: List<BaseRecyclerEntity>?) {
        val adapter = recyclerView.adapter as MainActivityAdapter
        list?.let {
            adapter.submitList(list)
        }
    }


}