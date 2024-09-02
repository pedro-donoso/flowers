package com.example.flowers

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.flowers.databinding.ActivityMainBinding
import com.example.flowers.ui.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(), View.OnClickListener {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnSubmit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        // Código a ejecutar cuando se hace clic en el botón
        Toast.makeText(this, "Botón presionado!", Toast.LENGTH_SHORT).show()
    }
}
