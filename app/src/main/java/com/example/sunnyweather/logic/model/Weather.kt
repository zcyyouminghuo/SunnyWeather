package com.example.sunnyweather.logic.model

/**
 * @Description: weather entity
 * @CreateDate: 2021/12/1 8:50
 */
data class Weather(val realtime:RealtimeResponse.Realtime,val daily: DailyResponse.Daily)