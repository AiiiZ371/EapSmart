package com.example.eapsmartapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eapsmartapp.databinding.ActivityRecipesBinding


class Activity_Recipes : AppCompatActivity() {
    private lateinit var binding: ActivityRecipesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var isButtonPressed = false

        val buttonFats: Button = findViewById(R.id.btnfats)
        val buttonProteins: Button = findViewById(R.id.btnproteins)
        val buttonCarbohydrates: Button = findViewById(R.id.btncarbohydrates)
        val buttonVitamins: Button = findViewById(R.id.btnvitamins)
        val buttonMinerals: Button = findViewById(R.id.btnminerals)
        val buttonAddRecipes: Button = findViewById(R.id.btnaddrecipes)

        buttonFats.setOnClickListener{
            if(!isButtonPressed){
                buttonFats.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonFats.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonProteins.setOnClickListener{
            if(!isButtonPressed){
                buttonProteins.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonProteins.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonCarbohydrates.setOnClickListener{
            if(!isButtonPressed){
                buttonCarbohydrates.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonCarbohydrates.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonVitamins.setOnClickListener{
            if(!isButtonPressed){
                buttonVitamins.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonVitamins.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonMinerals.setOnClickListener{
            if(!isButtonPressed){
                buttonMinerals.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonMinerals.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        val productList: RecyclerView = findViewById(R.id.productList)
        val products = arrayListOf<Product>()


        buttonAddRecipes.setOnClickListener{
            val intent = Intent(this, Activity_Add_Recipes::class.java)
            startActivity(intent)
        }


    }
}