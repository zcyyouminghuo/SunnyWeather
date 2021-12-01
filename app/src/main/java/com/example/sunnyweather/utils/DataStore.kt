package com.example.sunnyweather.utils

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

/**
 * @Description:
 * @CreateDate: 2021/12/1 14:52
 */
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "weather")