package com.example.solarsystem.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.R
import com.example.solarsystem.adapter.MyAdapter
import com.example.solarsystem.data.PlanetDataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler: RecyclerView = findViewById(R.id.rcView)
        val planetDataSet = PlanetDataSource().loadDataSource()

        recycler.adapter = MyAdapter(this,planetDataSet)
    }
}