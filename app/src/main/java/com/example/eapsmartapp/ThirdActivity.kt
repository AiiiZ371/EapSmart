package com.example.eapsmartapp

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.eapsmartapp.databinding.LayoutRegisterBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: LayoutRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegReg.setOnClickListener{
            val intent = Intent (this@ThirdActivity, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}