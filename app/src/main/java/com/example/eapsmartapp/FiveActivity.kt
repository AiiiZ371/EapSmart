package com.example.eapsmartapp

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.eapsmartapp.databinding.ActivityCalculatorBinding

class FiveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncreateplan.setOnClickListener{
            val intent = Intent (this@FiveActivity, FourActivity::class.java)
            startActivity(intent)
        }
    }
}