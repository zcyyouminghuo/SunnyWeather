package com.example.sunnyweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweather.logic.Repository
import com.example.sunnyweather.logic.model.Location

/**
 * @Description:
 * @CreateDate: 2021/12/1 9:27
 */
class WeatherViewModel:ViewModel() {
    private val locationLiveData=MutableLiveData<Location>()

    var locationLng=""

    var locationLat=""

    var placeName=""

    val weatherLiveData=Transformations.switchMap(locationLiveData){location->
        Repository.refreshWeather(location.lng,location.lat)
    }

    fun refreshWeather(lng:String,lat:String){
        locationLiveData.value= Location(lng, lat)
    }
}