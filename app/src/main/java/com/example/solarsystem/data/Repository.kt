package com.example.solarsystem.data

import com.example.solarsystem.R


object Repository {
    val planetNames = mapOf(
        PlanetId.MERCURY to "Меркурий",
        PlanetId.VENUS to "Венера",
        PlanetId.EARTH to "Земля",
        PlanetId.MARS to "Марс",
        PlanetId.JUPITER to "Юпитер",
        PlanetId.SATURN to "Сатурн",
        PlanetId.URANUS to "Уран",
        PlanetId.NEPTUNE to "Нептун"
    )

    val planetPictures = mapOf(
        PlanetId.MERCURY to R.drawable.mercury,
        PlanetId.VENUS to R.drawable.venus,
        PlanetId.EARTH to R.drawable.earth,
        PlanetId.MARS to R.drawable.mars,
        PlanetId.JUPITER to R.drawable.jupiter,
        PlanetId.SATURN to R.drawable.saturn,
        PlanetId.URANUS to R.drawable.uranus,
        PlanetId.NEPTUNE to R.drawable.neptune
    )
}