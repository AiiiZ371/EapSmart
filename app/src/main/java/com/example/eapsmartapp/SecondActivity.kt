package com.example.eapsmartapp

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.eapsmartapp.databinding.ActivityProfileBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnplantoday.setOnClickListener{
            val intent = Intent (this@SecondActivity, FourActivity::class.java)
            startActivity(intent)
        }

        binding.btncalculator.setOnClickListener{
            val intent = Intent (this@SecondActivity, FiveActivity::class.java)
            startActivity(intent)
        }

    }
}