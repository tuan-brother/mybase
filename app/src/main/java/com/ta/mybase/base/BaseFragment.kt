package com.ta.mybase.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<T : ViewBinding> : Fragment() {
    lateinit var viewBinding: ViewBinding

    abstract fun getViewBinding(): T

    open fun getData() {}

    abstract fun initView()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = getViewBinding()
        getData()
        initView()
        return viewBinding.root
    }
}