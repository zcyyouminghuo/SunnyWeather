package com.example.sunnyweather.logic.network

import com.example.sunnyweather.MyApplication
import com.example.sunnyweather.logic.model.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @Description:
 * @CreateDate: 2021/11/29 15:44
 */
interface PlaceService {
    @GET("v2/place?token=${MyApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String):retrofit2.Call<PlaceResponse>
}