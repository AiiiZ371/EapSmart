package com.example.eapsmartapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Product_Adapter(var product: List<Product>, var context: Context): RecyclerView.Adapter<Product_Adapter.MyViewHolder>(){

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.product_view)
        val title: TextView = view.findViewById(R.id.product_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_in_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return product.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = product[position].title

        val imageId = context.resources.getIdentifier(
            product[position].image,
            "drawable",
            context.packageName
            )

        holder.image.setImageResource(imageId)
    }
}