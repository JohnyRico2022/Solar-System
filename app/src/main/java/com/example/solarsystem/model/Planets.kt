package com.example.solarsystem.model

import androidx.annotation.DrawableRes

data class Planets(
    val planetName: String,
    @DrawableRes val planetPicture: Int
)