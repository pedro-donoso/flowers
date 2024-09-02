package com.example.flowers.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.example.flowers.databinding.ActivityMainBinding

abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {

    protected lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        val view = binding.root
        setContentView(view)
        setupClickListeners()
    }

    protected abstract fun getViewBinding(): T

    protected abstract fun setupClickListeners()
}