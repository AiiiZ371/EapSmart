package com.example.eapsmartapp

import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.eapsmartapp.databinding.ActivityLoginBinding

class Activity_Login : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userLoginEnter: EditText = findViewById(R.id.ettLogin)
        val userPasswordEnter: EditText = findViewById(R.id.etPassword)
        val buttonEnter: Button = findViewById(R.id.btnEnter)
        val buttonRegister: Button = findViewById(R.id.btnRegister)

        userLoginEnter.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (userLoginEnter.text.isNotEmpty()) {
                    userLoginEnter.setTextColor(Color.BLACK)
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        userPasswordEnter.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (userPasswordEnter.text.isNotEmpty()) {
                    userPasswordEnter.setTextColor(Color.BLACK)
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        buttonEnter.setOnClickListener {

            val loginEnter = userLoginEnter.text.toString().trim()
            val passwordEnter = userPasswordEnter.text.toString().trim()

            if (loginEnter == "" || passwordEnter == "")
                Toast.makeText(this, "Для авторизации заполните все поля", Toast.LENGTH_LONG).show()
            else {
                val db = DataBaseEatSmart(this, null)
                val isEnter = db.getUser(loginEnter, passwordEnter)
                if (isEnter) {
                    val intent = Intent(this, Activity_Profile::class.java)
                    startActivity(intent)
                    userLoginEnter.text.clear()
                    userPasswordEnter.text.clear()
                }
                else{
                    Toast.makeText(this, "Пользователь не найден или не авторизован", Toast.LENGTH_LONG).show()
                }
            }
        }

        buttonRegister.setOnClickListener {
            val intent = Intent(this, Activity_Register::class.java)
            startActivity(intent)
        }
    }
}
