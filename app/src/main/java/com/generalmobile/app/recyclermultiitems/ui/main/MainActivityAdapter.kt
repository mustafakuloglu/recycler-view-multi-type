package com.kuloglu.app.recyclermultiitems.ui.main

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.kuloglu.app.recyclermultiitems.App
import com.kuloglu.app.recyclermultiitems.R
import com.kuloglu.app.recyclermultiitems.core.Type
import com.kuloglu.app.recyclermultiitems.databinding.ItemHeaderBinding
import com.kuloglu.app.recyclermultiitems.databinding.ItemImageBinding
import com.kuloglu.app.recyclermultiitems.db.entities.BaseRecyclerEntity
import com.kuloglu.app.recyclermultiitems.db.entities.Header
import com.kuloglu.app.recyclermultiitems.db.entities.Image

class MainActivityAdapter : ListAdapter<BaseRecyclerEntity, RecyclerView.ViewHolder>(object : DiffUtil.ItemCallback<BaseRecyclerEntity>() {
    override fun areItemsTheSame(oldItem: BaseRecyclerEntity, newItem: BaseRecyclerEntity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: BaseRecyclerEntity, newItem: BaseRecyclerEntity): Boolean {
        return oldItem == newItem
    }

}) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = ViewHolder(createBinding(parent, viewType))

    override fun getItemViewType(position: Int) = getItem(position).type

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItem(position).type) {
            Type.HEADER -> ((holder as ViewHolder).binding as ItemHeaderBinding).viewModel?.setItem(getItem(position) as Header)
            Type.IMAGE -> ((holder as ViewHolder).binding as ItemImageBinding).viewModel?.setItem(getItem(position) as Image)
        }
        
    }

    private fun createBinding(parent: ViewGroup, viewType: Int) =
            when (viewType) {
            Type.HEADER -> {
                val viewModel = MainActivityHeaderViewModel(parent.context.applicationContext as App)
                val binding = DataBindingUtil.inflate<ItemHeaderBinding>(LayoutInflater.from(parent.context), R.layout.item_header, parent, false)
                binding.viewModel = viewModel
                binding
            }
            else -> {
                val viewModel = MainActivityImageViewModel(parent.context.applicationContext as App)
                val binding = DataBindingUtil.inflate<ItemImageBinding>(LayoutInflater.from(parent.context), R.layout.item_image, parent, false)
                binding.viewModel = viewModel
                binding
            }
        }



    class ViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

}