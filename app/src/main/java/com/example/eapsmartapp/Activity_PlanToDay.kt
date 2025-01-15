package com.example.eapsmartapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eapsmartapp.databinding.ActivityPlantodayBinding

class Activity_PlanToDay : AppCompatActivity() {
    private lateinit var binding: ActivityPlantodayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlantodayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productList: RecyclerView = findViewById(R.id.productList)
        val products = arrayListOf<Product>()

        products.add(Product(1, "lentils", "Чечевичные котлеты"))
        products.add(Product(2, "salad", "Салат с кейлом, фенхелем и бобами эдамаме"))
        products.add(Product(3, "chicken_and_broccoli", "Курица с брокколи по-китайски"))

        productList.layoutManager = LinearLayoutManager(this)
        productList.adapter = Product_Adapter(products, this)
    }
}