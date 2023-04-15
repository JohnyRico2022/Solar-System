package com.example.solarsystem.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Planets(
    @StringRes val planetName: Int,
    @DrawableRes val planetPicture: Int
)