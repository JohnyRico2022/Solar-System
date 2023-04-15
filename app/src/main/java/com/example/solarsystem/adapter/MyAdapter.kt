package com.example.solarsystem.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.R
import com.example.solarsystem.model.Planets

class MyAdapter(
    private val context: Context,
    private val dataset: List<Planets>
):RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById(R.id.planetName)
        val picture: ImageView = view.findViewById(R.id.planetPicture)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflatedView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_planets, parent, false)
        return ItemViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val planets = dataset[position]

        holder.name.text = context.resources.getString(planets.planetName)
        holder.picture.setImageResource(planets.planetPicture)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}