package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @Description: city Entity
 * @CreateDate: 2021/11/29 11:29
 */
data class PlaceResponse(val status: String, val places: List<Place>)
data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)
