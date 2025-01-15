package com.example.eapsmartapp

import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.eapsmartapp.databinding.ActivityCalculatorBinding

class Activity_Calculator : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var isButtonPressed = false

        val buttonCreatePlan: Button = findViewById(R.id.btncreateplan)
        val buttonCardio: Button = findViewById(R.id.btncardio)
        val buttonPilates: Button = findViewById(R.id.btnpilates)
        val buttonStrength: Button = findViewById(R.id.btnstrenght)
        val buttonYoga: Button = findViewById(R.id.btnyoga)
        val buttonDance: Button = findViewById(R.id.btndance)
        val buttonAerobics: Button = findViewById(R.id.btnaerobics)
        val editCalories: EditText = findViewById(R.id.editcalories)

        buttonCardio.setOnClickListener{
            if(!isButtonPressed){
                buttonCardio.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonCardio.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonPilates.setOnClickListener{
            if(!isButtonPressed){
                buttonPilates.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonPilates.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonStrength.setOnClickListener{
            if(!isButtonPressed){
                buttonStrength.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonStrength.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonYoga.setOnClickListener{
            if(!isButtonPressed){
                buttonYoga.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonYoga.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonDance.setOnClickListener{
            if(!isButtonPressed){
                buttonDance.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonDance.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }

        buttonAerobics.setOnClickListener{
            if(!isButtonPressed){
                buttonAerobics.setBackgroundResource(R.drawable.shape_rounded_variants_pressed)
                isButtonPressed = true
            }
            else{
                buttonAerobics.setBackgroundResource(R.drawable.shape_rounded_variants)
                isButtonPressed = false
            }
        }


        buttonCreatePlan.setOnClickListener{
            val intent = Intent (this, Activity_PlanToDay::class.java)
            startActivity(intent)
        }

        editCalories.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (editCalories.text.isNotEmpty()) {
                    editCalories.setTextColor(Color.BLACK)
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        buttonCreatePlan.setOnClickListener{
            val intent = Intent (this, Activity_PlanToDay::class.java)
            startActivity(intent)
        }

    }
}