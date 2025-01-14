package com.example.eapsmartapp

import android.content.Context
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.eapsmartapp.databinding.LayoutRegisterBinding
import java.util.Locale

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: LayoutRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userName: EditText = findViewById(R.id.etName)
        val userLogin: EditText = findViewById(R.id.etLoginReg)
        val userPassword: EditText = findViewById(R.id.etPassReg)
        val button: Button = findViewById(R.id.btnRegReg)

        userName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (userName.text.isNotEmpty()) {
                    userName.setTextColor(Color.BLACK)
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        userLogin.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (userLogin.text.isNotEmpty()) {
                    userLogin.setTextColor(Color.BLACK)
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        userPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (userPassword.text.isNotEmpty()) {
                    userPassword.setTextColor(Color.BLACK)
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })



        button.setOnClickListener{
            val name = userName.text.toString().trim()
            val login = userLogin.text.toString().trim()
            val password = userPassword.text.toString().trim()

            if (name == "" || login == "" || password == "")
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
            else {
                val user = User (name, login, password)

                val db = DataBaseEatSmart(this, null)
                db.addUser(user)
                Toast.makeText(this, "Регистрация прошла успешно", Toast.LENGTH_LONG).show()

                userName.text.clear()
                userLogin.text.clear()
                userPassword.text.clear()
            }
        }

    }
}