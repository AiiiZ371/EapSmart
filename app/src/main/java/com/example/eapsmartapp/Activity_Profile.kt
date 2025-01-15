package com.example.eapsmartapp

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eapsmartapp.databinding.ActivityProfileBinding

class Activity_Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonPlanToDay: Button = findViewById(R.id.btnplantoday)
        val buttonCalculator: Button = findViewById(R.id.btncalculator)
        val buttonRecipes: Button = findViewById(R.id.btnrecipes)
        val userName: TextView = findViewById(R.id.username)



       // userName.setText(text: )

        buttonCalculator.setOnClickListener{
            val intent = Intent(this, Activity_Calculator::class.java)
            startActivity(intent)
        }

        buttonPlanToDay.setOnClickListener{
            val intent = Intent(this, Activity_PlanToDay::class.java)
            startActivity(intent)
        }

        buttonRecipes.setOnClickListener{
            val intent = Intent(this, Activity_Recipes::class.java)
            startActivity(intent)
        }

    }
}