package com.example.flowers.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

interface OnItemClickListener {
    fun onClick(v: View)
}

abstract class BaseActivity<T : ViewBinding> : AppCompatActivity(), OnItemClickListener {

    protected lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        val view = binding.root
        setContentView(view)
    }

    protected abstract fun getViewBinding(): T
}