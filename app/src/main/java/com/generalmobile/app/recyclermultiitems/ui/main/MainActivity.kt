package com.kuloglu.app.recyclermultiitems.ui.main

import com.kuloglu.app.recyclermultiitems.R
import com.kuloglu.app.recyclermultiitems.core.BaseActivity
import com.kuloglu.app.recyclermultiitems.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {
    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
        binding.viewModel?.create()
        binding.recyclerView.adapter = MainActivityAdapter()

    }

    override fun getLayoutRes() = R.layout.activity_main
}
