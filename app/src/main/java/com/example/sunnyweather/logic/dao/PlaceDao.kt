package com.example.sunnyweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.sunnyweather.MyApplication
import com.example.sunnyweather.logic.model.Place
import com.example.sunnyweather.logic.network.SunnyWeatherNetwork
import com.example.sunnyweather.utils.dataStore
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Flow

/**
 * @Description:
 * @CreateDate: 2021/12/1 14:54
 */
object PlaceDao {
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved()= sharedPreferences().contains("place")

    private fun sharedPreferences() =
        MyApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)


}