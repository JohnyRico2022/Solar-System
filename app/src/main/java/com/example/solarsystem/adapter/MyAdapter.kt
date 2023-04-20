package com.example.solarsystem.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.R
import com.example.solarsystem.model.Planets

class MyAdapter(
    private val data: List<Planets>,
    private val listener: RecyclerViewEvents
) : RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val name: TextView = view.findViewById(R.id.planetName)
        val picture: ImageView = view.findViewById(R.id.planetPicture)

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflatedView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_planets, parent, false)
        return ItemViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val planets: Planets = data[position]

        holder.name.text = planets.planetName
        holder.picture.setImageResource(planets.planetPicture)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface RecyclerViewEvents {
        fun onItemClick(position: Int)

    }
}