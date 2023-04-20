package com.example.solarsystem.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.R
import com.example.solarsystem.adapter.MyAdapter
import com.example.solarsystem.data.PlanetId
import com.example.solarsystem.data.Repository
import com.example.solarsystem.model.Planets

class MainActivity : AppCompatActivity(), MyAdapter.RecyclerViewEvents {
    private val data = createData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.rcView)
        recyclerView.adapter = MyAdapter(data, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemClick(position: Int) {
        val planet = data[position]

        Toast.makeText(this, planet.planetName, Toast.LENGTH_SHORT).show()
    }

    private fun createData(): List<Planets> {
        val names = Repository.planetNames
        val pictures = Repository.planetPictures

        val planetData = ArrayList<Planets>()
        PlanetId.values().forEach { planetID ->
            //If the Id is in all lists, add molecule to the ArrayList
            if (containsId(planetID, names, pictures)) {
                planetData.add(
                    Planets(
                        planetName = names[planetID]!!,
                        planetPicture = pictures[planetID]!!
                    )
                )
            }
        }

        return planetData
    }

    private fun containsId(planetID: PlanetId, vararg maps: Map<PlanetId, Any>): Boolean {
        maps.forEach {
            if (planetID !in it.keys) {
                return false
            }
        }
        return true
    }
}