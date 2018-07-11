package com.generalmobile.app.recyclermultiitems.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.generalmobile.app.recyclermultiitems.R
import com.generalmobile.app.recyclermultiitems.core.BaseActivity
import com.generalmobile.app.recyclermultiitems.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {
    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
        binding.viewModel?.create()
        binding.recyclerView.adapter = MainActivityAdapter()

    }

    override fun getLayoutRes() = R.layout.activity_main
}
