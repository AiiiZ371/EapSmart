package com.example.eapsmartapp

import android.content.Context
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.eapsmartapp.databinding.ActivityLoginBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter.setOnClickListener{
            val intent = Intent (this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener{
            val intent = Intent (this@MainActivity, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}