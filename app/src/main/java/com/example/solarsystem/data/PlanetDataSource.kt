package com.example.solarsystem.data

import com.example.solarsystem.R
import com.example.solarsystem.model.Planets

class PlanetDataSource {

    fun loadDataSource(): List<Planets> {
        return listOf(
            Planets(R.string.mercury, R.drawable.mercury),
            Planets(R.string.venus, R.drawable.venus),
            Planets(R.string.earth, R.drawable.earth),
            Planets(R.string.mars, R.drawable.mars),
            Planets(R.string.jupiter, R.drawable.jupiter),
            Planets(R.string.saturn, R.drawable.saturn),
            Planets(R.string.uranus, R.drawable.uranus),
            Planets(R.string.neptune, R.drawable.neptune)
        )
    }
}