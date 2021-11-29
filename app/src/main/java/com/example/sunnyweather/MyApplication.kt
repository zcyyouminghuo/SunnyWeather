package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @Description: Application
 * @CreateDate: 2021/11/29 11:16
 */
class MyApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN="JfHsK1bx9CEVQXlw"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}