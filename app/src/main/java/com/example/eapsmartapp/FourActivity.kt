package com.example.eapsmartapp

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.eapsmartapp.databinding.ActivityPlantodayBinding

class FourActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlantodayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlantodayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}